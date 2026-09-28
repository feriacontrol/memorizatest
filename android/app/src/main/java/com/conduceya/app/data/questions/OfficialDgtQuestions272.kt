package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtQuestions272 {

    val questions = listOf(

        TestQuestion(
            id = 312,
            topic = "Alcohol y drogas",
            subtopic = "Pruebas de alcoholemia",
            text = "Si un conductor no supera la tasa máxima permitida, ¿puede un agente realizarle una segunda prueba si presenta síntomas evidentes de haber consumido alcohol?",
            answers = listOf(
                "Sí.",
                "No, nunca.",
                "Solo si ha sufrido un accidente."
            ),
            correctAnswer = 0,
            explanation = "Aunque la primera medición no supere el límite, la normativa prevé una segunda prueba cuando existen síntomas evidentes de influencia del alcohol.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 272, diciembre 2024, pregunta 4",
            legalReference = "Reglamento General de Circulación, artículo 23",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 313,
            topic = "Velocidades",
            subtopic = "Efecto túnel",
            text = "Al aumentar mucho la velocidad puede producirse el llamado efecto túnel. ¿Qué ocurre?",
            answers = listOf(
                "Se reduce la visión lateral y se concentra la atención en el centro.",
                "Aumenta el campo visual lateral.",
                "Mejora la percepción de los objetos situados a los lados."
            ),
            correctAnswer = 0,
            explanation = "A velocidades elevadas disminuye el campo visual útil y el conductor percibe peor lo que sucede en los laterales.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 272, diciembre 2024, pregunta 7",
            legalReference = "DGT - Velocidad y campo visual",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 314,
            topic = "Distracciones",
            subtopic = "Navegador GPS",
            text = "¿Dónde debe colocarse un navegador portátil dentro del vehículo?",
            answers = listOf(
                "En un lugar que no reduzca la visión ni interfiera con el despliegue de los airbags.",
                "Directamente delante de los ojos del conductor.",
                "Sobre el volante."
            ),
            correctAnswer = 0,
            explanation = "La colocación del dispositivo no debe limitar el campo de visión del conductor ni interferir con los sistemas de seguridad.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 272, diciembre 2024, pregunta 8",
            legalReference = "DGT - Dispositivos y distracciones",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 315,
            topic = "Accidentes y primeros auxilios",
            subtopic = "Obligaciones",
            text = "Un conductor implicado en un accidente, ¿debe detenerse?",
            answers = listOf(
                "Sí, procurando no crear un nuevo peligro.",
                "Solo si considera que ha sido culpable.",
                "No, si su vehículo puede continuar circulando."
            ),
            correctAnswer = 0,
            explanation = "Quien se vea implicado en un accidente debe detenerse de manera que no genere un riesgo adicional para la circulación.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 272, diciembre 2024, pregunta 10",
            legalReference = "Reglamento General de Circulación, artículo 129",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 316,
            topic = "Mecánica y mantenimiento",
            subtopic = "Neumáticos",
            text = "Circular con presiones de inflado muy diferentes entre los neumáticos, ¿puede hacer más difícil controlar el vehículo?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo cuando los neumáticos son nuevos."
            ),
            correctAnswer = 0,
            explanation = "Una presión incorrecta o descompensada puede reducir la estabilidad y provocar una frenada menos uniforme.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 272, diciembre 2024, pregunta 11",
            legalReference = "DGT - Neumáticos y presión",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 317,
            topic = "Motocicletas",
            subtopic = "Frenado con pasajero",
            text = "En una motocicleta que transporta un pasajero, ¿qué efecto puede producir el mayor peso sobre la rueda trasera al frenar?",
            answers = listOf(
                "Puede dificultar que la rueda trasera llegue a bloquearse.",
                "Hace imposible utilizar el freno trasero.",
                "Obliga a acelerar durante la frenada."
            ),
            correctAnswer = 0,
            explanation = "El peso adicional sobre la parte trasera aumenta la carga de esa rueda y modifica el comportamiento de la motocicleta durante la frenada.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 272, diciembre 2024, pregunta 12",
            legalReference = "DGT - Motocicletas y frenado",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
