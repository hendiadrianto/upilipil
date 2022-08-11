package com.hendi.upilipil

import java.text.DecimalFormat

fun String.resetFormat(): String {
    val re = Regex("[^A-Za-z0-9 ]")
    return re.replace(this, "")
}

fun String?.decimalFormat(currency : String = ""): String {
    val decimalFormat = DecimalFormat("#,###")
    if (currency.isNotEmpty()){
        return "$currency ${decimalFormat.format(this?.toInt().orZero())}"
    }
    return decimalFormat.format(this?.toInt().orZero())
}

fun String?.replacePointCommaWithEmptyString() : String {
    return this?.replace(".","")?.replace(",","") ?: ""
}
