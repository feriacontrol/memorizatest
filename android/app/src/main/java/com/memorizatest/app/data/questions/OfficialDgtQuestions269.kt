package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions269 {

    val questions = listOf(

        TestQuestion(
            id = 329,
            topic = "Velocidades",
            subtopic = "Consecuencias de un accidente",
            text = "En un accidente, ¿influye la velocidad de circulación en la gravedad de las lesiones?",
            answers = listOf(
                "Sí; cuanto mayor es la velocidad, mayor puede ser la gravedad.",
                "No.",
                "Una velocidad mayor reduce normalmente las lesiones."
            ),
            correctAnswer = 0,
            explanation = "Una mayor velocidad incrementa la energía del impacto y puede aumentar considerablemente la gravedad de las lesiones.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 269, marzo 2024, pregunta 3",
            legalReference = "DGT - Velocidad y seguridad vial",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 330,
            topic = "Ciclistas",
            subtopic = "Lesiones",
            text = "En un atropello a un ciclista, ¿en qué zona pueden localizarse algunas de las lesiones más graves?",
            answers = listOf(
                "En la cabeza.",
                "Solo en las manos.",
                "Únicamente en los pies."
            ),
            correctAnswer = 0,
            explanation = "La cabeza es una de las zonas especialmente vulnerables en los accidentes de ciclistas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 269, marzo 2024, pregunta 8",
            legalReference = "DGT - Seguridad de ciclistas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 331,
            topic = "Ciclomotores",
            subtopic = "Arcén",
            text = "En una carretera convencional con arcén transitable y suficiente, ¿por dónde debe circular normalmente un ciclomotor?",
            answers = listOf(
                "Por el arcén derecho.",
                "Por el centro del carril.",
                "Por el arcén izquierdo."
            ),
            correctAnswer = 0,
            explanation = "Cuando no existe una parte de la vía especialmente destinada a ellos, los ciclomotores deben utilizar el arcén derecho si es transitable y suficiente.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 269, marzo 2024, pregunta 9",
            legalReference = "Reglamento General de Circulación, artículo 36",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 332,
            topic = "Alcohol y drogas",
            subtopic = "Controles de drogas",
            text = "En un control preventivo, ¿pueden los agentes someter a un conductor a una prueba de detección de drogas?",
            answers = listOf(
                "Sí.",
                "Solo después de un accidente.",
                "No."
            ),
            correctAnswer = 0,
            explanation = "La normativa permite establecer controles preventivos para detectar estupefacientes y otras sustancias en los conductores.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 269, marzo 2024, pregunta 10",
            legalReference = "Reglamento General de Circulación, artículo 28",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 333,
            topic = "Condiciones adversas",
            subtopic = "Niebla",
            text = "Con niebla y pavimento húmedo o resbaladizo, ¿cómo debe ser la conducción?",
            answers = listOf(
                "Suave, reduciendo la velocidad y aumentando la distancia de seguridad.",
                "Más rápida para atravesar antes la zona.",
                "Igual que con la calzada seca."
            ),
            correctAnswer = 0,
            explanation = "La niebla reduce la visibilidad y suele disminuir la adherencia, por lo que conviene evitar movimientos bruscos, reducir la velocidad y aumentar la separación.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 269, marzo 2024, pregunta 11",
            legalReference = "DGT - Conducción con niebla",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 334,
            topic = "Señalización",
            subtopic = "Zona cebreada",
            text = "Como norma general, ¿puede un conductor circular o detenerse sobre una zona cebreada de la calzada?",
            answers = listOf(
                "No, ni circular ni detenerse sobre ella.",
                "Puede detenerse, pero no circular.",
                "Sí, si no circula ningún otro vehículo."
            ),
            correctAnswer = 0,
            explanation = "Las zonas cebreadas sirven para canalizar la circulación y no deben utilizarse para circular ni para detenerse sobre ellas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 269, marzo 2024, pregunta 12",
            legalReference = "DGT - Marcas viales",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 335,
            topic = "Señalización",
            subtopic = "Advertencias acústicas",
            text = "En poblado, ¿puede utilizarse excepcionalmente el claxon para evitar un posible accidente?",
            answers = listOf(
                "Sí.",
                "No, nunca.",
                "Solo por la noche."
            ),
            correctAnswer = 0,
            explanation = "Las señales acústicas pueden utilizarse excepcionalmente para evitar un posible accidente; su utilización inmotivada está prohibida.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 269, marzo 2024, pregunta 13",
            legalReference = "Reglamento General de Circulación, artículo 110",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
