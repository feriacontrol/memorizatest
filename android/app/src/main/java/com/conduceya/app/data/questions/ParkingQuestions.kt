package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object ParkingQuestions {

    val questions = listOf(

        TestQuestion(
            id = 74,
            topic = "Estacionamiento",
            subtopic = "Vías interurbanas",
            text = "Como norma general, ¿dónde debe efectuarse una parada o estacionamiento en una vía interurbana?",
            answers = listOf(
                "Fuera de la calzada, en el lado derecho y dejando libre la parte transitable del arcén.",
                "Sobre el arcén.",
                "En cualquier lado de la calzada."
            ),
            correctAnswer = 0,
            explanation = "En vías interurbanas debe hacerse fuera de la calzada, en el lado derecho y dejando libre la parte transitable del arcén.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 90.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 75,
            topic = "Estacionamiento",
            subtopic = "Vías urbanas",
            text = "En una vía urbana de sentido único, si está permitido estacionar en la calzada, ¿puede hacerse también en el lado izquierdo?",
            answers = listOf(
                "Sí.",
                "No, nunca.",
                "Solo las motocicletas."
            ),
            correctAnswer = 0,
            explanation = "En vías urbanas de sentido único el vehículo puede situarse también en el lado izquierdo.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 90.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 76,
            topic = "Estacionamiento",
            subtopic = "Normas generales",
            text = "La parada o el estacionamiento deben realizarse de forma que...",
            answers = listOf(
                "no obstaculicen la circulación ni constituyan un riesgo.",
                "el vehículo quede siempre con el motor encendido.",
                "ocupen parcialmente el carril de circulación."
            ),
            correctAnswer = 0,
            explanation = "La parada y el estacionamiento no deben obstaculizar la circulación ni constituir un riesgo para otros usuarios.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 91.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 77,
            topic = "Estacionamiento",
            subtopic = "Lugares prohibidos",
            text = "¿Está permitido parar sobre un paso para peatones?",
            answers = listOf(
                "Sí, durante menos de dos minutos.",
                "No.",
                "Sí, si permanecemos dentro del vehículo."
            ),
            correctAnswer = 1,
            explanation = "Está prohibido parar en los pasos para peatones.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 94.1.b",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 78,
            topic = "Estacionamiento",
            subtopic = "Autopistas y autovías",
            text = "¿Está permitido parar en una autopista o autovía fuera de una zona habilitada?",
            answers = listOf(
                "Sí.",
                "No.",
                "Sí, si se encienden las luces de emergencia."
            ),
            correctAnswer = 1,
            explanation = "Está prohibido parar en autopistas y autovías salvo en los lugares expresamente habilitados.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 94.1.g",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 79,
            topic = "Estacionamiento",
            subtopic = "Doble fila",
            text = "¿Está permitido estacionar en doble fila?",
            answers = listOf(
                "Sí, durante unos minutos.",
                "No.",
                "Sí, si queda suficiente espacio."
            ),
            correctAnswer = 1,
            explanation = "El estacionamiento en doble fila está prohibido.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 94.2.g",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 80,
            topic = "Estacionamiento",
            subtopic = "Zonas peatonales",
            text = "Como norma general, ¿está permitido estacionar sobre una acera destinada al paso de peatones?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo de noche."
            ),
            correctAnswer = 1,
            explanation = "Está prohibido estacionar sobre aceras, paseos y demás zonas destinadas al paso de peatones.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 94.2.e",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
