// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions.countries

import com.twilio_voice_openapi.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CountryFetchHighRiskSpecialPrefixesParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CountryFetchHighRiskSpecialPrefixesParams.builder()
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
            CountryFetchHighRiskSpecialPrefixesParams.builder()
                .isoCode("IsoCode")
                .page(0L)
                .pageSize(1L)
                .pageToken("PageToken")
                .build()

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
        val params = CountryFetchHighRiskSpecialPrefixesParams.builder().isoCode("IsoCode").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
        val params = CountryFetchHighRiskSpecialPrefixesParams.builder().isoCode("IsoCode").build()
        assertThat(params).isNotNull
        // path param "isoCode"
        assertThat(params.getPathParam(0)).isEqualTo("IsoCode")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
