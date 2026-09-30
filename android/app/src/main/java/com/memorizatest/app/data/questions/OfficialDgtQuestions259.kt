package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions259 {

    val questions = listOf(

        TestQuestion(
            id = 404,
            topic = "Circulación",
            subtopic = "Arcén",
            text = "Si no existe una vía o parte especialmente destinada a ellos, ¿por dónde deben circular los vehículos para personas con movilidad reducida?",
            answers = listOf(
                "Por el arcén derecho, si es transitable y suficiente.",
                "Siempre por el centro de la calzada.",
                "Por el arcén izquierdo."
            ),
            correctAnswer = 0,
            explanation = "Estos vehículos deben circular por el arcén de su derecha cuando sea transitable y suficiente; si no lo es, utilizarán la parte imprescindible de la calzada.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 259, octubre 2021, pregunta 4",
            legalReference = "Reglamento General de Circulación, artículo 36",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 405,
            topic = "Conducción eficiente",
            subtopic = "Equipaje",
            text = "Para reducir el consumo de carburante, ¿dónde conviene transportar el equipaje siempre que sea posible?",
            answers = listOf(
                "En el maletero.",
                "En la baca.",
                "Es indiferente."
            ),
            correctAnswer = 0,
            explanation = "Transportar equipaje en la baca aumenta la resistencia aerodinámica y puede incrementar el consumo; siempre que sea posible conviene utilizar el maletero.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 259, octubre 2021, pregunta 7",
            legalReference = "DGT - Conducción eficiente",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 406,
            topic = "Conducción segura",
            subtopic = "Estado del conductor y vehículo",
            text = "Para circular con seguridad, ¿qué debe encontrarse en condiciones adecuadas?",
            answers = listOf(
                "Solo el vehículo.",
                "Solo el conductor.",
                "Tanto el conductor como el vehículo."
            ),
            correctAnswer = 2,
            explanation = "La seguridad depende tanto del estado del vehículo como de las condiciones físicas y psicofísicas del conductor.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 259, octubre 2021, pregunta 8",
            legalReference = "DGT - Seguridad vial",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 407,
            topic = "Mecánica y mantenimiento",
            subtopic = "Limpiaparabrisas",
            text = "Una exposición prolongada del vehículo a temperaturas elevadas puede provocar que las gomas de los limpiaparabrisas...",
            answers = listOf(
                "se endurezcan y se agrieten.",
                "se vuelvan más flexibles permanentemente.",
                "mejoren su eficacia."
            ),
            correctAnswer = 0,
            explanation = "Las temperaturas elevadas pueden endurecer y agrietar las gomas, reduciendo la eficacia del limpiaparabrisas y empeorando la visibilidad.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 259, octubre 2021, pregunta 11",
            legalReference = "DGT - Mantenimiento del vehículo",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 408,
            topic = "Mecánica y mantenimiento",
            subtopic = "Freno de estacionamiento",
            text = "¿Cuál es la función principal del freno de estacionamiento?",
            answers = listOf(
                "Reducir normalmente la velocidad durante la marcha.",
                "Mantener inmovilizado el vehículo cuando está estacionado.",
                "Sustituir al freno de servicio en pendientes."
            ),
            correctAnswer = 1,
            explanation = "El freno de estacionamiento sirve para mantener inmovilizado el vehículo cuando queda estacionado.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 259, octubre 2021, pregunta 12",
            legalReference = "Reglamento General de Circulación - inmovilización del vehículo",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
