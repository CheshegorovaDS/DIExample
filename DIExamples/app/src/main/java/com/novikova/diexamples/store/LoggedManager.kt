package com.novikova.diexamples.store

import android.content.SharedPreferences

class LoggedManager constructor(
    private val sharedPreferences: SharedPreferences
): LoggedProvider {
    override fun setCount(count: Int) {
        val editor: SharedPreferences.Editor = sharedPreferences.edit()

        editor.putInt(COUNT, count)
        editor.apply()
    }

    override fun getCount(): Int? = sharedPreferences.getInt(COUNT, 0)

    companion object {
        const val COUNT = "count"
    }
}