package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions263 {

    val questions = listOf(

        TestQuestion(
            id = 378,
            topic = "Mecánica y mantenimiento",
            subtopic = "Neumáticos",
            text = "Cuando está lloviendo, ¿qué presión deben tener los neumáticos?",
            answers = listOf(
                "Una presión superior a la recomendada por el fabricante.",
                "Una presión inferior a la recomendada por el fabricante.",
                "La presión recomendada por el fabricante."
            ),
            correctAnswer = 2,
            explanation = "La lluvia no justifica modificar la presión indicada por el fabricante. Los neumáticos deben mantener la presión recomendada.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 263, octubre 2022, pregunta 3",
            legalReference = "DGT - Neumáticos",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 379,
            topic = "Circulación",
            subtopic = "Carril VAO",
            text = "¿Puede circular por un carril VAO un turismo que arrastra un remolque de menos de 750 kg de MMA?",
            answers = listOf(
                "Sí, únicamente durante el día.",
                "No.",
                "Sí, siempre."
            ),
            correctAnswer = 1,
            explanation = "Los turismos con remolque son conjuntos de vehículos y no están autorizados, como norma general, a utilizar los carriles VAO.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 263, octubre 2022, pregunta 5",
            legalReference = "Reglamento General de Circulación, artículo 35",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 380,
            topic = "Conducción segura",
            subtopic = "Conductores mayores",
            text = "Debido al deterioro psicofísico asociado al envejecimiento, ¿qué situaciones pueden presentar mayor dificultad para algunas personas mayores?",
            answers = listOf(
                "Únicamente los estacionamientos.",
                "Las situaciones complejas, como incorporarse a una vía donde se circula a alta velocidad.",
                "Solamente conducir por carreteras rectas."
            ),
            correctAnswer = 1,
            explanation = "Las situaciones de tráfico complejas, que exigen procesar mucha información y tomar decisiones rápidamente, pueden resultar más difíciles.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 263, octubre 2022, pregunta 8",
            legalReference = "DGT - Personas mayores y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 381,
            topic = "Documentación",
            subtopic = "Titular del vehículo",
            text = "Cuando la Administración lo requiere por una infracción, ¿qué obligación corresponde al titular del vehículo?",
            answers = listOf(
                "Identificar al conductor del vehículo en el momento en que se cometió la infracción.",
                "Comprobar personalmente que todos los ocupantes utilizan cinturón.",
                "Conducir él mismo el vehículo hasta dependencias de Tráfico."
            ),
            correctAnswer = 0,
            explanation = "El titular debe facilitar a la Administración la identificación del conductor responsable cuando sea requerido para ello.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 263, octubre 2022, pregunta 9",
            legalReference = "Ley de Tráfico, artículo 11",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 382,
            topic = "Adelantamientos",
            subtopic = "Adelantamiento por la derecha",
            text = "Dentro de poblado, en una calzada con al menos dos carriles para el mismo sentido delimitados por marcas longitudinales, ¿puede adelantarse por la derecha?",
            answers = listOf(
                "No, nunca.",
                "Sí, si puede hacerse sin peligro para los demás usuarios.",
                "Solo a motocicletas."
            ),
            correctAnswer = 1,
            explanation = "Dentro de poblado se permite adelantar por la derecha en calzadas con al menos dos carriles para el mismo sentido, siempre que pueda hacerse sin peligro.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 263, octubre 2022, pregunta 12",
            legalReference = "Reglamento General de Circulación, artículo 82.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 383,
            topic = "Accidentes y primeros auxilios",
            subtopic = "Obligaciones",
            text = "Si está implicado en un accidente, ¿debe colaborar para restablecer la seguridad de la circulación?",
            answers = listOf(
                "No, corresponde exclusivamente a los agentes.",
                "Sí, en la medida de lo posible.",
                "Solo cuando existan heridos graves."
            ),
            correctAnswer = 1,
            explanation = "Los implicados deben colaborar, en la medida de lo posible, para evitar nuevos peligros y restablecer la seguridad de la circulación.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 263, octubre 2022, pregunta 13",
            legalReference = "Reglamento General de Circulación, artículo 129",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 384,
            topic = "Motocicletas",
            subtopic = "Utilización de carriles",
            text = "En una autovía con tres o más carriles para el mismo sentido, ¿puede una motocicleta utilizar el carril situado más a la izquierda?",
            answers = listOf(
                "Sí, cuando las circunstancias del tráfico o de la vía lo aconsejen.",
                "No, únicamente puede utilizar los dos carriles de la derecha.",
                "Solo cuando exista una retención."
            ),
            correctAnswer = 0,
            explanation = "La motocicleta circulará normalmente por la derecha, pero puede utilizar los demás carriles del mismo sentido cuando las circunstancias lo aconsejen y no entorpezca a otros vehículos.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 263, octubre 2022, pregunta 14",
            legalReference = "Reglamento General de Circulación, artículo 31",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 385,
            topic = "Motocicletas",
            subtopic = "Equipación",
            text = "Al circular en motocicleta por una vía interurbana, ¿es obligatorio utilizar guantes de protección?",
            answers = listOf(
                "Sí.",
                "No, solo son recomendables.",
                "Solo cuando llueve."
            ),
            correctAnswer = 0,
            explanation = "Desde el 1 de octubre de 2026, conductor y pasajero de motocicleta deben utilizar guantes de protección cuando circulen por vías interurbanas.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Reglamento General de Circulación, artículo 118.1.b",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
