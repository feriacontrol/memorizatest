package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtQuestions264 {

    val questions = listOf(

        TestQuestion(
            id = 370,
            topic = "Maniobras",
            subtopic = "Carril de deceleración",
            text = "¿Cuál es la función de un carril de deceleración?",
            answers = listOf(
                "Permitir que circulen por él los vehículos lentos.",
                "Permitir adelantar por la derecha.",
                "Permitir reducir la velocidad al abandonar una vía."
            ),
            correctAnswer = 2,
            explanation = "El carril de deceleración permite abandonar la vía principal reduciendo progresivamente la velocidad sin entorpecer la circulación.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 264, diciembre 2022, pregunta 2",
            legalReference = "DGT - Carriles de deceleración",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 371,
            topic = "Alumbrado",
            subtopic = "Luz de carretera",
            text = "En una vía interurbana insuficientemente iluminada, si un turismo circula a menos de 40 km/h, ¿puede utilizar únicamente las luces de posición y cruce?",
            answers = listOf(
                "Sí, aunque puede utilizar la luz de carretera cuando no deslumbre.",
                "No, la luz de carretera es siempre obligatoria.",
                "Solo si se encuentra en una travesía."
            ),
            correctAnswer = 0,
            explanation = "La obligación específica de utilizar la luz de carretera en estas condiciones se establece para vehículos que circulan a más de 40 km/h, siempre que no proceda utilizar la de cruce.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 264, diciembre 2022, pregunta 3",
            legalReference = "Reglamento General de Circulación, artículo 100",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 372,
            topic = "Señalización",
            subtopic = "Marcas viales",
            text = "¿Qué indica en la calzada un damero formado por marcas blancas y rojas?",
            answers = listOf(
                "Una zona destinada a competiciones.",
                "Una zona exclusiva para estacionar vehículos pesados.",
                "El comienzo de una zona de frenado de emergencia que no puede utilizarse para parar o estacionar."
            ),
            correctAnswer = 2,
            explanation = "El damero blanco y rojo señala el inicio de una zona de frenado de emergencia y prohíbe utilizar esa parte de la calzada para otros fines.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 264, diciembre 2022, pregunta 4",
            legalReference = "Reglamento General de Circulación - marcas de otros colores",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 373,
            topic = "Señalización",
            subtopic = "Agentes",
            text = "Un agente circula en un vehículo portando una bandera verde. ¿Qué indica?",
            answers = listOf(
                "Que la calzada queda nuevamente abierta al tráfico a partir de su paso.",
                "Que la circulación está prohibida a partir de ese punto.",
                "Que todos los vehículos deben detenerse."
            ),
            correctAnswer = 0,
            explanation = "La bandera verde utilizada desde un vehículo por un agente indica que, a partir de su paso, la calzada vuelve a quedar abierta al tráfico.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 264, diciembre 2022, pregunta 6",
            legalReference = "Reglamento General de Circulación - señales desde vehículos",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 374,
            topic = "Carga y equipaje",
            subtopic = "Señal V-20",
            text = "Cuando una carga sobresale por la parte trasera de un vehículo en los supuestos permitidos, ¿debe señalizarse?",
            answers = listOf(
                "Sí, mediante la señal V-20 correspondiente.",
                "No, si se trata de un turismo.",
                "Solo durante la noche."
            ),
            correctAnswer = 0,
            explanation = "La carga que sobresale por detrás en los supuestos reglamentariamente permitidos debe señalizarse mediante la señal V-20.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 264, diciembre 2022, pregunta 8",
            legalReference = "Reglamento General de Circulación, artículo 15.6",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 375,
            topic = "Distracciones",
            subtopic = "Equipo de sonido",
            text = "Manipular la radio o el reproductor de música mientras se conduce, ¿puede aumentar el riesgo de accidente?",
            answers = listOf(
                "Sí, porque puede distraer al conductor.",
                "No.",
                "Solo cuando el vehículo circula por autopista."
            ),
            correctAnswer = 0,
            explanation = "Apartar la atención de la circulación para manipular un dispositivo puede aumentar el tiempo de reacción y el riesgo de accidente.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 264, diciembre 2022, pregunta 9",
            legalReference = "DGT - Distracciones",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 376,
            topic = "Adelantamientos",
            subtopic = "Varios vehículos",
            text = "En una carretera de doble sentido con un carril por sentido, ¿puede adelantarse a varios vehículos en una misma maniobra?",
            answers = listOf(
                "No, nunca.",
                "Sí, si existe seguridad de poder regresar a la derecha sin poner en peligro a los vehículos adelantados si aparece tráfico de frente.",
                "Sí, pero únicamente si todos los vehículos adelantados son pesados."
            ),
            correctAnswer = 1,
            explanation = "Puede adelantarse a varios vehículos siempre que exista total seguridad de poder regresar al lado derecho sin causar peligro si aparece un vehículo en sentido contrario.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 264, diciembre 2022, pregunta 14",
            legalReference = "Reglamento General de Circulación, artículo 84",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.HARD
        ),

        TestQuestion(
            id = 377,
            topic = "Alcohol y drogas",
            subtopic = "Pruebas de alcoholemia",
            text = "¿Puede un peatón estar obligado a someterse a una prueba de alcoholemia?",
            answers = listOf(
                "Sí, si está implicado directamente como posible responsable en un accidente.",
                "Sí, en cualquier control preventivo de alcoholemia.",
                "No, porque las pruebas solo pueden hacerse a conductores."
            ),
            correctAnswer = 0,
            explanation = "Los demás usuarios de la vía, incluidos los peatones, pueden estar obligados a someterse a la prueba cuando estén implicados en un accidente en los supuestos establecidos por la normativa.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 264, diciembre 2022, pregunta 15",
            legalReference = "Reglamento General de Circulación, artículo 21",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
