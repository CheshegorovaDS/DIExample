package com.novikova.diexamples.store

interface LoggedProvider {
    fun setCount(count: Int)
    fun getCount(): Int?
}