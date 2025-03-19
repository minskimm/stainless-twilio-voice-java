// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VoiceDialingPermissionsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val voiceDialingPermissions =
            VoiceDialingPermissions.builder()
                .dialingPermissionsInheritance(true)
                .url("https://example.com")
                .build()

        assertThat(voiceDialingPermissions.dialingPermissionsInheritance()).contains(true)
        assertThat(voiceDialingPermissions.url()).contains("https://example.com")
    }
}
