plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.6.10"
    kotlin("plugin.compose") version "2.0.0" // Apply the correct Compose plugin with version
}

kotlin {
    js {
        browser()
        binaries.executable()
    }
    
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(compose.web.core)
                implementation(compose.runtime)
                // Add the Compose Multiplatform BOM for version management
                implementation(platform("androidx.compose:compose-bom:2024.02.00"))
            }
        }
    }
}
