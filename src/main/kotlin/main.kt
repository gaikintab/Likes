package ru.netology

fun main() {
    val likes = 21       // кол-во лайков

    val endOfNumber = likes % 10
    val people = if (endOfNumber == 1 && likes != 11) " человеку" else " людям"

    println("Понравилось $likes$people")
}