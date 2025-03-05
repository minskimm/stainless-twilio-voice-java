// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import com.twilio_voice_openapi.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class DialingPermissionCountryListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createDialingPermissionCountryListResponse() {
        val dialingPermissionCountryListResponse =
            DialingPermissionCountryListResponse.builder()
                .addContent(
                    DialingPermissionCountryListResponse.Content.builder()
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
                    DialingPermissionCountryListResponse.Meta.builder()
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
        assertThat(dialingPermissionCountryListResponse).isNotNull
        assertThat(dialingPermissionCountryListResponse.content().get())
            .containsExactly(
                DialingPermissionCountryListResponse.Content.builder()
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
        assertThat(dialingPermissionCountryListResponse.meta())
            .contains(
                DialingPermissionCountryListResponse.Meta.builder()
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
