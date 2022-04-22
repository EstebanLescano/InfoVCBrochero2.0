package com.example.infovcbrochero20.viewmodel

import android.view.View
import android.view.inputmethod.InputMethodManager

fun View.hideKeyboard() {
    val imm =
        context.getSystemService(android.content.Context.INPUT_METHOD_SERVICE)
                as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}