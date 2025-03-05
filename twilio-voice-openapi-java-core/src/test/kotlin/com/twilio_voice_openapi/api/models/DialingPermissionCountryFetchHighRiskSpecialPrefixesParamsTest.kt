// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import com.twilio_voice_openapi.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class DialingPermissionCountryFetchHighRiskSpecialPrefixesParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        DialingPermissionCountryFetchHighRiskSpecialPrefixesParams.builder()
            .isoCode("IsoCode")
            .page(0L)
            .pageSize(1L)
            .pageToken("PageToken")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            DialingPermissionCountryFetchHighRiskSpecialPrefixesParams.builder()
                .isoCode("IsoCode")
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
            DialingPermissionCountryFetchHighRiskSpecialPrefixesParams.builder()
                .isoCode("IsoCode")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
        val params =
            DialingPermissionCountryFetchHighRiskSpecialPrefixesParams.builder()
                .isoCode("IsoCode")
                .build()
        assertThat(params).isNotNull
        // path param "isoCode"
        assertThat(params.getPathParam(0)).isEqualTo("IsoCode")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
