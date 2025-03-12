// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions.countries

import com.twilio_voice_openapi.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class CountryRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createCountryRetrieveResponse() {
      val countryRetrieveResponse = CountryRetrieveResponse.builder()
          .continent("continent")
          .addCountryCode("string")
          .highRiskSpecialNumbersEnabled(true)
          .highRiskTollfraudNumbersEnabled(true)
          .isoCode("iso_code")
          .links(JsonValue.from(mapOf<String, Any>()))
          .lowRiskNumbersEnabled(true)
          .name("name")
          .url("https://example.com")
          .build()
      assertThat(countryRetrieveResponse).isNotNull
      assertThat(countryRetrieveResponse.continent()).contains("continent")
      assertThat(countryRetrieveResponse.countryCodes().get()).containsExactly("string")
      assertThat(countryRetrieveResponse.highRiskSpecialNumbersEnabled()).contains(true)
      assertThat(countryRetrieveResponse.highRiskTollfraudNumbersEnabled()).contains(true)
      assertThat(countryRetrieveResponse.isoCode()).contains("iso_code")
      assertThat(countryRetrieveResponse._links()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
      assertThat(countryRetrieveResponse.lowRiskNumbersEnabled()).contains(true)
      assertThat(countryRetrieveResponse.name()).contains("name")
      assertThat(countryRetrieveResponse.url()).contains("https://example.com")
    }
}
