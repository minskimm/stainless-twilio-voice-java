// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.delete
import com.github.tomakehurst.wiremock.client.WireMock.deleteRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.twilio_voice_openapi.api.client.TwilioVoiceOpenAPIClient
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClient
import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.models.archives.ArchiveDeleteCallParams
import java.time.LocalDate
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: TwilioVoiceOpenAPIClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .username("My Username")
                .password("My Password")
                .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun deleteCall() {
        val archiveService = client.archives()
        stubFor(delete(anyUrl()).willReturn(ok("{}")))

        archiveService.deleteCall(
            ArchiveDeleteCallParams.builder()
                .date(LocalDate.parse("2019-12-27"))
                .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            deleteRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
