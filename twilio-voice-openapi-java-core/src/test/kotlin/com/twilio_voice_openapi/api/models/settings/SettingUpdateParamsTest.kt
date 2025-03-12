// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.settings

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class SettingUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SettingUpdateParams.builder().dialingPermissionsInheritance(true).build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params = SettingUpdateParams.builder().dialingPermissionsInheritance(true).build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.dialingPermissionsInheritance()).contains(true)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = SettingUpdateParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
