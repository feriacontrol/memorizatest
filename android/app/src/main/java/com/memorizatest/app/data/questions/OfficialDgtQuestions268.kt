package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions268 {

    val questions = listOf(

        TestQuestion(
            id = 336,
            topic = "Conducción segura",
            subtopic = "Tiempo de reacción",
            text = "En una misma situación de tráfico, ¿puede variar el tiempo de reacción según el estado psicofísico del conductor?",
            answers = listOf(
                "Sí.",
                "No, siempre es el mismo.",
                "Es idéntico para todos los conductores."
            ),
            correctAnswer = 0,
            explanation = "El tiempo de reacción puede variar según el estado psicofísico, la fatiga, el sueño, el alcohol, determinados medicamentos y otros factores.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 268, diciembre 2023, pregunta 2",
            legalReference = "DGT - Tiempo de reacción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 337,
            topic = "Motocicletas",
            subtopic = "Visibilidad",
            text = "¿Puede influir el color del casco de un motorista en su seguridad?",
            answers = listOf(
                "No.",
                "Sí; los colores claros o brillantes ayudan a hacerlo más visible.",
                "Sí; los colores oscuros protegen mejor en un impacto."
            ),
            correctAnswer = 1,
            explanation = "Los colores claros o llamativos pueden aumentar la visibilidad del motorista para otros usuarios.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 268, diciembre 2023, pregunta 3",
            legalReference = "DGT - Visibilidad de motoristas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 338,
            topic = "Seguridad",
            subtopic = "Puertas",
            text = "Antes de abrir una puerta para bajar del vehículo, ¿qué debe comprobarse?",
            answers = listOf(
                "Que no se ocasiona peligro ni entorpecimiento a otros usuarios.",
                "Que están encendidas las luces de emergencia.",
                "Que se lleva puesto el chaleco reflectante."
            ),
            correctAnswer = 0,
            explanation = "Antes de abrir las puertas o apearse debe comprobarse que la maniobra no supone peligro ni entorpecimiento para otros usuarios.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 268, diciembre 2023, pregunta 5",
            legalReference = "Reglamento General de Circulación, artículo 114",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 339,
            topic = "Medicamentos y conducción",
            subtopic = "Analgésicos",
            text = "Si está tomando analgésicos narcóticos para tratar un dolor intenso, ¿qué recomienda la DGT respecto a la conducción?",
            answers = listOf(
                "Conducir con normalidad.",
                "Conducir únicamente de noche.",
                "No conducir durante el tratamiento."
            ),
            correctAnswer = 2,
            explanation = "Estos medicamentos pueden producir efectos incompatibles con una conducción segura, por lo que debe seguirse la indicación médica y evitar conducir cuando así se advierta.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 268, diciembre 2023, pregunta 7",
            legalReference = "DGT - Medicamentos y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 340,
            topic = "Velocidades",
            subtopic = "Velocidad mínima",
            text = "Salvo causa justificada, ¿cuál es la velocidad mínima de una pick-up en una autovía?",
            answers = listOf(
                "60 km/h.",
                "55 km/h.",
                "70 km/h."
            ),
            correctAnswer = 0,
            explanation = "Como norma general, los vehículos a motor no deben circular en autopistas o autovías a menos de 60 km/h sin causa justificada.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 268, diciembre 2023, pregunta 8",
            legalReference = "Reglamento General de Circulación, artículo 49",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 341,
            topic = "Maniobras",
            subtopic = "Marcha atrás",
            text = "Al circular marcha atrás debe tener especialmente en cuenta que...",
            answers = listOf(
                "nunca puede recorrer más de 10 metros.",
                "pueden aparecer personas por detrás del vehículo.",
                "tiene prioridad sobre los peatones."
            ),
            correctAnswer = 1,
            explanation = "La marcha atrás exige especial precaución por la posibilidad de que existan peatones u otros usuarios detrás del vehículo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 268, diciembre 2023, pregunta 9",
            legalReference = "DGT - Marcha atrás",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 342,
            topic = "Alcohol y drogas",
            subtopic = "Negativa a las pruebas",
            text = "Si un conductor se niega a realizar las pruebas de alcoholemia requeridas legalmente, ¿puede inmovilizarse su vehículo?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si ha ocurrido un accidente."
            ),
            correctAnswer = 0,
            explanation = "La negativa permite la inmovilización del vehículo. Además, negarse a las pruebas legalmente establecidas puede constituir delito.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 268, diciembre 2023, pregunta 10",
            legalReference = "Reglamento General de Circulación, artículo 25; Código Penal, artículo 383",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 343,
            topic = "Motocicletas",
            subtopic = "Carga",
            text = "En una motocicleta de anchura inferior a un metro, ¿cuánto puede sobresalir lateralmente la carga por cada lado de su eje longitudinal?",
            answers = listOf(
                "Hasta 0,25 metros.",
                "Hasta 0,50 metros.",
                "Hasta 1 metro."
            ),
            correctAnswer = 1,
            explanation = "En vehículos de anchura inferior a un metro, la carga puede sobresalir lateralmente como máximo 0,50 metros a cada lado del eje longitudinal.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 268, diciembre 2023, pregunta 11",
            legalReference = "Reglamento General de Circulación, artículo 15.4",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 344,
            topic = "Alumbrado",
            subtopic = "Niebla",
            text = "Si conduce una motocicleta con niebla ligera, además de las luces de posición puede utilizar...",
            answers = listOf(
                "la luz antiniebla delantera, si dispone de ella, o la luz de cruce o carretera cuando proceda.",
                "obligatoriamente la luz antiniebla trasera.",
                "únicamente las luces de emergencia."
            ),
            correctAnswer = 0,
            explanation = "Con visibilidad reducida debe utilizarse la luz antiniebla delantera o la luz de cruce o carretera. La antiniebla trasera se reserva para condiciones especialmente desfavorables.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 268, diciembre 2023, pregunta 12",
            legalReference = "Reglamento General de Circulación, artículo 106",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 345,
            topic = "Distracciones",
            subtopic = "Navegador GPS",
            text = "Buscar una dirección en el navegador GPS mientras se conduce, ¿puede ser peligroso?",
            answers = listOf(
                "No.",
                "Solo si el dispositivo está lejos del conductor.",
                "Sí, porque puede distraer al conductor."
            ),
            correctAnswer = 2,
            explanation = "Manipular o consultar un navegador durante la conducción puede desviar la atención de la vía y aumentar el riesgo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 268, diciembre 2023, pregunta 14",
            legalReference = "DGT - Distracciones",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
