package com.novikova.diexamples.store.di

import android.content.Context
import android.content.SharedPreferences
import com.novikova.diexamples.store.LoggedManager
import com.novikova.diexamples.store.LoggedProvider
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

    val appModule = module {
        single<LoggedProvider> { LoggedManager(get()) }

        single<SharedPreferences> {
            return@single androidContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        }
    }

    const val PREFS_NAME = "preferences_name"
