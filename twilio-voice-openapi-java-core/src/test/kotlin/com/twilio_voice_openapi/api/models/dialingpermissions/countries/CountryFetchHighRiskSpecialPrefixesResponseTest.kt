// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions.countries

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class CountryFetchHighRiskSpecialPrefixesResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createCountryFetchHighRiskSpecialPrefixesResponse() {
      val countryFetchHighRiskSpecialPrefixesResponse = CountryFetchHighRiskSpecialPrefixesResponse.builder()
          .addContent(CountryFetchHighRiskSpecialPrefixesResponse.Content.builder()
              .prefix("prefix")
              .build())
          .meta(CountryFetchHighRiskSpecialPrefixesResponse.Meta.builder()
              .firstPageUrl("https://example.com")
              .key("key")
              .nextPageUrl("https://example.com")
              .page(0L)
              .pageSize(0L)
              .previousPageUrl("https://example.com")
              .url("https://example.com")
              .build())
          .build()
      assertThat(countryFetchHighRiskSpecialPrefixesResponse).isNotNull
      assertThat(countryFetchHighRiskSpecialPrefixesResponse.content().get()).containsExactly(CountryFetchHighRiskSpecialPrefixesResponse.Content.builder()
          .prefix("prefix")
          .build())
      assertThat(countryFetchHighRiskSpecialPrefixesResponse.meta()).contains(CountryFetchHighRiskSpecialPrefixesResponse.Meta.builder()
          .firstPageUrl("https://example.com")
          .key("key")
          .nextPageUrl("https://example.com")
          .page(0L)
          .pageSize(0L)
          .previousPageUrl("https://example.com")
          .url("https://example.com")
          .build())
    }
}
