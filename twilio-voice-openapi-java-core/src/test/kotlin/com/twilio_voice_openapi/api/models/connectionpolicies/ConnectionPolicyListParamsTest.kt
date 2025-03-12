// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.connectionpolicies

import com.twilio_voice_openapi.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class ConnectionPolicyListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ConnectionPolicyListParams.builder().page(0L).pageSize(1L).pageToken("PageToken").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            ConnectionPolicyListParams.builder()
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
        val params = ConnectionPolicyListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
