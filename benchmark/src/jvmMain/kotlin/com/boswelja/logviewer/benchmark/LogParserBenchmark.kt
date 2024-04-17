package com.boswelja.logviewer.benchmark

import com.boswelja.logviewer.DefaultLogParser
import com.boswelja.logviewer.LogParser
import kotlinx.benchmark.Benchmark
import kotlinx.benchmark.Scope
import kotlinx.benchmark.Setup
import kotlinx.benchmark.State

@State(Scope.Benchmark)
open class LogParserBenchmark {

    private lateinit var logParser: LogParser

    private lateinit var singleLine: String

    @Setup
    fun setUp() {
        logParser = DefaultLogParser()
        singleLine = logFile.first()
    }

    @Benchmark
    fun parsingSingleLine() {
        logParser.parseLine("2023-12-24 20:58:46.459996+13:00logger=plugins.update.checker t=2023-12-24T07:58:46.459759741Z level=info msg=\"Update check succeeded\" duration=393.64738ms")
    }

    @Benchmark
    fun parseLogFile() {
        logParser.parseLines(logFile)
    }

    companion object {
        private val logFile = """
            2024-04-16T12:00:00.842706097+12:00 [matroska,webm @ 0x560a289c52c0] Could not find codec parameters for stream 22 (Attachment: none): unknown codec
            2024-04-16T12:00:00.842708054+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:00.842710133+12:00 [matroska,webm @ 0x560a289c52c0] Could not find codec parameters for stream 23 (Attachment: none): unknown codec
            2024-04-16T12:00:00.842712127+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.004718406+12:00 [00:00:01] [INF] [21] Emby.Server.Implementations.ScheduledTasks.TaskManager: Daily trigger for Detect Introductions set to fire at 2024-04-17 00:00:00.000 +00:00, which is 23:59:58.9954631 from now.
            2024-04-16T12:00:01.049132963+12:00 [matroska,webm @ 0x561bfed9e2c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:01.049160052+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.049165515+12:00 [matroska,webm @ 0x561bfed9e2c0] Could not find codec parameters for stream 4 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:01.049170331+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.105291471+12:00 [matroska,webm @ 0x558544c892c0] Could not find codec parameters for stream 5 (Attachment: none): unknown codec
            2024-04-16T12:00:01.105307750+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.105313191+12:00 [matroska,webm @ 0x558544c892c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:01.105317733+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.105322048+12:00 [matroska,webm @ 0x558544c892c0] Could not find codec parameters for stream 7 (Attachment: none): unknown codec
            2024-04-16T12:00:01.105326320+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.105330682+12:00 [matroska,webm @ 0x558544c892c0] Could not find codec parameters for stream 8 (Attachment: none): unknown codec
            2024-04-16T12:00:01.105336144+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.105340657+12:00 [matroska,webm @ 0x558544c892c0] Could not find codec parameters for stream 9 (Attachment: none): unknown codec
            2024-04-16T12:00:01.105344914+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.366382694+12:00 [matroska,webm @ 0x55c3dbb3d2c0] Could not find codec parameters for stream 5 (Attachment: none): unknown codec
            2024-04-16T12:00:01.366407635+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.366413166+12:00 [matroska,webm @ 0x55c3dbb3d2c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:01.366417764+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.366422309+12:00 [matroska,webm @ 0x55c3dbb3d2c0] Could not find codec parameters for stream 7 (Attachment: none): unknown codec
            2024-04-16T12:00:01.366426619+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.366431079+12:00 [matroska,webm @ 0x55c3dbb3d2c0] Could not find codec parameters for stream 8 (Attachment: none): unknown codec
            2024-04-16T12:00:01.366435393+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.366439676+12:00 [matroska,webm @ 0x55c3dbb3d2c0] Could not find codec parameters for stream 9 (Attachment: none): unknown codec
            2024-04-16T12:00:01.366444289+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.572231146+12:00 [matroska,webm @ 0x557c7c2082c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:01.572257765+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.572263521+12:00 [matroska,webm @ 0x557c7c2082c0] Could not find codec parameters for stream 4 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:01.572268034+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.626530514+12:00 [matroska,webm @ 0x5645a04ea2c0] Could not find codec parameters for stream 5 (Attachment: none): unknown codec
            2024-04-16T12:00:01.626547542+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.626550293+12:00 [matroska,webm @ 0x5645a04ea2c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:01.626552457+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.626554503+12:00 [matroska,webm @ 0x5645a04ea2c0] Could not find codec parameters for stream 7 (Attachment: none): unknown codec
            2024-04-16T12:00:01.626556588+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.626558693+12:00 [matroska,webm @ 0x5645a04ea2c0] Could not find codec parameters for stream 8 (Attachment: none): unknown codec
            2024-04-16T12:00:01.626560703+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.626562727+12:00 [matroska,webm @ 0x5645a04ea2c0] Could not find codec parameters for stream 9 (Attachment: none): unknown codec
            2024-04-16T12:00:01.626564720+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.626566895+12:00 [matroska,webm @ 0x5645a04ea2c0] Could not find codec parameters for stream 10 (Attachment: none): unknown codec
            2024-04-16T12:00:01.626569018+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.888669585+12:00 [matroska,webm @ 0x555bda0b72c0] Could not find codec parameters for stream 5 (Attachment: none): unknown codec
            2024-04-16T12:00:01.888693630+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.888698719+12:00 [matroska,webm @ 0x555bda0b72c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:01.888702576+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.888706173+12:00 [matroska,webm @ 0x555bda0b72c0] Could not find codec parameters for stream 7 (Attachment: none): unknown codec
            2024-04-16T12:00:01.888709809+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.888713390+12:00 [matroska,webm @ 0x555bda0b72c0] Could not find codec parameters for stream 8 (Attachment: none): unknown codec
            2024-04-16T12:00:01.888716998+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.888720677+12:00 [matroska,webm @ 0x555bda0b72c0] Could not find codec parameters for stream 9 (Attachment: none): unknown codec
            2024-04-16T12:00:01.888724244+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:01.888727102+12:00 [matroska,webm @ 0x555bda0b72c0] Could not find codec parameters for stream 10 (Attachment: none): unknown codec
            2024-04-16T12:00:01.888730866+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.146010386+12:00 [matroska,webm @ 0x5587eba022c0] Could not find codec parameters for stream 5 (Attachment: none): unknown codec
            2024-04-16T12:00:02.146038025+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.146043751+12:00 [matroska,webm @ 0x5587eba022c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:02.146048504+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.146053111+12:00 [matroska,webm @ 0x5587eba022c0] Could not find codec parameters for stream 7 (Attachment: none): unknown codec
            2024-04-16T12:00:02.146057401+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.146061791+12:00 [matroska,webm @ 0x5587eba022c0] Could not find codec parameters for stream 8 (Attachment: none): unknown codec
            2024-04-16T12:00:02.146066164+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.146070362+12:00 [matroska,webm @ 0x5587eba022c0] Could not find codec parameters for stream 9 (Attachment: none): unknown codec
            2024-04-16T12:00:02.146074674+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.146078899+12:00 [matroska,webm @ 0x5587eba022c0] Could not find codec parameters for stream 10 (Attachment: none): unknown codec
            2024-04-16T12:00:02.146083202+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.146560002+12:00 [matroska,webm @ 0x55d0d1e792c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:02.146576582+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.146579303+12:00 [matroska,webm @ 0x55d0d1e792c0] Could not find codec parameters for stream 4 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:02.146581438+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.403679199+12:00 [matroska,webm @ 0x55fe540672c0] Could not find codec parameters for stream 5 (Attachment: none): unknown codec
            2024-04-16T12:00:02.403702976+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.403707759+12:00 [matroska,webm @ 0x55fe540672c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:02.403711597+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.403716083+12:00 [matroska,webm @ 0x55fe540672c0] Could not find codec parameters for stream 7 (Attachment: none): unknown codec
            2024-04-16T12:00:02.403719823+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.403722947+12:00 [matroska,webm @ 0x55fe540672c0] Could not find codec parameters for stream 8 (Attachment: none): unknown codec
            2024-04-16T12:00:02.403729042+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.403735630+12:00 [matroska,webm @ 0x55fe540672c0] Could not find codec parameters for stream 9 (Attachment: none): unknown codec
            2024-04-16T12:00:02.403738875+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.403743760+12:00 [matroska,webm @ 0x55fe540672c0] Could not find codec parameters for stream 10 (Attachment: none): unknown codec
            2024-04-16T12:00:02.403747239+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.663368598+12:00 [matroska,webm @ 0x563dd920f2c0] Could not find codec parameters for stream 5 (Attachment: none): unknown codec
            2024-04-16T12:00:02.663401857+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.663408156+12:00 [matroska,webm @ 0x563dd920f2c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:02.663412983+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.663417518+12:00 [matroska,webm @ 0x563dd920f2c0] Could not find codec parameters for stream 7 (Attachment: none): unknown codec
            2024-04-16T12:00:02.663422057+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.663426421+12:00 [matroska,webm @ 0x563dd920f2c0] Could not find codec parameters for stream 8 (Attachment: none): unknown codec
            2024-04-16T12:00:02.663430759+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.663435373+12:00 [matroska,webm @ 0x563dd920f2c0] Could not find codec parameters for stream 9 (Attachment: none): unknown codec
            2024-04-16T12:00:02.663439864+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.925900462+12:00 [matroska,webm @ 0x55a99cd932c0] Could not find codec parameters for stream 5 (Attachment: none): unknown codec
            2024-04-16T12:00:02.925924519+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.925930237+12:00 [matroska,webm @ 0x55a99cd932c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:02.925934802+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.925939111+12:00 [matroska,webm @ 0x55a99cd932c0] Could not find codec parameters for stream 7 (Attachment: none): unknown codec
            2024-04-16T12:00:02.925943300+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.925947557+12:00 [matroska,webm @ 0x55a99cd932c0] Could not find codec parameters for stream 8 (Attachment: none): unknown codec
            2024-04-16T12:00:02.925951731+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.925956020+12:00 [matroska,webm @ 0x55a99cd932c0] Could not find codec parameters for stream 9 (Attachment: none): unknown codec
            2024-04-16T12:00:02.925960239+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:02.925964400+12:00 [matroska,webm @ 0x55a99cd932c0] Could not find codec parameters for stream 10 (Attachment: none): unknown codec
            2024-04-16T12:00:02.925968707+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.184265034+12:00 [matroska,webm @ 0x55c4a8d362c0] Could not find codec parameters for stream 5 (Attachment: none): unknown codec
            2024-04-16T12:00:03.184287913+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.184293433+12:00 [matroska,webm @ 0x55c4a8d362c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:03.184297947+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.184302242+12:00 [matroska,webm @ 0x55c4a8d362c0] Could not find codec parameters for stream 7 (Attachment: none): unknown codec
            2024-04-16T12:00:03.184306434+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.184310658+12:00 [matroska,webm @ 0x55c4a8d362c0] Could not find codec parameters for stream 8 (Attachment: none): unknown codec
            2024-04-16T12:00:03.184314732+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.184318821+12:00 [matroska,webm @ 0x55c4a8d362c0] Could not find codec parameters for stream 9 (Attachment: none): unknown codec
            2024-04-16T12:00:03.184322919+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.184326993+12:00 [matroska,webm @ 0x55c4a8d362c0] Could not find codec parameters for stream 10 (Attachment: none): unknown codec
            2024-04-16T12:00:03.184331099+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.218190408+12:00 [matroska,webm @ 0x55c8ee3f12c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:03.218216232+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.218221866+12:00 [matroska,webm @ 0x55c8ee3f12c0] Could not find codec parameters for stream 4 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:03.218227445+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.443447015+12:00 [matroska,webm @ 0x55e02b17f2c0] Could not find codec parameters for stream 5 (Attachment: none): unknown codec
            2024-04-16T12:00:03.443472479+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.443475826+12:00 [matroska,webm @ 0x55e02b17f2c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:03.443478789+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.443481442+12:00 [matroska,webm @ 0x55e02b17f2c0] Could not find codec parameters for stream 7 (Attachment: none): unknown codec
            2024-04-16T12:00:03.443483913+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.443486383+12:00 [matroska,webm @ 0x55e02b17f2c0] Could not find codec parameters for stream 8 (Attachment: none): unknown codec
            2024-04-16T12:00:03.443488883+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.443491304+12:00 [matroska,webm @ 0x55e02b17f2c0] Could not find codec parameters for stream 9 (Attachment: none): unknown codec
            2024-04-16T12:00:03.443493936+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:03.734457856+12:00 [matroska,webm @ 0x5559b1ca92c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:03.734485323+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.239244707+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 3 episodes from Spice and Wolf: Merchant Meets the Wise Wolf season 1
            2024-04-16T12:00:05.268981229+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 10 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269020404+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.269023249+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 11 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269025473+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.269027538+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 12 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269029713+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.269031883+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 13 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269033916+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.269035953+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 14 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269038016+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.269040488+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 15 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269042536+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.269044508+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 16 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269046548+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.269048606+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 17 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269050660+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.269052745+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 18 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269054819+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.269056784+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 19 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269058855+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.269060850+12:00 [matroska,webm @ 0x559846b362c0] Could not find codec parameters for stream 20 (Attachment: none): unknown codec
            2024-04-16T12:00:05.269062984+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.441645911+12:00 [matroska,webm @ 0x563c4010d2c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:05.441664005+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.735693459+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Spy Classroom season 1
            2024-04-16T12:00:05.750584319+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Spy Classroom season 2
            2024-04-16T12:00:05.763714501+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 25 episodes from Summer Time Rendering season 1
            2024-04-16T12:00:05.787545434+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Tengoku Daimakyo season 1
            2024-04-16T12:00:05.800030451+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 24 episodes from That Time I Got Reincarnated as a Slime season 1
            2024-04-16T12:00:05.824335593+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 24 episodes from That Time I Got Reincarnated as a Slime season 2
            2024-04-16T12:00:05.846287177+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from The 100 Girlfriends Who Really, Really, Really, Really, Really Love You season 1
            2024-04-16T12:00:05.857379310+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from The Angel Next Door Spoils Me Rotten season 1
            2024-04-16T12:00:05.869728254+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from The Dangers in My Heart season 1
            2024-04-16T12:00:05.881894641+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from The Dangers in My Heart season 2
            2024-04-16T12:00:05.893378458+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from The Fruit of Evolution: Before I Knew It, My Life Had It Made season 1
            2024-04-16T12:00:05.905506418+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from The Magical Revolution of the Reincarnated Princess and the Genius Young Lady season 1
            2024-04-16T12:00:05.916933941+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from The Wrong Way to Use Healing Magic season 1
            2024-04-16T12:00:05.917732684+12:00 [matroska,webm @ 0x563cebd2d2c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:05.917735403+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:05.930249619+12:00 [00:00:05] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 15 episodes from Tsukimichi: Moonlit Fantasy season 2
            2024-04-16T12:00:05.951725714+12:00 [matroska,webm @ 0x564a399a72c0] Could not find codec parameters for stream 6 (Attachment: none): unknown codec
            2024-04-16T12:00:05.951733255+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:06.326561104+12:00 [00:00:06] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 24 episodes from Undead Unluck season 1
            2024-04-16T12:00:06.352777168+12:00 [00:00:06] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Violet Evergarden season 1
            2024-04-16T12:00:06.369304632+12:00 [00:00:06] [INF] [78] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Zom 100: Bucket List of the Dead season 1
            2024-04-16T12:00:06.500888065+12:00 [matroska,webm @ 0x5625c8def2c0] Could not find codec parameters for stream 4 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:06.500907539+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:07.704103412+12:00 [matroska,webm @ 0x562b307562c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:07.704131760+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:07.704137958+12:00 [matroska,webm @ 0x562b307562c0] Could not find codec parameters for stream 4 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:07.704143144+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:08.341892651+12:00 [matroska,webm @ 0x557e027012c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:08.341929964+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:08.341935894+12:00 [matroska,webm @ 0x557e027012c0] Could not find codec parameters for stream 4 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:08.341940795+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:09.762717749+12:00 [matroska,webm @ 0x55cbf47a82c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:09.762755414+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:10.454501992+12:00 [matroska,webm @ 0x55b3423d62c0] Could not find codec parameters for stream 3 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:10.454526632+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:10.454532135+12:00 [matroska,webm @ 0x55b3423d62c0] Could not find codec parameters for stream 4 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:10.454536649+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:11.163111470+12:00 [matroska,webm @ 0x55e547b8a2c0] Could not find codec parameters for stream 4 (Subtitle: hdmv_pgs_subtitle (pgssub)): unspecified size
            2024-04-16T12:00:11.163136620+12:00 Consider increasing the value for the 'analyzeduration' (0) and 'probesize' (5000000) options
            2024-04-16T12:00:16.043612247+12:00 [00:00:16] [INF] [11] Emby.Server.Implementations.ScheduledTasks.TaskManager: Detect Introductions Completed after 0 minute(s) and 16 seconds
            2024-04-16T12:00:16.043690264+12:00 [00:00:16] [INF] [11] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T12:38:28.971334398+12:00 [00:38:28] [INF] [113] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Scan Media Library
            2024-04-16T12:38:28.971418074+12:00 [00:38:28] [INF] [113] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task RefreshMediaLibraryTask
            2024-04-16T12:38:28.971452396+12:00 [00:38:28] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Scan Media Library
            2024-04-16T12:38:28.971472811+12:00 [00:38:28] [INF] [110] Emby.Server.Implementations.IO.LibraryMonitor: Stopping directory watching for path /mnt/Jellyfin-Media/Shows
            2024-04-16T12:38:28.971915149+12:00 [00:38:28] [INF] [110] Emby.Server.Implementations.Library.LibraryManager: Validating media library
            2024-04-16T12:38:30.760705581+12:00 [00:38:30] [INF] [70] Emby.Server.Implementations.ScheduledTasks.TaskManager: Scan Media Library Completed after 0 minute(s) and 1 seconds
            2024-04-16T12:38:30.760772755+12:00 [00:38:30] [INF] [70] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T12:38:30.774492898+12:00 [00:38:30] [INF] [69] Emby.Server.Implementations.IO.LibraryMonitor: Watching directory /mnt/Jellyfin-Media/Shows
            2024-04-16T12:39:16.154488500+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Clean Log Directory
            2024-04-16T12:39:16.154581200+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task DeleteLogFileTask
            2024-04-16T12:39:16.154596973+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Clean Log Directory
            2024-04-16T12:39:16.154829186+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Clean Log Directory Completed after 0 minute(s) and 0 seconds
            2024-04-16T12:39:16.155101708+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T12:39:16.182913270+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Clean Transcode Directory
            2024-04-16T12:39:16.182938488+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task DeleteTranscodeFileTask
            2024-04-16T12:39:16.182944114+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Clean Transcode Directory
            2024-04-16T12:39:16.182949330+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Clean Transcode Directory Completed after 0 minute(s) and 0 seconds
            2024-04-16T12:39:16.183343198+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T12:39:16.211345979+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Download missing subtitles
            2024-04-16T12:39:16.211383951+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task SubtitleScheduledTask
            2024-04-16T12:39:16.211392139+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Download missing subtitles
            2024-04-16T12:39:16.211544617+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.TaskManager: Download missing subtitles Completed after 0 minute(s) and 0 seconds
            2024-04-16T12:39:16.211689921+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T12:39:16.239924223+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: TasksRefreshChannels
            2024-04-16T12:39:16.240005215+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task RefreshChannelsScheduledTask
            2024-04-16T12:39:16.240021296+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing TasksRefreshChannels
            2024-04-16T12:39:16.240487037+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: TasksRefreshChannels Completed after 0 minute(s) and 0 seconds
            2024-04-16T12:39:16.240729904+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T12:39:16.352506706+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Optimize database
            2024-04-16T12:39:16.352578084+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task OptimizeDatabaseTask
            2024-04-16T12:39:16.352591639+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Optimize database
            2024-04-16T12:39:16.352634941+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.Tasks.OptimizeDatabaseTask: Optimizing and vacuuming jellyfin.db...
            2024-04-16T12:39:16.375801583+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.Tasks.OptimizeDatabaseTask: jellyfin.db optimized successfully!
            2024-04-16T12:39:16.375835532+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.TaskManager: Optimize database Completed after 0 minute(s) and 0 seconds
            2024-04-16T12:39:16.376052080+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T12:39:16.509029244+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Clean Cache Directory
            2024-04-16T12:39:16.509108806+12:00 [00:39:16] [INF] [61] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task DeleteCacheFileTask
            2024-04-16T12:39:16.509121913+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Clean Cache Directory
            2024-04-16T12:39:16.522551304+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: Clean Cache Directory Completed after 0 minute(s) and 0 seconds
            2024-04-16T12:39:16.522586304+12:00 [00:39:16] [INF] [110] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T12:39:34.322775719+12:00 [00:39:34] [INF] [111] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Refresh Guide
            2024-04-16T12:39:34.322884523+12:00 [00:39:34] [INF] [111] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task RefreshGuideScheduledTask
            2024-04-16T12:39:34.322921781+12:00 [00:39:34] [INF] [111] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Refresh Guide
            2024-04-16T12:39:37.325585431+12:00 [00:39:37] [INF] [70] Emby.Server.Implementations.LiveTv.LiveTvManager: Refreshing guide with 7 days of guide data
            2024-04-16T12:39:37.325986771+12:00 [00:39:37] [INF] [70] Emby.Server.Implementations.ScheduledTasks.TaskManager: Refresh Guide Completed after 0 minute(s) and 3 seconds
            2024-04-16T12:39:37.326458435+12:00 [00:39:37] [INF] [70] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T12:44:03.552036826+12:00 [00:44:03] [INF] [78] Emby.Server.Implementations.IO.LibraryMonitor: Classroom of the Elite (/mnt/Jellyfin-Media/Shows/Classroom of the Elite) will be refreshed.
            2024-04-16T12:44:09.372185735+12:00 [00:44:09] [INF] [66] Emby.Server.Implementations.IO.LibraryMonitor: Season 1 (/mnt/Jellyfin-Media/Shows/Spice and Wolf - MERCHANT MEETS THE WISE WOLF/Season 1) will be refreshed.
            2024-04-16T12:44:10.655794194+12:00 [00:44:10] [INF] [78] Emby.Server.Implementations.IO.LibraryMonitor: Season 2 (/mnt/Jellyfin-Media/Shows/Tsukimichi -Moonlit Fantasy-/Season 2) will be refreshed.
            2024-04-16T13:59:59.999109718+12:00 [01:59:59] [INF] [26] Emby.Server.Implementations.ScheduledTasks.TaskManager: DailyTrigger fired for task: Extract Chapter Images
            2024-04-16T13:59:59.999192989+12:00 [01:59:59] [INF] [26] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task ChapterImagesTask
            2024-04-16T13:59:59.999219331+12:00 [01:59:59] [INF] [26] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Extract Chapter Images
            2024-04-16T14:00:00.024366809+12:00 [02:00:00] [INF] [26] Emby.Server.Implementations.MediaEncoder.EncodingManager: Stopping chapter extraction for Sushi & Hot Springs of the Dead because a chapter was found with a position greater than the runtime.
            2024-04-16T14:00:00.034833973+12:00 [02:00:00] [INF] [26] Emby.Server.Implementations.ScheduledTasks.TaskManager: Extract Chapter Images Completed after 0 minute(s) and 0 seconds
            2024-04-16T14:00:00.034916254+12:00 [02:00:00] [INF] [26] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T14:00:00.999762240+12:00 [02:00:00] [INF] [26] Emby.Server.Implementations.ScheduledTasks.TaskManager: Daily trigger for Extract Chapter Images set to fire at 2024-04-17 02:00:00.000 +00:00, which is 23:59:59.0005883 from now.
            2024-04-16T17:50:24.554885161+12:00 [05:50:24] [INF] [52] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Update Plugins
            2024-04-16T17:50:24.555383955+12:00 [05:50:24] [INF] [52] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task PluginUpdateTask
            2024-04-16T17:50:24.555480022+12:00 [05:50:24] [INF] [51] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Update Plugins
            2024-04-16T17:50:26.846512658+12:00 [05:50:26] [INF] [42] Emby.Server.Implementations.ScheduledTasks.TaskManager: Update Plugins Completed after 0 minute(s) and 2 seconds
            2024-04-16T17:50:26.846621656+12:00 [05:50:26] [INF] [42] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-16T20:57:18.518309213+12:00 [08:57:18] [INF] [22] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-16T20:57:18.518345154+12:00 [08:57:18] [INF] [22] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Delfin Direct Play Profile, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 16.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/ac524833-48ae-65c6-4991-119ea66e216e/stream?MediaSourceId=ac52483348ae65c64991119ea66e216e&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=26a00ad2bddb849f3cb7dcb384fd7f04&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-16T20:57:32.103103196+12:00 [08:57:32] [INF] [14] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-16T20:57:32.103213330+12:00 [08:57:32] [INF] [14] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Delfin Direct Play Profile, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 15.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/c46a38f8-a4dd-7896-3e4b-8d8cd7859614/stream?MediaSourceId=c46a38f8a4dd78963e4b8d8cd7859614&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=3f1e8ea1a619b6455c27f1b6d56cafaa&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-16T20:57:32.944583981+12:00 [08:57:32] [INF] [32] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-16T20:57:32.944695870+12:00 [08:57:32] [INF] [32] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Delfin Direct Play Profile, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 14.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/2f625a9c-2c17-397f-db14-0fb6cd8720d9/stream?MediaSourceId=2f625a9c2c17397fdb140fb6cd8720d9&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=7c19b02604c0ae90bbf25f54f93b3c47&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-16T20:57:40.756577269+12:00 [08:57:40] [INF] [105] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-16T20:57:40.756612829+12:00 [08:57:40] [INF] [105] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Delfin Direct Play Profile, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 15.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/c46a38f8-a4dd-7896-3e4b-8d8cd7859614/stream?MediaSourceId=c46a38f8a4dd78963e4b8d8cd7859614&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=3f1e8ea1a619b6455c27f1b6d56cafaa&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-16T20:57:45.443750954+12:00 [08:57:45] [INF] [32] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-16T20:57:45.443905003+12:00 [08:57:45] [INF] [32] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Delfin Direct Play Profile, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 16.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/ac524833-48ae-65c6-4991-119ea66e216e/stream?MediaSourceId=ac52483348ae65c64991119ea66e216e&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=26a00ad2bddb849f3cb7dcb384fd7f04&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-16T21:05:09.483253363+12:00 [09:05:09] [WRN] [96] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.7190619 with Status Code 204
            2024-04-16T21:05:19.730872061+12:00 [09:05:19] [WRN] [82] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.9560947 with Status Code 204
            2024-04-16T21:05:29.536661096+12:00 [09:05:29] [WRN] [30] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.741542 with Status Code 204
            2024-04-16T21:05:39.788884515+12:00 [09:05:39] [WRN] [67] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.9732369 with Status Code 204
            2024-04-16T21:05:49.495624028+12:00 [09:05:49] [WRN] [67] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.7062833 with Status Code 204
            2024-04-16T21:05:59.546721672+12:00 [09:05:59] [WRN] [96] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.742383 with Status Code 204
            2024-04-16T21:06:10.219859381+12:00 [09:06:10] [WRN] [67] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:02.4394538 with Status Code 204
            2024-04-16T21:06:19.794232529+12:00 [09:06:19] [WRN] [67] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:02.0113708 with Status Code 204
            2024-04-16T21:06:29.834213284+12:00 [09:06:29] [WRN] [67] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:02.0791825 with Status Code 204
            2024-04-16T21:06:38.803379112+12:00 [09:06:38] [WRN] [96] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.0318127 with Status Code 204
            2024-04-16T21:06:48.804295842+12:00 [09:06:48] [WRN] [28] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.0223329 with Status Code 204
            2024-04-16T21:18:37.791069578+12:00 [09:18:37] [INF] [20] Emby.Server.Implementations.Session.SessionManager: Playback stopped reported by app Delfin 0.4.3 playing Shiketsu High Lurking. Stopped at 1410000 ms
            2024-04-17T00:35:11.959021025+12:00 [12:35:11] [INF] [98] Emby.Server.Implementations.HttpServer.WebSocketManager: WS 10.0.0.43 request
            2024-04-17T00:36:29.647894459+12:00 [12:36:29] [INF] [26] Emby.Server.Implementations.HttpServer.WebSocketManager: WS 10.0.0.43 closed
            2024-04-17T00:38:28.972191196+12:00 [12:38:28] [INF] [114] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Scan Media Library
            2024-04-17T00:38:28.972654660+12:00 [12:38:28] [INF] [114] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task RefreshMediaLibraryTask
            2024-04-17T00:38:28.972756016+12:00 [12:38:28] [INF] [23] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Scan Media Library
            2024-04-17T00:38:28.972879072+12:00 [12:38:28] [INF] [23] Emby.Server.Implementations.IO.LibraryMonitor: Stopping directory watching for path /mnt/Jellyfin-Media/Shows
            2024-04-17T00:38:28.973276630+12:00 [12:38:28] [INF] [23] Emby.Server.Implementations.Library.LibraryManager: Validating media library
            2024-04-17T00:38:30.603752700+12:00 [12:38:30] [INF] [68] Emby.Drawing.ImageProcessor: Creating image collage and saving to /cache/temp/252ee043e4ad43bb8519049411d306a3.png
            2024-04-17T00:38:30.681091336+12:00 [12:38:30] [INF] [68] Emby.Drawing.ImageProcessor: Completed creation of image collage and saved to /cache/temp/252ee043e4ad43bb8519049411d306a3.png
            2024-04-17T00:38:30.697839566+12:00 [12:38:30] [INF] [68] Emby.Server.Implementations.Library.Validators.StudiosValidator: Deleting dead Studio 266fb01d585f2df2f9254adea8b33784 Lerche
            2024-04-17T00:38:30.697869710+12:00 [12:38:30] [INF] [68] Emby.Server.Implementations.Library.LibraryManager: Removing item, Type: Studio, Name: Lerche, Path: /config/metadata/Studio/Lerche, Id: 266fb01d-585f-2df2-f925-4adea8b33784
            2024-04-17T00:38:30.775229240+12:00 [12:38:30] [INF] [68] Emby.Server.Implementations.ScheduledTasks.TaskManager: Scan Media Library Completed after 0 minute(s) and 1 seconds
            2024-04-17T00:38:30.775266106+12:00 [12:38:30] [INF] [68] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T00:38:30.808038801+12:00 [12:38:30] [INF] [70] Emby.Server.Implementations.IO.LibraryMonitor: Watching directory /mnt/Jellyfin-Media/Shows
            2024-04-17T01:32:40.617075579+12:00 [13:32:40] [INF] [94] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T01:32:40.617185364+12:00 [13:32:40] [INF] [94] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Direct play all, Path=/mnt/Jellyfin-Media/Shows/Spice and Wolf - MERCHANT MEETS THE WISE WOLF/Season 1/Spice.and.Wolf.MERCHANT.MEETS.THE.WISE.WOLF.S01E03.Port.Town.and.Sweet.Temptation.1080p.CR.WEB-DL.AAC2.0.H.264-VARYG.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=DirectPlay, TranscodeReason=0 ) media:/videos/1e15afa4-0413-aec0-b05c-9ae01124cd93/stream.mkv?MediaSourceId=1e15afa40413aec0b05c9ae01124cd93&Static=true&VideoCodec=h264&AudioCodec=aac&AudioStreamIndex=1&api_key=<token>&Tag=55fdc31d7ba7ca0ea0cea89f3e0fa750
            2024-04-17T01:54:00.287398804+12:00 [13:54:00] [INF] [67] Emby.Server.Implementations.Session.SessionManager: Playback stopped reported by app Findroid 0.14.2 playing Port Town and Sweet Temptation. Stopped at 1347000 ms
            2024-04-17T01:54:02.389887603+12:00 [13:54:02] [INF] [105] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T01:54:02.389995138+12:00 [13:54:02] [INF] [105] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Direct play all, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 17.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/585e239e-9edf-818d-e4bd-251633fec358/stream?MediaSourceId=585e239e9edf818de4bd251633fec358&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=05c36e4d1200a42fa2df4dab8afebca1&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T01:54:02.405019044+12:00 [13:54:02] [INF] [11] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T01:54:02.405106903+12:00 [13:54:02] [INF] [11] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Direct play all, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 18.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/7a3874f3-de9e-976c-aaec-14ae181c879a/stream?MediaSourceId=7a3874f3de9e976caaec14ae181c879a&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=a53dc2264c429d3d695da4c93b2b93b4&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T01:54:02.421629170+12:00 [13:54:02] [INF] [105] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T01:54:02.421713224+12:00 [13:54:02] [INF] [105] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Direct play all, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 19.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/b39e0b65-6174-9eb2-995b-ff9f71a3a062/stream?MediaSourceId=b39e0b6561749eb2995bff9f71a3a062&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=c482e31c97434a0bcc758ecf41f46553&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T01:54:02.437658190+12:00 [13:54:02] [INF] [11] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T01:54:02.437730347+12:00 [13:54:02] [INF] [11] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Direct play all, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 20.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/521996c2-8ee8-9c4b-ecc7-1271669d1154/stream?MediaSourceId=521996c28ee89c4becc71271669d1154&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=88bbf4c924f2bc54f477e525f08bca5a&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T01:54:02.455775812+12:00 [13:54:02] [INF] [78] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T01:54:02.455861731+12:00 [13:54:02] [INF] [78] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Direct play all, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 21.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/c1be5ad1-9e37-098b-dd81-949c4ac3a485/stream?MediaSourceId=c1be5ad19e37098bdd81949c4ac3a485&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=c13f67b2140c0e642c7b43dcf744ad6d&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T01:54:02.472406449+12:00 [13:54:02] [INF] [11] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T01:54:02.472484129+12:00 [13:54:02] [INF] [11] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Direct play all, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 22.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/81eadbf5-5d09-d3b6-9e47-48c0aa13ada5/stream?MediaSourceId=81eadbf55d09d3b69e4748c0aa13ada5&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=bd2a0013d9d93c64778b7ab7db9bec81&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T01:54:02.489438270+12:00 [13:54:02] [INF] [11] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T01:54:02.489523129+12:00 [13:54:02] [INF] [11] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Direct play all, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 23.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/0ee0e9ac-c3a5-28e6-32ec-7d2ae66a409c/stream?MediaSourceId=0ee0e9acc3a528e632ec7d2ae66a409c&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=d1ce22413ee916e3b93b7ff08db7a3bf&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T01:54:02.508556362+12:00 [13:54:02] [INF] [78] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T01:54:02.508625610+12:00 [13:54:02] [INF] [78] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Direct play all, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 24.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/b173b98c-8126-c013-1a7c-41c88a35492e/stream?MediaSourceId=b173b98c8126c0131a7c41c88a35492e&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=f9b2a57a1ffb0ff7be349954eeb80584&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T01:54:02.525634360+12:00 [13:54:02] [INF] [11] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T01:54:02.525709687+12:00 [13:54:02] [INF] [11] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Direct play all, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 25.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/93659bd0-6bba-3bc4-3e89-0a433f55de0f/stream?MediaSourceId=93659bd06bba3bc43e890a433f55de0f&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=7f63c5b9f29b3cd7748107c4010e92ef&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T02:11:23.798251961+12:00 [14:11:23] [WRN] [121] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10390000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.8702404 with Status Code 204
            2024-04-17T02:11:28.810979376+12:00 [14:11:28] [WRN] [19] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10440000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.8892612 with Status Code 204
            2024-04-17T02:11:33.899543536+12:00 [14:11:33] [WRN] [19] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10490000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.9792464 with Status Code 204
            2024-04-17T02:11:38.779514136+12:00 [14:11:38] [WRN] [105] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10540000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.8059094 with Status Code 204
            2024-04-17T02:11:43.799708622+12:00 [14:11:43] [WRN] [119] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10590000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.8143964 with Status Code 204
            2024-04-17T02:11:48.614320429+12:00 [14:11:48] [WRN] [121] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10640000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.6850664 with Status Code 204
            2024-04-17T02:11:53.688268665+12:00 [14:11:53] [WRN] [121] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10690000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.7608418 with Status Code 204
            2024-04-17T02:11:58.601849547+12:00 [14:11:58] [WRN] [33] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10740000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.6709816 with Status Code 204
            2024-04-17T02:12:03.816810739+12:00 [14:12:03] [WRN] [105] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10790000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.8862016 with Status Code 204
            2024-04-17T02:12:08.883261036+12:00 [14:12:08] [WRN] [105] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10840000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.9513612 with Status Code 204
            2024-04-17T02:12:13.716941411+12:00 [14:12:13] [WRN] [105] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10890000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.7848888 with Status Code 204
            2024-04-17T02:12:18.689468256+12:00 [14:12:18] [WRN] [24] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/585e239e-9edf-818d-e4bd-251633fec358/Progress?positionTicks=10940000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:00.7575402 with Status Code 204
            2024-04-17T03:15:20.590241208+12:00 [15:15:20] [WRN] [19] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/521996c2-8ee8-9c4b-ecc7-1271669d1154/Progress?positionTicks=12440000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:02.0824388 with Status Code 204
            2024-04-17T03:15:25.418319128+12:00 [15:15:25] [WRN] [15] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/521996c2-8ee8-9c4b-ecc7-1271669d1154/Progress?positionTicks=12490000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:01.9052128 with Status Code 204
            2024-04-17T03:15:30.543701373+12:00 [15:15:30] [WRN] [82] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/521996c2-8ee8-9c4b-ecc7-1271669d1154/Progress?positionTicks=12540000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:02.0292587 with Status Code 204
            2024-04-17T03:15:35.591382988+12:00 [15:15:35] [WRN] [22] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/521996c2-8ee8-9c4b-ecc7-1271669d1154/Progress?positionTicks=12590000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:02.0786647 with Status Code 204
            2024-04-17T03:15:40.230503546+12:00 [15:15:40] [WRN] [82] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/521996c2-8ee8-9c4b-ecc7-1271669d1154/Progress?positionTicks=12640000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:01.7151094 with Status Code 204
            2024-04-17T03:15:45.423418541+12:00 [15:15:45] [WRN] [94] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/521996c2-8ee8-9c4b-ecc7-1271669d1154/Progress?positionTicks=12690000000&isPaused=false&isMuted=false to 10.0.0.6 in 0:00:01.9013075 with Status Code 204
            2024-04-17T03:15:46.935679449+12:00 [15:15:46] [INF] [82] Emby.Server.Implementations.Session.SessionManager: Playback stopped reported by app Findroid 0.14.2 playing Special Episode - Save the World with Love!. Stopped at 1271000 ms
            2024-04-17T03:15:48.682941595+12:00 [15:15:48] [WRN] [82] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayingItems/521996c2-8ee8-9c4b-ecc7-1271669d1154?positionTicks=12710000000 to 10.0.0.6 in 0:00:01.7494947 with Status Code 204
            2024-04-17T03:15:51.266603288+12:00 [15:15:51] [WRN] [71] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayedItems/521996c2-8ee8-9c4b-ecc7-1271669d1154 to 10.0.0.6 in 0:00:01.8549019 with Status Code 200
            2024-04-17T03:15:56.230900650+12:00 [15:15:56] [WRN] [72] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Users/8c02c3f5-2565-44e3-bab3-14d7ab16b45e/PlayedItems/7a3874f3-de9e-976c-aaec-14ae181c879a to 10.0.0.6 in 0:00:01.6981261 with Status Code 200
            2024-04-17T10:45:45.490738237+12:00 [22:45:45] [INF] [127] Emby.Server.Implementations.IO.LibraryMonitor: Season 1 (/mnt/Jellyfin-Media/Shows/Solo Leveling/Season 1) will be refreshed.
            2024-04-17T10:45:45.497544278+12:00 [22:45:45] [INF] [127] Emby.Server.Implementations.Library.LibraryManager: Removing item, Type: Episode, Name: If I Had One More Chance, Path: /mnt/Jellyfin-Media/Shows/Solo Leveling/Season 1/S01E02-If I Had One More Chance [2F5293BD].mkv, Id: 8344ccbe-410b-07d7-2c76-e4d56b144dc1
            2024-04-17T11:59:59.994777447+12:00 [23:59:59] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: DailyTrigger fired for task: Detect Introductions
            2024-04-17T11:59:59.994893498+12:00 [23:59:59] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task AnalyzeEpisodesTask
            2024-04-17T11:59:59.994929599+12:00 [23:59:59] [INF] [123] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Detect Introductions
            2024-04-17T12:00:00.064538040+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.QueueManager: Running enqueue of items in library Shows (a656b907eb3a73532e40e44b968d0225)
            2024-04-17T12:00:00.089536935+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from 16bit Sensation: Another Layer season 1
            2024-04-17T12:00:00.089572449+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Angel Beats! season 1
            2024-04-17T12:00:00.111005958+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Bocchi the Rock! season 1
            2024-04-17T12:00:00.112509793+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Classroom of the Elite season 1
            2024-04-17T12:00:00.129536487+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Classroom of the Elite season 3
            2024-04-17T12:00:00.132020147+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 24 episodes from Dead Mount Death Play season 1
            2024-04-17T12:00:00.146606764+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 28 episodes from Code Geass: Lelouch of the Rebellion season 2
            2024-04-17T12:00:00.159091081+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Death Parade season 1
            2024-04-17T12:00:00.172941559+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 7 episodes from Demon Slayer season 2
            2024-04-17T12:00:00.179942121+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 22 episodes from Demon Slayer season 3
            2024-04-17T12:00:00.180997026+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Erased season 1
            2024-04-17T12:00:00.197276808+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Grimoire of Zero season 1
            2024-04-17T12:00:00.209067462+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from In/Spectre season 1
            2024-04-17T12:00:00.212704304+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 11 episodes from Demon Slayer season 4
            2024-04-17T12:00:00.220360779+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from In/Spectre season 2
            2024-04-17T12:00:00.224206959+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Konosuba: An Explosion on this Wonderful World! season 1
            2024-04-17T12:00:00.232701405+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from KamiKatsu: Working for God in a Godless World season 1
            2024-04-17T12:00:00.236629184+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Laid-Back Camp season 1
            2024-04-17T12:00:00.244714170+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Made in Abyss season 1
            2024-04-17T12:00:00.247286359+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Monogatari Series Second Season season 4
            2024-04-17T12:00:00.259078539+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Made in Abyss season 2
            2024-04-17T12:00:00.264781819+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 11 episodes from Oshi no Ko season 1
            2024-04-17T12:00:00.271814365+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 34 episodes from Monogatari Series Second Season season 2
            2024-04-17T12:00:00.275616514+12:00 /mnt/Jellyfin-Media/Shows/Oshi no Ko/Season 1/Oshi No Ko S01E01 1080p NF WEB-DL DDP2.0 H 264-anotherone (Oshi: No such file or directory
            2024-04-17T12:00:00.276208775+12:00 [00:00:00] [WRN] [123] ConfusedPolarBear.Plugin.IntroSkipper.Entrypoint: Chromaprint returned 0 points for "/mnt/Jellyfin-Media/Shows/Oshi no Ko/Season 1/Oshi No Ko S01E01 1080p NF WEB-DL DDP2.0 H 264-anotherone ("Oshi no Ko", Multi-Subs).mkv"
            2024-04-17T12:00:00.276306460+12:00 [00:00:00] [WRN] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Caught fingerprint error: ConfusedPolarBear.Plugin.IntroSkipper.FingerprintException: chromaprint output for "/mnt/Jellyfin-Media/Shows/Oshi no Ko/Season 1/Oshi No Ko S01E01 1080p NF WEB-DL DDP2.0 H 264-anotherone ("Oshi no Ko", Multi-Subs).mkv" was malformed
            2024-04-17T12:00:00.276318272+12:00    at ConfusedPolarBear.Plugin.IntroSkipper.FFmpegWrapper.Fingerprint(QueuedEpisode episode)
            2024-04-17T12:00:00.276323683+12:00    at ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask.AnalyzeSeason(ReadOnlyCollection`1 episodes, CancellationToken cancellationToken)
            2024-04-17T12:00:00.291872582+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Overlord season 1
            2024-04-17T12:00:00.307599337+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Overlord season 2
            2024-04-17T12:00:00.321583736+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Overlord season 3
            2024-04-17T12:00:00.331972854+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Overlord season 4
            2024-04-17T12:00:00.345478376+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Ron Kamonohashi's Forbidden Deductions season 1
            2024-04-17T12:00:00.346524613+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 15 episodes from Monogatari Series Second Season season 1
            2024-04-17T12:00:00.357599691+12:00 [00:00:00] [INF] [123] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Solo Leveling season 1
            2024-04-17T12:00:00.366956009+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Spy Classroom season 1
            2024-04-17T12:00:00.380177393+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Spy Classroom season 2
            2024-04-17T12:00:00.393318167+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 25 episodes from Summer Time Rendering season 1
            2024-04-17T12:00:00.417285294+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Tengoku Daimakyo season 1
            2024-04-17T12:00:00.429669945+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 24 episodes from That Time I Got Reincarnated as a Slime season 1
            2024-04-17T12:00:00.455313434+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 24 episodes from That Time I Got Reincarnated as a Slime season 2
            2024-04-17T12:00:00.478649840+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from The 100 Girlfriends Who Really, Really, Really, Really, Really Love You season 1
            2024-04-17T12:00:00.489883253+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from The Angel Next Door Spoils Me Rotten season 1
            2024-04-17T12:00:00.500899763+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from The Dangers in My Heart season 1
            2024-04-17T12:00:00.513010779+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from The Dangers in My Heart season 2
            2024-04-17T12:00:00.525270099+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from The Fruit of Evolution: Before I Knew It, My Life Had It Made season 1
            2024-04-17T12:00:00.536757786+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from The Magical Revolution of the Reincarnated Princess and the Genius Young Lady season 1
            2024-04-17T12:00:00.549090488+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from The Wrong Way to Use Healing Magic season 1
            2024-04-17T12:00:00.562742801+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 15 episodes from Tsukimichi: Moonlit Fantasy season 2
            2024-04-17T12:00:00.577397549+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 24 episodes from Undead Unluck season 1
            2024-04-17T12:00:00.603048959+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 13 episodes from Violet Evergarden season 1
            2024-04-17T12:00:00.618484460+12:00 [00:00:00] [INF] [134] ConfusedPolarBear.Plugin.IntroSkipper.AnalyzeEpisodesTask: Analyzing 12 episodes from Zom 100: Bucket List of the Dead season 1
            2024-04-17T12:00:00.933571374+12:00 [00:00:00] [INF] [123] Emby.Server.Implementations.ScheduledTasks.TaskManager: Detect Introductions Completed after 0 minute(s) and 0 seconds
            2024-04-17T12:00:00.933596246+12:00 [00:00:00] [INF] [123] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T12:00:00.995407224+12:00 [00:00:00] [INF] [123] Emby.Server.Implementations.ScheduledTasks.TaskManager: Daily trigger for Detect Introductions set to fire at 2024-04-18 00:00:00.000 +00:00, which is 23:59:59.0049303 from now.
            2024-04-17T12:38:28.970521288+12:00 [00:38:28] [INF] [47] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Scan Media Library
            2024-04-17T12:38:28.970591582+12:00 [00:38:28] [INF] [47] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task RefreshMediaLibraryTask
            2024-04-17T12:38:28.970768459+12:00 [00:38:28] [INF] [65] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Scan Media Library
            2024-04-17T12:38:28.970840204+12:00 [00:38:28] [INF] [65] Emby.Server.Implementations.IO.LibraryMonitor: Stopping directory watching for path /mnt/Jellyfin-Media/Shows
            2024-04-17T12:38:28.971081919+12:00 [00:38:28] [INF] [65] Emby.Server.Implementations.Library.LibraryManager: Validating media library
            2024-04-17T12:38:30.710803103+12:00 [00:38:30] [INF] [53] Emby.Server.Implementations.ScheduledTasks.TaskManager: Scan Media Library Completed after 0 minute(s) and 1 seconds
            2024-04-17T12:38:30.710848808+12:00 [00:38:30] [INF] [53] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T12:38:30.730879474+12:00 [00:38:30] [INF] [118] Emby.Server.Implementations.IO.LibraryMonitor: Watching directory /mnt/Jellyfin-Media/Shows
            2024-04-17T12:39:16.158202275+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Clean Log Directory
            2024-04-17T12:39:16.158326852+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task DeleteLogFileTask
            2024-04-17T12:39:16.158363441+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Clean Log Directory
            2024-04-17T12:39:16.158639223+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: Clean Log Directory Completed after 0 minute(s) and 0 seconds
            2024-04-17T12:39:16.158839458+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T12:39:16.186294434+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Clean Transcode Directory
            2024-04-17T12:39:16.186312919+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task DeleteTranscodeFileTask
            2024-04-17T12:39:16.186315923+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Clean Transcode Directory
            2024-04-17T12:39:16.186341263+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: Clean Transcode Directory Completed after 0 minute(s) and 0 seconds
            2024-04-17T12:39:16.186399275+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T12:39:16.210443973+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Download missing subtitles
            2024-04-17T12:39:16.210758253+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task SubtitleScheduledTask
            2024-04-17T12:39:16.210786092+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Download missing subtitles
            2024-04-17T12:39:16.210865856+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: Download missing subtitles Completed after 0 minute(s) and 0 seconds
            2024-04-17T12:39:16.211014071+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T12:39:16.242808492+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: TasksRefreshChannels
            2024-04-17T12:39:16.242844803+12:00 [00:39:16] [INF] [79] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task RefreshChannelsScheduledTask
            2024-04-17T12:39:16.242877175+12:00 [00:39:16] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing TasksRefreshChannels
            2024-04-17T12:39:16.243223133+12:00 [00:39:16] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: TasksRefreshChannels Completed after 0 minute(s) and 0 seconds
            2024-04-17T12:39:16.243424276+12:00 [00:39:16] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T12:39:16.375619916+12:00 [00:39:16] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Optimize database
            2024-04-17T12:39:16.375694277+12:00 [00:39:16] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task OptimizeDatabaseTask
            2024-04-17T12:39:16.375707392+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Optimize database
            2024-04-17T12:39:16.375718209+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.Tasks.OptimizeDatabaseTask: Optimizing and vacuuming jellyfin.db...
            2024-04-17T12:39:16.387656796+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.Tasks.OptimizeDatabaseTask: jellyfin.db optimized successfully!
            2024-04-17T12:39:16.387729839+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: Optimize database Completed after 0 minute(s) and 0 seconds
            2024-04-17T12:39:16.387949969+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T12:39:16.523519629+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Clean Cache Directory
            2024-04-17T12:39:16.523599426+12:00 [00:39:16] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task DeleteCacheFileTask
            2024-04-17T12:39:16.523635078+12:00 [00:39:16] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Clean Cache Directory
            2024-04-17T12:39:16.537437918+12:00 [00:39:16] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: Clean Cache Directory Completed after 0 minute(s) and 0 seconds
            2024-04-17T12:39:16.537462358+12:00 [00:39:16] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T12:39:34.323406753+12:00 [00:39:34] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Refresh Guide
            2024-04-17T12:39:34.323489477+12:00 [00:39:34] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task RefreshGuideScheduledTask
            2024-04-17T12:39:34.323505242+12:00 [00:39:34] [INF] [134] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Refresh Guide
            2024-04-17T12:39:37.323787819+12:00 [00:39:37] [INF] [46] Emby.Server.Implementations.LiveTv.LiveTvManager: Refreshing guide with 7 days of guide data
            2024-04-17T12:39:37.324188333+12:00 [00:39:37] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: Refresh Guide Completed after 0 minute(s) and 3 seconds
            2024-04-17T12:39:37.324403651+12:00 [00:39:37] [INF] [46] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T12:45:19.003581923+12:00 [00:45:19] [INF] [132] Emby.Server.Implementations.IO.LibraryMonitor: Classroom of the Elite (/mnt/Jellyfin-Media/Shows/Classroom of the Elite) will be refreshed.
            2024-04-17T12:45:26.799970833+12:00 [00:45:26] [INF] [46] Emby.Server.Implementations.IO.LibraryMonitor: Season 2 (/mnt/Jellyfin-Media/Shows/Tsukimichi -Moonlit Fantasy-/Season 2) will be refreshed.
            2024-04-17T13:59:59.998859529+12:00 [01:59:59] [INF] [127] Emby.Server.Implementations.ScheduledTasks.TaskManager: DailyTrigger fired for task: Extract Chapter Images
            2024-04-17T13:59:59.998946075+12:00 [01:59:59] [INF] [127] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task ChapterImagesTask
            2024-04-17T13:59:59.998960593+12:00 [01:59:59] [INF] [127] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Extract Chapter Images
            2024-04-17T14:00:00.021212440+12:00 [02:00:00] [INF] [127] Emby.Server.Implementations.MediaEncoder.EncodingManager: Stopping chapter extraction for Sushi & Hot Springs of the Dead because a chapter was found with a position greater than the runtime.
            2024-04-17T14:00:00.034555428+12:00 [02:00:00] [INF] [127] Emby.Server.Implementations.ScheduledTasks.TaskManager: Extract Chapter Images Completed after 0 minute(s) and 0 seconds
            2024-04-17T14:00:00.034573133+12:00 [02:00:00] [INF] [127] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T14:00:00.999941601+12:00 [02:00:00] [INF] [127] Emby.Server.Implementations.ScheduledTasks.TaskManager: Daily trigger for Extract Chapter Images set to fire at 2024-04-18 02:00:00.000 +00:00, which is 23:59:59.0004494 from now.
            2024-04-17T17:50:24.554993563+12:00 [05:50:24] [INF] [30] Emby.Server.Implementations.ScheduledTasks.TaskManager: IntervalTrigger fired for task: Update Plugins
            2024-04-17T17:50:24.555072397+12:00 [05:50:24] [INF] [30] Emby.Server.Implementations.ScheduledTasks.TaskManager: Queuing task PluginUpdateTask
            2024-04-17T17:50:24.555104986+12:00 [05:50:24] [INF] [30] Emby.Server.Implementations.ScheduledTasks.TaskManager: Executing Update Plugins
            2024-04-17T17:50:26.440601639+12:00 [05:50:26] [INF] [30] Emby.Server.Implementations.ScheduledTasks.TaskManager: Update Plugins Completed after 0 minute(s) and 1 seconds
            2024-04-17T17:50:26.440716215+12:00 [05:50:26] [INF] [30] Emby.Server.Implementations.ScheduledTasks.TaskManager: ExecuteQueuedTasks
            2024-04-17T19:30:40.596491098+12:00 [07:30:40] [INF] [48] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T19:30:40.596512964+12:00 [07:30:40] [INF] [48] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Delfin Direct Play Profile, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 21.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/c1be5ad1-9e37-098b-dd81-949c4ac3a485/stream?MediaSourceId=c1be5ad19e37098bdd81949c4ac3a485&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=c13f67b2140c0e642c7b43dcf744ad6d&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T19:51:13.796769133+12:00 [07:51:13] [INF] [88] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T19:51:13.797003386+12:00 [07:51:13] [INF] [88] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Delfin Direct Play Profile, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 22.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/81eadbf5-5d09-d3b6-9e47-48c0aa13ada5/stream?MediaSourceId=81eadbf55d09d3b69e4748c0aa13ada5&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=bd2a0013d9d93c64778b7ab7db9bec81&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T20:10:27.071406980+12:00 [08:10:27] [WRN] [70] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:02.0409014 with Status Code 204
            2024-04-17T20:10:36.827555698+12:00 [08:10:36] [WRN] [70] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.7829889 with Status Code 204
            2024-04-17T20:10:46.590457469+12:00 [08:10:46] [WRN] [95] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.5823556 with Status Code 204
            2024-04-17T20:10:56.593676205+12:00 [08:10:56] [WRN] [78] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.577014 with Status Code 204
            2024-04-17T20:11:06.734880807+12:00 [08:11:06] [WRN] [78] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.7102689 with Status Code 204
            2024-04-17T20:11:16.580387866+12:00 [08:11:16] [WRN] [78] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.5379681 with Status Code 204
            2024-04-17T20:11:25.986098616+12:00 [08:11:25] [WRN] [116] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:00.9772547 with Status Code 204
            2024-04-17T20:11:36.063982062+12:00 [08:11:36] [WRN] [116] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.0475298 with Status Code 204
            2024-04-17T20:11:46.079370100+12:00 [08:11:46] [WRN] [116] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.0564728 with Status Code 204
            2024-04-17T20:11:52.091941440+12:00 [08:11:52] [INF] [70] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T20:11:52.092041517+12:00 [08:11:52] [INF] [70] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Delfin Direct Play Profile, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 23.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/0ee0e9ac-c3a5-28e6-32ec-7d2ae66a409c/stream?MediaSourceId=0ee0e9acc3a528e632ec7d2ae66a409c&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=d1ce22413ee916e3b93b7ff08db7a3bf&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T20:23:40.780694998+12:00 [08:23:40] [WRN] [86] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.9231576 with Status Code 204
            2024-04-17T20:23:50.653310227+12:00 [08:23:50] [WRN] [79] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.7785153 with Status Code 204
            2024-04-17T20:24:00.477531806+12:00 [08:24:00] [WRN] [34] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.5955818 with Status Code 204
            2024-04-17T20:24:10.468527800+12:00 [08:24:10] [WRN] [95] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.5781446 with Status Code 204
            2024-04-17T20:24:20.300653580+12:00 [08:24:20] [WRN] [104] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.44548 with Status Code 204
            2024-04-17T20:24:30.854352079+12:00 [08:24:30] [WRN] [65] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.9836166 with Status Code 204
            2024-04-17T20:24:40.584493530+12:00 [08:24:40] [WRN] [78] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.7014163 with Status Code 204
            2024-04-17T20:24:50.566714498+12:00 [08:24:50] [WRN] [21] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.677663 with Status Code 204
            2024-04-17T20:25:00.633896829+12:00 [08:25:00] [WRN] [50] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.7374359 with Status Code 204
            2024-04-17T20:25:10.553019425+12:00 [08:25:10] [WRN] [50] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.6891441 with Status Code 204
            2024-04-17T20:25:20.587888441+12:00 [08:25:20] [WRN] [50] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.7065223 with Status Code 204
            2024-04-17T20:25:29.960815961+12:00 [08:25:29] [WRN] [65] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.0725165 with Status Code 204
            2024-04-17T20:25:40.009273936+12:00 [08:25:40] [WRN] [21] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.1135427 with Status Code 204
            2024-04-17T20:25:49.925049407+12:00 [08:25:49] [WRN] [21] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:01.0632576 with Status Code 204
            2024-04-17T20:32:13.035828454+12:00 [08:32:13] [INF] [50] Jellyfin.Api.Helpers.MediaInfoHelper: User policy for boswelja. EnablePlaybackRemuxing: True EnableVideoPlaybackTranscoding: True EnableAudioPlaybackTranscoding: True
            2024-04-17T20:32:13.035941046+12:00 [08:32:13] [INF] [50] Jellyfin.Api.Helpers.MediaInfoHelper: StreamBuilder.BuildVideoItem( Profile=Delfin Direct Play Profile, Path=/mnt/Jellyfin-Media/Shows/My Hero Academia/Season 3/[Judas] Boku no Hero Academia S3 - 24.mkv, AudioStreamIndex=null, SubtitleStreamIndex=null ) => ( PlayMethod=Transcode, TranscodeReason=SubtitleCodecNotSupported ) media:/videos/b173b98c-8126-c013-1a7c-41c88a35492e/stream?MediaSourceId=b173b98c8126c0131a7c41c88a35492e&AudioStreamIndex=1&SubtitleStreamIndex=4&api_key=<token>&SubtitleMethod=Encode&RequireAvc=false&Tag=f9b2a57a1ffb0ff7be349954eeb80584&TranscodeReasons=SubtitleCodecNotSupported
            2024-04-17T20:55:40.611222238+12:00 [08:55:40] [INF] [111] Emby.Server.Implementations.Session.SessionManager: Playback stopped reported by app Delfin 0.4.3 playing A Talk About Your Quirk. Stopped at 1319000 ms
            2024-04-17T20:57:41.735038317+12:00 [08:57:41] [WRN] [60] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:02.8914031 with Status Code 204
            2024-04-17T20:57:49.561053190+12:00 [08:57:49] [WRN] [133] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:00.7033006 with Status Code 204
            2024-04-17T20:57:59.720469269+12:00 [08:57:59] [WRN] [103] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:00.8903735 with Status Code 204
            2024-04-17T20:58:09.489793532+12:00 [08:58:09] [WRN] [33] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:00.648439 with Status Code 204
            2024-04-17T20:58:19.745812971+12:00 [08:58:19] [WRN] [60] Jellyfin.Server.Middleware.ResponseTimeMiddleware: Slow HTTP Response from http://10.0.0.40:30013/Sessions/Playing/Progress to 10.0.0.43 in 0:00:00.882618 with Status Code 204
            2024-04-17T21:01:14.460763473+12:00 [09:01:14] [INF] [77] Emby.Server.Implementations.Session.SessionManager: Playback stopped reported by app Delfin 0.4.3 playing A Season for Encounters. Stopped at 1318000 ms
        """.trimIndent()
            .lines()
    }
}
