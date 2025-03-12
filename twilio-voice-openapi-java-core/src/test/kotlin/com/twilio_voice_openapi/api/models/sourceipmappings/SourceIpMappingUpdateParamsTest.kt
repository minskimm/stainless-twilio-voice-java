// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.sourceipmappings

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class SourceIpMappingUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SourceIpMappingUpdateParams.builder()
            .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
            .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            SourceIpMappingUpdateParams.builder()
                .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.sipDomainSid()).isEqualTo("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SourceIpMappingUpdateParams.builder()
                .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.sipDomainSid()).isEqualTo("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
        val params =
            SourceIpMappingUpdateParams.builder()
                .sid("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sipDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
                .build()
        assertThat(params).isNotNull
        // path param "sid"
        assertThat(params.getPathParam(0)).isEqualTo("IBE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
