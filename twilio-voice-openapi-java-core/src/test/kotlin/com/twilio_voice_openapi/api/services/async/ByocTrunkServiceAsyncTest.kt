// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.services.async

import com.twilio_voice_openapi.api.TestServerExtension
import com.twilio_voice_openapi.api.client.okhttp.TwilioVoiceOpenAPIOkHttpClientAsync
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkCreateParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkDeleteParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkListParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkRetrieveParams
import com.twilio_voice_openapi.api.models.byoctrunks.ByocTrunkUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ByocTrunkServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
      val client = TwilioVoiceOpenAPIOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .username("My Username")
          .password("My Password")
          .build()
      val byocTrunkServiceAsync = client.byocTrunks()

      val byocTrunkFuture = byocTrunkServiceAsync.create(ByocTrunkCreateParams.builder()
          .cnamLookupEnabled(false)
          .connectionPolicySid("NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
          .friendlyName("friendly_name")
          .fromDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
          .statusCallbackMethod(ByocTrunkCreateParams.StatusCallbackMethod.GET)
          .statusCallbackUrl("https://byoc.example.com/twilio/status_callback")
          .voiceFallbackMethod(ByocTrunkCreateParams.VoiceFallbackMethod.GET)
          .voiceFallbackUrl("https://byoc.example.com/twilio/fallback")
          .voiceMethod(ByocTrunkCreateParams.VoiceMethod.GET)
          .voiceUrl("https://byoc.example.com/twilio/app")
          .build())

      val byocTrunk = byocTrunkFuture.get()
      byocTrunk.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
      val client = TwilioVoiceOpenAPIOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .username("My Username")
          .password("My Password")
          .build()
      val byocTrunkServiceAsync = client.byocTrunks()

      val byocTrunkFuture = byocTrunkServiceAsync.retrieve(ByocTrunkRetrieveParams.builder()
          .sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .build())

      val byocTrunk = byocTrunkFuture.get()
      byocTrunk.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
      val client = TwilioVoiceOpenAPIOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .username("My Username")
          .password("My Password")
          .build()
      val byocTrunkServiceAsync = client.byocTrunks()

      val byocTrunkFuture = byocTrunkServiceAsync.update(ByocTrunkUpdateParams.builder()
          .sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .cnamLookupEnabled(true)
          .connectionPolicySid("NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
          .friendlyName("update_name")
          .fromDomainSid("SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")
          .statusCallbackMethod(ByocTrunkUpdateParams.StatusCallbackMethod.GET)
          .statusCallbackUrl("https://byoc.example.com/twilio_updated/status_callback")
          .voiceFallbackMethod(ByocTrunkUpdateParams.VoiceFallbackMethod.GET)
          .voiceFallbackUrl("https://byoc.example.com/twilio_updated/fallback")
          .voiceMethod(ByocTrunkUpdateParams.VoiceMethod.GET)
          .voiceUrl("https://byoc.example.com/twilio_updated/app")
          .build())

      val byocTrunk = byocTrunkFuture.get()
      byocTrunk.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
      val client = TwilioVoiceOpenAPIOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .username("My Username")
          .password("My Password")
          .build()
      val byocTrunkServiceAsync = client.byocTrunks()

      val byocTrunkFuture = byocTrunkServiceAsync.list(ByocTrunkListParams.builder()
          .page(0L)
          .pageSize(1L)
          .pageToken("PageToken")
          .build())

      val byocTrunk = byocTrunkFuture.get()
      byocTrunk.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
      val client = TwilioVoiceOpenAPIOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .username("My Username")
          .password("My Password")
          .build()
      val byocTrunkServiceAsync = client.byocTrunks()

      val future = byocTrunkServiceAsync.delete(ByocTrunkDeleteParams.builder()
          .sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .build())

      val response = future.get()
    }
}
