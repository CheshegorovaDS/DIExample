package com.novikova.diexamples.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novikova.diexamples.R
import com.novikova.diexamples.presentation.feature.view.ExampleFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openFragment()
    }

    private fun openFragment() = supportFragmentManager
        .beginTransaction()
        .replace(R.id.container, ExampleFragment())
        .commit()
}
