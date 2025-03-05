// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class ConnectionPolicyDeleteParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ConnectionPolicyDeleteParams.builder().sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
        val params =
            ConnectionPolicyDeleteParams.builder().sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()
        assertThat(params).isNotNull
        // path param "sid"
        assertThat(params.getPathParam(0)).isEqualTo("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
