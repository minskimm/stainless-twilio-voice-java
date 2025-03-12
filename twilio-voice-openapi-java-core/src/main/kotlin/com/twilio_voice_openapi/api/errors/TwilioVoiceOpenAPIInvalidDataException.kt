package com.twilio_voice_openapi.api.errors

class TwilioVoiceOpenAPIInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    TwilioVoiceOpenAPIException(message, cause)
