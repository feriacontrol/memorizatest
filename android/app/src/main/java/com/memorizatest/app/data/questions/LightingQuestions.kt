package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object LightingQuestions {

    val questions = listOf(

        TestQuestion(
            id = 66,
            topic = "Alumbrado",
            subtopic = "Luces de posición",
            text = "Entre el ocaso y la salida del sol, ¿debe llevar un vehículo encendidas las luces de posición?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo en autopista."
            ),
            correctAnswer = 0,
            explanation = "Entre el ocaso y la salida del sol deben estar encendidas las luces de posición.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 99.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 67,
            topic = "Alumbrado",
            subtopic = "Luces de gálibo",
            text = "Si la anchura de un vehículo excede de 2,10 metros y circula de noche, además de las luces de posición deberá llevar...",
            answers = listOf(
                "las luces de gálibo.",
                "la luz antiniebla trasera obligatoriamente.",
                "las luces de emergencia."
            ),
            correctAnswer = 0,
            explanation = "Los vehículos de más de 2,10 metros de anchura deben utilizar también las luces de gálibo en las circunstancias previstas.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 99.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 68,
            topic = "Alumbrado",
            subtopic = "Luz de carretera",
            text = "Fuera de poblado, de noche y en una vía insuficientemente iluminada, un vehículo que circula a más de 40 km/h utilizará normalmente...",
            answers = listOf(
                "la luz de carretera, salvo que deba utilizar la de cruce.",
                "solo la luz de posición.",
                "las luces de emergencia."
            ),
            correctAnswer = 0,
            explanation = "En esas condiciones debe utilizarse normalmente la luz de carretera, excepto cuando proceda utilizar la de cruce para evitar deslumbramientos u otros supuestos reglamentarios.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 100.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 69,
            topic = "Alumbrado",
            subtopic = "Luz de carretera",
            text = "¿Puede mantenerse encendida la luz de carretera con el vehículo parado o estacionado?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo fuera de poblado."
            ),
            correctAnswer = 1,
            explanation = "Está prohibida la utilización de la luz de carretera cuando el vehículo está parado o estacionado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 100.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 70,
            topic = "Alumbrado",
            subtopic = "Luz de cruce",
            text = "De noche, al circular por una vía suficientemente iluminada, un vehículo de motor debe llevar encendida...",
            answers = listOf(
                "la luz de cruce, además de la de posición.",
                "únicamente la luz de posición.",
                "siempre la luz de carretera."
            ),
            correctAnswer = 0,
            explanation = "En vías suficientemente iluminadas entre el ocaso y la salida del sol debe utilizarse el alumbrado de cruce junto con el de posición.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 101.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 71,
            topic = "Alumbrado",
            subtopic = "Deslumbramiento",
            text = "Si existe posibilidad de deslumbrar a otro usuario con la luz de carretera, ¿qué debe hacerse?",
            answers = listOf(
                "Mantenerla encendida.",
                "Sustituirla por la luz de cruce.",
                "Apagar todo el alumbrado."
            ),
            correctAnswer = 1,
            explanation = "La luz de carretera debe sustituirse por la de cruce tan pronto exista posibilidad de producir deslumbramiento.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 102.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 72,
            topic = "Alumbrado",
            subtopic = "Deslumbramiento",
            text = "Si un conductor resulta deslumbrado, debe...",
            answers = listOf(
                "aumentar la velocidad para salir antes de la zona.",
                "reducir la velocidad lo necesario, incluso hasta detenerse.",
                "circular por el arcén."
            ),
            correctAnswer = 1,
            explanation = "En caso de deslumbramiento debe reducirse la velocidad lo necesario, incluso hasta la detención total si fuera preciso.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 102.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 73,
            topic = "Alumbrado",
            subtopic = "Antiniebla trasera",
            text = "¿Cuándo debe utilizarse la luz antiniebla trasera?",
            answers = listOf(
                "Siempre que llueva ligeramente.",
                "Solo cuando las condiciones sean especialmente desfavorables.",
                "Siempre durante la noche."
            ),
            correctAnswer = 1,
            explanation = "La antiniebla trasera se utiliza únicamente con condiciones especialmente desfavorables, como niebla espesa, lluvia muy intensa, fuerte nevada o nubes densas de polvo o humo.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 106.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
