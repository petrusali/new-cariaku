plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

android {
    namespace = "com.example.shared"
    compileSdk = 34
    
    defaultConfig {
        minSdk = 24
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }
    
    js {
        browser()
        binaries.executable()
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                // Common dependencies
            }
        }
        
        val androidMain by getting {
            dependencies {
                // Android-specific dependencies
            }
        }
        
        val jsMain by getting {
            dependencies {
                // JS-specific dependencies
            }
        }
    }
}

// Conditional application of Compose Desktop and Skiko dependencies
