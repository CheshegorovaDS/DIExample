package com.novikova.diexamples.presentation.feature.reducer

import io.reactivex.subjects.PublishSubject

class ExampleReducer: IExampleReducer {
    override val updateText: PublishSubject<String> = PublishSubject.create()

    override fun setText() {
        updateText.onNext("Example Text")
    }
}