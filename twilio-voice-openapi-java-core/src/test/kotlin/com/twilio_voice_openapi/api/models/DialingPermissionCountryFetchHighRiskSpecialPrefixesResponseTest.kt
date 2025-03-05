// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class DialingPermissionCountryFetchHighRiskSpecialPrefixesResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createDialingPermissionCountryFetchHighRiskSpecialPrefixesResponse() {
        val dialingPermissionCountryFetchHighRiskSpecialPrefixesResponse =
            DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse.builder()
                .addContent(
                    DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse.Content.builder()
                        .prefix("prefix")
                        .build()
                )
                .meta(
                    DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse.Meta.builder()
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
        assertThat(dialingPermissionCountryFetchHighRiskSpecialPrefixesResponse).isNotNull
        assertThat(dialingPermissionCountryFetchHighRiskSpecialPrefixesResponse.content().get())
            .containsExactly(
                DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse.Content.builder()
                    .prefix("prefix")
                    .build()
            )
        assertThat(dialingPermissionCountryFetchHighRiskSpecialPrefixesResponse.meta())
            .contains(
                DialingPermissionCountryFetchHighRiskSpecialPrefixesResponse.Meta.builder()
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
