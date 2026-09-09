package com.conduceya.app.data

import com.conduceya.app.model.TestQuestion

object QuestionBank {

    val questions = listOf(

        TestQuestion(
            id = 1,
            text = "¿Qué debe hacer un conductor cuando el semáforo está en rojo?",
            answers = listOf(
                "Detenerse antes de la línea de detención.",
                "Continuar si no viene ningún vehículo.",
                "Reducir la velocidad sin detenerse."
            ),
            correctAnswer = 0,
            explanation = "La luz roja no intermitente prohíbe el paso. El vehículo debe detenerse antes de la línea de detención.",
            topic = "Semáforos",
            reference = "Reglamento General de Circulación"
        ),

        TestQuestion(
            id = 2,
            text = "¿Qué indica, con carácter general, una señal triangular con borde rojo?",
            answers = listOf(
                "Una obligación.",
                "Una advertencia de peligro.",
                "Una zona de estacionamiento."
            ),
            correctAnswer = 1,
            explanation = "Las señales triangulares con borde rojo advierten de la proximidad de un peligro.",
            topic = "Señales",
            reference = "Reglamento General de Circulación"
        ),

        TestQuestion(
            id = 3,
            text = "Antes de realizar un adelantamiento, ¿qué debe comprobar el conductor?",
            answers = listOf(
                "Que puede hacerlo sin peligro.",
                "Que circula a la velocidad máxima permitida.",
                "Que el vehículo de delante está frenando."
            ),
            correctAnswer = 0,
            explanation = "Antes de adelantar debe comprobarse que la maniobra puede realizarse con seguridad.",
            topic = "Adelantamientos",
            reference = "Reglamento General de Circulación"
        ),

        TestQuestion(
            id = 4,
            text = "¿Es obligatorio utilizar el cinturón de seguridad cuando el vehículo dispone de él?",
            answers = listOf(
                "Solo en carretera.",
                "Sí, con las excepciones previstas legalmente.",
                "Solo para el conductor."
            ),
            correctAnswer = 1,
            explanation = "El cinturón debe utilizarse en vías urbanas e interurbanas, salvo las excepciones legalmente previstas.",
            topic = "Seguridad",
            reference = "Reglamento General de Circulación"
        ),

        TestQuestion(
            id = 5,
            text = "Si un conductor está cansado, ¿qué es lo más adecuado?",
            answers = listOf(
                "Aumentar la velocidad para llegar antes.",
                "Abrir la ventanilla y continuar.",
                "Detenerse en un lugar seguro y descansar."
            ),
            correctAnswer = 2,
            explanation = "La fatiga disminuye la atención y aumenta el tiempo de reacción. Lo adecuado es detenerse y descansar.",
            topic = "Conducción segura",
            reference = "Contenido formativo de seguridad vial"
        )
    )
}
