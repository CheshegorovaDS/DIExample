package com.novikova.diexamples.app

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.novikova.diexamples.presentation.feature.di.featureModule
import com.novikova.diexamples.store.LoggedManager
import com.novikova.diexamples.store.LoggedProvider
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.module

class KoinApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@KoinApplication)
            modules(appModule, featureModule)
        }
    }

    private fun provideSharedPreferences(context: Context): SharedPreferences =
            context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    private val appModule = module {
        single<LoggedProvider> { LoggedManager(provideSharedPreferences(applicationContext)) }
    }

    companion object {
        const val PREFS_NAME = "preferences_name"
    }
}
