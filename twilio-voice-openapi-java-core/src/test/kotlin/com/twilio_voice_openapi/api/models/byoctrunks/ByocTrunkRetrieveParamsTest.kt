// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.byoctrunks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ByocTrunkRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ByocTrunkRetrieveParams.builder().sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            ByocTrunkRetrieveParams.builder().sid("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()

        assertThat(params._pathParam(0)).isEqualTo("BYE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
