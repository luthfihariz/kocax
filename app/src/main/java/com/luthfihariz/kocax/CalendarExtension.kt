package com.luthfihariz.kocax

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by luthfihariz on 03/04/18.
 */
/**
 * Created by luthfihariz on 02/04/18.
 */
fun String.toCalendar(pattern: String): Calendar? {
    val dateFormat = SimpleDateFormat(pattern, Locale.getDefault())
    return try {
        val calendar = Calendar.getInstance()
        calendar.time = dateFormat.parse(this)
        calendar
    } catch (e: ParseException) {
        throw(e)
    }
}

fun Calendar.formatTime(pattern: String): String {
    val dateFormat = SimpleDateFormat(pattern, Locale.getDefault())
    return dateFormat.format(time)
}

fun String.adjustTimePattern(oldPattern: String, newPattern: String): String? {
    val dateFormat = SimpleDateFormat(oldPattern, Locale.getDefault())
    return try {
        val calendar = Calendar.getInstance()
        calendar.time = dateFormat.parse(this)
        dateFormat.applyPattern(newPattern)
        dateFormat.format(calendar.time)
    } catch (e: ParseException) {
        throw(e)
    }
}

fun Calendar.midnight(): Calendar {
    return this.run {
        set(Calendar.HOUR_OF_DAY, 0)
        set(Calendar.MINUTE, 0)
        set(Calendar.SECOND, 0)
        set(Calendar.MILLISECOND, 0)
        return@run this
    }
}

fun Calendar.yesterday(): Calendar {
    return this.run {
        set(Calendar.DAY_OF_MONTH, -1)
        return@run this
    }
}