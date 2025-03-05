// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClient
import com.twilio_voice_openapi.api.models.ByocTrunkCreateParams
import com.twilio_voice_openapi.api.models.ByocTrunkDeleteParams
import com.twilio_voice_openapi.api.models.ByocTrunkListParams
import com.twilio_voice_openapi.api.models.ByocTrunkRetrieveParams
import com.twilio_voice_openapi.api.models.ByocTrunkUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ByocTrunkServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val byocTrunkService = client.byocTrunks()

        val byocTrunk =
            byocTrunkService.create(
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
            )

        byocTrunk.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val byocTrunkService = client.byocTrunks()

        val byocTrunk =
            byocTrunkService.retrieve(
                ByocTrunkRetrieveParams.builder().sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()
            )

        byocTrunk.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val byocTrunkService = client.byocTrunks()

        val byocTrunk =
            byocTrunkService.update(
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
            )

        byocTrunk.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val byocTrunkService = client.byocTrunks()

        val byocTrunk =
            byocTrunkService.list(
                ByocTrunkListParams.builder().page(0L).pageSize(1L).pageToken("PageToken").build()
            )

        byocTrunk.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val byocTrunkService = client.byocTrunks()

        byocTrunkService.delete(
            ByocTrunkDeleteParams.builder().sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()
        )
    }
}
