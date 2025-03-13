// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.sourceipmappings

import com.twilio_voice_openapi.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class SourceIpMappingListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SourceIpMappingListParams.builder().page(0L).pageSize(1L).pageToken("PageToken").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            SourceIpMappingListParams.builder().page(0L).pageSize(1L).pageToken("PageToken").build()
        val expected = QueryParams.builder()
        expected.put("Page", "0")
        expected.put("PageSize", "1")
        expected.put("PageToken", "PageToken")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SourceIpMappingListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
