package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object TunnelRailQuestions {

    val questions = listOf(

        TestQuestion(
            id = 101,
            topic = "Túneles y pasos a nivel",
            subtopic = "Pasos a nivel",
            text = "Al aproximarse a un paso a nivel, ¿qué debe hacer el conductor?",
            answers = listOf(
                "Extremar la prudencia y reducir la velocidad por debajo de la máxima permitida.",
                "Aumentar la velocidad para cruzarlo rápidamente.",
                "Mantener siempre la velocidad máxima permitida."
            ),
            correctAnswer = 0,
            explanation = "Al aproximarse a un paso a nivel o puente móvil se debe extremar la prudencia y reducir la velocidad por debajo de la máxima permitida.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 95.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 102,
            topic = "Túneles y pasos a nivel",
            subtopic = "Barreras",
            text = "Si al llegar a un paso a nivel la barrera está bajada o en movimiento, ¿qué debe hacer?",
            answers = listOf(
                "Continuar si todavía no se aproxima el tren.",
                "Detenerse hasta que tenga el paso libre.",
                "Pasar rodeando la barrera."
            ),
            correctAnswer = 1,
            explanation = "Cuando la barrera o semibarrera está cerrada o en movimiento, los usuarios deben detenerse en su carril hasta tener el paso libre.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 95.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 103,
            topic = "Túneles y pasos a nivel",
            subtopic = "Cruce ferroviario",
            text = "Antes de atravesar una vía férrea, el conductor debe asegurarse de que...",
            answers = listOf(
                "podrá cruzarla sin riesgo de quedar inmovilizado dentro.",
                "no circula ningún vehículo detrás.",
                "puede detenerse sobre las vías."
            ),
            correctAnswer = 0,
            explanation = "El cruce debe realizarse sin demora y después de comprobar que no existe riesgo de quedar inmovilizado dentro del paso.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 95.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 104,
            topic = "Túneles y pasos a nivel",
            subtopic = "Señalización",
            text = "¿Deben estar señalizados los túneles cualquiera que sea su longitud?",
            answers = listOf(
                "Sí.",
                "Solo si superan 200 metros.",
                "Solo si carecen de iluminación."
            ),
            correctAnswer = 0,
            explanation = "Los túneles de cualquier longitud deben estar debidamente señalizados.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 95.5",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 105,
            topic = "Túneles y pasos a nivel",
            subtopic = "Túneles",
            text = "Como norma general, ¿está permitido parar dentro de un túnel?",
            answers = listOf(
                "Sí, si se utilizan las luces de emergencia.",
                "No.",
                "Sí, durante menos de dos minutos."
            ),
            correctAnswer = 1,
            explanation = "Dentro de túneles, pasos inferiores y tramos afectados por la señal de túnel está prohibido parar, salvo situaciones impuestas por la circulación o emergencia.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículos 94.1.a y 95.6",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 106,
            topic = "Túneles y pasos a nivel",
            subtopic = "Distancia de seguridad",
            text = "En un túnel, cuando no se pretende adelantar, ¿qué distancia mínima debe guardar normalmente un turismo con el vehículo precedente?",
            answers = listOf(
                "50 metros o 2 segundos.",
                "100 metros o 4 segundos.",
                "150 metros o 6 segundos."
            ),
            correctAnswer = 1,
            explanation = "Cuando no se pretende adelantar, debe mantenerse al menos 100 metros de distancia o un intervalo mínimo de cuatro segundos.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 95.6",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 107,
            topic = "Túneles y pasos a nivel",
            subtopic = "Vehículos pesados",
            text = "En un túnel, un vehículo de más de 3.500 kg de MMA que no pretende adelantar debe guardar, al menos...",
            answers = listOf(
                "100 metros o 4 segundos.",
                "150 metros o 6 segundos.",
                "200 metros o 8 segundos."
            ),
            correctAnswer = 1,
            explanation = "Para vehículos con MMA superior a 3.500 kg la distancia mínima es de 150 metros o seis segundos.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 95.6",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.HARD
        ),

        TestQuestion(
            id = 108,
            topic = "Túneles y pasos a nivel",
            subtopic = "Adelantamiento",
            text = "En un túnel con circulación en ambos sentidos, ¿puede adelantarse invadiendo el sentido contrario?",
            answers = listOf(
                "Sí.",
                "No.",
                "Sí, si no viene ningún vehículo."
            ),
            correctAnswer = 1,
            explanation = "En túneles de doble sentido está prohibido adelantar invadiendo el sentido contrario.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 95.6",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 109,
            topic = "Túneles y pasos a nivel",
            subtopic = "Paso a nivel sin barreras",
            text = "Antes de entrar en un paso a nivel sin barreras, semibarreras ni semáforos, ¿qué debe comprobar el conductor?",
            answers = listOf(
                "Que no se aproxima ningún vehículo que circule sobre raíles.",
                "Únicamente que no haya peatones.",
                "Que el vehículo precedente ya lo haya cruzado."
            ),
            correctAnswer = 0,
            explanation = "No se puede penetrar en un paso a nivel sin protección sin comprobar previamente que no se aproxima ningún vehículo sobre raíles.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 96.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 110,
            topic = "Túneles y pasos a nivel",
            subtopic = "Emergencias",
            text = "Si por una emergencia el vehículo queda inmovilizado dentro de un túnel, ¿qué debe hacer inicialmente el conductor?",
            answers = listOf(
                "Apagar el motor, conectar la señal de emergencia y mantener las luces de posición.",
                "Mantener el motor encendido y apagar todas las luces.",
                "Dar marcha atrás hasta la entrada."
            ),
            correctAnswer = 0,
            explanation = "En una inmovilización por emergencia dentro de un túnel deben apagarse el motor, conectarse la señal de emergencia y mantenerse encendidas las luces de posición.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 97.3.a",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
