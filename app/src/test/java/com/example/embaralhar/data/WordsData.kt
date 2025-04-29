package com.example.embaralhar.data

const val MAX_NO_WORDS = 10
const val SCORE_INCREASE = 20

val allWords: Set<String> =
    setOf(
        "se",
        "mar",
        "casa",
        "surgir",
        "banana",
        "android",
        "aniversário",
        "maleta",
        "moto",
        "couve-flor"

    )

private val wordLengthMap: Map<Int, String> = allWords.associateBy ({ it.length}, { it })

internal fun getUnscrambledWord(scrambleWord: String) = wordLengthMap[scrambleWord.length] ?: ""