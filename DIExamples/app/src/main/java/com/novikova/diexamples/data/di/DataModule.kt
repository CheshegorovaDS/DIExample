package com.novikova.diexamples.data.di

import com.novikova.diexamples.data.repository.DataRepository
import com.novikova.diexamples.data.repository.IDataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class DataModule {
    @Binds
    abstract fun bindRepository(repository: DataRepository): IDataRepository
}
