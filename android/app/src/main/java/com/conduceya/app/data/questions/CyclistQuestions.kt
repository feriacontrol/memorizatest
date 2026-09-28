package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object CyclistQuestions {

    val questions = listOf(

        TestQuestion(
            id = 233,
            topic = "Ciclistas",
            subtopic = "Prioridad",
            text = "Un ciclista que circula por un carril bici o paso para ciclistas señalizado tiene prioridad frente a...",
            answers = listOf(
                "los vehículos de motor cuya trayectoria se cruce con la suya.",
                "ningún otro usuario.",
                "únicamente otros ciclistas."
            ),
            correctAnswer = 0,
            explanation = "Los ciclistas tienen prioridad cuando circulan por un carril bici, paso para ciclistas o arcén debidamente señalizado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 64",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 234,
            topic = "Ciclistas",
            subtopic = "Giros",
            text = "Si un turismo gira a otra vía y hay un ciclista próximo cuya trayectoria cruza, debe...",
            answers = listOf(
                "ceder el paso al ciclista.",
                "acelerar para pasar antes.",
                "hacer sonar obligatoriamente el claxon."
            ),
            correctAnswer = 0,
            explanation = "El ciclista tiene prioridad cuando un vehículo de motor gira para entrar en otra vía y el ciclista se encuentra en sus proximidades.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 64",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 235,
            topic = "Ciclistas",
            subtopic = "Glorietas",
            text = "Cuando un grupo de ciclistas entra en una glorieta y el primero ya ha accedido, ¿cómo se considera al grupo a efectos de prioridad?",
            answers = listOf(
                "Como una unidad a estos efectos.",
                "Cada bicicleta de forma totalmente independiente.",
                "Sin ninguna prioridad."
            ),
            correctAnswer = 0,
            explanation = "Cuando circulan en grupo y el primero ya ha iniciado el cruce o ha entrado en una glorieta, se aplica la prioridad prevista para el conjunto.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 64",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 236,
            topic = "Ciclistas",
            subtopic = "Adelantamiento",
            text = "Al adelantar a un ciclista, ¿qué separación lateral mínima debe respetarse como regla general?",
            answers = listOf(
                "1 metro.",
                "1,5 metros.",
                "2,5 metros."
            ),
            correctAnswer = 1,
            explanation = "La separación lateral de seguridad en el adelantamiento a ciclistas debe ser de al menos 1,5 metros.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Adelantamiento a ciclistas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 237,
            topic = "Ciclistas",
            subtopic = "Adelantamiento",
            text = "En una calzada con más de un carril por sentido, para adelantar a un ciclista debe realizarse...",
            answers = listOf(
                "un cambio completo de carril.",
                "solo un pequeño desplazamiento lateral.",
                "el adelantamiento por el arcén."
            ),
            correctAnswer = 0,
            explanation = "Cuando existe más de un carril por sentido, el adelantamiento a ciclistas exige ocupar completamente el carril contiguo.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Adelantamiento a ciclistas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 238,
            topic = "Ciclistas",
            subtopic = "Arcén",
            text = "En una vía interurbana, cuando no existe una vía especialmente destinada a ciclos, una bicicleta debe circular normalmente...",
            answers = listOf(
                "por el arcén derecho si es transitable y suficiente.",
                "por el centro de la calzada.",
                "por el arcén izquierdo."
            ),
            correctAnswer = 0,
            explanation = "Los ciclos deben utilizar normalmente el arcén derecho cuando sea transitable y suficiente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 36.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 239,
            topic = "Ciclistas",
            subtopic = "Autovías",
            text = "Como norma general, un ciclista mayor de 14 años puede circular por el arcén de una autovía...",
            answers = listOf(
                "salvo que una señal lo prohíba expresamente.",
                "nunca.",
                "solo acompañado por un turismo."
            ),
            correctAnswer = 0,
            explanation = "Los ciclistas mayores de 14 años pueden circular por los arcenes de las autovías salvo prohibición expresa por razones de seguridad.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Circulación en bicicleta por autovías",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
