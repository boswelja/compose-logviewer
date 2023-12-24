package com.boswelja.logviewer

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

/**
 * A Composable that can be used to display log-style text.
 */
@Composable
public fun LogViewer(
    log: List<String>,
    lineContent: @Composable (LogLine) -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(),
) {
    val lines by remember(log) {
        val logParser = DefaultLogParser()
        derivedStateOf { logParser.parseLines(log) }
    }
    val listState = rememberLazyListState(
        initialFirstVisibleItemIndex = lines.lastIndex
    )
    LazyColumn(
        modifier = modifier,
        contentPadding = contentPadding,
        state = listState
    ) {
        items(
            items = lines,
            key = { it.hashCode() }
        ) { logLine ->
            lineContent(logLine)
        }
    }
}
