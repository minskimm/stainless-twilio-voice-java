// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.iprecords

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpRecordUpdateParamsTest {

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
    fun pathParams() {
        val params =
            IpRecordUpdateParams.builder().sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()

        assertThat(params._pathParam(0)).isEqualTo("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            IpRecordUpdateParams.builder()
                .sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .friendlyName("update_name")
                .build()

        val body = params._body()

        assertThat(body.friendlyName()).contains("update_name")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IpRecordUpdateParams.builder().sid("ILE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD").build()

        val body = params._body()
    }
}
