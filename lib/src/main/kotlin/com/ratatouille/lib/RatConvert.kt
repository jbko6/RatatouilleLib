package com.ratatouille.lib

import com.ratatouille.lib.RatConversions.RATATOUILLE_HOUR
import com.ratatouille.lib.RatConversions.RATATOUILLE_MINUTE
import com.ratatouille.lib.RatConversions.RATATOUILLE_SECOND
import com.ratatouille.lib.RatConversions.REMY_FEET
import com.ratatouille.lib.RatConversions.REMY_INCH
import com.ratatouille.lib.RatConversions.REMY_METER
import com.ratatouille.lib.RatConversions.REMY_MILE
import com.ratatouille.lib.RatConversions.REMY_YARD

internal object RatConversions {
    const val RATATOUILLE_HOUR = 2
    const val RATATOUILLE_MINUTE = 120
    const val RATATOUILLE_SECOND = 7200
    const val REMY_INCH = 6
    const val REMY_FEET = 0.5
    const val REMY_YARD = 1 / (3 * 2)
    const val REMY_MILE = 1 / (5800 * 2)
    const val REMY_METER = 1 / (3.2808 * 2)
}

fun Double.ratatouilleToHour() = this * RATATOUILLE_HOUR

fun Double.hourToRatatouille() = this / RATATOUILLE_HOUR

fun Double.ratatouilleToMinute() = this * RATATOUILLE_MINUTE

fun Double.minuteToRatatouille() = this / RATATOUILLE_MINUTE

fun Double.ratatouilleToSecond() = this * RATATOUILLE_SECOND

fun Double.secondToRatatouille() = this / RATATOUILLE_SECOND

fun Double.remyToInch() = this * REMY_INCH

fun Double.inchToRemy() = this / REMY_INCH

fun Double.remyToFeet() = this * REMY_FEET

fun Double.feetToRemy() = this / REMY_FEET

fun Double.remyToYard() = this * REMY_YARD

fun Double.yardToRemy() = this / REMY_YARD

fun Double.mileToRemy() = this * REMY_MILE

fun Double.remyToMile() = this / REMY_MILE

fun Double.meterToRemy() = this * REMY_METER

fun Double.remyToMeter() = this / REMY_METER