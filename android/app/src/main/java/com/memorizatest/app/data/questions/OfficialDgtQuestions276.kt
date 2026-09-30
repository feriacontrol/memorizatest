package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions276 {

    val questions = listOf(

        TestQuestion(
            id = 274,
            topic = "Mecánica y mantenimiento",
            subtopic = "Retrovisores",
            text = "Si el retrovisor exterior izquierdo de un turismo está roto, ¿puede seguir circulando si el conductor no puede ver correctamente la circulación por detrás?",
            answers = listOf(
                "Sí, si dispone de retrovisor interior.",
                "No.",
                "Sí, únicamente de día."
            ),
            correctAnswer = 1,
            explanation = "El conductor debe disponer de la visibilidad posterior reglamentaria necesaria para circular con seguridad.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 276, diciembre 2025, pregunta 1",
            legalReference = "DGT - Test 276",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 275,
            topic = "Fatiga y sueño",
            subtopic = "Microsueño",
            text = "¿Qué se entiende por microsueño durante la conducción?",
            answers = listOf(
                "Un breve periodo en el que el conductor queda dormido sin darse cuenta.",
                "Una pausa voluntaria para descansar.",
                "Un sueño profundo de varios minutos."
            ),
            correctAnswer = 0,
            explanation = "Un microsueño es un episodio muy breve de sueño involuntario que puede aparecer sin que el conductor sea consciente de ello.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 276, diciembre 2025, pregunta 2",
            legalReference = "DGT - Microsueños",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 276,
            topic = "Distracciones",
            subtopic = "Teléfono móvil",
            text = "En una retención con el vehículo detenido, ¿puede utilizarse el teléfono móvil sujetándolo con la mano?",
            answers = listOf(
                "Sí, porque el vehículo está detenido.",
                "No; únicamente puede utilizarse en las condiciones legalmente permitidas, como mediante manos libres sin auriculares.",
                "Sí, pero solo en vías urbanas."
            ),
            correctAnswer = 1,
            explanation = "Que el vehículo esté momentáneamente detenido en una retención no autoriza a utilizar el móvil sujetándolo con la mano.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 276, diciembre 2025, pregunta 3",
            legalReference = "DGT - Uso del teléfono móvil",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 277,
            topic = "Alumbrado",
            subtopic = "Niebla",
            text = "Entre el ocaso y la salida del sol, ¿puede utilizarse la luz de carretera cuando hay niebla?",
            answers = listOf(
                "Sí, siempre que no se deslumbre a otros usuarios.",
                "No, está siempre prohibido.",
                "Solo en carreteras de un carril por sentido."
            ),
            correctAnswer = 0,
            explanation = "La luz de carretera puede utilizarse cuando proceda, siempre evitando producir deslumbramiento a otros usuarios.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 276, diciembre 2025, pregunta 5",
            legalReference = "DGT - Alumbrado",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 278,
            topic = "Motocicletas",
            subtopic = "Casco",
            text = "Si una motocicleta figura en su ficha técnica con estructura de autoprotección y cinturón de seguridad, ¿puede su conductor estar exento de utilizar casco?",
            answers = listOf(
                "Sí, cuando se cumplen las condiciones reglamentarias del vehículo.",
                "No, nunca.",
                "Solo en vías urbanas."
            ),
            correctAnswer = 0,
            explanation = "Determinadas motocicletas dotadas reglamentariamente de estructura de autoprotección y cinturón pueden estar exceptuadas del uso del casco.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 276, diciembre 2025, pregunta 7",
            legalReference = "DGT - Uso del casco",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.HARD
        ),

        TestQuestion(
            id = 279,
            topic = "Peatones",
            subtopic = "Vías interurbanas",
            text = "Fuera de poblado, si no existe zona peatonal ni arcén practicable, ¿puede un peatón circular por la calzada?",
            answers = listOf(
                "Sí, adoptando las debidas precauciones.",
                "No, en ningún caso.",
                "Solo si empuja una bicicleta."
            ),
            correctAnswer = 0,
            explanation = "Cuando no existe zona peatonal ni arcén practicable, el peatón puede verse obligado a utilizar la calzada extremando las precauciones.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 276, diciembre 2025, pregunta 10",
            legalReference = "DGT - Circulación de peatones",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 280,
            topic = "Peatones",
            subtopic = "Personas mayores",
            text = "¿Qué dificultad pueden presentar algunas personas mayores como peatones?",
            answers = listOf(
                "Pueden tener dificultades para apreciar correctamente la velocidad de los vehículos que se aproximan.",
                "Siempre calculan mejor las distancias.",
                "Tienen mayor rapidez de reacción."
            ),
            correctAnswer = 0,
            explanation = "El deterioro de determinadas capacidades puede dificultar la valoración de velocidades y distancias de los vehículos que se aproximan.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 276, diciembre 2025, pregunta 11",
            legalReference = "DGT - Seguridad de las personas mayores",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 281,
            topic = "Ciclistas",
            subtopic = "Proximidad de vías ciclistas",
            text = "Al aproximarse a una vía destinada exclusivamente a ciclos, ¿qué debe hacer el conductor?",
            answers = listOf(
                "Moderar la velocidad y detenerse si fuera necesario.",
                "Mantener la velocidad mientras haga sonar el claxon.",
                "Aumentar la velocidad para abandonar antes la zona."
            ),
            correctAnswer = 0,
            explanation = "En las proximidades de vías destinadas a ciclos debe extremarse la precaución, moderar la velocidad y detenerse cuando resulte necesario.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 276, diciembre 2025, pregunta 13",
            legalReference = "DGT - Usuarios vulnerables",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 282,
            topic = "Circulación",
            subtopic = "Carril VAO",
            text = "Un turismo con distintivo ambiental ECO y ocupado únicamente por su conductor, ¿puede utilizar un carril VAO por el mero hecho de tener ese distintivo?",
            answers = listOf(
                "Sí, siempre.",
                "No; solo cuando la regulación o los paneles de mensaje variable autoricen expresamente su acceso.",
                "Sí, si lleva el distintivo pegado en el parabrisas."
            ),
            correctAnswer = 1,
            explanation = "La clasificación ECO no concede por sí sola acceso permanente a un carril VAO; deben cumplirse las condiciones de utilización vigentes en ese momento.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 276, diciembre 2025, pregunta 15",
            legalReference = "DGT - Carriles VAO",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
