package com.hendi.upilipil

import java.text.DecimalFormat

fun String.resetFormat(): String {
    val re = Regex("[^A-Za-z0-9 ]")
    return re.replace(this, "")
}

fun String.decimalFormat(): String {
    val decimalFormat = DecimalFormat("#,###")
    return decimalFormat.format(this.toInt())
}

fun String?.replacePointCommaWithEmptyString() : String {
    return this?.resetFormat() ?: ""
}
