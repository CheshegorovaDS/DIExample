package com.novikova.diexamples.storage

interface LoggedUserProvider{
    fun setCount(count: Int)
    fun getCount(): Int?
}
