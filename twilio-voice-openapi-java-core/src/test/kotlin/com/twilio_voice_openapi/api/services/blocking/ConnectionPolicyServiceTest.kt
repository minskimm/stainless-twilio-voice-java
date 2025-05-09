// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.blocking

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClient
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyCreateParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyListParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConnectionPolicyServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val connectionPolicyService = client.connectionPolicies()

        val connectionPolicy =
            connectionPolicyService.create(
                ConnectionPolicyCreateParams.builder().friendlyName("friendly_name").build()
            )

        connectionPolicy.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val connectionPolicyService = client.connectionPolicies()

        val connectionPolicy =
            connectionPolicyService.retrieve("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")

        connectionPolicy.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val connectionPolicyService = client.connectionPolicies()

        val connectionPolicy =
            connectionPolicyService.update(
                ConnectionPolicyUpdateParams.builder()
                    .sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .friendlyName("updated_name")
                    .build()
            )

        connectionPolicy.validate()
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
        val connectionPolicyService = client.connectionPolicies()

        val connectionPolicies =
            connectionPolicyService.list(
                ConnectionPolicyListParams.builder()
                    .page(0L)
                    .pageSize(1L)
                    .pageToken("PageToken")
                    .build()
            )

        connectionPolicies.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            TwilioVoiceOpenAPIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val connectionPolicyService = client.connectionPolicies()

        connectionPolicyService.delete("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
    }
}
