import kotlinx.benchmark.gradle.JvmBenchmarkTarget

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)

    alias(libs.plugins.detekt)

    id("org.jetbrains.kotlinx.benchmark") version "0.4.11"
}

android {
    namespace = "com.boswelja.logviewer.benchmark"

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    lint {
        sarifReport = true
        htmlReport = false
    }
}

repositories {
    google()
    mavenCentral()
}

kotlin {
    jvmToolchain(17)

    // Android
    androidTarget()

    // JVM
    jvm()

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":core"))

                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.animation)

                implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime:0.4.11")
            }
        }
    }
}

benchmark {
    targets {
        register("jvm") {
            this as JvmBenchmarkTarget
            jmhVersion = "1.37"
        }
    }
}

detekt {
    buildUponDefaultConfig = true
    config.setFrom("$rootDir/config/detekt.yml")
    basePath = rootDir.absolutePath
}
