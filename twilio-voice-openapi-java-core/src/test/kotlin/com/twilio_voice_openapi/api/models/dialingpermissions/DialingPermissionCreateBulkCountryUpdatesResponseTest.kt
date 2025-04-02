// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.twilio_voice_openapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DialingPermissionCreateBulkCountryUpdatesResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val dialingPermissionCreateBulkCountryUpdatesResponse =
            DialingPermissionCreateBulkCountryUpdatesResponse.builder()
                .updateCount(0L)
                .updateRequest("update_request")
                .build()

        assertThat(dialingPermissionCreateBulkCountryUpdatesResponse.updateCount()).contains(0L)
        assertThat(dialingPermissionCreateBulkCountryUpdatesResponse.updateRequest())
            .contains("update_request")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dialingPermissionCreateBulkCountryUpdatesResponse =
            DialingPermissionCreateBulkCountryUpdatesResponse.builder()
                .updateCount(0L)
                .updateRequest("update_request")
                .build()

        val roundtrippedDialingPermissionCreateBulkCountryUpdatesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dialingPermissionCreateBulkCountryUpdatesResponse),
                jacksonTypeRef<DialingPermissionCreateBulkCountryUpdatesResponse>(),
            )

        assertThat(roundtrippedDialingPermissionCreateBulkCountryUpdatesResponse)
            .isEqualTo(dialingPermissionCreateBulkCountryUpdatesResponse)
    }
}
