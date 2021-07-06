package com.novikova.diexamples.presentation.feature.reducer

import com.novikova.diexamples.store.LoggedProvider
import io.reactivex.subjects.PublishSubject

class ExampleReducer constructor(
    val loggedProvider: LoggedProvider
): IExampleReducer {
    override val updateText: PublishSubject<String> = PublishSubject.create()

    override fun setText() {
        val count = loggedProvider.getCount() ?: 0
        updateText.onNext("Example Text $count")
        loggedProvider.setCount(count + 1)

//        repository.getData()
    }
}