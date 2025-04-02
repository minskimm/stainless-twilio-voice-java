// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClient
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingCreateParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingDeleteParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingListParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingRetrieveParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SourceIpMappingServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val sourceIpMappingService = client.sourceIpMappings()

        val sourceIpMapping =
            sourceIpMappingService.create(
                SourceIpMappingCreateParams.builder()
                    .ipRecordSid("ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                    .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                    .build()
            )

        sourceIpMapping.validate()
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
        val sourceIpMappingService = client.sourceIpMappings()

        val sourceIpMapping =
            sourceIpMappingService.retrieve(
                SourceIpMappingRetrieveParams.builder()
                    .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .build()
            )

        sourceIpMapping.validate()
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
        val sourceIpMappingService = client.sourceIpMappings()

        val sourceIpMapping =
            sourceIpMappingService.update(
                SourceIpMappingUpdateParams.builder()
                    .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
                    .build()
            )

        sourceIpMapping.validate()
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
        val sourceIpMappingService = client.sourceIpMappings()

        val sourceIpMappings =
            sourceIpMappingService.list(
                SourceIpMappingListParams.builder()
                    .page(0L)
                    .pageSize(1L)
                    .pageToken("PageToken")
                    .build()
            )

        sourceIpMappings.validate()
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
        val sourceIpMappingService = client.sourceIpMappings()

        sourceIpMappingService.delete(
            SourceIpMappingDeleteParams.builder().sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()
        )
    }
}
