// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.byoctrunks

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ByocTrunkTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val byocTrunk =
            ByocTrunk.builder()
                .accountSid("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .cnamLookupEnabled(true)
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .friendlyName("friendly_name")
                .fromDomainSid("SDE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .statusCallbackMethod(ByocTrunk.StatusCallbackMethod.GET)
                .statusCallbackUrl("https://example.com")
                .url("https://example.com")
                .voiceFallbackMethod(ByocTrunk.VoiceFallbackMethod.GET)
                .voiceFallbackUrl("https://example.com")
                .voiceMethod(ByocTrunk.VoiceMethod.GET)
                .voiceUrl("https://example.com")
                .build()

        assertThat(byocTrunk.accountSid()).contains("ACE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(byocTrunk.cnamLookupEnabled()).contains(true)
        assertThat(byocTrunk.connectionPolicySid()).contains("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(byocTrunk.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(byocTrunk.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(byocTrunk.friendlyName()).contains("friendly_name")
        assertThat(byocTrunk.fromDomainSid()).contains("SDE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(byocTrunk.sid()).contains("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(byocTrunk.statusCallbackMethod()).contains(ByocTrunk.StatusCallbackMethod.GET)
        assertThat(byocTrunk.statusCallbackUrl()).contains("https://example.com")
        assertThat(byocTrunk.url()).contains("https://example.com")
        assertThat(byocTrunk.voiceFallbackMethod()).contains(ByocTrunk.VoiceFallbackMethod.GET)
        assertThat(byocTrunk.voiceFallbackUrl()).contains("https://example.com")
        assertThat(byocTrunk.voiceMethod()).contains(ByocTrunk.VoiceMethod.GET)
        assertThat(byocTrunk.voiceUrl()).contains("https://example.com")
    }
}
