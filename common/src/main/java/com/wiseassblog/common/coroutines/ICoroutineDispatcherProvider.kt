package com.wiseassblog.common.coroutines

import kotlin.coroutines.experimental.CoroutineContext

interface ICoroutineDispatcherProvider {
     fun provideUIContext(): CoroutineContext

    fun provideBackgroundContext(): CoroutineContext
}