// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class ConnectionPolicyTargetCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ConnectionPolicyTargetCreateParams.builder()
            .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
            .target("sip:sip-box.com:1234")
            .enabled(true)
            .friendlyName("friendly_name")
            .priority(1L)
            .weight(20L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            ConnectionPolicyTargetCreateParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .target("sip:sip-box.com:1234")
                .enabled(true)
                .friendlyName("friendly_name")
                .priority(1L)
                .weight(20L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.target()).isEqualTo("sip:sip-box.com:1234")
        assertThat(body.enabled()).contains(true)
        assertThat(body.friendlyName()).contains("friendly_name")
        assertThat(body.priority()).contains(1L)
        assertThat(body.weight()).contains(20L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConnectionPolicyTargetCreateParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .target("sip:sip-box.com:1234")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.target()).isEqualTo("sip:sip-box.com:1234")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
        val params =
            ConnectionPolicyTargetCreateParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .target("sip:sip-box.com:1234")
                .build()
        assertThat(params).isNotNull
        // path param "connectionPolicySid"
        assertThat(params.getPathParam(0)).isEqualTo("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
