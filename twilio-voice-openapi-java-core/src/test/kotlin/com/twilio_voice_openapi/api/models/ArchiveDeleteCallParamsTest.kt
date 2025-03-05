// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class ArchiveDeleteCallParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ArchiveDeleteCallParams.builder()
            .date(LocalDate.parse("2019-12-27"))
            .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
        val params =
            ArchiveDeleteCallParams.builder()
                .date(LocalDate.parse("2019-12-27"))
                .sid("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
                .build()
        assertThat(params).isNotNull
        // path param "date"
        assertThat(params.getPathParam(0)).isEqualTo("2019-12-27")
        // path param "sid"
        assertThat(params.getPathParam(1)).isEqualTo("CAE1CB97d8EBbDbaAae6d9B1ca0D1cFaAD")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
