package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object RestraintQuestions {

    val questions = listOf(

        TestQuestion(
            id = 93,
            topic = "Seguridad",
            subtopic = "Cinturón de seguridad",
            text = "En un vehículo equipado con cinturones, ¿deben utilizarlos el conductor y los ocupantes tanto en vías urbanas como interurbanas?",
            answers = listOf(
                "Sí.",
                "Solo en vías interurbanas.",
                "Solo cuando se circula a más de 50 km/h."
            ),
            correctAnswer = 0,
            explanation = "Los cinturones homologados deben utilizarse correctamente abrochados tanto en vías urbanas como interurbanas.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 117.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 94,
            topic = "Seguridad",
            subtopic = "Sistemas de retención infantil",
            text = "Un menor de edad de estatura igual o inferior a 135 cm debe utilizar...",
            answers = listOf(
                "un sistema de retención infantil adecuado.",
                "únicamente el cinturón de adulto en todos los casos.",
                "ningún sistema si viaja en los asientos traseros."
            ),
            correctAnswer = 0,
            explanation = "Los menores de edad de estatura igual o inferior a 135 cm deben utilizar un sistema de retención infantil homologado adecuado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 117.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 95,
            topic = "Seguridad",
            subtopic = "Sistemas de retención infantil",
            text = "En un turismo de hasta nueve plazas, como norma general, un menor de estatura igual o inferior a 135 cm debe viajar...",
            answers = listOf(
                "en los asientos traseros.",
                "siempre en el asiento delantero.",
                "en cualquier asiento sin limitación."
            ),
            correctAnswer = 0,
            explanation = "Como norma general, estos menores deben situarse en los asientos traseros y utilizar un sistema de retención infantil adecuado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 117.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 96,
            topic = "Seguridad",
            subtopic = "Sistemas de retención infantil",
            text = "¿Puede un menor de hasta 135 cm ocupar excepcionalmente el asiento delantero si el vehículo no dispone de asientos traseros?",
            answers = listOf(
                "Sí, utilizando el sistema de retención infantil adecuado.",
                "No, nunca.",
                "Solo a partir de los 12 años."
            ),
            correctAnswer = 0,
            explanation = "La ausencia de asientos traseros es uno de los supuestos excepcionales que permiten al menor ocupar el asiento delantero con el sistema adecuado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 117.3.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 97,
            topic = "Seguridad",
            subtopic = "Sistemas de retención infantil",
            text = "Si todos los asientos traseros ya están ocupados por menores de hasta 135 cm, ¿puede otro menor de esa estatura viajar delante?",
            answers = listOf(
                "Sí, excepcionalmente y con el sistema de retención adecuado.",
                "No, en ningún caso.",
                "Sí, pero sin sistema de retención."
            ),
            correctAnswer = 0,
            explanation = "Cuando todos los asientos traseros están ocupados por menores de este grupo, se permite excepcionalmente ocupar el asiento delantero con el SRI correspondiente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 117.3.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 98,
            topic = "Seguridad",
            subtopic = "Sistemas de retención infantil",
            text = "Si no es posible instalar en los asientos traseros todos los sistemas de retención infantil necesarios, ¿puede uno de los menores viajar delante?",
            answers = listOf(
                "Sí, excepcionalmente, con un sistema adecuado.",
                "No.",
                "Solo si el trayecto es inferior a 10 kilómetros."
            ),
            correctAnswer = 0,
            explanation = "La imposibilidad de instalar todos los SRI en los asientos traseros es otra de las excepciones previstas.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 117.3.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 99,
            topic = "Seguridad",
            subtopic = "Airbag",
            text = "Si un niño viaja delante en un sistema de retención orientado hacia atrás y existe airbag frontal, ¿qué debe hacerse?",
            answers = listOf(
                "Desactivar el airbag frontal.",
                "Mantener siempre activado el airbag.",
                "Abrir parcialmente la ventanilla."
            ),
            correctAnswer = 0,
            explanation = "Un sistema de retención orientado hacia atrás solo puede utilizarse delante cuando el airbag frontal haya sido desactivado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 117.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 100,
            topic = "Seguridad",
            subtopic = "Instalación del SRI",
            text = "¿Cómo debe instalarse un sistema de retención infantil?",
            answers = listOf(
                "Siguiendo las instrucciones del fabricante.",
                "De cualquier forma mientras quede sujeto.",
                "Siempre orientado hacia delante."
            ),
            correctAnswer = 0,
            explanation = "Los sistemas de retención infantil deben instalarse de acuerdo con las instrucciones facilitadas por su fabricante.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 117.4",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
