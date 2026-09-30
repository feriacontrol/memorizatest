package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object ManeuverQuestions {

    val questions = listOf(

        TestQuestion(
            id = 121,
            topic = "Maniobras",
            subtopic = "Incorporación",
            text = "Un vehículo estacionado que quiere incorporarse a la circulación debe...",
            answers = listOf(
                "ceder el paso a los vehículos que ya circulan por la vía.",
                "incorporarse directamente porque tiene prioridad.",
                "utilizar el claxon antes de salir."
            ),
            correctAnswer = 0,
            explanation = "Quien se incorpora desde una posición de parada o estacionamiento debe comprobar que puede hacerlo sin peligro y ceder el paso a los vehículos que ya circulan.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 72.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 122,
            topic = "Maniobras",
            subtopic = "Propiedad privada",
            text = "Al salir desde una propiedad privada a una vía pública, el conductor debe...",
            answers = listOf(
                "ceder el paso a los vehículos que circulen por la vía pública.",
                "tener prioridad por incorporarse desde la derecha.",
                "acelerar para incorporarse rápidamente."
            ),
            correctAnswer = 0,
            explanation = "Al acceder desde un camino exclusivamente privado debe hacerse a una velocidad que permita detenerse inmediatamente y cediendo el paso a los vehículos de la vía pública.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 72.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 123,
            topic = "Maniobras",
            subtopic = "Incorporación",
            text = "¿Debe señalizarse la incorporación a la circulación?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo cuando se incorpora desde un aparcamiento."
            ),
            correctAnswer = 0,
            explanation = "La incorporación debe advertirse mediante las señales ópticas correspondientes.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 72.3",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 124,
            topic = "Maniobras",
            subtopic = "Carril de aceleración",
            text = "Al principio de un carril de aceleración, si es necesario para incorporarse con seguridad, ¿puede el conductor llegar a detenerse?",
            answers = listOf(
                "Sí.",
                "No, nunca.",
                "Solo por avería."
            ),
            correctAnswer = 0,
            explanation = "Al inicio del carril de aceleración debe comprobarse que la incorporación puede hacerse sin peligro, deteniéndose si fuera necesario.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 72.4",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 125,
            topic = "Maniobras",
            subtopic = "Carril de aceleración",
            text = "Antes de incorporarse desde un carril de aceleración, el conductor debe procurar...",
            answers = listOf(
                "alcanzar una velocidad adecuada a la vía.",
                "circular siempre a menos de 40 km/h.",
                "detenerse al final del carril."
            ),
            correctAnswer = 0,
            explanation = "El conductor debe acelerar hasta alcanzar una velocidad adecuada antes de incorporarse a la circulación de la calzada.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 72.4",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 126,
            topic = "Maniobras",
            subtopic = "Facilitar incorporación",
            text = "Los conductores que ya circulan por una vía deben, en la medida de lo posible...",
            answers = listOf(
                "facilitar la incorporación de otros vehículos.",
                "impedir cualquier incorporación.",
                "detenerse siempre."
            ),
            correctAnswer = 0,
            explanation = "Los demás conductores deben facilitar la incorporación en la medida de lo posible, sin que ello elimine la obligación de quien se incorpora de ceder el paso.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 73.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 127,
            topic = "Maniobras",
            subtopic = "Cambio de dirección",
            text = "Antes de girar a otra vía, el conductor debe...",
            answers = listOf(
                "advertir la maniobra con suficiente antelación.",
                "realizar primero el giro y señalizar después.",
                "usar obligatoriamente el claxon."
            ),
            correctAnswer = 0,
            explanation = "El cambio de dirección debe advertirse previamente y con suficiente antelación.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 74.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 128,
            topic = "Maniobras",
            subtopic = "Cambio de carril",
            text = "Al cambiar de carril, ¿quién tiene prioridad?",
            answers = listOf(
                "El vehículo que ya circula por el carril que se pretende ocupar.",
                "El vehículo que realiza el cambio.",
                "El vehículo más rápido."
            ),
            correctAnswer = 0,
            explanation = "Todo desplazamiento lateral que implique cambio de carril debe respetar la prioridad de quien ya circula por el carril de destino.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 74.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 129,
            topic = "Maniobras",
            subtopic = "Giro a la derecha",
            text = "Como norma general, para girar a la derecha el conductor debe colocarse...",
            answers = listOf(
                "lo más cerca posible del borde derecho de la calzada.",
                "junto al borde izquierdo.",
                "en el centro de la calzada."
            ),
            correctAnswer = 0,
            explanation = "Para girar a la derecha debe ceñirse todo lo posible al borde derecho, salvo señalización o acondicionamiento distinto.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 75.1.b",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 130,
            topic = "Maniobras",
            subtopic = "Giro a la izquierda",
            text = "En una calzada de sentido único, para girar a la izquierda, como norma general el conductor debe situarse...",
            answers = listOf(
                "junto al borde izquierdo.",
                "junto al borde derecho.",
                "obligatoriamente en el centro."
            ),
            correctAnswer = 0,
            explanation = "En una calzada de sentido único, para efectuar un giro a la izquierda debe aproximarse al borde izquierdo.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 75.1.b",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 131,
            topic = "Maniobras",
            subtopic = "Giro a la izquierda",
            text = "En una calzada de doble sentido, para girar a la izquierda, como norma general el conductor debe situarse...",
            answers = listOf(
                "junto a la línea que separa los sentidos o al eje, sin invadir el sentido contrario.",
                "sobre el arcén derecho.",
                "invadiendo previamente el sentido contrario."
            ),
            correctAnswer = 0,
            explanation = "En vías de doble sentido debe aproximarse a la línea de separación de sentidos o al eje de la calzada, sin invadir la zona destinada al sentido contrario.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 75.1.b",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 132,
            topic = "Maniobras",
            subtopic = "Carril de deceleración",
            text = "Para abandonar una vía cuando existe un carril de deceleración, el conductor debe...",
            answers = listOf(
                "penetrar en él lo antes posible.",
                "frenar primero en el carril principal.",
                "detenerse antes de entrar."
            ),
            correctAnswer = 0,
            explanation = "Para abandonar la vía debe circularse con suficiente antelación por el carril próximo a la salida y entrar lo antes posible en el carril de deceleración.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 77",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 133,
            topic = "Maniobras",
            subtopic = "Cambio de sentido",
            text = "Para realizar un cambio de sentido, el conductor debe elegir un lugar...",
            answers = listOf(
                "donde pueda realizarlo sin poner en peligro ni obstaculizar a otros usuarios.",
                "con poca visibilidad.",
                "en el que tenga que permanecer detenido el mayor tiempo posible."
            ),
            correctAnswer = 0,
            explanation = "El cambio de sentido debe realizarse en un lugar adecuado, ocupando la vía el menor tiempo posible y sin peligro ni obstáculo para otros usuarios.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 78.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 134,
            topic = "Maniobras",
            subtopic = "Cambio de sentido",
            text = "¿Está permitido realizar un cambio de sentido dentro de un túnel?",
            answers = listOf(
                "No.",
                "Sí, si no circula ningún vehículo.",
                "Sí, si el túnel está iluminado."
            ),
            correctAnswer = 0,
            explanation = "El cambio de sentido está prohibido en túneles, pasos inferiores y tramos afectados por la señal de túnel.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 79.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 135,
            topic = "Maniobras",
            subtopic = "Marcha atrás",
            text = "Como maniobra complementaria de una parada, estacionamiento o incorporación, la marcha atrás no puede superar...",
            answers = listOf(
                "15 metros ni invadir un cruce de vías.",
                "30 metros.",
                "50 metros."
            ),
            correctAnswer = 0,
            explanation = "La marcha atrás complementaria de estas maniobras no puede superar 15 metros ni invadir un cruce de vías.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 80.2",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
