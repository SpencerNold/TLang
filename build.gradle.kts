plugins {
    java
    antlr
    application
}

group = "me.spencernold.tlang"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.13.1")
    implementation("org.antlr:antlr4-runtime:4.13.1")
}

application {
    mainClass = "me.spencernold.tlang.Main"
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf("-visitor", "-long-messages")
    outputDirectory = file("build/generated-src/antlr/main/me/spencernold/tlang/antlr")
}