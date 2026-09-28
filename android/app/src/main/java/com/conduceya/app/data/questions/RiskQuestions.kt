package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object RiskQuestions {

    val questions = listOf(

        TestQuestion(
            id = 246,
            topic = "Percepción del riesgo",
            subtopic = "Niños",
            text = "Al pasar junto a vehículos estacionados cerca de un colegio, el conductor debe prever que...",
            answers = listOf(
                "pueda aparecer un niño de forma inesperada.",
                "nunca aparecerá ningún peatón.",
                "todos los peatones cruzarán únicamente por semáforos."
            ),
            correctAnswer = 0,
            explanation = "Los vehículos estacionados pueden ocultar peatones, especialmente niños, por lo que debe anticiparse una posible irrupción en la calzada.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Percepción del riesgo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 247,
            topic = "Percepción del riesgo",
            subtopic = "Ciclistas",
            text = "Al aproximarse a un ciclista, ¿debe el conductor prever posibles cambios de trayectoria causados por obstáculos?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si el ciclista hace señales."
            ),
            correctAnswer = 0,
            explanation = "Un ciclista puede necesitar modificar su trayectoria por baches, vehículos estacionados u otros obstáculos, por lo que debe mantenerse espacio suficiente.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Percepción del riesgo - ciclistas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 248,
            topic = "Percepción del riesgo",
            subtopic = "Visibilidad",
            text = "Ante una zona en la que la visibilidad está limitada, una conducción preventiva consiste en...",
            answers = listOf(
                "reducir la velocidad y anticiparse a posibles peligros ocultos.",
                "acelerar para atravesarla rápidamente.",
                "circular lo más cerca posible del vehículo precedente."
            ),
            correctAnswer = 0,
            explanation = "La conducción preventiva exige adaptar la velocidad y prever riesgos que todavía no son completamente visibles.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Percepción y anticipación del riesgo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 249,
            topic = "Percepción del riesgo",
            subtopic = "Usuarios vulnerables",
            text = "Cuando se conduce cerca de usuarios vulnerables, ¿es conveniente dejarles mayor espacio y tiempo de reacción?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo en autopista."
            ),
            correctAnswer = 0,
            explanation = "Peatones y ciclistas carecen de la protección de un automóvil, por lo que es necesario extremar la anticipación y dejar espacio suficiente.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Percepción del riesgo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 250,
            topic = "Percepción del riesgo",
            subtopic = "Anticipación",
            text = "Una buena percepción del riesgo permite al conductor...",
            answers = listOf(
                "anticiparse a situaciones peligrosas antes de que sea necesario reaccionar bruscamente.",
                "conducir siempre a la velocidad máxima.",
                "eliminar la necesidad de mantener distancia de seguridad."
            ),
            correctAnswer = 0,
            explanation = "La anticipación permite detectar indicios de peligro y actuar con suavidad y margen antes de que se produzca una situación crítica.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Percepción del riesgo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
