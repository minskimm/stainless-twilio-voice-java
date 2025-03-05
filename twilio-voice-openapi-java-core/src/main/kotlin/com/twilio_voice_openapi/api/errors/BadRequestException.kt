package com.twilio_voice_openapi.api.errors

import com.twilio_voice_openapi.api.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: TwilioVoiceOpenAPIError) :
    TwilioVoiceOpenAPIServiceException(400, headers, body, error)
