package ru.sumin.composition.domain.entity

data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOgQuestions: Int,
    val gameSettings: GameSettings
)