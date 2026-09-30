package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object AccidentQuestions {

    val questions = listOf(

        TestQuestion(
            id = 176,
            topic = "Accidentes y primeros auxilios",
            subtopic = "Conducta PAS",
            text = "Ante un accidente de tráfico, ¿cuál es el orden de actuación de la conducta PAS?",
            answers = listOf(
                "Proteger, Avisar y Socorrer.",
                "Socorrer, Avisar y Proteger.",
                "Avisar, Socorrer y Proteger."
            ),
            correctAnswer = 0,
            explanation = "La conducta PAS establece primero proteger el lugar y a las personas, después avisar a los servicios de emergencia y finalmente socorrer si se tienen los conocimientos necesarios.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Qué hacer ante un accidente de tráfico - Conducta PAS",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 177,
            topic = "Accidentes y primeros auxilios",
            subtopic = "Emergencias",
            text = "¿Cuál es el número europeo de emergencias al que debe avisarse ante un accidente que requiera asistencia?",
            answers = listOf(
                "091.",
                "112.",
                "060."
            ),
            correctAnswer = 1,
            explanation = "El 112 es el número europeo establecido para activar los servicios de emergencia.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Qué hacer ante un accidente - Avisar",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 178,
            topic = "Accidentes y primeros auxilios",
            subtopic = "Aviso al 112",
            text = "Al llamar al 112 por un accidente, ¿es importante comunicar la localización, los vehículos implicados y el número de heridos?",
            answers = listOf(
                "Sí.",
                "No, basta con decir que ha ocurrido un accidente.",
                "Solo es necesario indicar la matrícula."
            ),
            correctAnswer = 0,
            explanation = "La información sobre localización, vehículos, heridos y circunstancias especiales facilita una respuesta adecuada de los servicios de emergencia.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Información que debe darse al 112",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 179,
            topic = "Accidentes y primeros auxilios",
            subtopic = "Motoristas accidentados",
            text = "Como norma general, ante un motorista accidentado, ¿debe quitarle el casco una persona sin formación específica?",
            answers = listOf(
                "Sí, siempre.",
                "No.",
                "Solo si el casco está cerrado."
            ),
            correctAnswer = 1,
            explanation = "La DGT recomienda no quitar el casco al motorista accidentado salvo actuación de personal capacitado o circunstancias excepcionales que lo requieran.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Socorrer - Accidentes de tráfico",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 180,
            topic = "Accidentes y primeros auxilios",
            subtopic = "Víctimas",
            text = "Como norma general, ¿debe movilizarse a una víctima de un accidente sin conocimientos de primeros auxilios?",
            answers = listOf(
                "Sí, inmediatamente.",
                "No, salvo que exista un peligro grave como incendio o explosión.",
                "Sí, para colocarla siempre de pie."
            ),
            correctAnswer = 1,
            explanation = "No debe movilizarse a una víctima sin conocimientos adecuados salvo que exista un riesgo grave e inmediato que haga necesario apartarla.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Socorrer - Accidentes de tráfico",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 181,
            topic = "Accidentes y primeros auxilios",
            subtopic = "Víctimas",
            text = "¿Debe darse comida o bebida a una persona herida en un accidente?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo bebidas azucaradas."
            ),
            correctAnswer = 1,
            explanation = "La DGT recomienda no dar de beber ni de comer a las víctimas de un accidente.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Socorrer - Accidentes de tráfico",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
