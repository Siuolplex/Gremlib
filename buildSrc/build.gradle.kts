plugins {
    `kotlin-dsl`
    `maven-publish`
}

group = "io.siuolplex"
version = "1.0"

repositories {
    mavenCentral()
}


publishing {
    repositories {
        maven {

        }
    }
}
