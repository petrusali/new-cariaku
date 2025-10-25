# Technologies Used

This document outlines the technologies, libraries, and development setup for the "CariAku Mobile 2.0" project.

## Core Technologies

*   **Kotlin Multiplatform (1.9.10):** The project is built using Kotlin Multiplatform to share code between the Android and Web targets.
*   **Jetpack Compose (1.5.1):** The user interface for both Android and Web is built with Jetpack Compose, enabling a declarative and modern UI development approach.
*   **Gradle:** The project uses Gradle for dependency management and build automation.

## Android-Specific Technologies

*   **Android App Plugin (8.2.2):** The Android application is built using the standard Android Gradle Plugin.
*   **Android SDK:** The project targets Android SDK version 34, with a minimum SDK version of 24.
*   **Jetpack Libraries:**
    *   `androidx.core:core-ktx:1.12.0`
    *   `androidx.lifecycle:lifecycle-runtime-ktx:2.7.0`
    *   `androidx.activity:activity-compose:1.8.2`
    *   `androidx.compose:compose-bom:2024.02.00`
    *   `androidx.compose.ui:ui`
    *   `androidx.compose.ui:ui-graphics`
    *   `androidx.compose.ui:ui-tooling-preview`
    *   `androidx.compose.material3:material3`
    *   `androidx.appcompat:appcompat:1.6.1`
    *   `com.google.android.material:material:1.11.0`

## Web-Specific Technologies

*   **Compose for Web:** The web application's UI is built using Compose for Web.
*   **Kotlin/JS:** The web application is built using the Kotlin/JS plugin, targeting the browser environment.

## Development Setup

*   **Java Version:** The project is configured to use Java 1.8.
*   **Android Studio / IntelliJ IDEA:** The recommended IDE for development is Android Studio or IntelliJ IDEA with the Kotlin Multiplatform Mobile plugin.
*   **Gradle Wrapper:** The project includes a Gradle wrapper for consistent builds across different development environments.

## Technical Constraints

*   **Minimum Android SDK:** The minimum supported Android version is API level 24 (Android 7.0 Nougat).
*   **Browser Compatibility:** The web application's compatibility is determined by the browsers supported by Compose for Web.