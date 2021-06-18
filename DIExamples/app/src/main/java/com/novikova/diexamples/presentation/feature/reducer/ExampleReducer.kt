package com.novikova.diexamples.presentation.feature.reducer

import dagger.hilt.android.scopes.FragmentScoped
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject

@FragmentScoped
class ExampleReducer @Inject constructor(

): IExampleReducer {
    override val updateText: PublishSubject<String> = PublishSubject.create()

    override fun setText() {
        updateText.onNext("Example Text")
    }
}