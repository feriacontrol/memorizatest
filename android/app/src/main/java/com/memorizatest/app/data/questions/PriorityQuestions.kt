package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object PriorityQuestions {

    val questions = listOf(

        TestQuestion(
            id = 43,
            topic = "Prioridades",
            subtopic = "Intersecciones señalizadas",
            text = "En una intersección señalizada, ¿qué determina la preferencia de paso?",
            answers = listOf(
                "La señalización que la regula.",
                "El vehículo más grande.",
                "El vehículo que llegue primero."
            ),
            correctAnswer = 0,
            explanation = "En las intersecciones señalizadas la preferencia debe ajustarse a la señalización existente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 56.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 44,
            topic = "Prioridades",
            subtopic = "STOP",
            text = "Ante una señal de STOP, el conductor debe...",
            answers = listOf(
                "reducir la velocidad sin detenerse.",
                "detener completamente el vehículo.",
                "detenerse únicamente si ve otro vehículo."
            ),
            correctAnswer = 1,
            explanation = "La señal de STOP obliga a detener completamente la marcha y a ceder el paso a los vehículos de la vía preferente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 56.5",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 45,
            topic = "Prioridades",
            subtopic = "Intersecciones sin señalizar",
            text = "En una intersección sin señalización de prioridad, como norma general debe cederse el paso...",
            answers = listOf(
                "a los vehículos que se aproximen por la izquierda.",
                "a los vehículos que se aproximen por la derecha.",
                "al vehículo que circule más rápido."
            ),
            correctAnswer = 1,
            explanation = "En ausencia de señalización, la regla general es ceder el paso a los vehículos que se aproximen por la derecha.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 57.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 46,
            topic = "Prioridades",
            subtopic = "Vía pavimentada",
            text = "En una intersección sin señalizar entre una vía pavimentada y otra sin pavimentar, ¿quién tiene prioridad?",
            answers = listOf(
                "El vehículo de la vía pavimentada.",
                "El vehículo de la vía sin pavimentar.",
                "Siempre el vehículo de la derecha."
            ),
            correctAnswer = 0,
            explanation = "Los vehículos que circulan por una vía pavimentada tienen prioridad frente a los procedentes de una vía sin pavimentar.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 57.1.a",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 47,
            topic = "Prioridades",
            subtopic = "Vehículos sobre raíles",
            text = "En una intersección sin señalizar, los vehículos que circulan por raíles...",
            answers = listOf(
                "deben ceder siempre el paso.",
                "tienen prioridad de paso.",
                "solo tienen prioridad fuera de poblado."
            ),
            correctAnswer = 1,
            explanation = "Los vehículos que circulan por raíles tienen prioridad sobre los demás usuarios en este supuesto.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 57.1.b",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 48,
            topic = "Prioridades",
            subtopic = "Glorietas",
            text = "En una glorieta, ¿quién tiene preferencia de paso?",
            answers = listOf(
                "Quien pretende entrar.",
                "Quien ya circula dentro de la vía circular.",
                "El vehículo de mayor tamaño."
            ),
            correctAnswer = 1,
            explanation = "Los vehículos que ya circulan dentro de la glorieta tienen preferencia sobre los que pretenden acceder.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 57.1.c",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 49,
            topic = "Prioridades",
            subtopic = "Autopistas y autovías",
            text = "Al acceder a una autopista o autovía, ¿quién tiene prioridad?",
            answers = listOf(
                "El vehículo que se incorpora.",
                "Los vehículos que ya circulan por la autopista o autovía.",
                "El vehículo que acelere primero."
            ),
            correctAnswer = 1,
            explanation = "Los vehículos que ya circulan por una autopista o autovía tienen prioridad frente a quienes pretenden acceder a ella.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 57.1.d",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 50,
            topic = "Prioridades",
            subtopic = "Intersecciones",
            text = "Aunque tenga prioridad, ¿puede entrar en una intersección si previsiblemente quedará detenido bloqueando la circulación transversal?",
            answers = listOf(
                "Sí.",
                "No.",
                "Sí, si el semáforo estaba verde al llegar."
            ),
            correctAnswer = 1,
            explanation = "No debe penetrarse en una intersección si previsiblemente se va a quedar detenido obstruyendo la circulación transversal.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 59.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 51,
            topic = "Prioridades",
            subtopic = "Ceder el paso",
            text = "Al ceder el paso, ¿puede obligarse al vehículo prioritario a modificar bruscamente su velocidad o trayectoria?",
            answers = listOf(
                "No.",
                "Sí, si se señaliza la maniobra.",
                "Sí, dentro de poblado."
            ),
            correctAnswer = 0,
            explanation = "Quien cede el paso debe hacerlo sin forzar al vehículo prioritario a variar bruscamente su trayectoria o velocidad.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 58.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 52,
            topic = "Prioridades",
            subtopic = "Pendientes",
            text = "A efectos de prioridad de paso en tramos estrechos, ¿a partir de qué inclinación se considera un tramo de gran pendiente?",
            answers = listOf(
                "5 por ciento.",
                "7 por ciento.",
                "10 por ciento."
            ),
            correctAnswer = 1,
            explanation = "El Reglamento considera tramo de gran pendiente el que tiene una inclinación mínima del 7 por ciento.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 63.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.HARD
        ),

        TestQuestion(
            id = 53,
            topic = "Prioridades",
            subtopic = "Vehículos prioritarios",
            text = "Un vehículo de un servicio de urgencia, cuando se encuentra en servicio urgente, ¿tiene prioridad de paso?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo en autopista."
            ),
            correctAnswer = 0,
            explanation = "Los vehículos de servicios de urgencia tienen prioridad cuando se encuentran en servicio de tal carácter.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 67.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
