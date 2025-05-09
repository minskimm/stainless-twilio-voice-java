// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async.dialingpermissions

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClientAsync
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryFetchHighRiskSpecialPrefixesParams
import com.twilio_voice_openapi.api.models.dialingpermissions.countries.CountryListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CountryServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val countryServiceAsync = client.dialingPermissions().countries()

        val countryFuture = countryServiceAsync.retrieve("IsoCode")

        val country = countryFuture.get()
        country.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val countryServiceAsync = client.dialingPermissions().countries()

        val countriesFuture =
            countryServiceAsync.list(
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
            )

        val countries = countriesFuture.get()
        countries.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun fetchHighRiskSpecialPrefixes() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val countryServiceAsync = client.dialingPermissions().countries()

        val responseFuture =
            countryServiceAsync.fetchHighRiskSpecialPrefixes(
                CountryFetchHighRiskSpecialPrefixesParams.builder()
                    .isoCode("IsoCode")
                    .page(0L)
                    .pageSize(1L)
                    .pageToken("PageToken")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
