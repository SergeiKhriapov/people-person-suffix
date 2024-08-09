package ru.netology

fun main() {
    val likes = 2002
    val message = if (likes % 10 == 1 && likes % 100 != 11) "человку" else "людям"
    println(
        """
        Понравилось $likes $message
    """.trimIndent()
    )

}