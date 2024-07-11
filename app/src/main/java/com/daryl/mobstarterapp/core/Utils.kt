package com.daryl.mobstarterapp.core

import android.util.Log

object Utils {
    fun debugLog(): (Any) -> Unit = { Log.d("debugging", it.toString()) }
}