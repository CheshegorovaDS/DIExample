package com.novikova.diexamples.data.repository

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataRepository @Inject constructor()
    : IDataRepository {
    override fun getData() = Unit
}
