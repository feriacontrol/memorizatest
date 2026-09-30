package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object SpeedQuestions {

    val questions = listOf(

        TestQuestion(
            id = 56,
            topic = "Velocidades",
            subtopic = "Señalización",
            text = "Si una señal establece una velocidad máxima inferior al límite genérico de la vía, ¿qué límite debe respetarse?",
            answers = listOf(
                "El límite genérico.",
                "El indicado por la señal.",
                "El que considere seguro el conductor."
            ),
            correctAnswer = 1,
            explanation = "Las limitaciones específicas señalizadas prevalecen sobre los límites genéricos.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículos 47 y 52",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 57,
            topic = "Velocidades",
            subtopic = "Autopistas y autovías",
            text = "Como norma general, ¿cuál es la velocidad máxima de un turismo en autopista o autovía?",
            answers = listOf(
                "100 km/h.",
                "120 km/h.",
                "130 km/h."
            ),
            correctAnswer = 1,
            explanation = "La velocidad máxima genérica para turismos en autopistas y autovías es de 120 km/h.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 48.1.a",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 58,
            topic = "Velocidades",
            subtopic = "Carreteras convencionales",
            text = "Como norma general, ¿cuál es la velocidad máxima de un turismo en carretera convencional?",
            answers = listOf(
                "80 km/h.",
                "90 km/h.",
                "100 km/h."
            ),
            correctAnswer = 1,
            explanation = "El límite genérico de los turismos en carretera convencional es de 90 km/h.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 48.1.a",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 59,
            topic = "Velocidades",
            subtopic = "Velocidad mínima",
            text = "Como norma general, ¿cuál es la velocidad mínima para un vehículo a motor en autopista o autovía?",
            answers = listOf(
                "40 km/h.",
                "50 km/h.",
                "60 km/h."
            ),
            correctAnswer = 2,
            explanation = "En autopistas y autovías está prohibido circular sin causa justificada a menos de 60 km/h.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 49.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 60,
            topic = "Velocidades",
            subtopic = "Velocidad mínima",
            text = "En una carretera convencional donde la velocidad genérica de un turismo es 90 km/h, ¿cuál es, como norma general, su velocidad mínima?",
            answers = listOf(
                "40 km/h.",
                "45 km/h.",
                "60 km/h."
            ),
            correctAnswer = 1,
            explanation = "En las vías distintas de autopistas y autovías, la velocidad mínima general es la mitad de la velocidad genérica correspondiente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 49.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 61,
            topic = "Velocidades",
            subtopic = "Velocidad mínima",
            text = "¿Puede circularse por debajo de la velocidad mínima cuando las circunstancias del tráfico o de la vía impiden mantenerla sin riesgo?",
            answers = listOf(
                "Sí.",
                "No, nunca.",
                "Solo en poblado."
            ),
            correctAnswer = 0,
            explanation = "Puede circularse por debajo del mínimo cuando las circunstancias del tráfico, del vehículo o de la vía impiden mantener una velocidad superior sin riesgo.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 49.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 62,
            topic = "Velocidades",
            subtopic = "Velocidad anormalmente reducida",
            text = "Si un vehículo no puede alcanzar la velocidad mínima exigida y existe peligro de alcance, ¿qué señalización debe utilizar durante la circulación?",
            answers = listOf(
                "Las luces de emergencia.",
                "Únicamente la luz antiniebla.",
                "Las luces de carretera."
            ),
            correctAnswer = 0,
            explanation = "Cuando existe peligro de alcance por no poder alcanzar la velocidad mínima, deben utilizarse las luces indicadoras de dirección con señal de emergencia.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 49.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 63,
            topic = "Velocidades",
            subtopic = "Vías urbanas",
            text = "En una vía urbana de un único carril por sentido, ¿puede la autoridad municipal elevar excepcionalmente el límite genérico de 30 km/h?",
            answers = listOf(
                "No.",
                "Sí, hasta 50 km/h y mediante señalización específica.",
                "Sí, hasta 70 km/h."
            ),
            correctAnswer = 1,
            explanation = "La autoridad municipal puede aumentar excepcionalmente el límite hasta 50 km/h, previa señalización específica.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 50.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 64,
            topic = "Velocidades",
            subtopic = "Vías urbanas",
            text = "¿Puede la autoridad municipal rebajar los límites genéricos de velocidad urbana?",
            answers = listOf(
                "Sí, mediante señalización específica.",
                "No.",
                "Solo durante la noche."
            ),
            correctAnswer = 0,
            explanation = "Los límites genéricos urbanos pueden ser rebajados por la autoridad municipal mediante señalización específica.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 50.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 65,
            topic = "Velocidades",
            subtopic = "Reducción de velocidad",
            text = "Salvo peligro inminente, antes de reducir considerablemente la velocidad el conductor debe...",
            answers = listOf(
                "frenar bruscamente.",
                "comprobar que puede hacerlo sin riesgo y advertirlo previamente.",
                "encender siempre las luces antiniebla."
            ),
            correctAnswer = 1,
            explanation = "Antes de una reducción considerable de velocidad debe comprobarse que puede hacerse sin riesgo, advertirla y evitar una frenada brusca.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 53.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
