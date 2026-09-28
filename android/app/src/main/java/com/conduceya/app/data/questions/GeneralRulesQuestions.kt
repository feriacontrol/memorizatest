package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object GeneralRulesQuestions {

    val questions = listOf(

        TestQuestion(
            id = 31,
            topic = "Normas generales",
            subtopic = "Control del vehículo",
            text = "Durante la conducción, ¿cuándo debe estar el conductor en condiciones de controlar su vehículo?",
            answers = listOf(
                "Solo cuando circula por carretera.",
                "En todo momento.",
                "Solo cuando supera los 50 km/h."
            ),
            correctAnswer = 1,
            explanation = "El conductor debe estar en todo momento en condiciones de controlar su vehículo.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 17.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 32,
            topic = "Normas generales",
            subtopic = "Usuarios vulnerables",
            text = "Al aproximarse a usuarios especialmente vulnerables, ¿qué debe hacer el conductor?",
            answers = listOf(
                "Mantener siempre la misma velocidad.",
                "Adoptar las precauciones necesarias para su seguridad.",
                "Utilizar obligatoriamente el claxon."
            ),
            correctAnswer = 1,
            explanation = "El Reglamento obliga a adoptar las precauciones necesarias para proteger a otros usuarios, especialmente a las personas más vulnerables.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 17.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 33,
            topic = "Normas generales",
            subtopic = "Atención",
            text = "Mientras conduce, ¿qué debe mantener el conductor?",
            answers = listOf(
                "Libertad de movimientos, campo de visión y atención permanente.",
                "Únicamente una mano sobre el volante.",
                "Solo el campo de visión hacia delante."
            ),
            correctAnswer = 0,
            explanation = "La conducción exige libertad de movimientos, campo de visión suficiente y atención permanente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 18.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 34,
            topic = "Normas generales",
            subtopic = "Carga y animales",
            text = "Los objetos o animales transportados en un vehículo deben colocarse...",
            answers = listOf(
                "de forma que no interfieran con el conductor.",
                "siempre en los asientos delanteros.",
                "sin ninguna limitación si están sujetos."
            ),
            correctAnswer = 0,
            explanation = "Los objetos y animales deben situarse de forma que no interfieran entre ellos y el conductor.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 18.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 35,
            topic = "Normas generales",
            subtopic = "Pantallas",
            text = "Con el vehículo en movimiento, ¿es compatible con la atención permanente utilizar una pantalla para ver vídeos?",
            answers = listOf(
                "Sí, siempre.",
                "Sí, si se circula despacio.",
                "No."
            ),
            correctAnswer = 2,
            explanation = "El uso durante la marcha de pantallas destinadas a internet, televisión o vídeo se considera incompatible con la atención permanente a la conducción.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 18.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 36,
            topic = "Normas generales",
            subtopic = "Auriculares",
            text = "Como norma general, ¿se puede conducir utilizando auriculares conectados a un reproductor de sonido?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo en vías urbanas."
            ),
            correctAnswer = 1,
            explanation = "Como regla general está prohibido conducir utilizando auriculares o dispositivos similares que disminuyan la atención.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 18.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 37,
            topic = "Normas generales",
            subtopic = "Teléfono móvil",
            text = "Como norma general, ¿está permitido utilizar un teléfono móvil durante la conducción?",
            answers = listOf(
                "No.",
                "Sí, si el tráfico es lento.",
                "Sí, dentro de poblado."
            ),
            correctAnswer = 0,
            explanation = "La utilización de dispositivos de telefonía móvil durante la conducción está prohibida, salvo las excepciones previstas legalmente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 18.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
