// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class ByocTrunkUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ByocTrunkUpdateParams.builder()
            .sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
            .cnamLookupEnabled(true)
            .connectionPolicySid("NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
            .friendlyName("update_name")
            .fromDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
            .statusCallbackMethod(ByocTrunkUpdateParams.StatusCallbackMethod.GET)
            .statusCallbackUrl("https://byoc.example.com/twilio_updated/status_callback")
            .voiceFallbackMethod(ByocTrunkUpdateParams.VoiceFallbackMethod.GET)
            .voiceFallbackUrl("https://byoc.example.com/twilio_updated/fallback")
            .voiceMethod(ByocTrunkUpdateParams.VoiceMethod.GET)
            .voiceUrl("https://byoc.example.com/twilio_updated/app")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            ByocTrunkUpdateParams.builder()
                .sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .cnamLookupEnabled(true)
                .connectionPolicySid("NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
                .friendlyName("update_name")
                .fromDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
                .statusCallbackMethod(ByocTrunkUpdateParams.StatusCallbackMethod.GET)
                .statusCallbackUrl("https://byoc.example.com/twilio_updated/status_callback")
                .voiceFallbackMethod(ByocTrunkUpdateParams.VoiceFallbackMethod.GET)
                .voiceFallbackUrl("https://byoc.example.com/twilio_updated/fallback")
                .voiceMethod(ByocTrunkUpdateParams.VoiceMethod.GET)
                .voiceUrl("https://byoc.example.com/twilio_updated/app")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.cnamLookupEnabled()).contains(true)
        assertThat(body.connectionPolicySid()).contains("NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
        assertThat(body.friendlyName()).contains("update_name")
        assertThat(body.fromDomainSid()).contains("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
        assertThat(body.statusCallbackMethod())
            .contains(ByocTrunkUpdateParams.StatusCallbackMethod.GET)
        assertThat(body.statusCallbackUrl())
            .contains("https://byoc.example.com/twilio_updated/status_callback")
        assertThat(body.voiceFallbackMethod())
            .contains(ByocTrunkUpdateParams.VoiceFallbackMethod.GET)
        assertThat(body.voiceFallbackUrl())
            .contains("https://byoc.example.com/twilio_updated/fallback")
        assertThat(body.voiceMethod()).contains(ByocTrunkUpdateParams.VoiceMethod.GET)
        assertThat(body.voiceUrl()).contains("https://byoc.example.com/twilio_updated/app")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ByocTrunkUpdateParams.builder().sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
        val params =
            ByocTrunkUpdateParams.builder().sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()
        assertThat(params).isNotNull
        // path param "sid"
        assertThat(params.getPathParam(0)).isEqualTo("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
