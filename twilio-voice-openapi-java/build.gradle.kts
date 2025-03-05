plugins {
    id("twilio-voice-openapi.kotlin")
    id("twilio-voice-openapi.publish")
}

dependencies {
    api(project(":twilio-voice-openapi-java-client-okhttp"))
}
