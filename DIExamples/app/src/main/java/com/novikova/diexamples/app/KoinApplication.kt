package com.novikova.diexamples.app

import android.app.Application
import com.novikova.diexamples.presentation.feature.presenter.ExamplePresenter
import com.novikova.diexamples.presentation.feature.reducer.ExampleReducer
import com.novikova.diexamples.presentation.feature.reducer.IExampleReducer
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
            modules(featureModule)
        }
    }

    private val featureModule = module {
        factory { ExamplePresenter(get()) }
        factory<IExampleReducer> { ExampleReducer() }
    }
}