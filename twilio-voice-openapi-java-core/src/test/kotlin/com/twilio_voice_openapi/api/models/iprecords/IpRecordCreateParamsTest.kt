// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.iprecords

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpRecordCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        IpRecordCreateParams.builder()
            .ipAddress("10.2.3.4")
            .cidrPrefixLength(30L)
            .friendlyName("friendly_name")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            IpRecordCreateParams.builder()
                .ipAddress("10.2.3.4")
                .cidrPrefixLength(30L)
                .friendlyName("friendly_name")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.ipAddress()).isEqualTo("10.2.3.4")
        assertThat(body.cidrPrefixLength()).contains(30L)
        assertThat(body.friendlyName()).contains("friendly_name")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = IpRecordCreateParams.builder().ipAddress("10.2.3.4").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.ipAddress()).isEqualTo("10.2.3.4")
    }
}
