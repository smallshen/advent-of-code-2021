@file:Suppress("NOTHING_TO_INLINE")

package common

import java.io.File

fun readInputs(day: Int) = File("inputs/day$day.txt").readLines()

inline fun Any?.println() = println(this)