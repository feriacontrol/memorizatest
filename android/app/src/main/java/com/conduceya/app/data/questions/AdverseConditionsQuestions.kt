package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object AdverseConditionsQuestions {

    val questions = listOf(

        TestQuestion(
            id = 182,
            topic = "Condiciones adversas",
            subtopic = "Lluvia",
            text = "Cuando llueve, ¿qué debe hacerse con la distancia de seguridad?",
            answers = listOf(
                "Reducirla.",
                "Aumentarla.",
                "Mantenerla siempre igual."
            ),
            correctAnswer = 1,
            explanation = "Con lluvia disminuye la adherencia y aumenta la distancia necesaria para detener el vehículo, por lo que debe aumentarse la separación.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Recomendaciones de tráfico con lluvia",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 183,
            topic = "Condiciones adversas",
            subtopic = "Lluvia",
            text = "Cuando se circula con lluvia, la DGT recomienda utilizar...",
            answers = listOf(
                "las luces de cruce.",
                "únicamente las luces de posición.",
                "las luces de emergencia permanentemente."
            ),
            correctAnswer = 0,
            explanation = "Con lluvia se recomienda encender las luces de cruce para mejorar la visibilidad y ser visto por otros usuarios.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Recomendaciones de tráfico con lluvia",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 184,
            topic = "Condiciones adversas",
            subtopic = "Aquaplaning",
            text = "Si se produce aquaplaning, ¿es aconsejable frenar bruscamente?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si se circula en línea recta."
            ),
            correctAnswer = 1,
            explanation = "Ante aquaplaning debe evitarse una frenada brusca, mantener sujeto el volante y corregir suavemente la trayectoria al recuperar adherencia.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducción con lluvia y aquaplaning",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 185,
            topic = "Condiciones adversas",
            subtopic = "Viento",
            text = "¿Dónde puede resultar especialmente peligroso un viento lateral fuerte?",
            answers = listOf(
                "Al salir de un túnel o al adelantar un vehículo voluminoso.",
                "Únicamente dentro de un aparcamiento.",
                "Solo cuando el vehículo está parado."
            ),
            correctAnswer = 0,
            explanation = "Los cambios bruscos de viento lateral pueden desestabilizar el vehículo, especialmente en salidas de túneles, zonas desprotegidas y al cruzarse o adelantar vehículos voluminosos.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducción con viento",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 186,
            topic = "Condiciones adversas",
            subtopic = "Nieve",
            text = "Al conducir sobre nieve, ¿qué es aconsejable?",
            answers = listOf(
                "Reducir la velocidad y aumentar la distancia de seguridad.",
                "Aumentar la velocidad para evitar patinar.",
                "Realizar frenadas bruscas."
            ),
            correctAnswer = 0,
            explanation = "Con nieve disminuye considerablemente la adherencia, por lo que debe moderarse la velocidad, aumentar la separación y conducir con suavidad.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducción invernal",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 187,
            topic = "Condiciones adversas",
            subtopic = "Hielo",
            text = "Cuando la temperatura exterior desciende aproximadamente de 3 °C, el conductor debe estar especialmente atento porque...",
            answers = listOf(
                "pueden aparecer placas de hielo.",
                "los neumáticos dejan de funcionar.",
                "desaparece el riesgo de deslizamiento."
            ),
            correctAnswer = 0,
            explanation = "La DGT advierte de que alrededor de temperaturas inferiores a 3 °C pueden aparecer placas de hielo en la calzada.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducción con hielo o nieve",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 188,
            topic = "Condiciones adversas",
            subtopic = "Hielo",
            text = "Al circular sobre una placa de hielo deben evitarse...",
            answers = listOf(
                "los movimientos bruscos del volante, freno y acelerador.",
                "los movimientos suaves.",
                "las marchas engranadas."
            ),
            correctAnswer = 0,
            explanation = "Con adherencia muy reducida deben evitarse las maniobras bruscas y actuar con máxima suavidad sobre dirección y pedales.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducción invernal - hielo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 189,
            topic = "Condiciones adversas",
            subtopic = "Lluvia intensa",
            text = "Si una lluvia muy intensa impide prácticamente la visibilidad, ¿qué recomienda la DGT?",
            answers = listOf(
                "Detenerse con precaución fuera de la calzada hasta que mejoren las condiciones.",
                "Continuar a la misma velocidad.",
                "Detenerse en el centro del carril."
            ),
            correctAnswer = 0,
            explanation = "Si la precipitación impide la visibilidad, se recomienda detenerse con precaución fuera de la calzada hasta que mejoren las condiciones.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Recomendaciones de tráfico con lluvia",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
