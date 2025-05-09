// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClientAsync
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyCreateParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyListParams
import com.twilio_voice_openapi.api.models.connectionpolicies.ConnectionPolicyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConnectionPolicyServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val connectionPolicyServiceAsync = client.connectionPolicies()

        val connectionPolicyFuture =
            connectionPolicyServiceAsync.create(
                ConnectionPolicyCreateParams.builder().friendlyName("friendly_name").build()
            )

        val connectionPolicy = connectionPolicyFuture.get()
        connectionPolicy.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val connectionPolicyServiceAsync = client.connectionPolicies()

        val connectionPolicyFuture =
            connectionPolicyServiceAsync.retrieve("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")

        val connectionPolicy = connectionPolicyFuture.get()
        connectionPolicy.validate()
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
        val connectionPolicyServiceAsync = client.connectionPolicies()

        val connectionPolicyFuture =
            connectionPolicyServiceAsync.update(
                ConnectionPolicyUpdateParams.builder()
                    .sid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                    .friendlyName("updated_name")
                    .build()
            )

        val connectionPolicy = connectionPolicyFuture.get()
        connectionPolicy.validate()
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
        val connectionPolicyServiceAsync = client.connectionPolicies()

        val connectionPoliciesFuture =
            connectionPolicyServiceAsync.list(
                ConnectionPolicyListParams.builder()
                    .page(0L)
                    .pageSize(1L)
                    .pageToken("PageToken")
                    .build()
            )

        val connectionPolicies = connectionPoliciesFuture.get()
        connectionPolicies.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            TwilioVoiceOpenAPIOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val connectionPolicyServiceAsync = client.connectionPolicies()

        val future = connectionPolicyServiceAsync.delete("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")

        val response = future.get()
    }
}
