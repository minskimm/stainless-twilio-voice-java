// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class DialingPermissionsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createDialingPermissions() {
      val dialingPermissions = DialingPermissions.builder()
          .dialingPermissionsInheritance(true)
          .url("https://example.com")
          .build()
      assertThat(dialingPermissions).isNotNull
      assertThat(dialingPermissions.dialingPermissionsInheritance()).contains(true)
      assertThat(dialingPermissions.url()).contains("https://example.com")
    }
}
