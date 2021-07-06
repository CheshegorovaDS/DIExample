package com.novikova.diexamples.app

import android.app.Application
import com.novikova.diexamples.presentation.feature.di.featureModule
import com.novikova.diexamples.store.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class KoinApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@KoinApplication)
            modules(appModule, featureModule)
        }
    }
}
