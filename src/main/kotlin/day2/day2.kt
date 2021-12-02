@file:Suppress("KotlinConstantConditions", "DuplicatedCode")

package day2

import common.readInputs

var horizontal = 0
var depth = 0
var aim = 0

fun main() {

    readInputs(2)
        .map { it.split(" ") }
        .forEach(::part1)
//        .forEach(::part2)

    println(horizontal * depth)
}

fun part1(data: List<String>) {
    val (direction, _v) = data
    val value = _v.toInt()
    when (direction) {
        "up" -> depth -= value
        "down" -> depth += value
        "forward" -> horizontal += value
    }
}


fun part2(data: List<String>) {
    val (direction, _v) = data
    val value = _v.toInt()
    when (direction) {
        "up" -> aim -= value
        "down" -> aim += value
        "forward" -> {
            horizontal += value
            depth += aim * value
        }
    }
}
