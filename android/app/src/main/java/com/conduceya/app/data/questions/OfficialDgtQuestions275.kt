package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtQuestions275 {

    val questions = listOf(

        TestQuestion(
            id = 283,
            topic = "Señalización",
            subtopic = "Semáforos",
            text = "Si hay semáforos con indicaciones diferentes a la derecha y a la izquierda, ¿a cuál debe obedecer un conductor que pretende seguir de frente?",
            answers = listOf(
                "Al situado inmediatamente a su izquierda.",
                "Siempre al situado a su derecha.",
                "Al más alejado del vehículo."
            ),
            correctAnswer = 0,
            explanation = "Cuando existen semáforos con indicaciones diferentes a ambos lados, quien continúa de frente debe atender al situado inmediatamente a su izquierda.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 275, octubre 2025, pregunta 1",
            legalReference = "DGT - Semáforos",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 284,
            topic = "Peatones",
            subtopic = "Arcén",
            text = "Al atravesar con un vehículo un arcén por el que circulan peatones sin disponer de zona peatonal, ¿qué debe hacer?",
            answers = listOf(
                "Cederles el paso.",
                "Hacer sonar el claxon para que se aparten.",
                "Continuar porque el vehículo tiene prioridad."
            ),
            correctAnswer = 0,
            explanation = "Debe cederse el paso a los peatones que circulan por el arcén cuando carecen de una zona especialmente reservada para ellos.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 275, octubre 2025, pregunta 3",
            legalReference = "DGT - Prioridad de peatones",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 285,
            topic = "Circulación",
            subtopic = "Carril reversible",
            text = "¿Puede un furgón circular por un carril reversible si ninguna señal se lo prohíbe?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si su MMA no supera los 3.500 kg."
            ),
            correctAnswer = 0,
            explanation = "Un carril reversible puede ser utilizado por los vehículos autorizados a circular por la vía, respetando su señalización y las normas especiales del carril.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 275, octubre 2025, pregunta 5",
            legalReference = "DGT - Carriles reversibles",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 286,
            topic = "Estacionamiento",
            subtopic = "Arcén",
            text = "Como norma general, ¿puede un vehículo parar o estacionar en la parte transitable del arcén de una vía interurbana?",
            answers = listOf(
                "No; están prohibidas ambas maniobras.",
                "Puede parar, pero no estacionar.",
                "Puede realizar ambas."
            ),
            correctAnswer = 0,
            explanation = "En una vía interurbana, la parada y el estacionamiento deben realizarse fuera de la calzada y dejando libre la parte transitable del arcén.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 275, octubre 2025, pregunta 6",
            legalReference = "DGT - Parada y estacionamiento",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 287,
            topic = "Maniobras",
            subtopic = "Marcha atrás",
            text = "Si circulando por una autopista se pasa una salida, ¿puede regresar a ella utilizando la marcha atrás?",
            answers = listOf(
                "No.",
                "Sí, si recorre menos de 15 metros.",
                "Sí, si no se aproxima ningún vehículo."
            ),
            correctAnswer = 0,
            explanation = "La marcha atrás está prohibida en autopistas y autovías, incluso aunque se haya rebasado una salida.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 275, octubre 2025, pregunta 7",
            legalReference = "DGT - Marcha atrás",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 288,
            topic = "Carga y equipaje",
            subtopic = "Visibilidad",
            text = "Si el equipaje impide ver correctamente por el retrovisor interior, ¿puede circular un turismo?",
            answers = listOf(
                "Sí, si dispone de retrovisor exterior a ambos lados y mantiene la visibilidad posterior reglamentaria.",
                "No, en ningún caso.",
                "Solo si circula por vías urbanas."
            ),
            correctAnswer = 0,
            explanation = "Puede circular si dispone de los retrovisores exteriores necesarios y conserva la visibilidad posterior reglamentaria.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 275, octubre 2025, pregunta 8",
            legalReference = "DGT - Visibilidad y retrovisores",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 289,
            topic = "Fatiga y sueño",
            subtopic = "Riesgo",
            text = "En general, un conductor que tiene sueño...",
            answers = listOf(
                "tiende a aceptar un mayor nivel de riesgo.",
                "reacciona más rápidamente.",
                "tiende a aceptar menos riesgo y mejora su atención."
            ),
            correctAnswer = 0,
            explanation = "La somnolencia deteriora la capacidad de conducción y puede hacer que se asuma un nivel de riesgo mayor.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 275, octubre 2025, pregunta 10",
            legalReference = "DGT - Sueño y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 290,
            topic = "Percepción del riesgo",
            subtopic = "Usuarios vulnerables",
            text = "¿Cómo se denomina a los colectivos con mayor probabilidad de sufrir un accidente o consecuencias graves en el tráfico?",
            answers = listOf(
                "Grupos de riesgo o usuarios vulnerables.",
                "Usuarios prioritarios.",
                "Conductores profesionales."
            ),
            correctAnswer = 0,
            explanation = "Determinados colectivos presentan una mayor vulnerabilidad o probabilidad de sufrir consecuencias graves en la circulación.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 275, octubre 2025, pregunta 11",
            legalReference = "DGT - Grupos de riesgo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 291,
            topic = "Carga y equipaje",
            subtopic = "Carga indivisible",
            text = "En un turismo, ¿cuánto puede sobresalir por la parte trasera una carga indivisible?",
            answers = listOf(
                "Hasta el 10 % de la longitud del vehículo.",
                "Hasta el 15 % de la longitud del vehículo.",
                "No puede sobresalir nunca."
            ),
            correctAnswer = 1,
            explanation = "En vehículos no destinados exclusivamente al transporte de mercancías, una carga indivisible puede sobresalir por detrás hasta un 15 % de la longitud del vehículo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 275, octubre 2025, pregunta 12",
            legalReference = "DGT - Transporte de carga",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 292,
            topic = "Distancia de seguridad",
            subtopic = "Retenciones",
            text = "Si queda detenido en un atasco, ¿qué separación es aconsejable mantener con el vehículo de delante?",
            answers = listOf(
                "Aproximadamente dos o tres metros.",
                "Menos de medio metro.",
                "La mínima posible para ocupar menos espacio."
            ),
            correctAnswer = 0,
            explanation = "Una separación aproximada de dos o tres metros ayuda a evitar golpear al vehículo precedente si se produce un alcance por detrás.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 275, octubre 2025, pregunta 14",
            legalReference = "DGT - Distancia en retenciones",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
