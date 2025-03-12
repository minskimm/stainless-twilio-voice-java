// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.iprecords

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class IpRecordUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
      IpRecordUpdateParams.builder()
          .sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .friendlyName("update_name")
          .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
      val params = IpRecordUpdateParams.builder()
          .sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .friendlyName("update_name")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.friendlyName()).contains("update_name")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
      val params = IpRecordUpdateParams.builder()
          .sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .build()

      val body = params._body()

      assertNotNull(body)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
      val params = IpRecordUpdateParams.builder()
          .sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .build()
      assertThat(params).isNotNull
      // path param "sid"
      assertThat(params.getPathParam(0)).isEqualTo("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
