package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtQuestions261 {

    val questions = listOf(

        TestQuestion(
            id = 392,
            topic = "Alcohol y drogas",
            subtopic = "Tasa de alcoholemia",
            text = "Después de beber alcohol, ¿tomar café o té es una estrategia eficaz para reducir la tasa de alcoholemia?",
            answers = listOf(
                "No.",
                "Sí.",
                "Solo si el café se toma sin azúcar."
            ),
            correctAnswer = 0,
            explanation = "El café o el té no reducen la cantidad de alcohol presente en la sangre ni aceleran de forma efectiva su eliminación.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 261, marzo 2022, pregunta 4",
            legalReference = "DGT - Alcohol y conducción",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 393,
            topic = "Estacionamiento",
            subtopic = "Vía de sentido único",
            text = "En una vía urbana de sentido único, ¿puede estacionarse tanto en el lado derecho como en el izquierdo, salvo que exista señalización u ordenanza que lo impida?",
            answers = listOf(
                "Sí.",
                "No, únicamente en el lado derecho.",
                "Solo pueden estacionar a la izquierda las motocicletas."
            ),
            correctAnswer = 0,
            explanation = "En una vía urbana de sentido único el vehículo puede situarse también en el lado izquierdo, sin perjuicio de la señalización y de las ordenanzas municipales.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 261, marzo 2022, pregunta 9",
            legalReference = "Reglamento General de Circulación, artículo 90.2",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 394,
            topic = "Alumbrado",
            subtopic = "Salida del sol",
            text = "Si todavía no ha salido el sol pero existe buena visibilidad y circula por una vía interurbana, ¿qué alumbrado debe llevar encendido?",
            answers = listOf(
                "El alumbrado de posición y el de corto alcance.",
                "Ninguno, si existe buena visibilidad.",
                "Únicamente el alumbrado de posición."
            ),
            correctAnswer = 0,
            explanation = "Entre el ocaso y la salida del sol debe utilizarse el alumbrado correspondiente; en este supuesto deben llevarse encendidas las luces de posición y cruce.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 261, marzo 2022, pregunta 10",
            legalReference = "Reglamento General de Circulación, artículo 98",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 395,
            topic = "Señalización",
            subtopic = "Agentes",
            text = "Si desde un vehículo policial un agente le ordena detenerse mediante una luz amarilla intermitente dirigida hacia delante, ¿dónde debe detenerse?",
            answers = listOf(
                "Siempre inmediatamente detrás del vehículo policial.",
                "Donde no genere mayores riesgos ni molestias para los demás usuarios.",
                "Siempre en el lado izquierdo de la calzada."
            ),
            correctAnswer = 1,
            explanation = "La detención debe efectuarse en un lugar en el que no se generen mayores riesgos ni molestias para el resto de usuarios.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 261, marzo 2022, pregunta 13",
            legalReference = "DGT - Señales de los agentes",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 396,
            topic = "Medicamentos y conducción",
            subtopic = "Antihistamínicos",
            text = "Si conduce con frecuencia y necesita antihistamínicos para tratar una alergia respiratoria, ¿qué resulta aconsejable?",
            answers = listOf(
                "Utilizar, siguiendo la indicación sanitaria correspondiente, antihistamínicos que no produzcan somnolencia.",
                "Tomar alcohol para evitar el sueño.",
                "Elegir siempre medicamentos sedantes."
            ),
            correctAnswer = 0,
            explanation = "Algunos antihistamínicos pueden producir somnolencia. La DGT recomienda prestar atención a este efecto y utilizar alternativas no sedantes cuando estén indicadas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 261, marzo 2022, pregunta 14",
            legalReference = "DGT - Medicamentos y conducción",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 397,
            topic = "Documentación",
            subtopic = "Distintivo ambiental",
            text = "¿Qué identifica la señal V-25 o distintivo ambiental colocada en un vehículo?",
            answers = listOf(
                "La clasificación ambiental que tiene el vehículo en el Registro de Vehículos.",
                "La potencia máxima del motor.",
                "La antigüedad exacta del vehículo."
            ),
            correctAnswer = 0,
            explanation = "La señal V-25 identifica la clasificación ambiental del vehículo registrada por la Administración.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 261, marzo 2022, pregunta 15",
            legalReference = "Reglamento General de Vehículos, anexo XI, señal V-25",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
