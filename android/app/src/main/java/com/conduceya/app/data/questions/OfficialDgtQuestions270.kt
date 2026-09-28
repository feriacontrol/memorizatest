package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtQuestions270 {

    val questions = listOf(

        TestQuestion(
            id = 325,
            topic = "Motocicletas",
            subtopic = "Equipación",
            text = "Además del casco, ¿es importante que conductor y pasajero de una motocicleta utilicen una equipación adecuada?",
            answers = listOf(
                "Sí, porque su cuerpo queda especialmente expuesto.",
                "No, el casco es suficiente.",
                "Solo durante el invierno."
            ),
            correctAnswer = 0,
            explanation = "Una equipación adecuada protege frente a las inclemencias y puede reducir las consecuencias de una caída.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 270, junio 2024, pregunta 7",
            legalReference = "DGT - Equipación de motoristas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 326,
            topic = "Seguridad",
            subtopic = "Cinturón de seguridad",
            text = "¿Qué es el llamado efecto submarino en un accidente?",
            answers = listOf(
                "El cuerpo se desliza por debajo del cinturón de seguridad.",
                "La cabeza golpea el reposacabezas.",
                "El airbag desplaza al ocupante hacia atrás."
            ),
            correctAnswer = 0,
            explanation = "El efecto submarino se produce cuando el cuerpo se desliza por debajo de la banda abdominal del cinturón, reduciendo su eficacia y aumentando el riesgo de lesiones.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 270, junio 2024, pregunta 10",
            legalReference = "DGT - Cinturón de seguridad",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 327,
            topic = "Condiciones adversas",
            subtopic = "Granizo",
            text = "Con una fuerte granizada, ¿qué actuación ayuda a mantener el control del vehículo?",
            answers = listOf(
                "Reducir la velocidad, evitar frenadas bruscas y aumentar la distancia de seguridad.",
                "Aumentar la velocidad.",
                "Realizar cambios frecuentes de dirección."
            ),
            correctAnswer = 0,
            explanation = "El granizo reduce la adherencia. Conviene disminuir la velocidad, aumentar la separación y evitar movimientos o frenadas bruscas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 270, junio 2024, pregunta 11",
            legalReference = "DGT - Conducción con meteorología adversa",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 328,
            topic = "Accidentes y primeros auxilios",
            subtopic = "Inmovilización del vehículo",
            text = "Siempre que sea posible, después de un accidente, ¿cómo debe asegurarse un vehículo para evitar que se desplace?",
            answers = listOf(
                "Cortando el contacto y accionando el freno de estacionamiento.",
                "Dejando el motor acelerado.",
                "Desconectando obligatoriamente la batería."
            ),
            correctAnswer = 0,
            explanation = "Cuando sea posible, debe evitarse que el vehículo accidentado pueda desplazarse involuntariamente, deteniendo el motor y accionando el freno de estacionamiento.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 270, junio 2024, pregunta 14",
            legalReference = "DGT - Actuación ante accidentes",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
