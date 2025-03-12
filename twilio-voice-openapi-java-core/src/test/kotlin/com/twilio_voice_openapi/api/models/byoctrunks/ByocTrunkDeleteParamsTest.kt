// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.byoctrunks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class ByocTrunkDeleteParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
      ByocTrunkDeleteParams.builder()
          .sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
      val params = ByocTrunkDeleteParams.builder()
          .sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
          .build()
      assertThat(params).isNotNull
      // path param "sid"
      assertThat(params.getPathParam(0)).isEqualTo("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
