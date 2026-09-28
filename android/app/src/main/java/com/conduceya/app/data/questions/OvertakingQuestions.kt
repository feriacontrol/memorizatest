package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OvertakingQuestions {

    val questions = listOf(

        TestQuestion(
            id = 81,
            topic = "Adelantamientos",
            subtopic = "Norma general",
            text = "Como norma general, ¿por qué lado debe efectuarse un adelantamiento?",
            answers = listOf(
                "Por la izquierda.",
                "Por la derecha.",
                "Por cualquiera de los dos lados."
            ),
            correctAnswer = 0,
            explanation = "Como norma general, el adelantamiento debe efectuarse por la izquierda del vehículo al que se pretende adelantar.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 82.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 82,
            topic = "Adelantamientos",
            subtopic = "Adelantamiento por la derecha",
            text = "¿Puede adelantarse por la derecha a un vehículo que indica claramente que va a girar a la izquierda?",
            answers = listOf(
                "Sí, si existe espacio suficiente y se toman las máximas precauciones.",
                "No, nunca.",
                "Solo en autopista."
            ),
            correctAnswer = 0,
            explanation = "Excepcionalmente se permite adelantar por la derecha si el vehículo precedente indica claramente que va a girar a la izquierda o parar en ese lado y existe espacio suficiente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 82.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 83,
            topic = "Adelantamientos",
            subtopic = "Poblado",
            text = "Dentro de poblado, en una calzada con al menos dos carriles para el mismo sentido delimitados por marcas, ¿puede adelantarse por la derecha?",
            answers = listOf(
                "Sí, si puede hacerse sin peligro.",
                "No.",
                "Solo a motocicletas."
            ),
            correctAnswer = 0,
            explanation = "En estas calzadas urbanas se permite el adelantamiento por la derecha si previamente se comprueba que puede realizarse sin peligro.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 82.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 84,
            topic = "Adelantamientos",
            subtopic = "Señalización",
            text = "Si para adelantar es necesario realizar un desplazamiento lateral, ¿debe advertirse la maniobra?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo durante la noche."
            ),
            correctAnswer = 0,
            explanation = "Todo adelantamiento que implique desplazamiento lateral debe advertirse mediante la correspondiente señal óptica.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 82.4",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 85,
            topic = "Adelantamientos",
            subtopic = "Inicio de la maniobra",
            text = "Antes de iniciar un adelantamiento, ¿debe comprobarse que existe espacio libre suficiente en el carril que se va a utilizar?",
            answers = listOf(
                "Sí.",
                "No, basta con señalizar.",
                "Solo si se adelanta a un vehículo pesado."
            ),
            correctAnswer = 0,
            explanation = "Antes de iniciar la maniobra debe comprobarse que existe espacio suficiente para adelantar sin peligro ni entorpecimiento.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 84.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 86,
            topic = "Adelantamientos",
            subtopic = "Inicio de la maniobra",
            text = "Antes de adelantar, el conductor debe asegurarse de que el vehículo que le precede...",
            answers = listOf(
                "no ha indicado su intención de desplazarse hacia el mismo lado.",
                "circula necesariamente por debajo del límite de velocidad.",
                "ha encendido las luces de emergencia."
            ),
            correctAnswer = 0,
            explanation = "Debe comprobarse que el vehículo precedente no ha indicado su intención de desplazarse hacia el mismo lado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 84.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 87,
            topic = "Adelantamientos",
            subtopic = "Inicio de la maniobra",
            text = "Antes de adelantar, ¿debe comprobarse que ningún conductor que circula detrás ha iniciado ya el adelantamiento?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo en vías de un carril."
            ),
            correctAnswer = 0,
            explanation = "El conductor debe asegurarse de que ningún vehículo que le siga haya iniciado ya una maniobra para adelantarlo.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 84.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 88,
            topic = "Adelantamientos",
            subtopic = "Ejecución",
            text = "Durante un adelantamiento, la velocidad del vehículo que adelanta debe ser...",
            answers = listOf(
                "notoriamente superior a la del vehículo adelantado.",
                "exactamente igual.",
                "inferior."
            ),
            correctAnswer = 0,
            explanation = "Durante la ejecución del adelantamiento debe mantenerse una velocidad notoriamente superior a la del vehículo adelantado y una separación lateral suficiente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 85.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 89,
            topic = "Adelantamientos",
            subtopic = "Desistimiento",
            text = "Si después de iniciar un adelantamiento resulta difícil terminarlo sin riesgo, ¿qué debe hacer el conductor?",
            answers = listOf(
                "Acelerar siempre hasta terminarlo.",
                "Reducir rápidamente la marcha y regresar a su carril.",
                "Detenerse en el carril contrario."
            ),
            correctAnswer = 1,
            explanation = "Si aparecen circunstancias que dificulten finalizar el adelantamiento con seguridad, debe reducirse la marcha y regresar al carril propio.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 85.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 90,
            topic = "Adelantamientos",
            subtopic = "Finalización",
            text = "Después de adelantar, ¿cómo debe regresar el conductor a su carril?",
            answers = listOf(
                "De forma gradual y sin obligar a otros usuarios a modificar bruscamente su trayectoria o velocidad.",
                "Inmediatamente, aunque obligue al adelantado a frenar.",
                "Solo cuando el vehículo adelantado haga señales."
            ),
            correctAnswer = 0,
            explanation = "El regreso al carril debe realizarse tan pronto como sea posible, de forma gradual y sin perjudicar a otros usuarios.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 85.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 91,
            topic = "Adelantamientos",
            subtopic = "Vehículo adelantado",
            text = "Cuando un conductor advierte que otro vehículo pretende adelantarlo, como norma general debe...",
            answers = listOf(
                "ceñirse al borde derecho de la calzada.",
                "desplazarse hacia la izquierda.",
                "aumentar la velocidad."
            ),
            correctAnswer = 0,
            explanation = "Como norma general, el conductor del vehículo adelantado debe ceñirse al borde derecho para facilitar la maniobra.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 86.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 92,
            topic = "Adelantamientos",
            subtopic = "Vehículo adelantado",
            text = "¿Puede el conductor de un vehículo que está siendo adelantado aumentar su velocidad para dificultar la maniobra?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo fuera de poblado."
            ),
            correctAnswer = 1,
            explanation = "Está prohibido aumentar la velocidad o realizar maniobras que impidan o dificulten el adelantamiento.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 86.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
