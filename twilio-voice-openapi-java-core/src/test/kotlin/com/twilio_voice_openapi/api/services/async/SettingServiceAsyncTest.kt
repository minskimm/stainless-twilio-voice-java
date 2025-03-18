// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClientAsync
import com.twilio_voice_openapi.api.models.settings.SettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val settingServiceAsync = client.settings()

        val voiceDialingPermissionsFuture = settingServiceAsync.retrieve()

        val voiceDialingPermissions = voiceDialingPermissionsFuture.get()
        voiceDialingPermissions.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val settingServiceAsync = client.settings()

        val voiceDialingPermissionsFuture =
            settingServiceAsync.update(
                SettingUpdateParams.builder().dialingPermissionsInheritance(true).build()
            )

        val voiceDialingPermissions = voiceDialingPermissionsFuture.get()
        voiceDialingPermissions.validate()
    }
}
