package com.hendi.upilipil

import java.text.SimpleDateFormat
import java.util.*

fun dateFormat(format: String = "dd-MM-yyyy", time: Boolean = false): String {
    val date = Date()
    var change = format
    if (time){
        change = "yyyy-MM-dd HH:mm:ss"
    }
    val dateFormat = SimpleDateFormat(change)
    return dateFormat.format(date)
}