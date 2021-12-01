package day1

import common.println
import common.readInputs

fun main() {
    readInputs(1)
        .map { it.toInt() }
        .windowed(2)
        .count { (x , y) -> y > x }
        .println()
}