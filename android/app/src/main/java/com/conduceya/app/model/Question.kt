package com.conduceya.app.model

data class TestQuestion(
    val id: Int,
    val text: String,
    val answers: List<String>,
    val correctAnswer: Int,
    val explanation: String,
    val topic: String,
    val reference: String
)
