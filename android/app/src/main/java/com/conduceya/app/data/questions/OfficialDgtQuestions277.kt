package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtQuestions277 {

    val questions = listOf(

        TestQuestion(
            id = 263,
            topic = "Estacionamiento",
            subtopic = "Carril bus",
            text = "¿Puede una motocicleta realizar una parada en un carril reservado para autobuses?",
            answers = listOf(
                "Sí, si no obstaculiza.",
                "No.",
                "Puede parar, pero no estacionar."
            ),
            correctAnswer = 1,
            explanation = "La parada en un carril reservado para autobuses está prohibida salvo que la señalización disponga otra cosa.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 2",
            legalReference = "DGT - Test 277",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 264,
            topic = "Maniobras",
            subtopic = "Marcha atrás",
            text = "¿Puede incorporarse a la circulación desde un estacionamiento utilizando la marcha atrás?",
            answers = listOf(
                "Sí, si no invade un cruce de vías y cumple los límites reglamentarios.",
                "No, nunca.",
                "Sí, sin limitación de distancia."
            ),
            correctAnswer = 0,
            explanation = "La marcha atrás puede utilizarse como maniobra complementaria de incorporación siempre que se respeten sus límites y no se invada un cruce de vías.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 3",
            legalReference = "Reglamento General de Circulación, artículo 80",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 265,
            topic = "Distancia de seguridad",
            subtopic = "Frenado",
            text = "La distancia de frenado depende...",
            answers = listOf(
                "solo de la velocidad.",
                "de varios factores, como velocidad, estado de la vía y del vehículo.",
                "solo del estado del vehículo."
            ),
            correctAnswer = 1,
            explanation = "La distancia de frenado está condicionada por múltiples factores, entre ellos la velocidad, la adherencia y el estado del vehículo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 4",
            legalReference = "DGT - Distancia de frenado",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 266,
            topic = "Seguridad",
            subtopic = "Cinturón de seguridad",
            text = "No utilizar el cinturón de seguridad en un accidente puede aumentar considerablemente el riesgo de fallecer...",
            answers = listOf(
                "solo para el conductor.",
                "solo en los asientos delanteros.",
                "en cualquiera de las plazas del vehículo."
            ),
            correctAnswer = 2,
            explanation = "El cinturón reduce significativamente el riesgo de lesiones graves y muerte para todos los ocupantes.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 5",
            legalReference = "DGT - Cinturón de seguridad",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 267,
            topic = "Emergencias y averías",
            subtopic = "Chaleco reflectante",
            text = "En un turismo, ¿es obligatorio llevar dos chalecos reflectantes, uno para el conductor y otro para un acompañante?",
            answers = listOf(
                "Sí.",
                "No.",
                "Es obligatorio uno por cada plaza."
            ),
            correctAnswer = 1,
            explanation = "No existe obligación general de llevar dos chalecos reflectantes en un turismo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 6",
            legalReference = "DGT - Equipamiento del vehículo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 268,
            topic = "Fatiga y sueño",
            subtopic = "Atención",
            text = "Un trastorno depresivo puede favorecer durante la conducción...",
            answers = listOf(
                "una mayor concentración.",
                "distracciones y somnolencia.",
                "una mejora de los reflejos."
            ),
            correctAnswer = 1,
            explanation = "La DGT señala que determinados trastornos y sus tratamientos pueden relacionarse con distracción o somnolencia y afectar a la conducción.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 9",
            legalReference = "DGT - Salud y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 269,
            topic = "Seguridad",
            subtopic = "Número de plazas",
            text = "En un turismo de nueve plazas incluida la del conductor, ¿pueden viajar nueve pasajeros además del conductor?",
            answers = listOf(
                "Sí.",
                "No, se superaría el número de plazas autorizado.",
                "Sí, si son menores."
            ),
            correctAnswer = 1,
            explanation = "El número máximo de ocupantes no puede superar las plazas autorizadas del vehículo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 11",
            legalReference = "DGT - Número máximo de ocupantes",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 270,
            topic = "Motocicletas",
            subtopic = "Carenado",
            text = "Cambiar el carenado de una motocicleta puede afectar...",
            answers = listOf(
                "solo a su aspecto.",
                "a su aerodinámica y al consumo.",
                "únicamente al color del vehículo."
            ),
            correctAnswer = 1,
            explanation = "El carenado influye en la resistencia aerodinámica de la motocicleta y puede repercutir en su comportamiento y consumo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 12",
            legalReference = "DGT - Motocicletas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 271,
            topic = "Distracciones",
            subtopic = "Manos libres",
            text = "Hablar por teléfono con un sistema manos libres mientras se conduce...",
            answers = listOf(
                "elimina totalmente el riesgo.",
                "puede disminuir la atención y aumentar el riesgo de accidente.",
                "solo es peligroso después de cinco minutos."
            ),
            correctAnswer = 1,
            explanation = "Aunque no sea necesario sujetar el teléfono, la conversación puede reducir la atención destinada a la conducción.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 13",
            legalReference = "DGT - Distracciones al volante",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 272,
            topic = "Conducción segura",
            subtopic = "Factores de riesgo",
            text = "¿Qué factor interviene en el mayor número de accidentes de tráfico?",
            answers = listOf(
                "El factor humano.",
                "La vía exclusivamente.",
                "El vehículo exclusivamente."
            ),
            correctAnswer = 0,
            explanation = "La DGT identifica el factor humano como el principal factor presente en la siniestralidad vial.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 14",
            legalReference = "DGT - Factores de riesgo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 273,
            topic = "Tipos de vía",
            subtopic = "Travesía",
            text = "Como norma general, ¿cómo se denomina el tramo de una carretera que discurre por poblado?",
            answers = listOf(
                "Autovía.",
                "Travesía.",
                "Vía para automóviles."
            ),
            correctAnswer = 1,
            explanation = "Se denomina travesía al tramo de carretera que discurre por poblado en los términos establecidos por la normativa.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 277, marzo 2026, pregunta 15",
            legalReference = "DGT - Definiciones de vías",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
