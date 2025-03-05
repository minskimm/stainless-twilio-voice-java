// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async.dialingPermissions

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClientAsync
import com.twilio_voice_openapi.api.models.DialingPermissionCountryFetchHighRiskSpecialPrefixesParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryListParams
import com.twilio_voice_openapi.api.models.DialingPermissionCountryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CountryServiceAsyncTest {

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

        val countryFuture =
            countryServiceAsync.retrieve(
                DialingPermissionCountryRetrieveParams.builder().isoCode("IsoCode").build()
            )

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

        val countryFuture =
            countryServiceAsync.list(
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

        val country = countryFuture.get()
        country.validate()
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
                DialingPermissionCountryFetchHighRiskSpecialPrefixesParams.builder()
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
