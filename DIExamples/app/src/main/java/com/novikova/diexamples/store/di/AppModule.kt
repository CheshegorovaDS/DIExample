package com.novikova.diexamples.store.di

import android.content.Context
import android.content.SharedPreferences
import com.novikova.diexamples.store.LoggedManager
import com.novikova.diexamples.store.LoggedProvider
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

    private fun provideSharedPreferences(context: Context): SharedPreferences =
            context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    val appModule = module {
        single<LoggedProvider> { LoggedManager(provideSharedPreferences(androidContext())) }
    }

    const val PREFS_NAME = "preferences_name"

