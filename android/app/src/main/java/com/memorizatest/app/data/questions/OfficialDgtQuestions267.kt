package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions267 {

    val questions = listOf(

        TestQuestion(
            id = 346,
            topic = "Señalización",
            subtopic = "Prioridad entre señales",
            text = "Si las indicaciones de un semáforo contradicen una señal de balizamiento, ¿cuál prevalece?",
            answers = listOf(
                "La señal de balizamiento.",
                "El semáforo.",
                "La señal más restrictiva."
            ),
            correctAnswer = 0,
            explanation = "En el orden de prioridad de las señales, la señalización circunstancial y de balizamiento prevalece sobre los semáforos.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 267, octubre 2023, pregunta 1",
            legalReference = "Reglamento General de Circulación - prioridad entre señales",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 347,
            topic = "Mecánica y mantenimiento",
            subtopic = "Frenos",
            text = "En un turismo, ¿sobre qué ruedas actúa normalmente el freno de servicio o freno de pie?",
            answers = listOf(
                "Solo sobre las delanteras.",
                "Sobre las cuatro ruedas.",
                "Solo sobre las ruedas motrices."
            ),
            correctAnswer = 1,
            explanation = "El freno de servicio debe actuar sobre las ruedas del vehículo de forma que permita controlar su movimiento y detenerlo eficazmente.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 267, octubre 2023, pregunta 3",
            legalReference = "DGT - Sistema de frenado",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 348,
            topic = "Maniobras",
            subtopic = "Cambio de dirección",
            text = "Para advertir un giro a la derecha, ¿qué puede utilizar el conductor?",
            answers = listOf(
                "El intermitente o, en su defecto, la señal reglamentaria con el brazo.",
                "El claxon obligatoriamente.",
                "Las luces de emergencia."
            ),
            correctAnswer = 0,
            explanation = "El cambio de dirección debe señalizarse mediante el indicador correspondiente o, cuando proceda, mediante la señal reglamentaria realizada con el brazo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 267, octubre 2023, pregunta 5",
            legalReference = "DGT - Señalización de maniobras",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 349,
            topic = "Peatones",
            subtopic = "Señales de los agentes",
            text = "Un peatón que pretende cruzar una vía encuentra de frente a un agente con el brazo levantado verticalmente. ¿Qué debe hacer?",
            answers = listOf(
                "Detenerse.",
                "Cruzar porque las órdenes de los agentes solo afectan a vehículos.",
                "Cruzar si existe un semáforo verde para peatones."
            ),
            correctAnswer = 0,
            explanation = "Las señales de los agentes obligan a todos los usuarios de la vía afectados por ellas, incluidos los peatones.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 267, octubre 2023, pregunta 9",
            legalReference = "DGT - Señales de los agentes",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 350,
            topic = "Fatiga y sueño",
            subtopic = "Síntomas",
            text = "¿Cuál puede ser un síntoma de la aparición de fatiga durante la conducción?",
            answers = listOf(
                "Realizar menos correcciones sobre la dirección.",
                "Aumentar la agudeza visual.",
                "Distinguir mejor la información relevante."
            ),
            correctAnswer = 0,
            explanation = "La fatiga puede reducir la precisión de la conducción y disminuir la frecuencia de las correcciones realizadas sobre la dirección.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 267, octubre 2023, pregunta 10",
            legalReference = "DGT - Fatiga en la conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 351,
            topic = "Mecánica y mantenimiento",
            subtopic = "Faros",
            text = "Después de una exposición prolongada del vehículo a altas temperaturas, ¿conviene revisar visualmente los faros y pilotos?",
            answers = listOf(
                "Sí.",
                "No, nunca se deterioran por el calor.",
                "Solo en vehículos de más de diez años."
            ),
            correctAnswer = 0,
            explanation = "El calor y la exposición prolongada pueden acelerar el deterioro y la pérdida de transparencia de faros y pilotos.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 267, octubre 2023, pregunta 11",
            legalReference = "DGT - Mantenimiento del alumbrado",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 352,
            topic = "Alcohol y drogas",
            subtopic = "Seguridad",
            text = "Desde el punto de vista de la seguridad vial, ¿cuál es la tasa de alcohol más segura para conducir?",
            answers = listOf(
                "0,0 g/l.",
                "0,3 g/l.",
                "0,5 g/l."
            ),
            correctAnswer = 0,
            explanation = "La única tasa de alcohol completamente segura para conducir es 0,0.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 267, octubre 2023, pregunta 12",
            legalReference = "DGT - Alcohol y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 353,
            topic = "Conductores noveles",
            subtopic = "Percepción del riesgo",
            text = "Sobrevalorar la propia capacidad de conducción y percibir menos los riesgos puede hacer que los conductores jóvenes...",
            answers = listOf(
                "tengan mayor probabilidad de sufrir un accidente.",
                "tengan menor probabilidad de sufrirlo.",
                "sean siempre más prudentes."
            ),
            correctAnswer = 0,
            explanation = "La sobrevaloración de las propias capacidades y una menor percepción del riesgo pueden favorecer conductas peligrosas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 267, octubre 2023, pregunta 13",
            legalReference = "DGT - Jóvenes conductores",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 354,
            topic = "Vehículos prioritarios",
            subtopic = "Servicio urgente",
            text = "Un vehículo prioritario que circula en servicio urgente, ¿puede utilizar únicamente la señal luminosa y omitir la acústica?",
            answers = listOf(
                "Sí, cuando su omisión no suponga peligro para los demás usuarios.",
                "No, debe utilizar siempre ambas simultáneamente.",
                "Solo puede hacerlo dentro de poblado."
            ),
            correctAnswer = 0,
            explanation = "En determinadas circunstancias puede utilizarse únicamente la señal luminosa cuando la omisión de la acústica no entrañe peligro para los demás usuarios.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 267, octubre 2023, pregunta 14",
            legalReference = "DGT - Vehículos prioritarios",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
