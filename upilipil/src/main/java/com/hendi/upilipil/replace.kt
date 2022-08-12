package com.hendi.upilipil

import java.text.NumberFormat

fun String.resetFormat(): String {
    val re = Regex("[^A-Za-z0-9 ]")
    return re.replace(this, "")
}

fun String?.decimalFormat(currency: String = ""): String {
    val number = this?.split(".")?.get(0)?.toLong().orZero()
    val numberFormat: NumberFormat = NumberFormat.getNumberInstance()

    if (currency.isNotEmpty()) {
        return "$currency ${numberFormat.format(number)}"
    }
    return numberFormat.format(number)
}

fun String?.replacePointCommaWithEmptyString(): String {
    return this?.replace(".", "")?.replace(",", "") ?: ""
}
