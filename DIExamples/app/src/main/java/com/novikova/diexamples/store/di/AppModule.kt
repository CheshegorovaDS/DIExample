package com.novikova.diexamples.store.di

import com.novikova.diexamples.store.LoggedManager
import org.koin.dsl.module

class AppModule {
    val appModule = module {
//        single { LoggedManager() }
    }
}