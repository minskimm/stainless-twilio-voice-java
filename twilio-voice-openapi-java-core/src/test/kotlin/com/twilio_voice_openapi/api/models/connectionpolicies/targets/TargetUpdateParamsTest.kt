// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies.targets

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TargetUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        TargetUpdateParams.builder()
            .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
            .sid("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
            .enabled(false)
            .friendlyName("updated_name")
            .priority(2L)
            .target("sip:sip-updated.com:4321")
            .weight(10L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            TargetUpdateParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sid("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        assertThat(params._pathParam(1)).isEqualTo("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            TargetUpdateParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sid("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .enabled(false)
                .friendlyName("updated_name")
                .priority(2L)
                .target("sip:sip-updated.com:4321")
                .weight(10L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.enabled()).contains(false)
        assertThat(body.friendlyName()).contains("updated_name")
        assertThat(body.priority()).contains(2L)
        assertThat(body.target()).contains("sip:sip-updated.com:4321")
        assertThat(body.weight()).contains(10L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TargetUpdateParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .sid("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .build()

        val body = params._body()

        assertNotNull(body)
    }
}
