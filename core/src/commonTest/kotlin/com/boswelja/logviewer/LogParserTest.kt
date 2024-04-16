package com.boswelja.logviewer

import kotlinx.datetime.Instant
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.Test
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class LogParserTest(private val logParser: LogParser) {

    @Test
    fun parseLine() {
        testData.forEach { (input, expected) ->
            assertEquals(
                expected,
                logParser.parseLine(input)
            )
        }
    }

    companion object {
        @JvmStatic
        @Parameters
        fun getLogParsers(): List<Array<Any>> = listOf(
            arrayOf(DefaultLogParser())
        )

        val testData = mapOf(
            "2023-12-24 20:58:46.459996+13:00logger=plugins.update.checker t=2023-12-24T07:58:46.459759741Z level=info msg=\"Update check succeeded\" duration=393.64738ms" to
                    LogLine(
                        level = LogLevel.Info,
                        timestamp = Instant.parse("2023-12-24T20:58:46.459996+13:00"),
                        content = "logger=plugins.update.checker t=2023-12-24T07:58:46.459759741Z msg=\"Update check succeeded\" duration=393.64738ms"
                    ),
            "2023-12-24 14:00:07.073504+13:00ts=2023-12-24T01:00:07.073Z caller=head.go:1299 level=info component=tsdb msg=\"Head GC completed\" caller=truncateMemory duration=6.189897ms" to
                    LogLine(
                        level = LogLevel.Info,
                        timestamp = Instant.parse("2023-12-24T14:00:07.073504+13:00"),
                        content = "ts=2023-12-24T01:00:07.073Z caller=head.go:1299 component=tsdb msg=\"Head GC completed\" caller=truncateMemory duration=6.189897ms"
                    ),
            "2023-12-24 13:16:54.663515+13:002023/12/24 00:16:54.663307 [error] dnsproxy: unpacking udp packet: dns: buffer size too small" to
                    LogLine(
                        level = LogLevel.Error,
                        timestamp = Instant.parse("2023-12-24T13:16:54.663515+13:00"),
                        content = "2023/12/24 00:16:54.663307 dnsproxy: unpacking udp packet: dns: buffer size too small"
                    ),
            "2023-12-24 21:11:24.734096+13:002023-12-24 21:11:24.733891894  address - - [24/Dec/2023:21:11:24 +1300] \"GET /api/ HTTP/1.1\" 200 38 \"http://address:port/api\" \"kube-probe/1.26\" \"-\"" to
                    LogLine(
                        level = null,
                        timestamp = Instant.parse("2023-12-24T21:11:24.734096+13:00"),
                        content = "2023-12-24 21:11:24.733891894  address - - [24/Dec/2023:21:11:24 +1300] \"GET /api/ HTTP/1.1\" 200 38 \"http://address:port/api\" \"kube-probe/1.26\" \"-\""
                    ),
            "2023-12-24 19:41:37.603008+13:00[06:41:37] [INF] [37] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks" to
                    LogLine(
                        level = LogLevel.Info,
                        timestamp = Instant.parse("2023-12-24T19:41:37.603008+13:00"),
                        content = "[06:41:37] [37] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks"
                    ),
            "2023-12-24 20:52:00.246953+13:00[Error] DownloadedEpisodesImportService: Import failed, path does not exist or is not accessible by Sonarr: path. Ensure the path exists and the user running Sonarr has the correct permissions to access this file/folder" to
                    LogLine(
                        level = LogLevel.Error,
                        timestamp = Instant.parse("2023-12-24T20:52:00.246953+13:00"),
                        content = "DownloadedEpisodesImportService: Import failed, path does not exist or is not accessible by Sonarr: path. Ensure the path exists and the user running Sonarr has the correct permissions to access this file/folder"
                    )
        )
    }
}