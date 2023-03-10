plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.xapp.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.xapp.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

// NOTE - androidx needs it
repositories {
    mavenCentral()
    google()
}

dependencies {
    // NOTE - add flutter
    implementation(project(":flutter"))
    implementation(project(":shared"))
    // NOTE - update deps
    implementation("androidx.compose.ui:ui:1.3.2")
    implementation("androidx.compose.ui:ui-tooling:1.3.2")
    implementation("androidx.compose.ui:ui-tooling-preview:1.3.2")
    implementation("androidx.compose.foundation:foundation:1.3.1")
    implementation("androidx.compose.material:material:1.3.1")
    implementation("androidx.activity:activity-compose:1.6.1")
}