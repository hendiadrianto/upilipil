package com.hendi.upilipil

fun String?.replaceConvertStringToInt() : Int{
    return this?.resetFormat()?.trim()?.toInt().orZero()
}

fun String?.replaceConvertStringToDouble() : Double{
    return this?.resetFormat()?.trim()?.toDouble().orZero()
}

fun String?.replaceConvertStringToLong() : Long{
    return this?.resetFormat()?.trim()?.toLong().orZero()
}

fun String?.replaceConvertStringToFloat() : Float{
    return this?.resetFormat()?.trim()?.toFloat().orZero()
}

fun String?.replaceConvertStringToByte() : Byte{
    return this?.resetFormat()?.trim()?.toByte().orZero()
}

fun String?.replaceConvertStringToShort() : Short{
    return this?.resetFormat()?.trim()?.toShort().orZero()
}