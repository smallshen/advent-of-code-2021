package common

import java.io.File

fun readInputs(day: Int) = File("inputs/day$day.txt").readLines()

fun Any?.println() = println(this)