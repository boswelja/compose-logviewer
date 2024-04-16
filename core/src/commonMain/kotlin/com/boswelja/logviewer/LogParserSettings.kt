package com.boswelja.logviewer

/**
 * Describes how the log parser should behave in various scenarios.
 *
 * @property stripLogLevel Defines how log levels should be stripped, if at all. See
 * [StripLogLevelMode] for details.
 * @property stripTimestamps Defines how timestamps should be stripped, if at all. See
 * [StripTimestampMode] for details.
 */
public data class LogParserSettings(
    val stripLogLevel: StripLogLevelMode = StripLogLevelMode.NONE,
    val stripTimestamps: StripTimestampMode = StripTimestampMode.SINGLE
)

/**
 * Encapsulates all possible modes of stripping timestamps from log content.
 */
public enum class StripTimestampMode {
    /**
     * Do not strip any timestamps. Timestamps will be parsed, and the log content will contain the
     * parsed timestamp.
     */
    NONE,

    /**
     * Strip the timestamp parsed from the log line. This will NOT strip any timestamps other than
     * the one that was parsed as the log timestamp.
     */
    SINGLE,

    /**
     * Strip the timestamp parsed from the log line, as well as any timestamps that appear to be
     * duplicates. A duplicate timestamp is one whose recorded time is exceedingly close to the
     * parsed time value. Note that some tolerance is built-in to allow for millisecond-level
     * inaccuracies in the logger.
     */
    DUPLICATE,

    /**
     * Strips all timestamps from the log line. This is generally not recommended, as it might strip
     * important data too.
     */
    ALL
}

/**
 * Encapsulates all possible modes of stripping log level information from log content.
 */
public enum class StripLogLevelMode {
    /**
     * Do not strip any log levels. Log levels will be parsed, and the log content will contain the
     * parsed level.
     */
    NONE,

    /**
     * Strip the log level parsed from the log line. This will NOT strip any other potential log
     * level identifiers, other than the one that was parsed as the main log level.
     */
    SINGLE,
}
