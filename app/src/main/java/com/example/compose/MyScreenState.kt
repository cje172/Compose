package com.example.compose

data class MyScreenState(
    val text: String = "",
    val namesList: MutableList<String> = mutableListOf()
)
