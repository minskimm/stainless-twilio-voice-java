// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClientAsync
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingCreateParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingDeleteParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingListParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingRetrieveParams
import com.twilio_voice_openapi.api.models.sourceipmappings.SourceIpMappingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SourceIpMappingServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val sourceIpMappingServiceAsync = client.sourceIpMappings()

        val sourceIpMappingFuture =
            sourceIpMappingServiceAsync.create(
                SourceIpMappingCreateParams.builder()
                    .ipRecordSid("ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                    .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                    .build()
            )

        val sourceIpMapping = sourceIpMappingFuture.get()
        sourceIpMapping.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val sourceIpMappingServiceAsync = client.sourceIpMappings()

        val sourceIpMappingFuture =
            sourceIpMappingServiceAsync.retrieve(
                SourceIpMappingRetrieveParams.builder()
                    .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .build()
            )

        val sourceIpMapping = sourceIpMappingFuture.get()
        sourceIpMapping.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val sourceIpMappingServiceAsync = client.sourceIpMappings()

        val sourceIpMappingFuture =
            sourceIpMappingServiceAsync.update(
                SourceIpMappingUpdateParams.builder()
                    .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
                    .build()
            )

        val sourceIpMapping = sourceIpMappingFuture.get()
        sourceIpMapping.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val sourceIpMappingServiceAsync = client.sourceIpMappings()

        val sourceIpMappingsFuture =
            sourceIpMappingServiceAsync.list(
                SourceIpMappingListParams.builder()
                    .page(0L)
                    .pageSize(1L)
                    .pageToken("PageToken")
                    .build()
            )

        val sourceIpMappings = sourceIpMappingsFuture.get()
        sourceIpMappings.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val sourceIpMappingServiceAsync = client.sourceIpMappings()

        val future =
            sourceIpMappingServiceAsync.delete(
                SourceIpMappingDeleteParams.builder()
                    .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .build()
            )

        val response = future.get()
    }
}
