plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Twilio - Voice")
                description.set("This is the public Twilio REST API.")
                url.set("https://support.twilio.com")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Twilio Voice OpenAPI")
                        email.set("support@twilio.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/twilio-voice-openapi-java.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/twilio-voice-openapi-java.git")
                    url.set("https://github.com/stainless-sdks/twilio-voice-openapi-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
