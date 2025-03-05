// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking.dialingPermissions

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClient
import com.twilio_voice_openapi.api.models.DialingPermissionCountryFetchHighRiskSpecialPrefixesParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryListParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CountryServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val countryService = client.dialingPermissions().countries()

        val country =
            countryService.retrieve(
                DialingPermissionCountryRetrieveParams.builder().isoCode("IsoCode").build()
            )

        country.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val countryService = client.dialingPermissions().countries()

        val country =
            countryService.list(
                DialingPermissionCountryListParams.builder()
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
            )

        country.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun fetchHighRiskSpecialPrefixes() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val countryService = client.dialingPermissions().countries()

        val response =
            countryService.fetchHighRiskSpecialPrefixes(
                DialingPermissionCountryFetchHighRiskSpecialPrefixesParams.builder()
                    .isoCode("IsoCode")
                    .page(0L)
                    .pageSize(1L)
                    .pageToken("PageToken")
                    .build()
            )

        response.validate()
    }
}
