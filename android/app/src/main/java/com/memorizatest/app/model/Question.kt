package com.memorizatest.app.model

enum class QuestionSourceType {
    BOE,
    DGT,
    REVISTA_DGT,
    ELABORACION_PROPIA
}

enum class QuestionDifficulty {
    EASY,
    MEDIUM,
    HARD
}

enum class QuestionType {
    TEXT,
    IMAGE
}

enum class QuestionOrigin {
    VERIFIED,
    DGT_PUBLISHED
}

data class TestQuestion(
    val id: Int,

    // Permiso
    val permit: String = "B",

    // Clasificación
    val topic: String,
    val subtopic: String = "",

    // Pregunta y respuestas
    val text: String,
    val answers: List<String>,
    val correctAnswer: Int,

    // Explicación para el alumno
    val explanation: String,

    // Fuente y verificación
    val origin: QuestionOrigin = QuestionOrigin.VERIFIED,
    val sourceType: QuestionSourceType = QuestionSourceType.ELABORACION_PROPIA,
    val reference: String,
    val legalReference: String = "",
    val lastVerified: String = "PENDIENTE",

    // Metadatos
    val difficulty: QuestionDifficulty = QuestionDifficulty.MEDIUM,
    val questionType: QuestionType = QuestionType.TEXT,

    // Imagen, si la pregunta la necesita
    val imageAsset: String? = null,

    // Permite desactivar una pregunta sin borrarla
    val active: Boolean = true
)
