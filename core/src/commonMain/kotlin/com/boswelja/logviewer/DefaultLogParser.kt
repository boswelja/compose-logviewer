package com.boswelja.logviewer

import kotlinx.datetime.Instant

/**
 * The default implementation of [LogParser]. This is capable of simple log metadata extraction, and
 * will strip extracted data from the log content.
 */
public class DefaultLogParser : LogParser {

    override fun parseLine(logLine: String): LogLine? {
        if (logLine.isBlank()) return null
        var workingLine = logLine

        // Extract timestamp info
        val timestampMutation = extractTimestamp(workingLine)
        workingLine = timestampMutation.result

        // Extract log level
        val logLevel = extractLogLevel(workingLine)
        if (logLevel != null) {
            workingLine = logLevel.result
        }

        return LogLine(
            level = logLevel?.extractedData,
            timestamp = timestampMutation.extractedData,
            content = workingLine.trim()
        )
    }

    internal fun extractTimestamp(input: String): StringMutation<Instant> {
        val timestampMatch = timestampRegex.find(input)
        requireNotNull(timestampMatch) { "No timestamp found in: $input" }
        val timestamp = Instant.parse(timestampMatch.value.replace(" ", "T"))
        return StringMutation(
            result = input.removeRange(timestampMatch.range),
            extractedData = timestamp
        )
    }

    @Suppress("ReturnCount")
    internal fun extractLogLevel(input: String): StringMutation<LogLevel>? {
        val logLevelMatch = logLevelPattern.find(input) ?: return null
        for (logLevel in LogLevel.entries) {
            for (knownEntryName in logLevel.knownNames) {
                if (logLevelMatch.value.contains(knownEntryName)) {
                    return StringMutation(
                        result = input.removeRange(logLevelMatch.range).replace("  ", " "),
                        extractedData = logLevel
                    )
                }
            }
        }
        return null
    }

    internal data class StringMutation<T>(val result: String, val extractedData: T)

    public companion object {
        private val logLevelPattern = LogLevel.entries
            .flatMap { it.knownNames }
            .joinToString(separator = "|") { Regex.escape(it) }
            .toRegex()
        private val timestampRegex = Regex("^(\\d{4})[-/](\\d{2})[-/](\\d{2})[T ](\\d{2}):(\\d{2}):(\\d{2}(?:\\.\\d*)?)((\\+(\\d{2}):(\\d{2})|Z)?)((-(\\d{2}):(\\d{2})|Z)?)")
    }
}
