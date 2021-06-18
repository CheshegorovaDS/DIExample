package com.novikova.diexamples.presentation.feature.di

import com.novikova.diexamples.presentation.feature.reducer.ExampleReducer
import com.novikova.diexamples.presentation.feature.reducer.IExampleReducer
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
abstract class ExampleModule {

    @Binds
    abstract fun bindReducer(reducer: ExampleReducer): IExampleReducer
}
