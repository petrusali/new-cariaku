# System Architecture

This document outlines the architecture of the "CariAku Mobile 2.0" project, a Kotlin Multiplatform application.

## High-Level Overview

The project follows a modular architecture, typical for Kotlin Multiplatform projects, to maximize code sharing while allowing for platform-specific implementations. The architecture is composed of three main modules:

1.  **Shared Module (`shared`)**: This is the core of the application, containing the business logic, data models, and networking layer. It is written in common Kotlin and is shared across all target platforms.
2.  **Android Module (`android`)**: This module contains the Android-specific code, including the UI layer built with Jetpack Compose and platform-specific APIs. It depends on the `shared` module.
3.  **Web Module (`web`)**: This module contains the web-specific code, including the UI layer built with Compose for Web and any JavaScript interop. It also depends on the `shared` module.

## Source Code Paths

*   **Shared Logic**: [`shared/src/commonMain/kotlin/`](shared/src/commonMain/kotlin/)
*   **Android-Specific Code**: [`android/src/main/java/com/example/android/`](android/src/main/java/com/example/android/)
*   **Android UI**: The Android UI is expected to be implemented using Jetpack Compose within the [`android`](android) module.
*   **Web-Specific Code**: [`web/src/jsMain/kotlin/`](web/src/jsMain/kotlin/)
*   **Web UI**: The Web UI is built using Compose for Web in the [`web`](web) module.

## Key Technical Decisions

*   **Kotlin Multiplatform**: The project uses Kotlin Multiplatform to share code between Android and Web, reducing development time and ensuring consistency.
*   **Compose Multiplatform**: The UI for both Android and Web is built using Compose Multiplatform, allowing for a declarative UI approach and potential for sharing UI components.
*   **Model-View-ViewModel (MVVM)**: The presentation layer is expected to follow the MVVM pattern, with ViewModels in the `shared` module driving the UI state for both platforms.
*   **Dependency Injection**: A dependency injection framework (like Koin or Kodein) is expected to be used to manage dependencies within the `shared` module and provide platform-specific implementations.

## Design Patterns

*   **Modularization**: The project is divided into modules to separate concerns and improve maintainability.
*   **Repository Pattern**: The data layer is expected to use the Repository pattern to abstract data sources and provide a clean API to the business logic.
*   **Clean Architecture**: The project aims to follow the principles of Clean Architecture, with a clear separation between the domain, data, and presentation layers.