plugins {
    kotlin("jvm") version "2.1.20"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "dev.m1sk9"
version = "v0.3.2-bp-1-18-2"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc-repo"
    }
    maven("https://oss.sonatype.org/content/groups/public/") {
        name = "sonatype"
    }
    maven("https://repo.xenondevs.xyz/releases") {
        name = "xenondevs"
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.18.2-R0.1-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.arrow-kt:arrow-core:1.2.4")
    implementation("io.arrow-kt:arrow-fx-coroutines:1.2.4")
}

val targetJavaVersion = 17
kotlin {
    jvmToolchain(targetJavaVersion)
}

tasks {
    build {
        dependsOn("shadowJar")
    }

    processResources {
        val props = mapOf("version" to version)
        inputs.properties(props)
        filteringCharset = "UTF-8"
        filesMatching("paper-plugin.yml") {
            expand(props)
        }
    }

    shadowJar {
        archiveFileName.set("Ribbon-${version}.jar")
    }
}
