package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions258 {

    val questions = listOf(

        TestQuestion(
            id = 409,
            topic = "Mecánica y mantenimiento",
            subtopic = "Visibilidad",
            text = "¿Puede un turismo llevar láminas adhesivas o cortinillas contra el sol en las ventanillas traseras?",
            answers = listOf(
                "No, nunca.",
                "Sí, sin ninguna condición.",
                "Sí, si dispone de dos espejos retrovisores exteriores adecuados."
            ),
            correctAnswer = 2,
            explanation = "Se permiten en las ventanillas posteriores cuando el vehículo dispone de dos retrovisores exteriores que proporcionen la visibilidad reglamentaria.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 258, junio 2021, pregunta 1",
            legalReference = "Reglamento General de Circulación, artículo 19",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 410,
            topic = "Circulación",
            subtopic = "Posición en la calzada",
            text = "En una calzada de doble sentido sin carriles delimitados, ¿por dónde debe circular normalmente un turismo?",
            answers = listOf(
                "Por el lugar que considere más seguro.",
                "Por la derecha y lo más cerca posible del borde de la calzada.",
                "Junto al eje imaginario de la calzada."
            ),
            correctAnswer = 1,
            explanation = "Como norma general, los vehículos deben circular por la derecha y lo más cerca posible del borde de la calzada.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 258, junio 2021, pregunta 4",
            legalReference = "Reglamento General de Circulación, artículos 29 y 30",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 411,
            topic = "Señalización",
            subtopic = "Obras",
            text = "Cuando un cartel de orientación tiene fondo amarillo por señalización circunstancial, ¿qué indica normalmente?",
            answers = listOf(
                "Que se trata de señalización relacionada con un tramo en obras o conservación.",
                "Que comienza una vía para automóviles.",
                "Que la vía tiene prioridad en todas las intersecciones."
            ),
            correctAnswer = 0,
            explanation = "En los tramos afectados por obras o tareas de conservación, los nuevos carteles de orientación utilizan fondo amarillo y caracteres negros.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 258, junio 2021, pregunta 7",
            legalReference = "Catálogo oficial de señales de circulación - señalización de obras",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 412,
            topic = "Señalización",
            subtopic = "Paneles de mensaje variable",
            text = "¿Pueden los paneles de mensaje variable transmitir instrucciones de obligado cumplimiento?",
            answers = listOf(
                "No, solo ofrecen información.",
                "Sí.",
                "Solo pueden advertir de condiciones meteorológicas."
            ),
            correctAnswer = 1,
            explanation = "Los paneles de mensaje variable forman parte de los sistemas utilizados para regular y gestionar el tráfico y pueden transmitir instrucciones que deben ser respetadas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 258, junio 2021, pregunta 8",
            legalReference = "DGT - Paneles de mensaje variable",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 413,
            topic = "Carga y equipaje",
            subtopic = "Carga y descarga",
            text = "En una vía urbana, cuando una operación de carga o descarga deba realizarse en la vía, ¿deben respetarse las disposiciones municipales sobre horarios y lugares?",
            answers = listOf(
                "Sí.",
                "No, únicamente se aplica la normativa estatal.",
                "Solo cuando se trate de vehículos pesados."
            ),
            correctAnswer = 0,
            explanation = "En poblado deben respetarse también las disposiciones que establezcan las autoridades municipales respecto a las horas y lugares adecuados para estas operaciones.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 258, junio 2021, pregunta 10",
            legalReference = "Reglamento General de Circulación, artículo 16",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 414,
            topic = "Túneles",
            subtopic = "Incendio",
            text = "Si se produce un incendio en el interior de un túnel, ¿qué debe hacer el conductor, entre otras medidas?",
            answers = listOf(
                "Aproximar el vehículo a la derecha, apagar el motor y abandonar el túnel siguiendo las vías de evacuación.",
                "Permanecer siempre dentro del vehículo.",
                "Mantener el motor en marcha para poder mover el vehículo rápidamente."
            ),
            correctAnswer = 0,
            explanation = "En caso de incendio debe aproximarse el vehículo todo lo posible a la derecha, apagar el motor y abandonar el vehículo dirigiéndose al refugio o salida más próximos, siguiendo las instrucciones de seguridad.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 258, junio 2021, pregunta 14",
            legalReference = "Reglamento General de Circulación, artículo 97",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 415,
            topic = "Alumbrado",
            subtopic = "Antiniebla trasera",
            text = "Con lluvia muy intensa, ¿debe utilizarse la luz antiniebla trasera?",
            answers = listOf(
                "No, solo puede utilizarse con niebla.",
                "Sí, cuando las condiciones son especialmente desfavorables.",
                "Es siempre opcional."
            ),
            correctAnswer = 1,
            explanation = "La luz antiniebla trasera debe utilizarse cuando las condiciones meteorológicas o ambientales sean especialmente desfavorables, como con lluvia muy intensa, niebla espesa o fuerte nevada.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 258, junio 2021, pregunta 15",
            legalReference = "Reglamento General de Circulación, artículo 106",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
