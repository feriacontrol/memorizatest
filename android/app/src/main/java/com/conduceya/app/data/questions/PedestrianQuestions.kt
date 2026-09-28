package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object PedestrianQuestions {

    val questions = listOf(

        TestQuestion(
            id = 226,
            topic = "Peatones",
            subtopic = "Pasos para peatones",
            text = "En un paso para peatones debidamente señalizado, ¿tienen prioridad los peatones?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si existe semáforo."
            ),
            correctAnswer = 0,
            explanation = "Los peatones tienen prioridad en los pasos para peatones debidamente señalizados.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 65",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 227,
            topic = "Peatones",
            subtopic = "Cambio de dirección",
            text = "Si un vehículo gira para entrar en otra vía y hay peatones cruzándola, aunque no exista paso señalizado, debe...",
            answers = listOf(
                "cederles el paso.",
                "hacer sonar el claxon.",
                "continuar porque siempre tiene prioridad."
            ),
            correctAnswer = 0,
            explanation = "El conductor debe ceder el paso a los peatones que estén cruzando la vía a la que pretende incorporarse.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 65",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 228,
            topic = "Peatones",
            subtopic = "Cruce de calzada",
            text = "Si existe un paso para peatones próximo, los peatones que quieran atravesar la calzada deben utilizar...",
            answers = listOf(
                "ese paso.",
                "cualquier punto de la calzada.",
                "preferentemente una curva."
            ),
            correctAnswer = 0,
            explanation = "Cuando existe un paso para peatones en la zona, el cruce debe realizarse por él.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 124.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 229,
            topic = "Peatones",
            subtopic = "Cruce de calzada",
            text = "Fuera de un paso para peatones, antes de atravesar la calzada el peatón debe...",
            answers = listOf(
                "asegurarse de que puede hacerlo sin riesgo ni entorpecimiento indebido.",
                "entrar directamente en la calzada.",
                "hacer señales a los vehículos para que se detengan."
            ),
            correctAnswer = 0,
            explanation = "Antes de cruzar fuera de un paso, el peatón debe comprobar que puede hacerlo sin riesgo ni entorpecer indebidamente la circulación.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 124.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 230,
            topic = "Peatones",
            subtopic = "Cruce de calzada",
            text = "Al atravesar una calzada, como norma general los peatones deben caminar...",
            answers = listOf(
                "perpendicularmente al eje de la calzada.",
                "en diagonal para recorrer más distancia.",
                "por el centro del carril."
            ),
            correctAnswer = 0,
            explanation = "El cruce debe hacerse perpendicularmente al eje de la calzada y sin demorarse innecesariamente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 124.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 231,
            topic = "Peatones",
            subtopic = "Autopistas y autovías",
            text = "Como norma general, ¿pueden los peatones circular por una autopista o autovía?",
            answers = listOf(
                "No.",
                "Sí, por el arcén.",
                "Sí, durante el día."
            ),
            correctAnswer = 0,
            explanation = "Como regla general, los peatones no pueden circular por autopistas ni autovías.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 125.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 232,
            topic = "Peatones",
            subtopic = "Visibilidad nocturna",
            text = "Fuera de poblado y de noche, un peatón que circula por la calzada o el arcén debe ser visible mediante...",
            answers = listOf(
                "un elemento luminoso o retrorreflectante homologado.",
                "únicamente ropa oscura.",
                "las luces de un teléfono móvil."
            ),
            correctAnswer = 0,
            explanation = "Cuando circula de noche fuera de poblado por calzada o arcén, el peatón debe utilizar un elemento luminoso o retrorreflectante adecuado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 123",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
