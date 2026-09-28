package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object DocumentationQuestions {

    val questions = listOf(

        TestQuestion(
            id = 151,
            topic = "Documentación",
            subtopic = "Permiso de conducción",
            text = "El conductor de un vehículo debe llevar consigo...",
            answers = listOf(
                "su permiso o licencia de conducción válido y vigente.",
                "únicamente su documento de identidad.",
                "el recibo del último repostaje."
            ),
            correctAnswer = 0,
            explanation = "El conductor debe estar en posesión y llevar consigo el permiso o licencia necesarios para conducir, que deben ser válidos y estar vigentes.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Conductores",
            legalReference = "Artículo 3.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 152,
            topic = "Documentación",
            subtopic = "Documentos del vehículo",
            text = "Entre la documentación reglamentaria de un turismo se encuentran...",
            answers = listOf(
                "el permiso de circulación y la tarjeta de inspección técnica.",
                "únicamente el permiso de conducción.",
                "el contrato de compraventa del vehículo."
            ),
            correctAnswer = 0,
            explanation = "El Reglamento General de Vehículos establece, entre otros, el permiso de circulación y la tarjeta de inspección técnica como documentación del vehículo.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Vehículos",
            legalReference = "Artículo 26",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 153,
            topic = "Permiso B",
            subtopic = "Vehículos autorizados",
            text = "Como norma general, el permiso B autoriza a conducir automóviles cuya masa máxima autorizada no exceda de...",
            answers = listOf(
                "2.500 kg.",
                "3.500 kg.",
                "7.500 kg."
            ),
            correctAnswer = 1,
            explanation = "El permiso B autoriza, con carácter general, a conducir automóviles cuya MMA no exceda de 3.500 kg.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Conductores",
            legalReference = "Artículo 4.2.e",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 154,
            topic = "Permiso B",
            subtopic = "Plazas",
            text = "Además del conductor, ¿para cuántos pasajeros como máximo puede estar diseñado un automóvil conducido con el permiso B, según la regla general?",
            answers = listOf(
                "5 pasajeros.",
                "8 pasajeros.",
                "12 pasajeros."
            ),
            correctAnswer = 1,
            explanation = "El permiso B autoriza automóviles diseñados y construidos para transportar no más de ocho pasajeros además del conductor.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Conductores",
            legalReference = "Artículo 4.2.e",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 155,
            topic = "Permiso B",
            subtopic = "Remolques",
            text = "Un automóvil autorizado por el permiso B puede llevar enganchado, con carácter general, un remolque cuya MMA no exceda de...",
            answers = listOf(
                "500 kg.",
                "750 kg.",
                "1.500 kg."
            ),
            correctAnswer = 1,
            explanation = "El permiso B permite llevar enganchado un remolque de hasta 750 kg de MMA dentro de sus condiciones generales.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Conductores",
            legalReference = "Artículo 4.2.e",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 156,
            topic = "Permiso B",
            subtopic = "Edad mínima",
            text = "¿Cuál es la edad mínima ordinaria para obtener el permiso de conducción B?",
            answers = listOf(
                "16 años.",
                "17 años.",
                "18 años."
            ),
            correctAnswer = 2,
            explanation = "La edad mínima para obtener el permiso B es de 18 años cumplidos.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Conductores",
            legalReference = "Artículo 4.2.e",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 157,
            topic = "Permiso B",
            subtopic = "Vigencia",
            text = "Como norma general, ¿qué vigencia tiene el permiso B mientras su titular no haya cumplido 65 años?",
            answers = listOf(
                "5 años.",
                "10 años.",
                "15 años."
            ),
            correctAnswer = 1,
            explanation = "El permiso B tiene una vigencia ordinaria de diez años mientras su titular no haya cumplido 65 años.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Conductores",
            legalReference = "Artículo 12.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 158,
            topic = "Permiso B",
            subtopic = "Vigencia",
            text = "A partir de los 65 años, ¿cuál es la vigencia ordinaria máxima del permiso B?",
            answers = listOf(
                "3 años.",
                "5 años.",
                "10 años."
            ),
            correctAnswer = 1,
            explanation = "A partir de los 65 años, el periodo ordinario de vigencia del permiso B es de cinco años.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Conductores",
            legalReference = "Artículo 12.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 159,
            topic = "Permiso B",
            subtopic = "Caducidad",
            text = "Un permiso de conducción cuya vigencia ha vencido...",
            answers = listOf(
                "sigue autorizando a conducir durante un mes.",
                "no autoriza a conducir.",
                "solo permite conducir en vías urbanas."
            ),
            correctAnswer = 1,
            explanation = "Un permiso o licencia cuya vigencia haya vencido no autoriza a su titular a conducir.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Conductores",
            legalReference = "Artículo 12.4",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 160,
            topic = "ITV",
            subtopic = "Turismos nuevos",
            text = "Un turismo particular de hasta 4 años de antigüedad, como norma general, está respecto a la ITV periódica...",
            answers = listOf(
                "exento.",
                "obligado a pasarla cada año.",
                "obligado a pasarla cada seis meses."
            ),
            correctAnswer = 0,
            explanation = "Los turismos de categoría M1 están exentos de inspección periódica hasta los cuatro años.",
            sourceType = QuestionSourceType.BOE,
            reference = "Real Decreto 920/2017 sobre ITV",
            legalReference = "Artículo 6.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 161,
            topic = "ITV",
            subtopic = "Periodicidad",
            text = "Un turismo particular de más de 4 años y hasta 10 años de antigüedad debe pasar normalmente la ITV...",
            answers = listOf(
                "cada seis meses.",
                "cada año.",
                "cada dos años."
            ),
            correctAnswer = 2,
            explanation = "Para los turismos M1 de más de cuatro años y hasta diez años, la inspección periódica es bienal.",
            sourceType = QuestionSourceType.BOE,
            reference = "Real Decreto 920/2017 sobre ITV",
            legalReference = "Artículo 6.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 162,
            topic = "ITV",
            subtopic = "Periodicidad",
            text = "Un turismo particular de más de 10 años debe pasar normalmente la ITV...",
            answers = listOf(
                "cada año.",
                "cada dos años.",
                "cada tres años."
            ),
            correctAnswer = 0,
            explanation = "Los turismos M1 de más de diez años deben someterse a inspección periódica anual.",
            sourceType = QuestionSourceType.BOE,
            reference = "Real Decreto 920/2017 sobre ITV",
            legalReference = "Artículo 6.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 163,
            topic = "ITV",
            subtopic = "Fecha de inspección",
            text = "Si se pasa favorablemente la ITV dentro de los 30 días naturales anteriores a su fecha de caducidad, la nueva validez se calcula...",
            answers = listOf(
                "desde la fecha de caducidad anterior.",
                "siempre desde el día de la inspección.",
                "desde el primer día del año siguiente."
            ),
            correctAnswer = 0,
            explanation = "Cuando la ITV se realiza dentro de los 30 días naturales anteriores a su vencimiento, la nueva validez se calcula tomando como referencia la fecha de expiración anterior.",
            sourceType = QuestionSourceType.BOE,
            reference = "Real Decreto 920/2017 sobre ITV",
            legalReference = "Artículo 6.5",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
