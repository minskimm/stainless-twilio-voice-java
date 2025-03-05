// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class DialingPermissionCreateBulkCountryUpdatesResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createDialingPermissionCreateBulkCountryUpdatesResponse() {
        val dialingPermissionCreateBulkCountryUpdatesResponse =
            DialingPermissionCreateBulkCountryUpdatesResponse.builder()
                .updateCount(0L)
                .updateRequest("update_request")
                .build()
        assertThat(dialingPermissionCreateBulkCountryUpdatesResponse).isNotNull
        assertThat(dialingPermissionCreateBulkCountryUpdatesResponse.updateCount()).contains(0L)
        assertThat(dialingPermissionCreateBulkCountryUpdatesResponse.updateRequest())
            .contains("update_request")
    }
}
