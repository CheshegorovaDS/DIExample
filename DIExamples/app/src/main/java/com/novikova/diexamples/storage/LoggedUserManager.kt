package com.novikova.diexamples.storage

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoggedUserManager @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : LoggedUserProvider {
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