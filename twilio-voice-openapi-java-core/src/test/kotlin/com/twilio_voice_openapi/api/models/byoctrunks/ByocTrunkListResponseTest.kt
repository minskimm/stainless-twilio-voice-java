// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.byoctrunks

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ByocTrunkListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val byocTrunkListResponse =
            ByocTrunkListResponse.builder()
                .addByocTrunk(
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
                )
                .meta(
                    ByocTrunkListResponse.Meta.builder()
                        .firstPageUrl("https://example.com")
                        .key("key")
                        .nextPageUrl("https://example.com")
                        .page(0L)
                        .pageSize(0L)
                        .previousPageUrl("https://example.com")
                        .url("https://example.com")
                        .build()
                )
                .build()

        assertThat(byocTrunkListResponse.byocTrunks().getOrNull())
            .containsExactly(
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
            )
        assertThat(byocTrunkListResponse.meta())
            .contains(
                ByocTrunkListResponse.Meta.builder()
                    .firstPageUrl("https://example.com")
                    .key("key")
                    .nextPageUrl("https://example.com")
                    .page(0L)
                    .pageSize(0L)
                    .previousPageUrl("https://example.com")
                    .url("https://example.com")
                    .build()
            )
    }
}
