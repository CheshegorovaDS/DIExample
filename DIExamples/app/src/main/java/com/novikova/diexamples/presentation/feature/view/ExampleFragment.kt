package com.novikova.diexamples.presentation.feature.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.novikova.diexamples.R
import com.novikova.diexamples.presentation.feature.presenter.ExamplePresenter
import io.reactivex.subjects.PublishSubject

class ExampleFragment: Fragment(), ExampleView {
    private val resLayout = R.layout.fragment_example

    lateinit var presenter: ExamplePresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(resLayout, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponent()
        presenter.attachView(this)
    }

    override fun initComponent() {

    }

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }

    override val updateText: PublishSubject<Unit> = PublishSubject.create()

    override fun setText(text: String) {
        requireActivity().findViewById<TextView>(R.id.textView).text = text
    }
}