// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class ConnectionPolicyCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ConnectionPolicyCreateParams.builder().friendlyName("friendly_name").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params = ConnectionPolicyCreateParams.builder().friendlyName("friendly_name").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.friendlyName()).contains("friendly_name")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = ConnectionPolicyCreateParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
