// File generated from our OpenAPI spec by Stainless.

package com.twilio_voice_openapi.api.errors

import com.twilio_voice_openapi.api.core.JsonValue
import com.twilio_voice_openapi.api.core.http.Headers

abstract class TwilioVoiceOpenAPIServiceException
protected constructor(message: String, cause: Throwable? = null) :
    TwilioVoiceOpenAPIException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
