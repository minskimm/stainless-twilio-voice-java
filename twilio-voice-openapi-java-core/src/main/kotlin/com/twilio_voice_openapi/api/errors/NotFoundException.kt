package com.twilio_voice_openapi.api.errors

import com.twilio_voice_openapi.api.core.http.Headers

class NotFoundException(headers: Headers, body: String, error: TwilioVoiceOpenAPIError) :
    TwilioVoiceOpenAPIServiceException(404, headers, body, error)
