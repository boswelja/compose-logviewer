package com.boswelja.logviewer.material3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.boswelja.logviewer.LogLevel
import com.boswelja.logviewer.LogLine
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

/**
 * A Material3 flavor of [com.boswelja.logviewer.LogViewer].
 */
@Composable
public fun LogViewer(
    log: List<String>,
    modifier: Modifier = Modifier,
    colors: LogColors = rememberMaterial3LogColors(),
) {
    com.boswelja.logviewer.LogViewer(
        log = log,
        lineContent = {
            LogText(it, colors)
        },
        modifier = modifier,
    )
}

private const val TIMESTAMP_PRECISION = 12

@Composable
internal fun LogText(
    logLine: LogLine,
    logColors: LogColors,
    modifier: Modifier = Modifier
) {
    val logColor = when (logLine.level) {
        LogLevel.Debug -> logColors.debug
        LogLevel.Info -> logColors.info
        LogLevel.Warning -> logColors.warn
        LogLevel.Error -> logColors.error
        null -> LocalContentColor.current
    }
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = logLine.timestamp
                .toLocalDateTime(TimeZone.UTC)
                .time
                .toString()
                .take(TIMESTAMP_PRECISION),
            color = logColors.timestamp,
        )
        LogLevelIndicator(
            logLevel = logLine.level,
            textColor = logColors.levelIndicator,
            backgroundColor = logColor
        )
        Text(
            text = logLine.content,
            color = logColor
        )
    }
}

@Composable
internal fun LogLevelIndicator(
    logLevel: LogLevel?,
    textColor: Color,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(backgroundColor)
            .layout { measurable, constraints ->
                val placeable = measurable.measure(constraints)
                val height = placeable.height
                val contentStart = (height / 2) - (placeable.width / 2)
                layout(height, height) {
                    placeable.placeRelative(contentStart, 0)
                }
            }
    ) {
        Text(
            text = logLevel?.identifier?.toString() ?: "?",
            color = textColor,
            fontWeight = FontWeight.SemiBold,
        )
    }
}
