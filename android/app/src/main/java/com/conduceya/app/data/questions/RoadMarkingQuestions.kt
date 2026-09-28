package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object RoadMarkingQuestions {

    val questions = listOf(

        TestQuestion(
            id = 218,
            topic = "Señalización",
            subtopic = "Marcas longitudinales",
            text = "Como norma general, una línea longitudinal continua sobre la calzada...",
            answers = listOf(
                "no debe atravesarse ni circular sobre ella.",
                "puede atravesarse libremente.",
                "obliga a aumentar la velocidad."
            ),
            correctAnswer = 0,
            explanation = "Una marca longitudinal continua no debe atravesarse ni utilizarse para circular sobre ella, salvo excepciones reglamentarias.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Catálogo oficial de marcas viales M-2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 219,
            topic = "Señalización",
            subtopic = "Marcas longitudinales",
            text = "Dos líneas longitudinales continuas adosadas tienen...",
            answers = listOf(
                "el mismo significado que una línea continua.",
                "el mismo significado que una línea discontinua.",
                "únicamente función decorativa."
            ),
            correctAnswer = 0,
            explanation = "Dos líneas continuas paralelas tienen el mismo significado prohibitivo que una única línea longitudinal continua.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Catálogo oficial de marcas viales M-2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 220,
            topic = "Señalización",
            subtopic = "Continua y discontinua",
            text = "Si una línea continua está adosada a una discontinua, el conductor debe tener en cuenta...",
            answers = listOf(
                "la línea situada en el lado por el que circula.",
                "siempre la línea continua, esté donde esté.",
                "únicamente la línea del lado contrario."
            ),
            correctAnswer = 0,
            explanation = "En una marca formada por una línea continua y otra discontinua adosadas debe atenderse a la línea situada en el lado por el que se circula.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Catálogo oficial de marcas viales M-3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 221,
            topic = "Señalización",
            subtopic = "Marcas transversales",
            text = "Una línea transversal continua asociada a un STOP o semáforo indica...",
            answers = listOf(
                "la línea de detención que no debe franquearse cuando exista obligación de detenerse.",
                "una zona de estacionamiento.",
                "un carril de aceleración."
            ),
            correctAnswer = 0,
            explanation = "La marca transversal continua M-4.1 establece el lugar de detención cuando así lo exige la señalización correspondiente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Marca vial M-4.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 222,
            topic = "Señalización",
            subtopic = "Marcas transversales",
            text = "Una línea transversal discontinua asociada a un Ceda el paso indica...",
            answers = listOf(
                "el lugar que no debe franquearse cuando sea necesario ceder el paso.",
                "una obligación de estacionar.",
                "un paso a nivel sin protección."
            ),
            correctAnswer = 0,
            explanation = "La línea transversal discontinua M-4.2 indica la posición relacionada con la obligación de ceder el paso.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Marca vial M-4.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 223,
            topic = "Señalización",
            subtopic = "Marcas amarillas",
            text = "Una línea amarilla discontinua junto al borde de la calzada indica, como norma general...",
            answers = listOf(
                "prohibición de estacionamiento.",
                "prohibición únicamente de circular.",
                "estacionamiento obligatorio."
            ),
            correctAnswer = 0,
            explanation = "La marca amarilla longitudinal discontinua M-7.7 indica prohibición de estacionar a lo largo de su longitud.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Marca vial M-7.7",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 224,
            topic = "Señalización",
            subtopic = "Marcas amarillas",
            text = "Una línea amarilla continua junto al borde de la calzada indica...",
            answers = listOf(
                "prohibición de parar y estacionar.",
                "únicamente prohibición de adelantar.",
                "zona de estacionamiento gratuito."
            ),
            correctAnswer = 0,
            explanation = "La marca amarilla longitudinal continua M-7.8 prohíbe tanto la parada como el estacionamiento a lo largo del tramo.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Marca vial M-7.8",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 225,
            topic = "Señalización",
            subtopic = "Zigzag amarillo",
            text = "Una marca amarilla en zigzag indica normalmente...",
            answers = listOf(
                "una zona donde el estacionamiento está prohibido por estar reservada a un uso especial.",
                "un carril de adelantamiento.",
                "una zona donde el estacionamiento es libre."
            ),
            correctAnswer = 0,
            explanation = "El zigzag amarillo M-7.9 reserva la zona para determinados usos, como paradas de autobús o carga y descarga, y prohíbe el estacionamiento general.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Marca vial M-7.9",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
