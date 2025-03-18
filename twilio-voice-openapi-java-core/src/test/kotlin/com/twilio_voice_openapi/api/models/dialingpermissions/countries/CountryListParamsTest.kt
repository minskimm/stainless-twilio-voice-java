// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions.countries

import com.twilio_voice_openapi.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CountryListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CountryListParams.builder()
            .continent("Continent")
            .countryCode("CountryCode")
            .highRiskSpecialNumbersEnabled(true)
            .highRiskTollfraudNumbersEnabled(true)
            .isoCode("IsoCode")
            .lowRiskNumbersEnabled(true)
            .page(0L)
            .pageSize(1L)
            .pageToken("PageToken")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            CountryListParams.builder()
                .continent("Continent")
                .countryCode("CountryCode")
                .highRiskSpecialNumbersEnabled(true)
                .highRiskTollfraudNumbersEnabled(true)
                .isoCode("IsoCode")
                .lowRiskNumbersEnabled(true)
                .page(0L)
                .pageSize(1L)
                .pageToken("PageToken")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("Continent", "Continent")
                    .put("CountryCode", "CountryCode")
                    .put("HighRiskSpecialNumbersEnabled", "true")
                    .put("HighRiskTollfraudNumbersEnabled", "true")
                    .put("IsoCode", "IsoCode")
                    .put("LowRiskNumbersEnabled", "true")
                    .put("Page", "0")
                    .put("PageSize", "1")
                    .put("PageToken", "PageToken")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CountryListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
