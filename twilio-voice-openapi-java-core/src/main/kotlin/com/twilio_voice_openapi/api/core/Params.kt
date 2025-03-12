package com.twilio_voice_openapi.api.core

import com.twilio_voice_openapi.api.core.http.Headers
import com.twilio_voice_openapi.api.core.http.QueryParams

/** An interface representing parameters passed to a service method. */
interface Params {
    /** The full set of headers in the parameters, including both fixed and additional headers. */
    fun _headers(): Headers

    /** The full set of query params in the parameters, including both fixed and additional query params. */
    fun _queryParams(): QueryParams
}
