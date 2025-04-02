// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions.countries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.twilio_voice_openapi.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CountryFetchHighRiskSpecialPrefixesResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val countryFetchHighRiskSpecialPrefixesResponse =
            CountryFetchHighRiskSpecialPrefixesResponse.builder()
                .addContent(
                    CountryFetchHighRiskSpecialPrefixesResponse.Content.builder()
                        .prefix("prefix")
                        .build()
                )
                .meta(
                    CountryFetchHighRiskSpecialPrefixesResponse.Meta.builder()
                        .firstPageUrl("https://example.com")
                        .key("key")
                        .nextPageUrl("https://example.com")
                        .page(0L)
                        .pageSize(0L)
                        .previousPageUrl("https://example.com")
                        .url("https://example.com")
                        .build()
                )
                .build()

        assertThat(countryFetchHighRiskSpecialPrefixesResponse.content().getOrNull())
            .containsExactly(
                CountryFetchHighRiskSpecialPrefixesResponse.Content.builder()
                    .prefix("prefix")
                    .build()
            )
        assertThat(countryFetchHighRiskSpecialPrefixesResponse.meta())
            .contains(
                CountryFetchHighRiskSpecialPrefixesResponse.Meta.builder()
                    .firstPageUrl("https://example.com")
                    .key("key")
                    .nextPageUrl("https://example.com")
                    .page(0L)
                    .pageSize(0L)
                    .previousPageUrl("https://example.com")
                    .url("https://example.com")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val countryFetchHighRiskSpecialPrefixesResponse =
            CountryFetchHighRiskSpecialPrefixesResponse.builder()
                .addContent(
                    CountryFetchHighRiskSpecialPrefixesResponse.Content.builder()
                        .prefix("prefix")
                        .build()
                )
                .meta(
                    CountryFetchHighRiskSpecialPrefixesResponse.Meta.builder()
                        .firstPageUrl("https://example.com")
                        .key("key")
                        .nextPageUrl("https://example.com")
                        .page(0L)
                        .pageSize(0L)
                        .previousPageUrl("https://example.com")
                        .url("https://example.com")
                        .build()
                )
                .build()

        val roundtrippedCountryFetchHighRiskSpecialPrefixesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(countryFetchHighRiskSpecialPrefixesResponse),
                jacksonTypeRef<CountryFetchHighRiskSpecialPrefixesResponse>(),
            )

        assertThat(roundtrippedCountryFetchHighRiskSpecialPrefixesResponse)
            .isEqualTo(countryFetchHighRiskSpecialPrefixesResponse)
    }
}
