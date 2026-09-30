package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object VehicleTechQuestions {

    val questions = listOf(

        TestQuestion(
            id = 164,
            topic = "Mecánica y mantenimiento",
            subtopic = "Neumáticos",
            text = "¿Cuál es la profundidad mínima legal del dibujo principal de los neumáticos de un turismo?",
            answers = listOf(
                "1,0 mm.",
                "1,6 mm.",
                "2,5 mm."
            ),
            correctAnswer = 1,
            explanation = "Los neumáticos de los turismos deben conservar al menos 1,6 mm de profundidad en las ranuras principales de la banda de rodadura.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Anexo VII.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 165,
            topic = "Mecánica y mantenimiento",
            subtopic = "Neumáticos",
            text = "¿Para qué sirven los indicadores de desgaste de los neumáticos de un turismo?",
            answers = listOf(
                "Para indicar que se ha alcanzado la profundidad mínima del dibujo.",
                "Para indicar la presión exacta del neumático.",
                "Para indicar la temperatura del neumático."
            ),
            correctAnswer = 0,
            explanation = "Los indicadores de desgaste permiten reconocer cuándo las ranuras principales han alcanzado la profundidad mínima reglamentaria.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Anexo VII.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 166,
            topic = "Mecánica y mantenimiento",
            subtopic = "Neumáticos",
            text = "¿Puede utilizarse un neumático que presenta ampollas o deformaciones anormales?",
            answers = listOf(
                "Sí, si conserva dibujo suficiente.",
                "No.",
                "Sí, únicamente en ciudad."
            ),
            correctAnswer = 1,
            explanation = "Los neumáticos no deben presentar ampollas, deformaciones anormales, roturas u otros signos de deterioro reglamentariamente prohibidos.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Anexo VII.4",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 167,
            topic = "Mecánica y mantenimiento",
            subtopic = "Neumáticos",
            text = "¿Puede circular un turismo con un neumático que presenta cables al descubierto?",
            answers = listOf(
                "Sí, si no llueve.",
                "No.",
                "Sí, hasta la siguiente ITV."
            ),
            correctAnswer = 1,
            explanation = "Los neumáticos no pueden presentar cables al descubierto ni daños que evidencien deterioro de su estructura.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Anexo VII.4",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 168,
            topic = "Mecánica y mantenimiento",
            subtopic = "Neumáticos",
            text = "Los neumáticos instalados en un vehículo deben tener...",
            answers = listOf(
                "las dimensiones y características previstas en su homologación o ser equivalentes permitidos.",
                "cualquier dimensión elegida por el conductor.",
                "necesariamente una anchura superior a la original."
            ),
            correctAnswer = 0,
            explanation = "Los neumáticos deben corresponder a las dimensiones y características previstas por el fabricante en la homologación o a sus equivalentes permitidos.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Anexo VII.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 169,
            topic = "Mecánica y mantenimiento",
            subtopic = "Presión de neumáticos",
            text = "¿Debe revisarse regularmente la presión de inflado de los neumáticos?",
            answers = listOf(
                "Sí.",
                "No, únicamente en la ITV.",
                "Solo cuando se aprecia un pinchazo."
            ),
            correctAnswer = 0,
            explanation = "El Reglamento General de Vehículos establece que la presión de inflado de los neumáticos debe revisarse regularmente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Anexo VII.6",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 170,
            topic = "Mecánica y mantenimiento",
            subtopic = "Frenos",
            text = "¿Cuál es la función principal del freno de servicio?",
            answers = listOf(
                "Controlar el movimiento del vehículo y detenerlo de forma segura, rápida y eficaz.",
                "Mantener únicamente el vehículo estacionado.",
                "Evitar el funcionamiento del motor."
            ),
            correctAnswer = 0,
            explanation = "El frenado de servicio debe permitir controlar el movimiento del vehículo y detenerlo de manera segura, rápida y eficaz.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Anexo VIII.1.2.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 171,
            topic = "Mecánica y mantenimiento",
            subtopic = "Frenos",
            text = "¿Para qué sirve el frenado de socorro?",
            answers = listOf(
                "Para poder detener el vehículo en caso de fallo del freno de servicio.",
                "Únicamente para estacionar.",
                "Para reducir el consumo."
            ),
            correctAnswer = 0,
            explanation = "El frenado de socorro debe permitir detener el vehículo en una distancia razonable cuando falla el frenado de servicio.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Anexo VIII.1.2.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 172,
            topic = "Mecánica y mantenimiento",
            subtopic = "Freno de estacionamiento",
            text = "El freno de estacionamiento debe ser capaz de...",
            answers = listOf(
                "mantener inmóvil el vehículo en una pendiente incluso sin conductor.",
                "detener únicamente el vehículo en marcha.",
                "actuar exclusivamente sobre el motor."
            ),
            correctAnswer = 0,
            explanation = "El frenado de estacionamiento debe mantener inmóvil el vehículo incluso en pendientes y en ausencia del conductor.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Anexo VIII.1.2.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 173,
            topic = "Mecánica y mantenimiento",
            subtopic = "Alumbrado obligatorio",
            text = "¿Debe un automóvil disponer de luces de cruce?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si circula habitualmente de noche."
            ),
            correctAnswer = 0,
            explanation = "La luz de cruce forma parte de los dispositivos obligatorios de alumbrado de los automóviles.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Artículo 16",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 174,
            topic = "Mecánica y mantenimiento",
            subtopic = "Alumbrado obligatorio",
            text = "¿Debe un automóvil disponer de luces de carretera?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo los vehículos pesados."
            ),
            correctAnswer = 0,
            explanation = "La luz de carretera es uno de los dispositivos de alumbrado obligatorios de los automóviles.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Artículo 16",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 175,
            topic = "Mecánica y mantenimiento",
            subtopic = "Alumbrado obligatorio",
            text = "¿Es obligatoria la luz antiniebla trasera en un automóvil?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo en vehículos matriculados después de 2025."
            ),
            correctAnswer = 0,
            explanation = "La luz antiniebla trasera está incluida entre los dispositivos obligatorios de alumbrado y señalización óptica de los automóviles.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Artículo 16",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
