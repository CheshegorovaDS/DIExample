package com.novikova.diexamples.store

import android.content.SharedPreferences

class LoggedManager constructor(
    private val sharedPreferences: SharedPreferences
): LoggedProvider {
}