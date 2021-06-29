package com.novikova.diexamples.presentation.feature.di

import com.novikova.diexamples.presentation.feature.presenter.ExamplePresenter
import com.novikova.diexamples.presentation.feature.reducer.ExampleReducer
import com.novikova.diexamples.presentation.feature.reducer.IExampleReducer
import org.koin.dsl.module

val featureModule = module {
    factory { ExamplePresenter(get()) }
    factory<IExampleReducer> { ExampleReducer() }
}
