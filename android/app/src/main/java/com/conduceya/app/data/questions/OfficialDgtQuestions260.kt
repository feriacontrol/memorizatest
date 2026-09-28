package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtQuestions260 {

    val questions = listOf(

        TestQuestion(
            id = 398,
            topic = "Velocidades",
            subtopic = "Límites de velocidad",
            text = "¿Con qué finalidad se establecen los límites de velocidad?",
            answers = listOf(
                "Para garantizar la máxima seguridad y fluidez posible.",
                "Únicamente para aumentar la fluidez.",
                "Únicamente para reducir el consumo."
            ),
            correctAnswer = 0,
            explanation = "Los límites de velocidad buscan compatibilizar la seguridad de la circulación con una adecuada fluidez del tráfico.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 260, diciembre 2021, pregunta 3",
            legalReference = "DGT - Velocidad y seguridad vial",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 399,
            topic = "Estacionamiento",
            subtopic = "Visibilidad de señales",
            text = "¿Está permitido parar o estacionar en un lugar donde el vehículo impida que otros usuarios vean una señal que les afecta?",
            answers = listOf(
                "Sí, si la parada dura menos de dos minutos.",
                "No.",
                "Puede parar, pero no estacionar."
            ),
            correctAnswer = 1,
            explanation = "Está prohibido parar y, por tanto, también estacionar en lugares donde se impida la visibilidad de la señalización a los usuarios afectados.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 260, diciembre 2021, pregunta 7",
            legalReference = "Reglamento General de Circulación, artículo 94",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 400,
            topic = "Distracciones",
            subtopic = "Navegador GPS",
            text = "¿Puede un sistema de navegación ayudar a controlar la velocidad a la que circula el vehículo?",
            answers = listOf(
                "No, nunca.",
                "Sí, aunque la referencia principal debe seguir siendo el velocímetro.",
                "Solo cuando se circula a más de 100 km/h."
            ),
            correctAnswer = 1,
            explanation = "Algunos sistemas de navegación muestran información de velocidad, pero el velocímetro del vehículo debe seguir siendo la referencia principal.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 260, diciembre 2021, pregunta 9",
            legalReference = "DGT - Sistemas de navegación",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 401,
            topic = "Condiciones adversas",
            subtopic = "Barro",
            text = "Si las ruedas motrices de un turismo patinan porque el vehículo ha quedado atascado en barro, ¿qué actuación puede ayudar a salir?",
            answers = listOf(
                "Acelerar a fondo continuamente.",
                "Colocar material adecuado junto a las ruedas motrices para aumentar la adherencia.",
                "Girar el volante rápidamente de un lado a otro."
            ),
            correctAnswer = 1,
            explanation = "Puede prepararse una superficie más estable colocando material que aumente la adherencia de las ruedas motrices.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 260, diciembre 2021, pregunta 11",
            legalReference = "DGT - Conducción y adherencia",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 402,
            topic = "Motocicletas",
            subtopic = "Casco",
            text = "Si el pasajero de una motocicleta no utiliza el casco de protección obligatorio, ¿quién es responsable de esa infracción?",
            answers = listOf(
                "El conductor de la motocicleta.",
                "Únicamente el pasajero.",
                "Siempre el propietario del vehículo."
            ),
            correctAnswer = 0,
            explanation = "La normativa atribuye al conductor la responsabilidad por la falta de utilización del casco obligatorio por parte del pasajero.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 260, diciembre 2021, pregunta 12",
            legalReference = "Ley de Tráfico, artículo 82",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 403,
            topic = "Documentación",
            subtopic = "Seguro obligatorio",
            text = "En un accidente cubierto por el seguro obligatorio, ¿puede el conductor perjudicado que no ha causado el accidente recibir indemnización por sus daños personales y materiales?",
            answers = listOf(
                "Sí, dentro de los límites y condiciones legalmente aplicables.",
                "Solo por los daños personales.",
                "No, el seguro obligatorio nunca cubre al conductor perjudicado."
            ),
            correctAnswer = 0,
            explanation = "El seguro obligatorio debe indemnizar al perjudicado por los daños personales y materiales que correspondan. La exclusión afecta, entre otros supuestos, al conductor del vehículo causante respecto de sus propias lesiones.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 260, diciembre 2021, pregunta 14",
            legalReference = "Ley sobre responsabilidad civil y seguro en la circulación de vehículos a motor, artículos 5 y 7",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.HARD
        )
    )
}
