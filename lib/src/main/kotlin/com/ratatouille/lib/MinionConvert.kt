package com.ratatouille.lib

import com.ratatouille.lib.MinionConversions.GRU_FEET
import com.ratatouille.lib.MinionConversions.GRU_INCHES
import com.ratatouille.lib.MinionConversions.GRU_MILES
import com.ratatouille.lib.MinionConversions.GRU_YARDS
import com.ratatouille.lib.MinionConversions.MINION_FEET
import com.ratatouille.lib.MinionConversions.MINION_INCHES
import com.ratatouille.lib.MinionConversions.MINION_MILES
import com.ratatouille.lib.MinionConversions.MINION_YARDS
import com.ratatouille.lib.MinionConversions.MOVIE_HOURS
import com.ratatouille.lib.MinionConversions.MOVIE_MILLISECONDS
import com.ratatouille.lib.MinionConversions.MOVIE_MINUTES
import com.ratatouille.lib.MinionConversions.MOVIE_SECONDS

internal object MinionConversions {
    const val MINION_INCHES = 24
    const val MINION_FEET = 2
    const val MINION_YARDS = 0.66
    const val MINION_MILES = 0.00037879
    const val MOVIE_MINUTES = 90
    const val MOVIE_HOURS = 1.5
    const val MOVIE_SECONDS = 5400
    const val MOVIE_MILLISECONDS = 5400000
    const val GRU_INCHES = 78
    const val GRU_FEET = 6.5
    const val GRU_YARDS = 2.16
    const val GRU_MILES = 0.00123106
}

fun Double.inchesToMinions() = this / MINION_INCHES

fun Double.minionsToInches() = this * MINION_INCHES

fun Double.feetToMinions() = this / MINION_FEET

fun Double.minionsToFeet() = this * MINION_FEET

fun Double.yardsToMinions() = this / MINION_YARDS

fun Double.minionsToYards() = this * MINION_YARDS

fun Double.milesToMinions() = this / MINION_MILES

fun Double.minionsToMiles() = this * MINION_MILES

fun Double.minutesToDespicableMe() = this / MOVIE_MINUTES

fun Double.despicableMeToMinutes() = this * MOVIE_MINUTES

fun Double.hoursToDespicableMe() = this / MOVIE_HOURS

fun Double.despicableMeToHours() = this * MOVIE_HOURS

fun Double.secondsToDespicableMe() = this / MOVIE_SECONDS

fun Double.despicableMeToSeconds() = this * MOVIE_SECONDS

fun Double.millisecondsToDespicableMe() = this / MOVIE_MILLISECONDS

fun Double.despicableMeToMilliseconds() = this * MOVIE_MILLISECONDS

fun Double.inchesToGru() = this / GRU_INCHES

fun Double.gruToInches() = this * GRU_INCHES

fun Double.feetToGru() = this / GRU_FEET

fun Double.gruToFeet() = this * GRU_FEET

fun Double.yardsToGru() = this / GRU_YARDS

fun Double.gruToYards() = this * GRU_YARDS

fun Double.milesToGru() = this / GRU_MILES

fun Double.gruToMiles() = this * GRU_MILES