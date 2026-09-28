package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtQuestions266 {

    val questions = listOf(

        TestQuestion(
            id = 355,
            topic = "Mecánica y mantenimiento",
            subtopic = "Repuestos",
            text = "¿Es imprescindible que todos los turismos lleven una rueda de repuesto?",
            answers = listOf(
                "No, puede sustituirse por un sistema alternativo autorizado que permita continuar la marcha.",
                "Sí, siempre.",
                "Solo en autopistas y autovías."
            ),
            correctAnswer = 0,
            explanation = "Puede utilizarse un sistema alternativo autorizado para garantizar la movilidad del vehículo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 266, junio 2023, pregunta 1",
            legalReference = "DGT - Repuestos del vehículo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 356,
            topic = "Distracciones",
            subtopic = "Auriculares",
            text = "Como norma general, ¿puede conducirse llevando auriculares conectados a un teléfono?",
            answers = listOf(
                "Sí, si son inalámbricos.",
                "No.",
                "Sí, cuando el volumen sea bajo."
            ),
            correctAnswer = 1,
            explanation = "Como norma general está prohibido conducir utilizando cascos o auriculares conectados a aparatos de sonido.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 266, junio 2023, pregunta 2",
            legalReference = "Reglamento General de Circulación, artículo 18",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 357,
            topic = "Fatiga y sueño",
            subtopic = "Somnolencia",
            text = "¿Pueden producirse durante el día accidentes relacionados principalmente con el sueño?",
            answers = listOf(
                "Sí.",
                "No, únicamente suceden de noche.",
                "Solo les ocurre a conductores profesionales."
            ),
            correctAnswer = 0,
            explanation = "La somnolencia también puede aparecer durante el día, especialmente en determinadas franjas horarias.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 266, junio 2023, pregunta 3",
            legalReference = "DGT - Sueño y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 358,
            topic = "Alcohol y drogas",
            subtopic = "Absorción del alcohol",
            text = "Tomar alcohol después de haber comido, ¿elimina su efecto sobre la conducción?",
            answers = listOf(
                "Sí.",
                "No; puede absorberse más lentamente, pero continúa existiendo riesgo.",
                "Sí, siempre que la comida sea abundante."
            ),
            correctAnswer = 1,
            explanation = "Tener el estómago lleno puede ralentizar la absorción, pero no elimina los efectos ni el riesgo del alcohol.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 266, junio 2023, pregunta 7",
            legalReference = "DGT - Alcohol y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 359,
            topic = "Seguridad",
            subtopic = "Reposacabezas",
            text = "Para que el reposacabezas sea eficaz, ¿qué separación conviene mantener respecto a la cabeza?",
            answers = listOf(
                "La mínima posible y no superior aproximadamente a 4 cm.",
                "Más de 10 cm.",
                "Cuanta más separación, mejor."
            ),
            correctAnswer = 0,
            explanation = "Una separación pequeña ayuda al reposacabezas a limitar el movimiento de la cabeza en una colisión.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 266, junio 2023, pregunta 8",
            legalReference = "DGT - Reposacabezas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 360,
            topic = "Estacionamiento",
            subtopic = "Vías interurbanas",
            text = "En una carretera interurbana de doble sentido, ¿dónde debe realizarse normalmente una parada?",
            answers = listOf(
                "Fuera de la calzada, en el lado derecho y dejando libre la parte transitable del arcén.",
                "En cualquiera de los dos lados.",
                "Sobre el arcén derecho."
            ),
            correctAnswer = 0,
            explanation = "En vías interurbanas debe realizarse fuera de la calzada, en el lado derecho y sin ocupar la parte transitable del arcén.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 266, junio 2023, pregunta 9",
            legalReference = "Reglamento General de Circulación, artículo 90",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 361,
            topic = "Carga y equipaje",
            subtopic = "Remolques",
            text = "Al transportar carga en un remolque ligero, ¿es importante distribuirla y sujetarla correctamente?",
            answers = listOf(
                "Sí.",
                "No, si el remolque pesa menos de 750 kg.",
                "Solo cuando se circula por autopista."
            ),
            correctAnswer = 0,
            explanation = "Una carga bien repartida y sujeta ayuda a evitar desplazamientos que puedan desestabilizar el conjunto.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 266, junio 2023, pregunta 11",
            legalReference = "DGT - Transporte de carga y remolques",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 362,
            topic = "Conducción segura",
            subtopic = "Alergias",
            text = "Si un conductor padece una alergia respiratoria, ¿es aconsejable circular con las ventanillas abiertas?",
            answers = listOf(
                "Sí, siempre.",
                "No, porque puede aumentar la entrada de polen y otros alérgenos.",
                "Solo cuando circule por ciudad."
            ),
            correctAnswer = 1,
            explanation = "Mantener las ventanillas cerradas puede reducir la entrada de determinados alérgenos al habitáculo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 266, junio 2023, pregunta 12",
            legalReference = "DGT - Alergias y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 363,
            topic = "Mecánica y mantenimiento",
            subtopic = "Alumbrado",
            text = "¿Debe revisarse periódicamente el funcionamiento de las luces del vehículo?",
            answers = listOf(
                "Sí, forma parte del mantenimiento preventivo.",
                "No, únicamente se revisan en la ITV.",
                "Solo si son luces halógenas."
            ),
            correctAnswer = 0,
            explanation = "Comprobar periódicamente el alumbrado ayuda a detectar fallos antes de circular.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 266, junio 2023, pregunta 13",
            legalReference = "DGT - Mantenimiento del alumbrado",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
