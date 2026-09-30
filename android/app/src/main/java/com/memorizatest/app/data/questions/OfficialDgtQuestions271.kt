package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions271 {

    val questions = listOf(

        TestQuestion(
            id = 318,
            topic = "Fatiga y sueño",
            subtopic = "Velocidad",
            text = "Conducir durante mucho tiempo a una velocidad elevada...",
            answers = listOf(
                "retrasa la aparición de la fatiga.",
                "acelera la aparición de la fatiga y puede aumentar la agresividad.",
                "reduce el nivel de tensión del conductor."
            ),
            correctAnswer = 1,
            explanation = "Mantener velocidades elevadas durante mucho tiempo incrementa la exigencia de la conducción, favoreciendo la fatiga y conductas más agresivas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 271, octubre 2024, pregunta 4",
            legalReference = "DGT - Fatiga y velocidad",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 319,
            topic = "Medicamentos y conducción",
            subtopic = "Efectos secundarios",
            text = "¿Pueden factores como la edad, la fatiga o el estado físico hacer que los efectos secundarios de un medicamento sean diferentes según la persona?",
            answers = listOf(
                "Sí.",
                "No, son iguales para todo el mundo.",
                "Solo si se toma el medicamento con alimentos."
            ),
            correctAnswer = 0,
            explanation = "Los efectos de un medicamento pueden variar según las características y el estado de cada persona.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 271, octubre 2024, pregunta 5",
            legalReference = "DGT - Medicamentos y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 320,
            topic = "Distracciones",
            subtopic = "Navegador GPS",
            text = "Si las indicaciones de un navegador GPS contradicen la señalización de la vía, ¿qué debe prevalecer?",
            answers = listOf(
                "Las indicaciones del navegador.",
                "El criterio del conductor respetando la señalización de la vía.",
                "La ruta más corta."
            ),
            correctAnswer = 1,
            explanation = "El navegador es únicamente una ayuda. El conductor debe respetar siempre la señalización y decidir conforme a las condiciones reales de circulación.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 271, octubre 2024, pregunta 6",
            legalReference = "DGT - Navegadores y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 321,
            topic = "Velocidades",
            subtopic = "Autopistas urbanas",
            text = "En una autopista o autovía que transcurre dentro de poblado, si no existe señalización específica, ¿cuál es el límite genérico?",
            answers = listOf(
                "50 km/h.",
                "80 km/h.",
                "120 km/h."
            ),
            correctAnswer = 1,
            explanation = "El límite genérico en autopistas y autovías que transcurren dentro de poblado es de 80 km/h, salvo señalización específica.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 271, octubre 2024, pregunta 8",
            legalReference = "Reglamento General de Circulación, artículo 50.6",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 322,
            topic = "Alumbrado",
            subtopic = "Visibilidad reducida",
            text = "En una vía interurbana, si por lluvia intensa no puede distinguirse un vehículo oscuro a 50 metros, ¿se considera la vía insuficientemente iluminada?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si además existe niebla."
            ),
            correctAnswer = 0,
            explanation = "Se considera insuficientemente iluminada una vía cuando no puede distinguirse un vehículo oscuro a 50 metros, entre otros criterios reglamentarios.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 271, octubre 2024, pregunta 10",
            legalReference = "Reglamento General de Circulación, artículo 100.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 323,
            topic = "Señalización",
            subtopic = "Agentes",
            text = "Si un agente balancea una luz roja o amarilla hacia usted, ¿qué debe hacer?",
            answers = listOf(
                "Reducir ligeramente la velocidad.",
                "Detenerse.",
                "Continuar con precaución."
            ),
            correctAnswer = 1,
            explanation = "El balanceo de una luz roja o amarilla por un agente obliga a detenerse a los usuarios hacia los que dirige la luz.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 271, octubre 2024, pregunta 12",
            legalReference = "Reglamento General de Circulación - Señales de los agentes",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 324,
            topic = "Circulación",
            subtopic = "Carril reversible",
            text = "¿Cómo se delimita un carril reversible?",
            answers = listOf(
                "Mediante líneas continuas simples.",
                "Mediante marcas dobles discontinuas a ambos lados.",
                "Mediante una única línea amarilla."
            ),
            correctAnswer = 1,
            explanation = "Los carriles reversibles se delimitan por ambos lados mediante marcas longitudinales dobles discontinuas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 271, octubre 2024, pregunta 13",
            legalReference = "Reglamento General de Circulación, artículo 40",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
