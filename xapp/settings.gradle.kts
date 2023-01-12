pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "xapp"
include(":androidApp")
include(":shared")

// nowtech - include flutter module (flutter_gui)
apply { from("include_flutter.gradle") }
