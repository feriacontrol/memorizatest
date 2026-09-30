package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions262 {

    val questions = listOf(

        TestQuestion(
            id = 386,
            topic = "Vehículos prioritarios",
            subtopic = "Servicio urgente",
            text = "Si, por circunstancias especialmente graves, un turismo particular debe realizar urgentemente un servicio normalmente reservado a vehículos prioritarios, ¿qué señal luminosa debe utilizar para advertir la situación?",
            answers = listOf(
                "La luz de emergencia, si dispone de ella.",
                "La luz de carretera.",
                "Únicamente las luces de posición."
            ),
            correctAnswer = 0,
            explanation = "Un vehículo no prioritario que excepcionalmente realice un servicio urgente debe advertir la situación utilizando el avisador acústico de forma intermitente y conectando la luz de emergencia, si dispone de ella.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 262, junio 2022, pregunta 1",
            legalReference = "Reglamento General de Circulación, artículo 70",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 387,
            topic = "Señalización",
            subtopic = "Marcas amarillas",
            text = "¿Qué recuerda una cuadrícula de marcas amarillas pintada en una intersección?",
            answers = listOf(
                "Que está prohibido entrar siempre en la intersección.",
                "Que no debe entrarse si previsiblemente se va a quedar detenido obstaculizando la circulación transversal.",
                "Que está prohibido estacionar, pero puede detenerse dentro de ella."
            ),
            correctAnswer = 1,
            explanation = "Aunque tenga prioridad, el conductor no debe entrar en una intersección si puede quedar detenido dentro de ella obstaculizando la circulación transversal.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 262, junio 2022, pregunta 5",
            legalReference = "Reglamento General de Circulación, artículo 59.1",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 388,
            topic = "Conducción segura",
            subtopic = "Estrés",
            text = "En general, ¿cómo puede afectar el estrés a un conductor?",
            answers = listOf(
                "Puede hacer que se distraiga con mayor facilidad.",
                "Hace que cometa menos errores.",
                "Mejora siempre su capacidad de atención."
            ),
            correctAnswer = 0,
            explanation = "El estrés puede alterar la atención y favorecer las distracciones, además de influir negativamente en la toma de decisiones.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 262, junio 2022, pregunta 8",
            legalReference = "DGT - Estrés y conducción",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 389,
            topic = "Señalización",
            subtopic = "Prioridad entre señales",
            text = "Si dos señales del mismo tipo parecen contradecirse, ¿cuál debe obedecerse?",
            answers = listOf(
                "La menos restrictiva.",
                "La más restrictiva.",
                "Ninguna."
            ),
            correctAnswer = 1,
            explanation = "Cuando existe contradicción entre señales del mismo tipo, prevalece la más restrictiva.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 262, junio 2022, pregunta 9",
            legalReference = "Reglamento General de Circulación, artículo 133",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 390,
            topic = "Conducción segura",
            subtopic = "Advertencias ópticas",
            text = "Si debido a una retención debe reducir considerablemente la velocidad, ¿debe advertir a los vehículos que circulan detrás siempre que sea posible?",
            answers = listOf(
                "Sí, utilizando reiteradamente las luces de frenado o mediante la señal reglamentaria con el brazo.",
                "Sí, utilizando únicamente las luces de emergencia.",
                "No."
            ),
            correctAnswer = 0,
            explanation = "La intención de frenar considerablemente debe advertirse, siempre que sea posible, mediante el empleo reiterado de las luces de frenado o moviendo el brazo alternativamente de arriba abajo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 262, junio 2022, pregunta 11",
            legalReference = "Reglamento General de Circulación, artículo 109.2.c",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 391,
            topic = "Estacionamiento",
            subtopic = "Vías urbanas",
            text = "En una vía urbana de doble sentido, ¿en qué lado debe estacionarse normalmente un turismo?",
            answers = listOf(
                "En cualquiera de los dos lados.",
                "En el lado izquierdo según el sentido de la marcha.",
                "En el lado derecho según el sentido de la marcha."
            ),
            correctAnswer = 2,
            explanation = "En una vía urbana de doble sentido, cuando el estacionamiento se realiza en la calzada o el arcén, el vehículo debe situarse lo más cerca posible del borde derecho.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 262, junio 2022, pregunta 12",
            legalReference = "Reglamento General de Circulación, artículo 90.2",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
