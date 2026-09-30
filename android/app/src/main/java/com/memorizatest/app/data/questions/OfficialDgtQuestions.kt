package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions {

    val questions = listOf(

        TestQuestion(
            id = 251,
            topic = "Alcohol y drogas",
            subtopic = "Cannabis",
            text = "¿Cómo puede afectar el consumo de cannabis a un conductor?",
            answers = listOf(
                "Aumentando su atención.",
                "Aumentando su tiempo de reacción.",
                "Reduciendo la somnolencia."
            ),
            correctAnswer = 1,
            explanation = "El cannabis puede aumentar el tiempo de reacción y deteriorar capacidades necesarias para conducir con seguridad.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 2",
            legalReference = "DGT - Cannabis y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 252,
            topic = "Túneles y pasos a nivel",
            subtopic = "Adelantamiento",
            text = "En un túnel con un solo carril para cada sentido, ¿puede adelantarse invadiendo el sentido contrario?",
            answers = listOf(
                "No.",
                "Sí, si no viene nadie.",
                "Sí, únicamente a motocicletas."
            ),
            correctAnswer = 0,
            explanation = "Con un solo carril para cada sentido no puede realizarse un adelantamiento que invada el sentido contrario dentro del túnel.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 3",
            legalReference = "Reglamento General de Circulación, artículo 95.6",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 253,
            topic = "Mecánica y mantenimiento",
            subtopic = "Rueda de emergencia",
            text = "Si utiliza una rueda de repuesto de uso temporal, ¿qué debe respetar?",
            answers = listOf(
                "Las indicaciones del fabricante de la rueda.",
                "Las mismas condiciones que una rueda normal en todos los casos.",
                "Una presión elegida libremente por el conductor."
            ),
            correctAnswer = 0,
            explanation = "Las ruedas temporales o de emergencia tienen condiciones específicas de utilización indicadas por su fabricante.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 4",
            legalReference = "DGT - Rueda de repuesto temporal",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 254,
            topic = "Fatiga y sueño",
            subtopic = "Factores",
            text = "¿Afectan por igual a todas las personas factores como dormir poco, los sedantes o una conducción monótona?",
            answers = listOf(
                "Sí.",
                "No, pueden afectar de manera diferente a cada persona.",
                "Solo afectan a quien conduce de noche."
            ),
            correctAnswer = 1,
            explanation = "La influencia de estos factores varía entre personas y puede aumentar el riesgo de somnolencia.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 6",
            legalReference = "DGT - Somnolencia y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 255,
            topic = "Circulación",
            subtopic = "Carriles urbanos",
            text = "En una vía urbana, después de elegir el carril que mejor conviene al destino, ¿puede abandonarlo?",
            answers = listOf(
                "Sí, para determinadas maniobras como girar, adelantar, parar o estacionar.",
                "No, nunca.",
                "Solo para girar."
            ),
            correctAnswer = 0,
            explanation = "En las condiciones previstas puede abandonarse para prepararse a cambiar de dirección, adelantar, parar o estacionar.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 7",
            legalReference = "Reglamento General de Circulación, artículo 33",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 256,
            topic = "Señalización",
            subtopic = "Señales acústicas",
            text = "En una vía urbana, ¿debe utilizarse el claxon para anunciar normalmente un adelantamiento?",
            answers = listOf(
                "Sí, siempre.",
                "Sí, excepto cerca de hospitales.",
                "No."
            ),
            correctAnswer = 2,
            explanation = "El claxon no debe utilizarse normalmente en poblado para anunciar un adelantamiento.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 8",
            legalReference = "DGT - Señales acústicas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 257,
            topic = "Alumbrado",
            subtopic = "Deslumbramiento",
            text = "Con las luces de carretera encendidas, se aproxima por detrás a otro vehículo. ¿Debe pasar a luz de cruce si puede deslumbrarlo por los retrovisores?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si no piensa adelantar."
            ),
            correctAnswer = 0,
            explanation = "La luz de carretera debe sustituirse por la de cruce cuando pueda producir deslumbramiento, incluso a través de los retrovisores.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 9",
            legalReference = "Reglamento General de Circulación, artículo 102",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 258,
            topic = "Adelantamientos",
            subtopic = "Desistimiento",
            text = "Si después de iniciar un adelantamiento resulta difícil terminarlo con seguridad, ¿qué debe hacer?",
            answers = listOf(
                "Regresar a su carril con seguridad.",
                "Acelerar obligatoriamente hasta finalizarlo.",
                "Obligar al vehículo adelantado a circular por el arcén."
            ),
            correctAnswer = 0,
            explanation = "Cuando aparecen circunstancias que dificultan terminar la maniobra con seguridad debe desistirse y regresar al carril propio.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 10",
            legalReference = "Reglamento General de Circulación, artículo 85.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 259,
            topic = "Peatones",
            subtopic = "Pasos para peatones",
            text = "¿Qué conducta de los conductores supone un riesgo especialmente importante para los peatones?",
            answers = listOf(
                "No respetar su prioridad en los pasos para peatones.",
                "Mantener suficiente distancia con otro automóvil.",
                "Reducir la velocidad al acercarse a un paso."
            ),
            correctAnswer = 0,
            explanation = "No respetar la prioridad de los peatones en los pasos señalizados genera un riesgo especialmente grave.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 12",
            legalReference = "DGT - Seguridad de los peatones",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 260,
            topic = "Seguridad",
            subtopic = "Ocupantes",
            text = "¿Quién debe procurar que los pasajeros mantengan una posición adecuada que no interfiera en la seguridad de la conducción?",
            answers = listOf(
                "El conductor.",
                "Únicamente el pasajero delantero.",
                "Solo los pasajeros mayores de edad."
            ),
            correctAnswer = 0,
            explanation = "El conductor debe cuidar de mantener su posición y de que los pasajeros no interfieran en una conducción segura.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 13",
            legalReference = "DGT - Posición de los ocupantes",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 261,
            topic = "Señalización",
            subtopic = "Agentes",
            text = "Si un vehículo policial circula detrás y muestra hacia delante una luz roja destellante, ¿qué debe hacer?",
            answers = listOf(
                "Detenerse y seguir, en su caso, las instrucciones del agente.",
                "Acelerar para dejar libre la vía.",
                "Continuar hasta encontrar un aparcamiento."
            ),
            correctAnswer = 0,
            explanation = "La señal emitida desde el vehículo policial obliga al conductor requerido a detenerse en condiciones de seguridad y atender las instrucciones.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 14",
            legalReference = "DGT - Señales de los agentes",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 262,
            topic = "Conducción segura",
            subtopic = "Deslumbramiento solar",
            text = "¿Puede ser peligroso conducir con el sol incidiendo directamente sobre los ojos?",
            answers = listOf(
                "Sí, porque puede reducir considerablemente la visión.",
                "No, porque aumenta la cantidad de luz.",
                "No si se utilizan las luces de carretera."
            ),
            correctAnswer = 0,
            explanation = "El sol directo puede producir deslumbramiento y dificultar la percepción de vehículos, peatones, señales y otros elementos.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 278, junio 2026, pregunta 15",
            legalReference = "DGT - Deslumbramiento por el sol",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
