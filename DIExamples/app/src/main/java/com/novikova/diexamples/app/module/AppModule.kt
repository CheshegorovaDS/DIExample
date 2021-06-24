package com.novikova.diexamples.app.module

import android.content.Context
import android.content.SharedPreferences
import com.novikova.diexamples.storage.LoggedUserManager
import com.novikova.diexamples.storage.LoggedUserProvider
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class AppModule {

    @Binds
    abstract fun provideLoggedManager(manager: LoggedUserManager): LoggedUserProvider

    @Module
    @InstallIn(ApplicationComponent::class)
    object SharedModule {

        @Singleton
        @Provides
        fun getSharedPreferences(@ApplicationContext context: Context): SharedPreferences =
            context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        private val PREFS_NAME = "SHELTER_MANAGER_PREFS"
    }

}
