package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object AlcoholQuestions {

    val questions = listOf(

        TestQuestion(
            id = 38,
            topic = "Alcohol y drogas",
            subtopic = "Pruebas de alcoholemia",
            text = "¿Están los conductores de bicicletas obligados a someterse a las pruebas de alcoholemia cuando sean requeridos legalmente?",
            answers = listOf(
                "No.",
                "Sí.",
                "Solo de noche."
            ),
            correctAnswer = 1,
            explanation = "La obligación de someterse a las pruebas alcanza tanto a conductores de vehículos como a conductores de bicicletas.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 21",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 39,
            topic = "Alcohol y drogas",
            subtopic = "Accidentes",
            text = "Un usuario de la vía que no conduce, ¿puede estar obligado a someterse a una prueba de alcoholemia si está implicado en un accidente?",
            answers = listOf(
                "Sí.",
                "No, nunca.",
                "Solo si tiene permiso de conducir."
            ),
            correctAnswer = 0,
            explanation = "Los demás usuarios de la vía pueden estar obligados cuando estén implicados en un accidente de circulación.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 21",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 40,
            topic = "Alcohol y drogas",
            subtopic = "Controles preventivos",
            text = "¿Puede un conductor ser requerido para una prueba de alcoholemia dentro de un control preventivo?",
            answers = listOf(
                "Sí.",
                "No, salvo que haya cometido una infracción.",
                "Solo después de un accidente."
            ),
            correctAnswer = 0,
            explanation = "Los agentes pueden requerir pruebas dentro de los programas de controles preventivos de alcoholemia.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 21.d",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 41,
            topic = "Alcohol y drogas",
            subtopic = "Etilómetro",
            text = "Normalmente, ¿cómo se realiza la prueba para detectar alcohol?",
            answers = listOf(
                "Mediante aire espirado con un etilómetro autorizado.",
                "Mediante una prueba visual.",
                "Únicamente mediante análisis de sangre."
            ),
            correctAnswer = 0,
            explanation = "La prueba se practica normalmente mediante la verificación del aire espirado con etilómetros oficialmente autorizados.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 22.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 42,
            topic = "Alcohol y drogas",
            subtopic = "Prueba de contraste",
            text = "¿Puede el interesado solicitar una prueba de contraste después de una prueba de alcoholemia?",
            answers = listOf(
                "No.",
                "Sí.",
                "Solo si es conductor profesional."
            ),
            correctAnswer = 1,
            explanation = "A petición del interesado o por orden judicial pueden realizarse pruebas de contraste mediante análisis de sangre, orina u otros análogos.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 22.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
