package ru.netology

fun main() {
    val likes = 211       // кол-во лайков

    val endOfNumber1 = likes % 10
    val endOfNumber11 = likes % 100
    val people = if (endOfNumber1 == 1 && endOfNumber11 != 11) " человеку" else " людям"

    println("Понравилось $likes$people")
}