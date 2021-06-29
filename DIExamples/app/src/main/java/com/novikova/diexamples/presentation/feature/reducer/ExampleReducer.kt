package com.novikova.diexamples.presentation.feature.reducer

import com.novikova.diexamples.store.LoggedProvider
import io.reactivex.subjects.PublishSubject

class ExampleReducer constructor(
//    val loggedProvider: LoggedProvider
): IExampleReducer {
    override val updateText: PublishSubject<String> = PublishSubject.create()

    override fun setText() {
        updateText.onNext("Example Text")
    }
}