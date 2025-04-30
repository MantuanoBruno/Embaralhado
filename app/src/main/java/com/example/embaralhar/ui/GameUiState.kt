package com.example.embaralhar.ui

data class GameUiState (
    val currentScrambleWord: String = "",
    val reShuffleCurrentWord: String = "",
    val currentWordCount: Int = 1,
    val score: Int = 0,
    val isGuessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false
)