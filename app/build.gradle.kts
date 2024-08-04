plugins {
    alias(libs.plugins.jvm)
    alias(libs.plugins.javafx)
    alias(libs.plugins.javamodularity)
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.logback)
    implementation(libs.tornadofx)
    implementation(libs.coroutines.javafx)
    implementation(libs.fontawesomefx)
    implementation(libs.sqlite.jdbc)
}

java {
    modularity.inferModulePath.set(false)

    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

javafx {
    version = "22.0.1"
    modules("javafx.controls", "javafx.fxml")
}

application {
    mainClass = "org.example.mazebank.AppKt"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
