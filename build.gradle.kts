plugins {
    java
    application
    id("org.javamodularity.moduleplugin") version "1.6.0" apply false
}

apply(plugin = "org.javamodularity.moduleplugin")

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_13
}


application {
    mainClassName = "modu/modu.Main"
    applicationDefaultJvmArgs = listOf(
//        "-Xshare:off",
//        "-verbose:class",
        "-Xmx128m"
    )
}
