// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectionPolicyUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ConnectionPolicyUpdateParams.builder()
            .sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
            .friendlyName("updated_name")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            ConnectionPolicyUpdateParams.builder().sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()

        assertThat(params._pathParam(0)).isEqualTo("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            ConnectionPolicyUpdateParams.builder()
                .sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .friendlyName("updated_name")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.friendlyName()).contains("updated_name")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConnectionPolicyUpdateParams.builder().sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()

        val body = params._body()

        assertNotNull(body)
    }
}
