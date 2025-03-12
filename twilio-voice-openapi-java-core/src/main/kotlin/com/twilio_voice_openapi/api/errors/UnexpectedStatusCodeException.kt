package com.twilio_voice_openapi.api.errors

import com.twilio_voice_openapi.api.core.http.Headers

class UnexpectedStatusCodeException(
        statusCode: Int,
        headers: Headers,
        body: String,
        error: TwilioVoiceOpenAPIError,
) : TwilioVoiceOpenAPIServiceException(statusCode, headers, body, error)
