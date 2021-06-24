package com.novikova.diexamples.presentation.feature.view

import io.reactivex.subjects.PublishSubject

interface ExampleView {
    val updateText: PublishSubject<Unit>

    fun setText(text: String)
}
