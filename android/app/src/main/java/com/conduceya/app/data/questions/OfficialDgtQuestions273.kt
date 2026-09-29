package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtQuestions273 {

    val questions = listOf(

        TestQuestion(
            id = 304,
            topic = "Documentación",
            subtopic = "Matrícula",
            text = "¿Está permitido circular si algún obstáculo dificulta la lectura o identificación de la matrícula?",
            answers = listOf(
                "No.",
                "Sí, si la matrícula delantera se lee correctamente.",
                "Sí, únicamente en vías urbanas."
            ),
            correctAnswer = 0,
            explanation = "El conductor debe comprobar que las placas de matrícula pueden leerse e identificarse correctamente.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 273, abril 2025, pregunta 1",
            legalReference = "DGT - Placas de matrícula",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 305,
            topic = "Adelantamientos",
            subtopic = "Vehículos de tracción animal",
            text = "Al adelantar fuera de poblado a un vehículo de tracción animal, ¿qué separación lateral mínima debe mantenerse?",
            answers = listOf(
                "1 metro.",
                "1,5 metros.",
                "2 metros."
            ),
            correctAnswer = 1,
            explanation = "Debe mantenerse una separación lateral mínima de 1,5 metros. Al realizarse fuera de poblado, antes y durante toda la maniobra debe reducirse además la velocidad respecto al límite de la vía en al menos 20 km/h.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 273, abril 2025, pregunta 5",
            legalReference = "Reglamento General de Circulación, artículo 85.4",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 306,
            topic = "Alumbrado",
            subtopic = "Vehículo inmovilizado",
            text = "Entre el ocaso y la salida del sol, un vehículo parado o estacionado en el arcén de una travesía insuficientemente iluminada debe llevar encendidas, como norma general...",
            answers = listOf(
                "las luces de posición.",
                "las luces de emergencia.",
                "ninguna luz."
            ),
            correctAnswer = 0,
            explanation = "En estas circunstancias deben permanecer encendidas las luces de posición, con las alternativas reglamentarias previstas para determinados estacionamientos.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 273, abril 2025, pregunta 6",
            legalReference = "Reglamento General de Circulación, artículo 105",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 307,
            topic = "Alcohol y drogas",
            subtopic = "Efectos del alcohol",
            text = "¿Qué alteración puede provocar con frecuencia el alcohol en el comportamiento de un conductor?",
            answers = listOf(
                "Respuestas impulsivas y agresivas.",
                "Una reducción del tiempo de reacción.",
                "Una mejor percepción de las señales."
            ),
            correctAnswer = 0,
            explanation = "El alcohol puede favorecer conductas impulsivas y agresivas, además de deteriorar otras capacidades necesarias para conducir.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 273, abril 2025, pregunta 9",
            legalReference = "DGT - Alcohol y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 308,
            topic = "Conductores noveles",
            subtopic = "Factores de riesgo",
            text = "Muchos de los accidentes más graves de los conductores jóvenes se relacionan especialmente con...",
            answers = listOf(
                "la falta de experiencia y el consumo de alcohol o drogas.",
                "una conducción excesivamente prudente.",
                "el exceso de experiencia."
            ),
            correctAnswer = 0,
            explanation = "La falta de experiencia y el consumo de alcohol o drogas son factores especialmente relevantes en la siniestralidad de los conductores jóvenes.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 273, abril 2025, pregunta 12",
            legalReference = "DGT - Jóvenes conductores y factores de riesgo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 309,
            topic = "Conducción eficiente",
            subtopic = "Carga",
            text = "¿Qué ocurre normalmente con el consumo de combustible cuando un vehículo circula muy cargado?",
            answers = listOf(
                "Aumenta.",
                "Disminuye siempre.",
                "No varía."
            ),
            correctAnswer = 0,
            explanation = "Una mayor carga obliga al vehículo a realizar más esfuerzo y normalmente incrementa el consumo de combustible.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 273, abril 2025, pregunta 13",
            legalReference = "DGT - Conducción eficiente",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 310,
            topic = "Conducción segura",
            subtopic = "Seguridad del vehículo",
            text = "¿Por qué el vehículo aparece en menor medida como causa principal de los accidentes que otros factores?",
            answers = listOf(
                "Por las importantes mejoras técnicas incorporadas a su diseño y construcción.",
                "Porque los vehículos no pueden sufrir averías.",
                "Porque cada año se recorren menos kilómetros."
            ),
            correctAnswer = 0,
            explanation = "La evolución de los sistemas de seguridad y las mejoras técnicas de los vehículos han reducido su peso relativo como causa principal de accidentes.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 273, abril 2025, pregunta 14",
            legalReference = "DGT - Factores de riesgo en la conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 311,
            topic = "Mecánica y mantenimiento",
            subtopic = "Revisiones",
            text = "Para mantener la seguridad del vehículo, ¿qué elementos conviene revisar periódicamente con especial frecuencia?",
            answers = listOf(
                "Neumáticos, frenos y amortiguadores.",
                "Solo la batería y las llantas.",
                "Únicamente el filtro de aire."
            ),
            correctAnswer = 0,
            explanation = "Neumáticos, sistema de frenado y amortiguadores son elementos directamente relacionados con la adherencia, estabilidad y capacidad de detener el vehículo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 273, abril 2025, pregunta 15",
            legalReference = "DGT - Mantenimiento y seguridad del vehículo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
