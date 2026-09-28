package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object EcoDrivingQuestions {

    val questions = listOf(

        TestQuestion(
            id = 195,
            topic = "Conducción eficiente",
            subtopic = "Arranque",
            text = "Para realizar un arranque eficiente, ¿es recomendable pisar el acelerador al arrancar el motor?",
            answers = listOf(
                "No.",
                "Sí, siempre.",
                "Solo con el motor caliente."
            ),
            correctAnswer = 0,
            explanation = "La DGT recomienda arrancar el motor sin pisar el acelerador.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducción eficiente - Arranque",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 196,
            topic = "Conducción eficiente",
            subtopic = "Marchas",
            text = "En condiciones normales, para reducir el consumo es conveniente circular...",
            answers = listOf(
                "el mayor tiempo posible en marchas largas y a bajas revoluciones.",
                "siempre en marchas cortas y a altas revoluciones.",
                "con el cambio en punto muerto."
            ),
            correctAnswer = 0,
            explanation = "La conducción eficiente busca utilizar marchas largas y un régimen bajo de revoluciones cuando las condiciones permiten hacerlo con seguridad.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducción eficiente",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 197,
            topic = "Conducción eficiente",
            subtopic = "Anticipación",
            text = "¿Qué estilo de conducción ayuda a reducir el consumo?",
            answers = listOf(
                "Anticiparse al tráfico y mantener una velocidad lo más uniforme posible.",
                "Acelerar y frenar bruscamente.",
                "Cambiar continuamente de velocidad."
            ),
            correctAnswer = 0,
            explanation = "La anticipación y una velocidad adecuada y uniforme reducen frenadas y aceleraciones innecesarias y, con ello, el consumo.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducción eficiente - Anticipación",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 198,
            topic = "Conducción eficiente",
            subtopic = "Paradas prolongadas",
            text = "En una parada prolongada de más de aproximadamente un minuto, la DGT recomienda...",
            answers = listOf(
                "apagar el motor cuando las circunstancias lo permitan.",
                "mantener el motor acelerado.",
                "mantener siempre el motor al ralentí."
            ),
            correctAnswer = 0,
            explanation = "En paradas prolongadas, apagar el motor evita consumo innecesario de combustible cuando puede hacerse de forma segura y adecuada.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducción eficiente - Paradas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
