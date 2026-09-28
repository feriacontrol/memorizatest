package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtQuestions265 {

    val questions = listOf(

        TestQuestion(
            id = 364,
            topic = "Prioridad",
            subtopic = "Estrechamientos",
            text = "Dos vehículos del mismo tipo han recorrido la misma distancia dentro de un estrechamiento sin prioridad señalizada. Si uno debe retroceder, ¿cuál tendrá preferencia?",
            answers = listOf(
                "El de menor masa máxima autorizada.",
                "El que tenga menor longitud.",
                "El que tenga mayor anchura, longitud o masa máxima autorizada."
            ),
            correctAnswer = 2,
            explanation = "Si son vehículos del mismo tipo y ambos tendrían que retroceder la misma distancia, la preferencia se decide atendiendo a sus dimensiones y masa máxima autorizada.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 265, marzo 2023, pregunta 9; fe de erratas DGT",
            legalReference = "Reglamento General de Circulación, artículo 62",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.HARD
        ),

        TestQuestion(
            id = 365,
            topic = "Mecánica y mantenimiento",
            subtopic = "Neumáticos de invierno",
            text = "Si un vehículo lleva neumáticos de invierno, ¿conviene sustituirlos cuando comienzan las temperaturas más cálidas?",
            answers = listOf(
                "Sí, porque con temperaturas elevadas se desgastan más rápidamente.",
                "No, porque se adaptan automáticamente al calor.",
                "No, siempre ofrecen mejores prestaciones que los neumáticos convencionales."
            ),
            correctAnswer = 0,
            explanation = "Los neumáticos de invierno están diseñados para bajas temperaturas; con calor aumentan su desgaste y pueden empeorar sus prestaciones.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 265, marzo 2023, pregunta 11",
            legalReference = "DGT - Neumáticos de invierno",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 366,
            topic = "Alumbrado",
            subtopic = "Luz de carretera",
            text = "En una travesía, ¿está permitido circular con la luz de largo alcance o carretera encendida?",
            answers = listOf(
                "No.",
                "Sí, cuando la travesía esté insuficientemente iluminada.",
                "Sí, siempre que se circule a más de 40 km/h."
            ),
            correctAnswer = 0,
            explanation = "La luz de carretera se utiliza, con las condiciones reglamentarias, fuera de poblado. En una travesía no corresponde utilizarla.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 265, marzo 2023, pregunta 12",
            legalReference = "Reglamento General de Circulación, artículo 100",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 367,
            topic = "Circulación",
            subtopic = "Carril VAO",
            text = "Como norma general, ¿puede una motocicleta circular por un carril reservado para vehículos de alta ocupación (VAO)?",
            answers = listOf(
                "No.",
                "Solo cuando lleve pasajero.",
                "Sí."
            ),
            correctAnswer = 2,
            explanation = "Las motocicletas se encuentran entre los vehículos autorizados para utilizar los carriles VAO, sin perjuicio de la señalización y regulación concreta del tramo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 265, marzo 2023, pregunta 13",
            legalReference = "Reglamento General de Circulación, artículo 35",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 368,
            topic = "Alcohol y drogas",
            subtopic = "Eliminación del alcohol",
            text = "Después de consumir alcohol, ¿desaparece rápidamente de la sangre?",
            answers = listOf(
                "Sí, normalmente en una hora.",
                "Sí, principalmente mediante el sudor.",
                "No, su eliminación es lenta y puede necesitar varias horas."
            ),
            correctAnswer = 2,
            explanation = "El organismo elimina el alcohol lentamente, por lo que sus efectos y su presencia en sangre pueden mantenerse durante varias horas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 265, marzo 2023, pregunta 14",
            legalReference = "DGT - Alcohol y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 369,
            topic = "Alcohol y drogas",
            subtopic = "Anfetaminas",
            text = "¿Es seguro conducir después de consumir anfetaminas?",
            answers = listOf(
                "No.",
                "Sí, porque retrasan la aparición del sueño.",
                "Sí, siempre que no se mezclen con alcohol."
            ),
            correctAnswer = 0,
            explanation = "Las anfetaminas pueden alterar gravemente la percepción del riesgo, el comportamiento y otras capacidades necesarias para una conducción segura.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 265, marzo 2023, pregunta 15",
            legalReference = "DGT - Drogas y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
