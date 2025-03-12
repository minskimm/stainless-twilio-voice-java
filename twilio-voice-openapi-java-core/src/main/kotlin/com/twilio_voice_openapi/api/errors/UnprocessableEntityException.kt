package com.twilio_voice_openapi.api.errors

import com.twilio_voice_openapi.api.core.http.Headers

class UnprocessableEntityException(
        headers: Headers,
        body: String,
        error: TwilioVoiceOpenAPIError,
) : TwilioVoiceOpenAPIServiceException(422, headers, body, error)
