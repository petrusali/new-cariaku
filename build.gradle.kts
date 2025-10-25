// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Apply the Kotlin Multiplatform plugin to the root project
    kotlin("multiplatform") version "1.9.10" apply false
    // Apply the Compose Gradle plugin for Compose for Web
    id("org.jetbrains.compose") version "1.5.1" apply false
    // Android application plugin
    id("com.android.application") version "8.2.2" apply false
    // Kotlin Android plugin
    kotlin("android") version "1.9.10" apply false
    // Android library plugin
    id("com.android.library") version "8.2.2" apply false
}
