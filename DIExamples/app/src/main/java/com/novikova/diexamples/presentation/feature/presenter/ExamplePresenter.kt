package com.novikova.diexamples.presentation.feature.presenter

import com.novikova.diexamples.presentation.feature.reducer.IExampleReducer
import com.novikova.diexamples.presentation.feature.view.ExampleView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo

class ExamplePresenter constructor(
    private val reducer: IExampleReducer
){

    private var view: ExampleView? = null

    private val dispose = CompositeDisposable()

    fun attachView(view: ExampleView) {
        this.view = view
        bind()
    }

    fun detachView() {
        dispose.clear()
    }

    private fun bind() {
        view?.updateText?.subscribe {
            reducer.setText()
        }?.addTo(dispose)

        reducer.updateText
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                view?.setText(it)
            }.addTo(dispose)
    }
}