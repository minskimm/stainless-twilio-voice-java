// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import com.twilio_voice_openapi.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class ConnectionPolicyTargetListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ConnectionPolicyTargetListParams.builder()
            .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
            .page(0L)
            .pageSize(1L)
            .pageToken("PageToken")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            ConnectionPolicyTargetListParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .page(0L)
                .pageSize(1L)
                .pageToken("PageToken")
                .build()
        val expected = QueryParams.builder()
        expected.put("Page", "0")
        expected.put("PageSize", "1")
        expected.put("PageToken", "PageToken")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ConnectionPolicyTargetListParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
        val params =
            ConnectionPolicyTargetListParams.builder()
                .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .build()
        assertThat(params).isNotNull
        // path param "connectionPolicySid"
        assertThat(params.getPathParam(0)).isEqualTo("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
