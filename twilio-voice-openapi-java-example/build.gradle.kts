plugins {
    id("twilio-voice-openapi.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":twilio-voice-openapi-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.twilio_voice_openapi.api.example.Main"
}
