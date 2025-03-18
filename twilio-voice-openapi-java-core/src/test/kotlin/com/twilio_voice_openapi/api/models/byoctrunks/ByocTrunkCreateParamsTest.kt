// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.byoctrunks

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ByocTrunkCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ByocTrunkCreateParams.builder()
            .cnamLookupEnabled(false)
            .connectionPolicySid("NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
            .friendlyName("friendly_name")
            .fromDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
            .statusCallbackMethod(ByocTrunkCreateParams.StatusCallbackMethod.GET)
            .statusCallbackUrl("https://byoc.example.com/twilio/status_callback")
            .voiceFallbackMethod(ByocTrunkCreateParams.VoiceFallbackMethod.GET)
            .voiceFallbackUrl("https://byoc.example.com/twilio/fallback")
            .voiceMethod(ByocTrunkCreateParams.VoiceMethod.GET)
            .voiceUrl("https://byoc.example.com/twilio/app")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            ByocTrunkCreateParams.builder()
                .cnamLookupEnabled(false)
                .connectionPolicySid("NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .friendlyName("friendly_name")
                .fromDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .statusCallbackMethod(ByocTrunkCreateParams.StatusCallbackMethod.GET)
                .statusCallbackUrl("https://byoc.example.com/twilio/status_callback")
                .voiceFallbackMethod(ByocTrunkCreateParams.VoiceFallbackMethod.GET)
                .voiceFallbackUrl("https://byoc.example.com/twilio/fallback")
                .voiceMethod(ByocTrunkCreateParams.VoiceMethod.GET)
                .voiceUrl("https://byoc.example.com/twilio/app")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.cnamLookupEnabled()).contains(false)
        assertThat(body.connectionPolicySid()).contains("NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
        assertThat(body.friendlyName()).contains("friendly_name")
        assertThat(body.fromDomainSid()).contains("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
        assertThat(body.statusCallbackMethod())
            .contains(ByocTrunkCreateParams.StatusCallbackMethod.GET)
        assertThat(body.statusCallbackUrl())
            .contains("https://byoc.example.com/twilio/status_callback")
        assertThat(body.voiceFallbackMethod())
            .contains(ByocTrunkCreateParams.VoiceFallbackMethod.GET)
        assertThat(body.voiceFallbackUrl()).contains("https://byoc.example.com/twilio/fallback")
        assertThat(body.voiceMethod()).contains(ByocTrunkCreateParams.VoiceMethod.GET)
        assertThat(body.voiceUrl()).contains("https://byoc.example.com/twilio/app")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = ByocTrunkCreateParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
