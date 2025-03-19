// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions.countries

import com.twilio_voice_openapi.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CountryListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val countryListResponse =
            CountryListResponse.builder()
                .addContent(
                    CountryListResponse.Content.builder()
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
                )
                .meta(
                    CountryListResponse.Meta.builder()
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

        assertThat(countryListResponse.content().getOrNull())
            .containsExactly(
                CountryListResponse.Content.builder()
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
            )
        assertThat(countryListResponse.meta())
            .contains(
                CountryListResponse.Meta.builder()
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
}
