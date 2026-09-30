package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object LaneQuestions {

    val questions = listOf(

        TestQuestion(
            id = 136,
            topic = "Circulación",
            subtopic = "Posición en la vía",
            text = "Como norma general, ¿por qué lado de la calzada deben circular los vehículos?",
            answers = listOf(
                "Por la derecha.",
                "Por la izquierda.",
                "Por el centro."
            ),
            correctAnswer = 0,
            explanation = "Como norma general debe circularse por la derecha y lo más cerca posible del borde de la calzada.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 29.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 137,
            topic = "Circulación",
            subtopic = "Visibilidad reducida",
            text = "En una curva de visibilidad reducida, aunque no exista una línea que separe los sentidos, el conductor debe...",
            answers = listOf(
                "dejar libre la parte de calzada destinada al sentido contrario.",
                "circular por el centro.",
                "invadir parcialmente el sentido contrario."
            ),
            correctAnswer = 0,
            explanation = "En curvas y cambios de rasante de reducida visibilidad debe dejarse completamente libre la mitad de la calzada correspondiente al sentido contrario, salvo excepciones reglamentarias.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 29.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 138,
            topic = "Circulación",
            subtopic = "Doble sentido",
            text = "En una calzada de doble sentido con dos carriles, un turismo debe circular normalmente...",
            answers = listOf(
                "por el carril derecho.",
                "por el carril izquierdo.",
                "por cualquiera indistintamente."
            ),
            correctAnswer = 0,
            explanation = "En calzadas de doble sentido y dos carriles debe circularse por el carril derecho.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 30.1.a",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 139,
            topic = "Circulación",
            subtopic = "Tres carriles",
            text = "En una calzada de doble sentido con tres carriles separados por líneas discontinuas, el carril central se utiliza...",
            answers = listOf(
                "para los adelantamientos necesarios y los cambios de dirección a la izquierda.",
                "para circular permanentemente.",
                "únicamente para estacionar."
            ),
            correctAnswer = 0,
            explanation = "El carril central solo se utiliza para efectuar adelantamientos y para cambiar de dirección a la izquierda.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 30.1.b",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 140,
            topic = "Circulación",
            subtopic = "Fuera de poblado",
            text = "Fuera de poblado, en una calzada con varios carriles para el mismo sentido, un turismo circulará normalmente...",
            answers = listOf(
                "por el carril situado más a la derecha.",
                "por el carril más a la izquierda.",
                "siempre por el carril central."
            ),
            correctAnswer = 0,
            explanation = "Fuera de poblado debe utilizarse normalmente el carril situado más a la derecha.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 31.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 141,
            topic = "Circulación",
            subtopic = "Fuera de poblado",
            text = "Fuera de poblado, ¿puede utilizar un turismo otros carriles distintos del derecho?",
            answers = listOf(
                "Sí, cuando las circunstancias del tráfico o de la vía lo aconsejen y no entorpezca a otros.",
                "No, nunca.",
                "Solo durante la noche."
            ),
            correctAnswer = 0,
            explanation = "Pueden utilizarse los restantes carriles cuando las circunstancias lo aconsejen, siempre que no se entorpezca la marcha de otro vehículo que siga detrás.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 31.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 142,
            topic = "Circulación",
            subtopic = "Poblado",
            text = "En poblado, en una calzada con al menos dos carriles delimitados para el mismo sentido, salvo autopista o autovía, un turismo puede utilizar...",
            answers = listOf(
                "el carril que mejor convenga a su destino.",
                "únicamente el carril derecho.",
                "únicamente el carril izquierdo."
            ),
            correctAnswer = 0,
            explanation = "En estas vías urbanas puede utilizarse el carril que mejor convenga al destino, siempre que no se obstaculice la circulación.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 33",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 143,
            topic = "Circulación",
            subtopic = "Poblado",
            text = "Una vez elegido un carril en poblado según la regla general, ¿cuándo debe abandonarse?",
            answers = listOf(
                "Para prepararse a cambiar de dirección, adelantar, parar o estacionar.",
                "Continuamente para buscar el carril más rápido.",
                "Siempre que haya un hueco."
            ),
            correctAnswer = 0,
            explanation = "El carril elegido no debe abandonarse salvo para prepararse a realizar determinadas maniobras como girar, adelantar, parar o estacionar.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 33",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 144,
            topic = "Circulación",
            subtopic = "Arcén",
            text = "Como norma general, un turismo debe circular...",
            answers = listOf(
                "por la calzada y no por el arcén.",
                "siempre por el arcén.",
                "indistintamente por calzada o arcén."
            ),
            correctAnswer = 0,
            explanation = "Los automóviles circulan por la calzada y no por el arcén, salvo situaciones excepcionales como una emergencia.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículos 30 y 31",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 145,
            topic = "Circulación",
            subtopic = "Carril reversible",
            text = "Un vehículo que circula por un carril reversible debe llevar encendida, como mínimo...",
            answers = listOf(
                "la luz de cruce, tanto de día como de noche.",
                "solo la luz de posición durante el día.",
                "las luces de emergencia."
            ),
            correctAnswer = 0,
            explanation = "En los carriles reversibles debe utilizarse al menos la luz de corto alcance o de cruce tanto de día como de noche.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 40.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 146,
            topic = "Circulación",
            subtopic = "Sentido contrario al habitual",
            text = "Cuando un carril en sentido contrario al habitual se habilita por razones de fluidez, ¿puede utilizarlo un turismo sin remolque?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si es un vehículo eléctrico."
            ),
            correctAnswer = 0,
            explanation = "Cuando se habilitan por razones de fluidez, estos carriles pueden ser utilizados por motocicletas y turismos, pero no por turismos con remolque.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 41.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 147,
            topic = "Circulación",
            subtopic = "Sentido contrario al habitual",
            text = "Como norma general, en un carril habilitado en sentido contrario al habitual por razones de fluidez se circulará entre...",
            answers = listOf(
                "60 y 80 km/h, salvo señalización inferior.",
                "80 y 120 km/h.",
                "40 y 60 km/h."
            ),
            correctAnswer = 0,
            explanation = "En estos carriles la velocidad máxima general es 80 km/h y la mínima 60 km/h, salvo límites inferiores establecidos o señalizados.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 41.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.HARD
        ),

        TestQuestion(
            id = 148,
            topic = "Circulación",
            subtopic = "Sentido contrario al habitual",
            text = "Un vehículo que circula por un carril habilitado en sentido contrario al habitual, ¿puede invadir el carril del sentido normal para adelantar?",
            answers = listOf(
                "No.",
                "Sí.",
                "Solo si existe línea discontinua."
            ),
            correctAnswer = 0,
            explanation = "No puede desplazarse lateralmente invadiendo los carriles destinados al sentido normal, ni siquiera para adelantar.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 41.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 149,
            topic = "Circulación",
            subtopic = "Sentido contrario al habitual",
            text = "¿Debe utilizarse la luz de cruce durante el día al circular por un carril habilitado en sentido contrario al habitual?",
            answers = listOf(
                "Sí.",
                "No.",
                "Solo si llueve."
            ),
            correctAnswer = 0,
            explanation = "En estos carriles debe llevarse encendida al menos la luz de cruce tanto de día como de noche.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 41.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 150,
            topic = "Circulación",
            subtopic = "Carril adicional",
            text = "En un carril adicional circunstancial, salvo señalización inferior, los vehículos deben circular...",
            answers = listOf(
                "entre 60 y 80 km/h y con la luz de cruce encendida.",
                "entre 80 y 120 km/h sin necesidad de alumbrado.",
                "a cualquier velocidad permitida en la vía."
            ),
            correctAnswer = 0,
            explanation = "En los carriles adicionales circunstanciales se establece normalmente una velocidad entre 60 y 80 km/h y debe utilizarse al menos la luz de cruce tanto de día como de noche.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 42.1",
            lastVerified = "2026-09-28",
            difficulty = QuestionDifficulty.HARD
        )
    )
}
