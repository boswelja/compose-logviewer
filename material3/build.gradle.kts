import org.jetbrains.dokka.gradle.DokkaTaskPartial
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import java.net.URL

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)

    alias(libs.plugins.detekt)

    alias(libs.plugins.dokka)

    id("maven-publish")
    id("signing")
}

group = "io.github.boswelja.logviewer"
version = "1.0.0"

android {
    namespace = "com.boswelja.logviewer.material3"

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

    publishing {
        singleVariant("release") {
            withJavadocJar()
            withSourcesJar()
        }
    }
}

repositories {
    google()
    mavenCentral()
}

kotlin {
    applyDefaultHierarchyTemplate()

    jvmToolchain(21)

    explicitApi()

    // Android
    androidTarget {
        publishLibraryVariants("release")
    }

    // Apple
    macosX64()
    macosArm64()
    iosX64()
    iosArm64()

    // JVM
    jvm()

    // WASM
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }

    sourceSets {
        commonMain {
            dependencies {
                api(project(":core"))
                implementation(compose.material3)
            }
        }
    }
}

detekt {
    buildUponDefaultConfig = true
    config.setFrom("$rootDir/config/detekt.yml")
    basePath = rootDir.absolutePath
}

signing {
    val signingKey: String? by project
    val signingPassword: String? by project
    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publishing.publications)
}

publishing {
    repositories {
        if (System.getenv("PUBLISHING") == "true") {
            maven("https://maven.pkg.github.com/boswelja/Compose-LogViewer") {
                val githubUsername: String? by project.properties
                val githubToken: String? by project.properties
                name = "github"
                credentials {
                    username = githubUsername
                    password = githubToken
                }
            }
            maven("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/") {
                val ossrhUsername: String? by project
                val ossrhPassword: String? by project
                name = "oss"
                credentials {
                    username = ossrhUsername
                    password = ossrhPassword
                }
            }
        }
    }

    publications.withType<MavenPublication> {
        pom {
            name = "material3"
            description = "Composable convenience for all your log-viewing needs!"
            url = "https://github.com/boswelja/compose-logviewer"
            licenses {
                license {
                    name = "MIT"
                    url = "https://github.com/boswelja/compose-logviewer/blob/main/LICENSE"
                }
            }
            developers {
                developer {
                    id = "boswelja"
                    name = "Jack Boswell (boswelja)"
                    email = "boswelja@outlook.com"
                    url = "https://github.com/boswelja"
                }
            }
            scm {
                connection.set("scm:git:github.com/boswelja/compose-logviewer.git")
                developerConnection.set("scm:git:ssh://github.com/boswelja/compose-logviewer.git")
                url.set("https://github.com/boswelja/compose-logviewer")
            }
        }
    }
}

tasks.withType<DokkaTaskPartial>().configureEach {
    dokkaSourceSets.configureEach {
        includes.from("MODULE.md")
        externalDocumentationLink(
            url = "https://developer.android.com/reference/kotlin/",
            packageListUrl = "https://developer.android.com/reference/kotlin/androidx/package-list"
        )
        sourceLink {
            localDirectory.set(projectDir.resolve("src"))
            remoteUrl.set(URL("https://github.com/boswelja/compose-logviewer/tree/main/material3/src"))
            remoteLineSuffix.set("#L")
        }
    }
}
