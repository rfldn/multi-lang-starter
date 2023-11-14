plugins {
    kotlin("jvm") version "1.9.10"
    application
}

group = "code.retreat"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.mockk:mockk:1.13.8")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(20)
}

application {
    mainClass.set("AppKt")
}
