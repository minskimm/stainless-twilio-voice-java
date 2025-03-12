package com.twilio_voice_openapi.api.errors

import com.twilio_voice_openapi.api.core.http.Headers

class UnauthorizedException(
        headers: Headers,
        body: String,
        error: TwilioVoiceOpenAPIError,
) : TwilioVoiceOpenAPIServiceException(401, headers, body, error)
