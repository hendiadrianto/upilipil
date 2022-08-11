package com.hendi.upilipil

fun Int?.orZero(): Int {
    return this ?: 0
}

fun Double?.orZero(): Double {
    return this ?: 0.0
}

fun Float?.orZero(): Float {
    return this ?: 0.0f
}

fun Long?.orZero(): Long {
    return this ?: 0L
}

fun Byte?.orZero(): Byte {
    return this ?: 0
}

fun Short?.orZero(): Short {
    return this ?: 0
}

fun String?.orZero(): String {
    return this ?: "0"
}