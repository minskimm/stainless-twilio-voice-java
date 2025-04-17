// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.delete
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.twilio_voice_openapi.api.client.TwilioVoiceOpenAPIClient
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClient
import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.core.http.Headers
import com.twilio_voice_openapi.api.core.jsonMapper
import com.twilio_voice_openapi.api.errors.BadRequestException
import com.twilio_voice_openapi.api.errors.InternalServerException
import com.twilio_voice_openapi.api.errors.NotFoundException
import com.twilio_voice_openapi.api.errors.PermissionDeniedException
import com.twilio_voice_openapi.api.errors.RateLimitException
import com.twilio_voice_openapi.api.errors.UnauthorizedException
import com.twilio_voice_openapi.api.errors.UnexpectedStatusCodeException
import com.twilio_voice_openapi.api.errors.UnprocessableEntityException
import com.twilio_voice_openapi.api.models.archives.ArchiveDeleteCallParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

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
    fun archivesDeleteCall400() {
        val archiveService = client.archives()
        stubFor(
            delete(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                archiveService.deleteCall(
                    ArchiveDeleteCallParams.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun archivesDeleteCall401() {
        val archiveService = client.archives()
        stubFor(
            delete(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                archiveService.deleteCall(
                    ArchiveDeleteCallParams.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun archivesDeleteCall403() {
        val archiveService = client.archives()
        stubFor(
            delete(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                archiveService.deleteCall(
                    ArchiveDeleteCallParams.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun archivesDeleteCall404() {
        val archiveService = client.archives()
        stubFor(
            delete(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                archiveService.deleteCall(
                    ArchiveDeleteCallParams.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun archivesDeleteCall422() {
        val archiveService = client.archives()
        stubFor(
            delete(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                archiveService.deleteCall(
                    ArchiveDeleteCallParams.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun archivesDeleteCall429() {
        val archiveService = client.archives()
        stubFor(
            delete(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                archiveService.deleteCall(
                    ArchiveDeleteCallParams.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun archivesDeleteCall500() {
        val archiveService = client.archives()
        stubFor(
            delete(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                archiveService.deleteCall(
                    ArchiveDeleteCallParams.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun archivesDeleteCall999() {
        val archiveService = client.archives()
        stubFor(
            delete(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                archiveService.deleteCall(
                    ArchiveDeleteCallParams.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
