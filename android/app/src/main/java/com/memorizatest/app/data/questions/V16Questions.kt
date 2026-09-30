package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object V16Questions {

    val questions = listOf(

        TestQuestion(
            id = 201,
            topic = "Emergencias y averías",
            subtopic = "V16",
            text = "Desde el 1 de enero de 2026, ¿qué dispositivo es el medio legal de preseñalización de un turismo inmovilizado en España?",
            answers = listOf(
                "La baliza V16 conectada y certificada.",
                "Dos triángulos de emergencia.",
                "Cualquier linterna amarilla."
            ),
            correctAnswer = 0,
            explanation = "Desde el 1 de enero de 2026 la V16 conectada es el dispositivo legal de preseñalización de vehículos inmovilizados en España.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Dispositivos de preseñalización V16",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 202,
            topic = "Emergencias y averías",
            subtopic = "V16",
            text = "¿Debe estar conectada la baliza V16 utilizada legalmente en España desde 2026?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si se circula por autopista."
            ),
            correctAnswer = 0,
            explanation = "Desde 2026 las balizas V16 no conectadas ya no son válidas como medio legal de preseñalización en España.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "Dispositivos de preseñalización V16",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 203,
            topic = "Emergencias y averías",
            subtopic = "V16",
            text = "¿Dónde recomienda la DGT llevar la baliza V16 dentro del vehículo?",
            answers = listOf(
                "En la guantera, accesible y con carga.",
                "En el fondo del maletero bajo el equipaje.",
                "Fijada permanentemente bajo el vehículo."
            ),
            correctAnswer = 0,
            explanation = "La baliza debe mantenerse accesible, y la DGT recomienda llevarla en la guantera y comprobar su estado de carga.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "V16 - Uso y funcionamiento",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 204,
            topic = "Emergencias y averías",
            subtopic = "V16",
            text = "Al utilizar una V16, ¿dónde debe colocarse para conseguir la máxima visibilidad?",
            answers = listOf(
                "En la parte más alta posible del vehículo, preferentemente en el techo.",
                "En el suelo detrás del vehículo.",
                "Dentro de la guantera."
            ),
            correctAnswer = 0,
            explanation = "Debe colocarse en la parte más alta posible del vehículo garantizando su máxima visibilidad, preferentemente sobre el techo cuando sea posible.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "V16 - Colocación",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 205,
            topic = "Emergencias y averías",
            subtopic = "V16",
            text = "Al activar una V16 conectada, además de emitir luz, el dispositivo...",
            answers = listOf(
                "transmite la ubicación del vehículo a la plataforma DGT 3.0.",
                "llama automáticamente al propietario del vehículo.",
                "bloquea electrónicamente el motor."
            ),
            correctAnswer = 0,
            explanation = "La V16 conectada transmite la geolocalización de la incidencia a la plataforma DGT 3.0.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "V16 conectada - DGT 3.0",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 206,
            topic = "Emergencias y averías",
            subtopic = "V16",
            text = "¿Es obligatorio instalar una aplicación móvil para que una V16 conectada pueda enviar su ubicación?",
            answers = listOf(
                "No.",
                "Sí.",
                "Solo en vehículos nuevos."
            ),
            correctAnswer = 0,
            explanation = "La baliza incorpora los elementos necesarios para su conectividad y no necesita una aplicación móvil para transmitir la ubicación.",
            sourceType = QuestionSourceType.DGT,
            reference = "Dirección General de Tráfico",
            legalReference = "V16 - Preguntas frecuentes",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        )
    )
}
