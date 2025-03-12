// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions.countries

import com.twilio_voice_openapi.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class CountryListParamsTest {

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
      val params = CountryListParams.builder()
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
      val expected = QueryParams.builder()
      expected.put("Continent", "Continent")
      expected.put("CountryCode", "CountryCode")
      expected.put("HighRiskSpecialNumbersEnabled", "true")
      expected.put("HighRiskTollfraudNumbersEnabled", "true")
      expected.put("IsoCode", "IsoCode")
      expected.put("LowRiskNumbersEnabled", "true")
      expected.put("Page", "0")
      expected.put("PageSize", "1")
      expected.put("PageToken", "PageToken")
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = CountryListParams.builder().build()
      val expected = QueryParams.builder()
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
