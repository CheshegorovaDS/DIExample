package com.novikova.diexamples.presentation.feature.view

import io.reactivex.subjects.PublishSubject

interface ExampleView {
    fun initComponent()

    val updateText: PublishSubject<Unit>

    fun setText(text: String)
}