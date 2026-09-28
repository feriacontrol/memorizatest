package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtQuestions274 {

    val questions = listOf(

        TestQuestion(
            id = 293,
            topic = "Alcohol y drogas",
            subtopic = "Cocaína",
            text = "En general, ¿cómo puede afectar la cocaína al comportamiento de un conductor?",
            answers = listOf(
                "Puede hacerlo más competitivo e impulsivo.",
                "Mejora su capacidad para tomar decisiones.",
                "Reduce siempre su sensación de seguridad."
            ),
            correctAnswer = 0,
            explanation = "La cocaína puede favorecer conductas impulsivas, competitivas y de mayor aceptación del riesgo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 4",
            legalReference = "DGT - Drogas y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 294,
            topic = "Seguridad",
            subtopic = "Cinturón de seguridad",
            text = "Como norma general, ¿debe utilizar el cinturón de seguridad una mujer embarazada?",
            answers = listOf(
                "Sí.",
                "No, porque puede perjudicar al feto.",
                "Solo cuando circule fuera de poblado."
            ),
            correctAnswer = 0,
            explanation = "Las mujeres embarazadas deben utilizar el cinturón de seguridad como norma general y colocarlo correctamente.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 5",
            legalReference = "DGT - Cinturón de seguridad y embarazo",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 295,
            topic = "Conducción segura",
            subtopic = "Calor",
            text = "¿Cómo puede afectar un calor excesivo a la conducción?",
            answers = listOf(
                "Puede aumentar el tiempo de reacción y favorecer una conducta más agresiva.",
                "Reduce el tiempo de reacción.",
                "Mejora la concentración."
            ),
            correctAnswer = 0,
            explanation = "Las temperaturas elevadas pueden deteriorar la atención, aumentar el tiempo de reacción y favorecer irritabilidad o agresividad.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 6",
            legalReference = "DGT - Calor y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 296,
            topic = "Maniobras",
            subtopic = "Marcha atrás",
            text = "Si la luz de marcha atrás está averiada, ¿cómo puede indicar el conductor que va a realizar esta maniobra?",
            answers = listOf(
                "Con el brazo extendido y la palma de la mano hacia atrás.",
                "Moviendo el brazo verticalmente de arriba abajo.",
                "Utilizando únicamente el claxon."
            ),
            correctAnswer = 0,
            explanation = "Cuando no funciona la señal luminosa correspondiente, la maniobra puede advertirse mediante la señal reglamentaria realizada con el brazo.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 7",
            legalReference = "DGT - Señalización de maniobras",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 297,
            topic = "Ciclomotores",
            subtopic = "Cambio de dirección",
            text = "En una vía interurbana con un carril por sentido, ¿dónde debe colocarse un ciclomotor para girar a la izquierda si no existe carril específico?",
            answers = listOf(
                "A la derecha, fuera de la calzada siempre que sea posible.",
                "Junto al eje de la calzada.",
                "En el centro del carril."
            ),
            correctAnswer = 0,
            explanation = "En este supuesto, el ciclomotor debe situarse a la derecha, fuera de la calzada siempre que sea posible, y realizar el giro cuando pueda hacerlo con seguridad.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 8",
            legalReference = "DGT - Giro a la izquierda de ciclomotores",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 298,
            topic = "Fatiga y sueño",
            subtopic = "Descanso",
            text = "Para reducir el riesgo de somnolencia al volante, ¿cuántas horas de sueño suelen necesitar la mayoría de las personas?",
            answers = listOf(
                "Entre 4 y 5 horas.",
                "Entre 7 y 9 horas.",
                "Más de 12 horas."
            ),
            correctAnswer = 1,
            explanation = "Dormir lo suficiente es fundamental para prevenir la somnolencia; para la mayoría de las personas se sitúa aproximadamente entre siete y nueve horas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 10",
            legalReference = "DGT - Sueño y conducción",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 299,
            topic = "Motocicletas",
            subtopic = "Convivencia urbana",
            text = "Especialmente en vías urbanas, ¿qué ayuda a detectar a tiempo motocicletas y ciclomotores?",
            answers = listOf(
                "Consultar con frecuencia los retrovisores.",
                "Circular muy cerca de ellos.",
                "Reducir la distancia de seguridad."
            ),
            correctAnswer = 0,
            explanation = "La observación frecuente de los retrovisores ayuda a detectar vehículos de dos ruedas, especialmente en entornos urbanos.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 11",
            legalReference = "DGT - Motocicletas y ciclomotores",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 300,
            topic = "Circulación",
            subtopic = "Sentido contrario al habitual",
            text = "Si un carril en sentido contrario al habitual se habilita debido a trabajos en la calzada, ¿quién puede utilizarlo?",
            answers = listOf(
                "Todos los vehículos autorizados a circular por esa vía, salvo señalización en contrario.",
                "Únicamente turismos y motocicletas.",
                "Solo vehículos de hasta 3.500 kg."
            ),
            correctAnswer = 0,
            explanation = "Cuando el carril se habilita por trabajos en la calzada, pueden utilizarlo los vehículos autorizados a circular por la vía, respetando las condiciones establecidas.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 12",
            legalReference = "DGT - Carriles en sentido contrario por obras",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 301,
            topic = "Ciclistas",
            subtopic = "Adelantamiento",
            text = "En una carretera con un carril por sentido, ¿puede invadirse parcialmente el carril contrario para adelantar a un ciclista?",
            answers = listOf(
                "Sí, cuando pueda hacerse con seguridad.",
                "No, nunca.",
                "Solo si la bicicleta está detenida."
            ),
            correctAnswer = 0,
            explanation = "Puede ocuparse el carril contrario para mantener la separación necesaria siempre que la maniobra pueda efectuarse sin peligro.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 13",
            legalReference = "DGT - Adelantamiento a ciclistas",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 302,
            topic = "Alcohol y drogas",
            subtopic = "Pruebas de alcoholemia",
            text = "Cuando un agente de tráfico requiere a un conductor para realizar una prueba de alcoholemia, ¿está obligado a someterse a ella?",
            answers = listOf(
                "Sí.",
                "Solo después de un accidente.",
                "No, puede negarse y continuar circulando."
            ),
            correctAnswer = 0,
            explanation = "El conductor está obligado a someterse a las pruebas legalmente requeridas por los agentes; la negativa puede tener consecuencias penales.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 14",
            legalReference = "DGT - Pruebas de alcoholemia",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 303,
            topic = "Mecánica y mantenimiento",
            subtopic = "Aceite del motor",
            text = "¿Conviene utilizar un aceite que al calentarse se vuelva excesivamente líquido?",
            answers = listOf(
                "No, porque podría lubricar insuficientemente las piezas del motor.",
                "Sí, cuanto más líquido mejor.",
                "Sí, porque reduce siempre la temperatura del motor."
            ),
            correctAnswer = 0,
            explanation = "El lubricante debe mantener unas propiedades adecuadas a la temperatura de funcionamiento para garantizar una correcta lubricación del motor.",
            origin = QuestionOrigin.DGT_PUBLISHED,
            sourceType = QuestionSourceType.DGT,
            reference = "Revista Tráfico y Seguridad Vial - Test 274, junio 2025, pregunta 15",
            legalReference = "DGT - Lubricación del motor",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        )
    )
}
