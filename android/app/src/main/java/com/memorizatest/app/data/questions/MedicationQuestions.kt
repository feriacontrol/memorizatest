package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object MedicationQuestions {

    val questions = listOf(

        TestQuestion(
            id = 207,
            topic = "Medicamentos y conducción",
            subtopic = "Pictograma",
            text = "El pictograma de un automóvil dentro de un triángulo rojo en el envase de un medicamento advierte de que...",
            answers = listOf(
                "el medicamento puede afectar a la capacidad para conducir.",
                "está prohibido utilizar cualquier vehículo durante toda la vida.",
                "el medicamento solo puede tomarse dentro de un automóvil."
            ),
            correctAnswer = 0,
            explanation = "El pictograma advierte al paciente de que debe consultar la información sobre posibles efectos del medicamento en la conducción.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Consumo de drogas y medicación",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 208,
            topic = "Medicamentos y conducción",
            subtopic = "Efectos",
            text = "¿Pueden algunos medicamentos producir somnolencia o disminuir la capacidad de reacción?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo los medicamentos inyectables."
            ),
            correctAnswer = 0,
            explanation = "Determinados medicamentos pueden causar somnolencia, lentitud de reacción, alteraciones visuales, mareos u otros efectos incompatibles con una conducción segura.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Medicamentos y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 209,
            topic = "Medicamentos y conducción",
            subtopic = "Tratamiento",
            text = "Si un medicamento prescrito puede afectar a la conducción, ¿debe el paciente suspenderlo por su cuenta?",
            answers = listOf(
                "No; debe seguir las indicaciones médicas y consultar si tiene dudas.",
                "Sí, siempre.",
                "Sí, únicamente los fines de semana."
            ),
            correctAnswer = 0,
            explanation = "No debe abandonarse un tratamiento por cuenta propia. Deben seguirse las instrucciones del profesional sanitario y consultar cualquier duda.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Medicamentos y conducción segura",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 210,
            topic = "Medicamentos y conducción",
            subtopic = "Alcohol",
            text = "Mezclar alcohol con determinados medicamentos puede...",
            answers = listOf(
                "aumentar sus efectos adversos sobre la conducción.",
                "eliminar siempre la somnolencia.",
                "mejorar los reflejos."
            ),
            correctAnswer = 0,
            explanation = "El alcohol puede potenciar los efectos adversos de numerosos medicamentos y aumentar el riesgo durante la conducción.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Medicamentos, alcohol y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 211,
            topic = "Medicamentos y conducción",
            subtopic = "Somnolencia",
            text = "¿Pueden algunos antihistamínicos favorecer la somnolencia durante la conducción?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si se toman con agua."
            ),
            correctAnswer = 0,
            explanation = "Algunos antihistamínicos tienen efectos sedantes y pueden favorecer la somnolencia, por lo que es importante comprobar sus advertencias.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Conducir con sueño o cansancio",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
