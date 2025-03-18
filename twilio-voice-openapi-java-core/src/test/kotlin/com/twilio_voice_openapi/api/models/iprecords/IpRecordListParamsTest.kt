// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.iprecords

import com.twilio_voice_openapi.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpRecordListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        IpRecordListParams.builder().page(0L).pageSize(1L).pageToken("PageToken").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            IpRecordListParams.builder().page(0L).pageSize(1L).pageToken("PageToken").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("Page", "0")
                    .put("PageSize", "1")
                    .put("PageToken", "PageToken")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IpRecordListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
