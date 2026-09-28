package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object NightDrivingQuestions {

    val questions = listOf(

        TestQuestion(
            id = 240,
            topic = "Conducción nocturna",
            subtopic = "Alumbrado",
            text = "Entre el ocaso y la salida del sol, los vehículos deben llevar encendido...",
            answers = listOf(
                "el alumbrado que corresponda.",
                "únicamente las luces de emergencia.",
                "ningún alumbrado si la vía está iluminada."
            ),
            correctAnswer = 0,
            explanation = "Entre el ocaso y la salida del sol debe utilizarse el alumbrado reglamentario correspondiente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 98.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 241,
            topic = "Conducción nocturna",
            subtopic = "Túneles",
            text = "¿Debe utilizarse alumbrado dentro de un túnel aunque sea de día?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si el túnel supera un kilómetro."
            ),
            correctAnswer = 0,
            explanation = "En túneles, pasos inferiores y tramos afectados por la señal de túnel debe utilizarse el alumbrado correspondiente a cualquier hora del día.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 98.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 242,
            topic = "Conducción nocturna",
            subtopic = "Velocidad",
            text = "Al conducir de noche, ¿debe adaptarse la velocidad al alcance real de la visión?",
            answers = listOf(
                "Sí.",
                "No, basta con respetar exactamente el límite máximo.",
                "Solo cuando llueve."
            ),
            correctAnswer = 0,
            explanation = "La velocidad debe adaptarse a la visibilidad disponible para conservar margen suficiente de reacción y detención.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Consejos para conducir de noche",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 243,
            topic = "Conducción nocturna",
            subtopic = "Distancia",
            text = "Durante la conducción nocturna, ¿es recomendable aumentar la distancia de seguridad?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo en poblado."
            ),
            correctAnswer = 0,
            explanation = "La menor visibilidad nocturna aconseja aumentar la distancia para disponer de mayor tiempo de reacción.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Consejos para conducir de noche",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 244,
            topic = "Conducción nocturna",
            subtopic = "Deslumbramiento",
            text = "Si otro vehículo deslumbra al conductor durante la noche, una referencia útil para mantener la trayectoria es...",
            answers = listOf(
                "el borde derecho de la calzada.",
                "mirar directamente a sus faros.",
                "el retrovisor interior."
            ),
            correctAnswer = 0,
            explanation = "La DGT aconseja evitar mirar directamente a las luces que deslumbran y utilizar como referencia el lado derecho de la vía.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Recomendaciones de conducción nocturna",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 245,
            topic = "Conducción nocturna",
            subtopic = "Visibilidad",
            text = "¿Por qué es especialmente importante mantener limpios el parabrisas y las lunas durante la noche?",
            answers = listOf(
                "Porque la suciedad favorece reflejos y reduce la visibilidad.",
                "Porque aumenta la potencia de los faros.",
                "Porque reduce automáticamente la velocidad."
            ),
            correctAnswer = 0,
            explanation = "La suciedad en cristales puede incrementar reflejos y empeorar la visión nocturna.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Consejos para conducir de noche",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
