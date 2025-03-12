package com.twilio_voice_openapi.api.errors

import com.twilio_voice_openapi.api.core.http.Headers

class RateLimitException(
        headers: Headers,
        body: String,
        error: TwilioVoiceOpenAPIError,
) : TwilioVoiceOpenAPIServiceException(429, headers, body, error)
