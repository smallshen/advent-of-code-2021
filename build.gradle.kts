plugins {
    kotlin("jvm") version "1.6.0"
}

group = "club.eridani"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks {
    compileKotlin {
        kotlinOptions.freeCompilerArgs = listOf("-Xlambdas=indy")
    }

    compileTestKotlin {
        kotlinOptions.freeCompilerArgs = listOf("-Xlambdas=indy")
    }
}