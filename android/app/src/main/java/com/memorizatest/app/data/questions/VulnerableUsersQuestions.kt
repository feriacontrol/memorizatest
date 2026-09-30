package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object VulnerableUsersQuestions {

    val questions = listOf(

        TestQuestion(
            id = 54,
            topic = "Usuarios vulnerables",
            subtopic = "Ciclistas",
            text = "Si un ciclista circula por un carril bici o paso para ciclistas debidamente señalizado, ¿tiene prioridad frente a un vehículo de motor cuya trayectoria se cruza con la suya?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si circula en grupo."
            ),
            correctAnswer = 0,
            explanation = "Los ciclistas tienen prioridad cuando circulan por un carril bici, paso para ciclistas o arcén debidamente señalizados.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 64",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 55,
            topic = "Usuarios vulnerables",
            subtopic = "Peatones",
            text = "En un paso para peatones debidamente señalizado, ¿quién tiene prioridad?",
            answers = listOf(
                "El vehículo.",
                "El peatón.",
                "El que llegue primero."
            ),
            correctAnswer = 1,
            explanation = "Los peatones tienen prioridad en los pasos para peatones debidamente señalizados.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 65",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
