// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DialingPermissionCreateBulkCountryUpdatesParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        DialingPermissionCreateBulkCountryUpdatesParams.builder()
            .updateRequest(
                "[ { \"iso_code\": \"GB\", \"low_risk_numbers\": \"Enabled\", \"high_risk_special_numbers\":\"Enabled\", \"high_risk_irsf_numbers\": \"Enabled\" } ]"
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            DialingPermissionCreateBulkCountryUpdatesParams.builder()
                .updateRequest(
                    "[ { \"iso_code\": \"GB\", \"low_risk_numbers\": \"Enabled\", \"high_risk_special_numbers\":\"Enabled\", \"high_risk_irsf_numbers\": \"Enabled\" } ]"
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.updateRequest())
            .isEqualTo(
                "[ { \"iso_code\": \"GB\", \"low_risk_numbers\": \"Enabled\", \"high_risk_special_numbers\":\"Enabled\", \"high_risk_irsf_numbers\": \"Enabled\" } ]"
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DialingPermissionCreateBulkCountryUpdatesParams.builder()
                .updateRequest(
                    "[ { \"iso_code\": \"GB\", \"low_risk_numbers\": \"Enabled\", \"high_risk_special_numbers\":\"Enabled\", \"high_risk_irsf_numbers\": \"Enabled\" } ]"
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.updateRequest())
            .isEqualTo(
                "[ { \"iso_code\": \"GB\", \"low_risk_numbers\": \"Enabled\", \"high_risk_special_numbers\":\"Enabled\", \"high_risk_irsf_numbers\": \"Enabled\" } ]"
            )
    }
}
