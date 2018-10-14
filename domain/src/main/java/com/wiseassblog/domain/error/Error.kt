package com.wiseassblog.domain.error

const val ERROR_NOT_FOUND = "Unable to locate Record."
const val ERROR_UNSC_IO = "Unable to access IO Device."

/**
 * Errors which
 */
sealed class Error(message: String? = null): Exception(message) {
    class RecordNotFound: Error(ERROR_NOT_FOUND)
    class IoDeviceFailure: Error(ERROR_UNSC_IO)
}


