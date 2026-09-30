package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object FatigueQuestions {

    val questions = listOf(

        TestQuestion(
            id = 190,
            topic = "Fatiga y sueño",
            subtopic = "Descansos",
            text = "En un viaje largo, la DGT aconseja interrumpir la conducción como norma general...",
            answers = listOf(
                "cada 2 horas o 200 kilómetros.",
                "cada 5 horas.",
                "únicamente cuando se encienda un testigo."
            ),
            correctAnswer = 0,
            explanation = "La DGT recomienda interrumpir la conducción cada dos horas o cada 200 kilómetros, y hacerlo antes si aparecen síntomas de cansancio o sueño.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducir con sueño o cansancio",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 191,
            topic = "Fatiga y sueño",
            subtopic = "Somnolencia",
            text = "La somnolencia al volante...",
            answers = listOf(
                "aumenta el tiempo de reacción.",
                "reduce el tiempo de reacción.",
                "no afecta a la capacidad de reaccionar."
            ),
            correctAnswer = 0,
            explanation = "La somnolencia aumenta sensiblemente el tiempo necesario para reaccionar ante los estímulos del tráfico.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Efectos de la somnolencia",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 192,
            topic = "Fatiga y sueño",
            subtopic = "Horas de mayor riesgo",
            text = "¿En qué franjas horarias aparece con mayor facilidad la somnolencia según la DGT?",
            answers = listOf(
                "Entre las 3 y 5 de la madrugada y entre las 14 y 16 horas.",
                "Únicamente entre las 9 y las 11 de la mañana.",
                "Solo después de medianoche."
            ),
            correctAnswer = 0,
            explanation = "Los ritmos biológicos hacen que la somnolencia aparezca con mayor facilidad durante la madrugada y las primeras horas de la tarde.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducir con sueño o cansancio",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 193,
            topic = "Fatiga y sueño",
            subtopic = "Somnolencia",
            text = "Si aparece sueño durante la conducción, ¿qué es lo más seguro?",
            answers = listOf(
                "Parar en un lugar adecuado y descansar.",
                "Subir mucho el volumen de la música y continuar.",
                "Aumentar la velocidad para llegar antes."
            ),
            correctAnswer = 0,
            explanation = "Cuando aparece somnolencia, lo más seguro es detener la conducción y descansar en un lugar adecuado.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Prevención de la somnolencia",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 194,
            topic = "Fatiga y sueño",
            subtopic = "Entorno",
            text = "¿Puede una carretera monótona favorecer la aparición de somnolencia?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si está mojada."
            ),
            correctAnswer = 0,
            explanation = "Los entornos viales monótonos y con poca estimulación pueden favorecer la aparición del sueño.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Factores de somnolencia",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
