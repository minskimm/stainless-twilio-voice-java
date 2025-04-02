// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.twilio_voice_openapi.api.core.jsonMapper
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceDialingPermissions =
            VoiceDialingPermissions.builder()
                .dialingPermissionsInheritance(true)
                .url("https://example.com")
                .build()

        val roundtrippedVoiceDialingPermissions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceDialingPermissions),
                jacksonTypeRef<VoiceDialingPermissions>(),
            )

        assertThat(roundtrippedVoiceDialingPermissions).isEqualTo(voiceDialingPermissions)
    }
}
