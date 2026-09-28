package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object DistanceQuestions {

    val questions = listOf(

        TestQuestion(
            id = 212,
            topic = "Distancia de seguridad",
            subtopic = "Regla general",
            text = "La separación con el vehículo precedente debe permitir...",
            answers = listOf(
                "detenerse ante un frenado brusco sin colisionar con él.",
                "circular siempre a la misma velocidad que él.",
                "adelantarlo inmediatamente."
            ),
            correctAnswer = 0,
            explanation = "Debe mantenerse un espacio que permita detener el vehículo sin colisionar si el que circula delante frena bruscamente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 54.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 213,
            topic = "Distancia de seguridad",
            subtopic = "Factores",
            text = "Para determinar una distancia de seguridad adecuada hay que tener especialmente en cuenta...",
            answers = listOf(
                "la velocidad y las condiciones de adherencia y frenado.",
                "únicamente el color del vehículo precedente.",
                "solo la cilindrada del motor."
            ),
            correctAnswer = 0,
            explanation = "La distancia necesaria depende especialmente de la velocidad y de las condiciones de adherencia y frenado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 54.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 214,
            topic = "Distancia de seguridad",
            subtopic = "Adelantamiento",
            text = "Fuera de las excepciones reglamentarias, un conductor que no pretende adelantar debe dejar una separación que...",
            answers = listOf(
                "permita al vehículo que le siga adelantarlo con seguridad.",
                "impida que cualquier vehículo pueda adelantar.",
                "sea siempre exactamente de 10 metros."
            ),
            correctAnswer = 0,
            explanation = "Además de evitar alcances, debe mantenerse en determinados casos una separación que permita al vehículo que circula detrás adelantar con seguridad.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 54.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 215,
            topic = "Distancia de seguridad",
            subtopic = "Vehículos pesados",
            text = "En los casos en que resulte aplicable la separación para facilitar adelantamientos, un vehículo de más de 3.500 kg de MMA debe guardar al menos...",
            answers = listOf(
                "25 metros.",
                "50 metros.",
                "100 metros."
            ),
            correctAnswer = 1,
            explanation = "Los vehículos de más de 3.500 kg de MMA deben mantener una separación mínima de 50 metros en los supuestos previstos por el Reglamento.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 54.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 216,
            topic = "Distancia de seguridad",
            subtopic = "Vehículos largos",
            text = "En los casos en que resulte aplicable, un vehículo o conjunto de vehículos de más de 10 metros de longitud debe guardar, al menos...",
            answers = listOf(
                "20 metros.",
                "30 metros.",
                "50 metros."
            ),
            correctAnswer = 2,
            explanation = "Los vehículos y conjuntos de más de 10 metros de longitud total deben mantener una separación mínima de 50 metros en esos supuestos.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 54.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 217,
            topic = "Distancia de seguridad",
            subtopic = "Excepciones",
            text = "La obligación de dejar separación para que otro vehículo pueda adelantar, ¿se aplica dentro de poblado?",
            answers = listOf(
                "No.",
                "Sí, siempre.",
                "Solo durante la noche."
            ),
            correctAnswer = 0,
            explanation = "La obligación específica de dejar espacio para facilitar el adelantamiento prevista en el artículo 54.2 no se aplica en poblado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 54.3.a",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
