package com.wiseassblog.domain.domainmodel

sealed class Result<out E, out V> {

    data class Value<out V>(val value: V) : Result<Nothing, V>()
    object Loading : Result<Nothing, Nothing>()
    data class Error<out E>(val error: E) : Result<E, Nothing>()

    companion object Factory{
        inline fun <V> buildValue(function: () -> V): Result<Nothing, V> {
            return Value(function.invoke())
        }

        inline fun buildError(error: Exception): Result<Exception, Nothing> {
            return Error(error)
        }

        inline fun buildLoading(error: Exception): Result<Exception, Nothing> {
            return Error(error)
        }
    }

}