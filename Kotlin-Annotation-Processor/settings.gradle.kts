pluginManagement {
    plugins {
        kotlin("jvm") version "2.2.20"
        kotlin("kapt") version "2.2.20"
    }
}
rootProject.name = "kotlin-annotation-processor"

include("annotations")
include("processor")
include("app")
