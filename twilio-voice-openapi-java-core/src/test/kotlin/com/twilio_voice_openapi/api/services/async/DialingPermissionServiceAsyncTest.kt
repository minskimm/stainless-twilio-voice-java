// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClientAsync
import com.twilio_voice_openapi.api.models.dialingpermissions.DialingPermissionCreateBulkCountryUpdatesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DialingPermissionServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createBulkCountryUpdates() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val dialingPermissionServiceAsync = client.dialingPermissions()

        val responseFuture =
            dialingPermissionServiceAsync.createBulkCountryUpdates(
                DialingPermissionCreateBulkCountryUpdatesParams.builder()
                    .updateRequest(
                        "[ { \"iso_code\": \"GB\", \"low_risk_numbers\": \"Enabled\", \"high_risk_special_numbers\":\"Enabled\", \"high_risk_irsf_numbers\": \"Enabled\" } ]"
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
