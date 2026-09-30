package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object LoadQuestions {

    val questions = listOf(

        TestQuestion(
            id = 199,
            topic = "Carga y equipaje",
            subtopic = "Sujeción",
            text = "La carga transportada en un vehículo debe colocarse y sujetarse de forma que...",
            answers = listOf(
                "no pueda caer, arrastrar o desplazarse peligrosamente.",
                "pueda moverse libremente durante la marcha.",
                "sobresalga siempre del vehículo."
            ),
            correctAnswer = 0,
            explanation = "La carga y sus accesorios deben disponerse y sujetarse de forma que no puedan caer, arrastrar o desplazarse peligrosamente ni comprometer la estabilidad del vehículo.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 14.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 200,
            topic = "Carga y equipaje",
            subtopic = "Visibilidad y señalización",
            text = "¿Puede colocarse una carga de forma que oculte las luces o la matrícula del vehículo?",
            answers = listOf(
                "No.",
                "Sí, durante el día.",
                "Sí, si el trayecto es corto."
            ),
            correctAnswer = 0,
            explanation = "La carga no puede ocultar los dispositivos de alumbrado o señalización, las placas de matrícula ni otros distintivos obligatorios.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 14.1.d",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
