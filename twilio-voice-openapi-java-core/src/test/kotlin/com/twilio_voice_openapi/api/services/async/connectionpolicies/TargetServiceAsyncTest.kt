// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async.connectionpolicies

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClientAsync
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetCreateParams
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetDeleteParams
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetListParams
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetRetrieveParams
import com.twilio_voice_openapi.api.models.connectionpolicies.targets.TargetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TargetServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
      val client = TwilioVoiceOpenAPIOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .username("My Username")
          .password("My Password")
          .build()
      val targetServiceAsync = client.connectionPolicies().targets()

      val connectionPolicyTargetFuture = targetServiceAsync.create(TargetCreateParams.builder()
          .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .target("sip:sip-box.com:1234")
          .enabled(true)
          .friendlyName("friendly_name")
          .priority(1L)
          .weight(20L)
          .build())

      val connectionPolicyTarget = connectionPolicyTargetFuture.get()
      connectionPolicyTarget.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
      val client = TwilioVoiceOpenAPIOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .username("My Username")
          .password("My Password")
          .build()
      val targetServiceAsync = client.connectionPolicies().targets()

      val connectionPolicyTargetFuture = targetServiceAsync.retrieve(TargetRetrieveParams.builder()
          .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .sid("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .build())

      val connectionPolicyTarget = connectionPolicyTargetFuture.get()
      connectionPolicyTarget.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
      val client = TwilioVoiceOpenAPIOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .username("My Username")
          .password("My Password")
          .build()
      val targetServiceAsync = client.connectionPolicies().targets()

      val connectionPolicyTargetFuture = targetServiceAsync.update(TargetUpdateParams.builder()
          .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .sid("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .enabled(false)
          .friendlyName("updated_name")
          .priority(2L)
          .target("sip:sip-updated.com:4321")
          .weight(10L)
          .build())

      val connectionPolicyTarget = connectionPolicyTargetFuture.get()
      connectionPolicyTarget.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
      val client = TwilioVoiceOpenAPIOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .username("My Username")
          .password("My Password")
          .build()
      val targetServiceAsync = client.connectionPolicies().targets()

      val targetFuture = targetServiceAsync.list(TargetListParams.builder()
          .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .page(0L)
          .pageSize(1L)
          .pageToken("PageToken")
          .build())

      val target = targetFuture.get()
      target.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
      val client = TwilioVoiceOpenAPIOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .username("My Username")
          .password("My Password")
          .build()
      val targetServiceAsync = client.connectionPolicies().targets()

      val future = targetServiceAsync.delete(TargetDeleteParams.builder()
          .connectionPolicySid("NYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .sid("NEE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .build())

      val response = future.get()
    }
}
