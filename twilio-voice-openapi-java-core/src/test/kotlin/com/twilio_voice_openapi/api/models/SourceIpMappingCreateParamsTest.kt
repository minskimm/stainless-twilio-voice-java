// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class SourceIpMappingCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SourceIpMappingCreateParams.builder()
            .ipRecordSid("ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
            .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            SourceIpMappingCreateParams.builder()
                .ipRecordSid("ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.ipRecordSid()).isEqualTo("ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
        assertThat(body.sipDomainSid()).isEqualTo("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SourceIpMappingCreateParams.builder()
                .ipRecordSid("ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.ipRecordSid()).isEqualTo("ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
        assertThat(body.sipDomainSid()).isEqualTo("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
    }
}
