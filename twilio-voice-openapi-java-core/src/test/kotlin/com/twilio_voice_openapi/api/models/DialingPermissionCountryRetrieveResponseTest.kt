// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import com.twilio_voice_openapi.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class DialingPermissionCountryRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createDialingPermissionCountryRetrieveResponse() {
        val dialingPermissionCountryRetrieveResponse =
            DialingPermissionCountryRetrieveResponse.builder()
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
        assertThat(dialingPermissionCountryRetrieveResponse).isNotNull
        assertThat(dialingPermissionCountryRetrieveResponse.continent()).contains("continent")
        assertThat(dialingPermissionCountryRetrieveResponse.countryCodes().get())
            .containsExactly("string")
        assertThat(dialingPermissionCountryRetrieveResponse.highRiskSpecialNumbersEnabled())
            .contains(true)
        assertThat(dialingPermissionCountryRetrieveResponse.highRiskTollfraudNumbersEnabled())
            .contains(true)
        assertThat(dialingPermissionCountryRetrieveResponse.isoCode()).contains("iso_code")
        assertThat(dialingPermissionCountryRetrieveResponse._links())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(dialingPermissionCountryRetrieveResponse.lowRiskNumbersEnabled()).contains(true)
        assertThat(dialingPermissionCountryRetrieveResponse.name()).contains("name")
        assertThat(dialingPermissionCountryRetrieveResponse.url()).contains("https://example.com")
    }
}
