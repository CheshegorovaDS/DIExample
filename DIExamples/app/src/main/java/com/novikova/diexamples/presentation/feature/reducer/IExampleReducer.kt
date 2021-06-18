package com.novikova.diexamples.presentation.feature.reducer

import io.reactivex.subjects.PublishSubject

interface IExampleReducer {
    val updateText: PublishSubject<String>

    fun setText()
}