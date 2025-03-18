// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.models.dialingpermissions.countries

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CountryRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CountryRetrieveParams.builder().isoCode("IsoCode").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getPathParam() {
        val params = CountryRetrieveParams.builder().isoCode("IsoCode").build()
        assertThat(params).isNotNull
        // path param "isoCode"
        assertThat(params.getPathParam(0)).isEqualTo("IsoCode")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
