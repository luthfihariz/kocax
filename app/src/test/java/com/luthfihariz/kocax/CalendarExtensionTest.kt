package com.luthfihariz.kocax

import org.junit.Test
import org.junit.Assert.*
import java.util.*

/**
 * Created by luthfihariz on 03/04/18.
 */
class CalendarExtensionTest {

    @Test
    fun formatTime() {
        val calendar = Calendar.getInstance()
        calendar.set(2018, 10, 10, 13, 15)
        assertEquals("10 11 2018 01:15 PM", calendar.formatTime("dd MM yyyy hh:mm aaa"))
    }

    @Test
    fun toCalendar() {
        val firstJan = Calendar.getInstance()
        firstJan.set(2018, 0, 1, 10, 0, 0)
        firstJan.set(Calendar.MILLISECOND, 0)
        val firstJanInString = "01 01 2018 10:00 AM"
        assertEquals(firstJanInString.toCalendar("dd MM yyyy hh:mm aaa"), firstJan)
    }

    @Test
    fun adjustTimePattern() {
        val oldPattern = "2018-10-19"
        val newPattern = "19 10 2018"
        assertEquals(newPattern, oldPattern.adjustTimePattern("yyyy-MM-dd", "dd MM yyyy"))
    }

    @Test
    fun midnight() {
        val todayMidnight = Calendar.getInstance()
        todayMidnight.apply {
            set(Calendar.HOUR_OF_DAY, 0)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
        }

        assertEquals(todayMidnight, Calendar.getInstance().midnight())

    }

    @Test
    fun yesterday() {
        val yesterday = Calendar.getInstance()
        yesterday.set(Calendar.DAY_OF_MONTH, -1)
        assertEquals(yesterday, Calendar.getInstance().yesterday())
    }
}