package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object SignalsQuestions {

    val questions = listOf(

        TestQuestion(
            id = 111,
            topic = "Señalización",
            subtopic = "Preferencia entre señales",
            text = "¿Qué señales tienen mayor preferencia sobre las demás?",
            answers = listOf(
                "Las marcas viales.",
                "Las señales y órdenes de los agentes de tráfico.",
                "Las señales verticales."
            ),
            correctAnswer = 1,
            explanation = "Las señales y órdenes de los agentes de la autoridad encargados de la vigilancia del tráfico ocupan el primer lugar en el orden de preferencia.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 133.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 112,
            topic = "Señalización",
            subtopic = "Preferencia entre señales",
            text = "Dentro del orden general de preferencia, ¿qué tiene prioridad: un semáforo o una señal vertical?",
            answers = listOf(
                "La señal vertical.",
                "El semáforo.",
                "Siempre la señal más cercana."
            ),
            correctAnswer = 1,
            explanation = "Los semáforos tienen preferencia sobre las señales verticales de circulación.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 133.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 113,
            topic = "Señalización",
            subtopic = "Señales contradictorias",
            text = "Si dos señales del mismo tipo parecen contradecirse, ¿cuál debe obedecerse?",
            answers = listOf(
                "La más restrictiva.",
                "La menos restrictiva.",
                "La situada más a la derecha en todos los casos."
            ),
            correctAnswer = 0,
            explanation = "Cuando se contradicen señales del mismo tipo, prevalece la más restrictiva.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 133.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 114,
            topic = "Señalización",
            subtopic = "Semáforos",
            text = "Una luz roja fija en un semáforo para vehículos significa...",
            answers = listOf(
                "paso permitido con precaución.",
                "prohibición de pasar.",
                "obligación de acelerar."
            ),
            correctAnswer = 1,
            explanation = "Una luz roja no intermitente prohíbe el paso.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Anexo I, apartado 4.2.a",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 115,
            topic = "Señalización",
            subtopic = "Semáforos",
            text = "Ante una luz amarilla fija, el conductor debe...",
            answers = listOf(
                "acelerar siempre.",
                "detenerse, salvo que esté tan cerca que no pueda hacerlo con seguridad.",
                "continuar sin ninguna precaución."
            ),
            correctAnswer = 1,
            explanation = "La luz amarilla fija obliga a detenerse como una roja, salvo cuando no sea posible hacerlo con seguridad por la proximidad al lugar de detención.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Anexo I, apartado 4.2.c",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 116,
            topic = "Señalización",
            subtopic = "Semáforos",
            text = "Una luz verde fija en un semáforo para vehículos significa, como norma general...",
            answers = listOf(
                "que está permitido el paso con prioridad.",
                "que debe detenerse.",
                "que debe ceder siempre el paso antes del semáforo."
            ),
            correctAnswer = 0,
            explanation = "La luz verde no intermitente permite el paso con prioridad, sin perjuicio de situaciones como una intersección bloqueada.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Anexo I, apartado 4.2.e",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 117,
            topic = "Señalización",
            subtopic = "Semáforos",
            text = "Una luz roja intermitente o dos luces rojas alternativamente intermitentes indican...",
            answers = listOf(
                "que el paso está temporalmente prohibido.",
                "que puede pasarse con precaución.",
                "que existe vía libre."
            ),
            correctAnswer = 0,
            explanation = "Las luces rojas intermitentes prohíben temporalmente el paso, por ejemplo ante determinados pasos a nivel.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Anexo I, apartado 4.2.b",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 118,
            topic = "Señalización",
            subtopic = "Semáforos de carril",
            text = "Una luz roja en forma de aspa sobre un carril significa...",
            answers = listOf(
                "que está prohibido ocupar ese carril.",
                "que ese carril tiene prioridad.",
                "que únicamente pueden circular turismos."
            ),
            correctAnswer = 0,
            explanation = "La aspa roja prohíbe ocupar el carril indicado y obliga a abandonarlo lo antes posible.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Anexo I, apartado 4.3.a",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 119,
            topic = "Señalización",
            subtopic = "Semáforos de carril",
            text = "Una flecha verde hacia abajo situada sobre un carril indica...",
            answers = listOf(
                "que está permitido circular por ese carril.",
                "que debe abandonarse inmediatamente.",
                "que el carril es exclusivo para emergencias."
            ),
            correctAnswer = 0,
            explanation = "La flecha verde hacia abajo permite circular por el carril, pero no exime de cumplir otras señales de detención o prioridad.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Anexo I, apartado 4.3.b",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 120,
            topic = "Señalización",
            subtopic = "Semáforos de carril",
            text = "Una flecha blanca o amarilla oblicua sobre un carril indica que...",
            answers = listOf(
                "el carril va a quedar cerrado y debe incorporarse con seguridad al indicado por la flecha.",
                "debe detenerse inmediatamente en ese carril.",
                "puede adelantar por cualquier lado."
            ),
            correctAnswer = 0,
            explanation = "La flecha oblicua indica que el carril va a quedar cerrado y que debe realizarse la incorporación segura hacia el carril señalado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Anexo I, apartado 4.3.c",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
