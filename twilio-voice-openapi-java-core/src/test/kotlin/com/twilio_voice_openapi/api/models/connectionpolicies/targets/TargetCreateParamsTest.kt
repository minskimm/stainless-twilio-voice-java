// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies.targets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TargetCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        TargetCreateParams.builder()
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
    fun pathParams() {
        val params =
            TargetCreateParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .target("sip:sip-box.com:1234")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            TargetCreateParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .target("sip:sip-box.com:1234")
                .enabled(true)
                .friendlyName("friendly_name")
                .priority(1L)
                .weight(20L)
                .build()

        val body = params._body()

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
            TargetCreateParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .target("sip:sip-box.com:1234")
                .build()

        val body = params._body()

        assertThat(body.target()).isEqualTo("sip:sip-box.com:1234")
    }
}
