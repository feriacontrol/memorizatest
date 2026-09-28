package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtBatch252to248 {

    private fun q(
        id: Int,
        topic: String,
        subtopic: String,
        text: String,
        a: String,
        b: String,
        c: String,
        correct: Int,
        explanation: String,
        test: Int,
        question: Int,
        legal: String,
        difficulty: QuestionDifficulty = QuestionDifficulty.MEDIUM
    ) = TestQuestion(
        id = id,
        topic = topic,
        subtopic = subtopic,
        text = text,
        answers = listOf(a, b, c),
        correctAnswer = correct,
        explanation = explanation,
        origin = QuestionOrigin.DGT_PUBLISHED,
        sourceType = QuestionSourceType.DGT,
        reference = "Revista Tráfico y Seguridad Vial - Test $test, pregunta $question",
        legalReference = legal,
        lastVerified = "2026-09-29",
        difficulty = difficulty
    )

    val questions = listOf(

        // ───────────── TEST 252 ─────────────

        q(
            447,
            "Emergencias y averías",
            "Pinchazo",
            "Si durante la marcha se pincha una rueda, ¿qué debe hacer?",
            "Continuar hasta el taller más próximo.",
            "Inmovilizar el vehículo cuanto antes fuera de la calzada o en un lugar seguro.",
            "Detenerse inmediatamente en cualquier punto de la calzada.",
            1,
            "Ante un pinchazo debe controlarse el vehículo y detenerlo en un lugar seguro, evitando crear un nuevo peligro.",
            252, 6,
            "DGT - Averías",
            QuestionDifficulty.EASY
        ),

        q(
            448,
            "Prioridad",
            "Tramos de gran pendiente",
            "Como norma general, en un tramo estrecho de gran pendiente donde no pueden cruzarse dos vehículos, ¿quién debe ceder el paso?",
            "El vehículo que asciende.",
            "El vehículo que desciende.",
            "El vehículo de menor tamaño.",
            1,
            "En los tramos de gran pendiente tiene preferencia, como norma general, el vehículo que circula en sentido ascendente.",
            252, 7,
            "Reglamento General de Circulación - tramos de gran pendiente"
        ),

        q(
            449,
            "Señalización",
            "Semáforos especiales",
            "Un semáforo con una franja blanca horizontal iluminada sobre fondo negro indica a los vehículos afectados...",
            "que pueden continuar de frente.",
            "que deben detenerse.",
            "que pueden girar a ambos lados.",
            1,
            "La franja blanca horizontal de estos semáforos especiales equivale a una orden de detención.",
            252, 9,
            "Reglamento General de Circulación - semáforos reservados"
        ),

        q(
            450,
            "Mecánica y mantenimiento",
            "Amortiguadores",
            "¿Puede afectar al control del vehículo circular con los amortiguadores en mal estado?",
            "No, únicamente afecta al confort.",
            "Solo afecta al consumo.",
            "Sí, puede provocar una inclinación excesiva del vehículo en las curvas.",
            2,
            "Una amortiguación deficiente perjudica la estabilidad, la adherencia y el control del vehículo.",
            252, 11,
            "DGT - Suspensión y amortiguación",
            QuestionDifficulty.EASY
        ),

        q(
            451,
            "Maniobras",
            "Incorporación",
            "Si observa que otro vehículo intenta incorporarse mediante un carril de aceleración, ¿qué debe hacer?",
            "Mantener siempre su trayectoria sin facilitarle la maniobra.",
            "Cederle obligatoriamente el paso.",
            "Facilitarle la incorporación en la medida de lo posible.",
            2,
            "Aunque el vehículo que circula por la vía principal mantiene la prioridad, debe facilitar la incorporación cuando pueda hacerlo con seguridad.",
            252, 12,
            "DGT - Incorporación a la circulación"
        ),

        q(
            452,
            "Adelantamientos",
            "Inicio de la maniobra",
            "Antes de iniciar un adelantamiento debe comprobar que...",
            "existe espacio suficiente para regresar al carril derecho al finalizar.",
            "el vehículo adelantado va a frenar.",
            "los vehículos que circulan detrás se han detenido.",
            0,
            "No debe iniciarse el adelantamiento si no existe espacio suficiente para finalizarlo y regresar al carril correspondiente.",
            252, 13,
            "Reglamento General de Circulación - adelantamiento"
        ),

        q(
            453,
            "Seguridad",
            "Airbag",
            "Una de las funciones del airbag en un accidente es...",
            "sustituir completamente al cinturón.",
            "reducir el riesgo de determinadas lesiones en la cara y la cabeza.",
            "evitar siempre cualquier lesión.",
            1,
            "El airbag complementa al cinturón y ayuda a reducir determinadas lesiones producidas por el impacto.",
            252, 14,
            "DGT - Airbag",
            QuestionDifficulty.EASY
        ),

        q(
            454,
            "Distancia de seguridad",
            "Norma general",
            "¿En qué tipo de vías debe mantenerse una distancia de seguridad adecuada con el vehículo precedente?",
            "Solo en carreteras de doble sentido.",
            "Solo en autopistas y autovías.",
            "En todo tipo de vías.",
            2,
            "La distancia de seguridad debe adaptarse siempre a la velocidad y a las circunstancias de la circulación.",
            252, 15,
            "Reglamento General de Circulación - distancia entre vehículos",
            QuestionDifficulty.EASY
        ),

        // ───────────── TEST 251 ─────────────

        q(
            455,
            "Emergencias y averías",
            "Reventón",
            "Si sufre un reventón cuando circula a velocidad elevada, ¿debe frenar bruscamente?",
            "Sí.",
            "No; debe controlar el vehículo y reducir la velocidad de forma suave y progresiva.",
            "Solo si revienta una rueda delantera.",
            1,
            "Una frenada brusca puede agravar la pérdida de estabilidad después de un reventón.",
            251, 1,
            "DGT - Neumáticos y reventones"
        ),

        q(
            456,
            "Condiciones adversas",
            "Lluvia",
            "¿Obliga la lluvia a adoptar más precauciones durante la conducción?",
            "Sí, porque puede reducir la adherencia.",
            "No, la adherencia no cambia.",
            "Solo durante los primeros segundos.",
            0,
            "La presencia de agua reduce la adherencia y puede aumentar la distancia necesaria para detener el vehículo.",
            251, 3,
            "DGT - Conducción con lluvia",
            QuestionDifficulty.EASY
        ),

        q(
            457,
            "Carga y equipaje",
            "Carga indivisible",
            "En un vehículo destinado al transporte de mercancías de menos de cinco metros, ¿cuánto puede sobresalir por delante una carga indivisible?",
            "Hasta un tercio de la longitud del vehículo.",
            "Hasta un 15 %.",
            "No puede sobresalir nunca.",
            0,
            "En los vehículos destinados exclusivamente al transporte de mercancías de hasta cinco metros, una carga indivisible puede sobresalir hasta un tercio por delante y por detrás.",
            251, 7,
            "Reglamento General de Circulación - dimensiones de la carga",
            QuestionDifficulty.HARD
        ),

        q(
            458,
            "Túneles",
            "Averías",
            "Si su vehículo sufre una avería en un paso inferior pero todavía puede continuar la marcha, ¿qué debe hacer?",
            "Detenerlo inmediatamente dentro.",
            "Abandonarlo dentro del paso inferior.",
            "Continuar hasta salir del paso inferior, siempre que pueda hacerlo con seguridad.",
            2,
            "Si el vehículo puede continuar, debe abandonarse cuanto antes la zona de especial riesgo.",
            251, 8,
            "DGT - Averías en túneles y pasos inferiores"
        ),

        q(
            459,
            "Mecánica y mantenimiento",
            "Presión de neumáticos",
            "Una presión de inflado inferior a la recomendada en los neumáticos...",
            "puede aumentar el consumo de combustible.",
            "reduce siempre el consumo.",
            "no afecta al consumo.",
            0,
            "Una presión insuficiente aumenta la resistencia a la rodadura y puede incrementar el consumo y el desgaste.",
            251, 11,
            "DGT - Neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            460,
            "Prioridad",
            "Intersecciones",
            "En una intersección sin señalizar entre una vía pavimentada y otra sin pavimentar, ¿quién tiene prioridad?",
            "El que se aproxima por la derecha.",
            "El vehículo más grande.",
            "El que circula por la vía pavimentada.",
            2,
            "En este supuesto tiene prioridad el vehículo que circula por la vía pavimentada.",
            251, 12,
            "Reglamento General de Circulación - prioridad en intersecciones"
        ),

        q(
            461,
            "Adelantamientos",
            "Visibilidad",
            "¿Puede adelantar detrás de otro vehículo que ya está adelantando si no tiene visibilidad suficiente de la parte delantera de la vía?",
            "Sí.",
            "Solo en autopista.",
            "No.",
            2,
            "No debe efectuarse un adelantamiento cuando la visibilidad disponible no permite realizar o abortar la maniobra con seguridad.",
            251, 13,
            "Reglamento General de Circulación - adelantamientos"
        ),

        q(
            462,
            "Conducción segura",
            "Transporte escolar",
            "Al aproximarse a un autobús del que están bajando niños, ¿qué debe hacer?",
            "Mantener la velocidad.",
            "Usar repetidamente el claxon.",
            "Moderar la velocidad e incluso detenerse si fuera necesario.",
            2,
            "La presencia de menores exige anticipación y una velocidad que permita detenerse inmediatamente si fuera preciso.",
            251, 15,
            "DGT - Seguridad infantil",
            QuestionDifficulty.EASY
        ),

        // ───────────── TEST 250 ─────────────

        q(
            463,
            "Condiciones adversas",
            "Hielo",
            "¿Puede mejorarse la adherencia sobre una calzada con hielo?",
            "Sí, utilizando los dispositivos autorizados adecuados, como cadenas o neumáticos apropiados.",
            "No, nunca.",
            "Solo aumentando la presión de los neumáticos.",
            0,
            "Los dispositivos adecuados pueden mejorar la adherencia cuando existen hielo o nieve.",
            250, 2,
            "DGT - Conducción con hielo"
        ),

        q(
            464,
            "Ciclomotores",
            "Autopistas",
            "¿Puede un ciclomotor circular por una autopista?",
            "Sí.",
            "No.",
            "Solo por el arcén.",
            1,
            "Los ciclomotores tienen prohibida la circulación por autopistas.",
            250, 4,
            "Reglamento General de Circulación - autopistas",
            QuestionDifficulty.EASY
        ),

        q(
            465,
            "Prioridad",
            "Estrechamientos",
            "En un estrechamiento sin señalizar, si dos vehículos no pueden pasar simultáneamente, ¿quién tiene preferencia como norma general?",
            "El que haya entrado primero.",
            "El vehículo más pesado.",
            "El que circule a mayor velocidad.",
            0,
            "Como norma general, tiene preferencia quien haya entrado primero en el estrechamiento.",
            250, 5,
            "Reglamento General de Circulación - estrechamientos"
        ),

        q(
            466,
            "Alcohol y drogas",
            "Efectos del alcohol",
            "El consumo de alcohol puede provocar que el campo visual del conductor...",
            "aumente.",
            "disminuya.",
            "permanezca siempre igual.",
            1,
            "El alcohol puede reducir la capacidad visual y favorecer el denominado efecto túnel.",
            250, 8,
            "DGT - Alcohol y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            467,
            "Señalización",
            "Marcas longitudinales",
            "Si una línea continua está adosada a otra discontinua, ¿qué línea debe tener en cuenta cada conductor?",
            "Siempre la continua.",
            "Siempre la discontinua.",
            "La situada más próxima al carril por el que circula.",
            2,
            "Cada conductor debe atender al significado de la línea situada en su lado.",
            250, 9,
            "Reglamento General de Circulación - marcas longitudinales"
        ),

        q(
            468,
            "Túneles",
            "Distancia de seguridad",
            "En un túnel, si no pretende adelantar, ¿qué separación mínima debe mantener un turismo respecto al vehículo precedente?",
            "100 metros o un intervalo mínimo de 4 segundos.",
            "50 metros o 2 segundos.",
            "25 metros.",
            0,
            "En túneles debe aumentarse especialmente la separación entre vehículos cuando no se pretende adelantar.",
            250, 10,
            "Reglamento General de Circulación - circulación en túneles",
            QuestionDifficulty.HARD
        ),

        q(
            469,
            "Mecánica y mantenimiento",
            "Filtro del habitáculo",
            "¿Debe revisarse y sustituirse cuando sea necesario el filtro del habitáculo?",
            "Sí.",
            "No, dura toda la vida del vehículo.",
            "Solo si el vehículo tiene más de diez años.",
            0,
            "La capacidad de retención del filtro es limitada y su mantenimiento ayuda a conservar la calidad del aire del habitáculo.",
            250, 11,
            "DGT - Mantenimiento",
            QuestionDifficulty.EASY
        ),

        q(
            470,
            "Velocidades",
            "Velocidad mínima",
            "En una carretera donde la velocidad genérica para un turismo es 90 km/h, ¿qué velocidad se considera anormalmente reducida sin causa justificada?",
            "Una inferior a 60 km/h.",
            "Una inferior a 55 km/h.",
            "Una inferior a 45 km/h.",
            2,
            "Fuera de autopistas y autovías se considera anormalmente reducida, como norma general, una velocidad inferior a la mitad de la genérica correspondiente.",
            250, 12,
            "Reglamento General de Circulación, artículo 49"
        ),

        q(
            471,
            "Alcohol y drogas",
            "Inmovilización",
            "Si un vehículo ha sido inmovilizado porque su conductor superaba la tasa de alcohol permitida, ¿cuándo podrá levantarse la inmovilización?",
            "Cuando desaparezca la causa que la motivó.",
            "Al entregar el boletín de denuncia.",
            "Siempre después de treinta minutos.",
            0,
            "La inmovilización puede levantarse cuando desaparece la causa que la justificó y se cumplen las condiciones legales.",
            250, 14,
            "DGT - Inmovilización por alcohol"
        ),

        q(
            472,
            "Alumbrado",
            "Luces de posición",
            "¿Qué finalidad tienen las luces de posición de un vehículo?",
            "Iluminar la calzada a gran distancia.",
            "Indicar la presencia, posición y anchura del vehículo.",
            "Indicar únicamente que el vehículo está detenido.",
            1,
            "Las luces de posición permiten a otros usuarios apreciar la presencia y dimensiones básicas del vehículo.",
            250, 15,
            "Reglamento General de Vehículos - alumbrado",
            QuestionDifficulty.EASY
        ),

        // ───────────── TEST 249 ─────────────

        q(
            473,
            "Seguridad",
            "Reposacabezas",
            "¿Conviene regular el reposacabezas a la altura adecuada para cada ocupante?",
            "No, solo sirve para mejorar el confort.",
            "Solo debe regularlo el conductor.",
            "Sí, porque es un elemento de seguridad que ayuda a reducir lesiones cervicales.",
            2,
            "Un reposacabezas correctamente ajustado puede reducir el movimiento de la cabeza y el riesgo de determinadas lesiones cervicales.",
            249, 1,
            "DGT - Reposacabezas",
            QuestionDifficulty.EASY
        ),

        q(
            474,
            "Distancia de seguridad",
            "Frenado",
            "¿Qué es la distancia de frenado?",
            "La distancia recorrida desde que se ve un peligro hasta detenerse.",
            "La distancia recorrida durante el tiempo de reacción.",
            "La distancia recorrida desde que se accionan los frenos hasta que el vehículo se detiene.",
            2,
            "La distancia de frenado comienza cuando actúa el sistema de frenado y termina cuando el vehículo queda detenido.",
            249, 6,
            "DGT - Distancia de frenado",
            QuestionDifficulty.EASY
        ),

        // ───────────── TEST 248 ─────────────

        q(
            475,
            "Mecánica y mantenimiento",
            "Repostaje",
            "Al repostar combustible, además de detener el motor, ¿qué debe hacerse con sistemas eléctricos como las luces o la radio?",
            "Mantenerlos todos conectados.",
            "Encender las luces de emergencia.",
            "Desconectarlos.",
            2,
            "Durante el repostaje deben evitarse posibles fuentes de ignición y respetarse las medidas de seguridad de la estación de servicio.",
            248, 5,
            "DGT - Repostaje de combustible",
            QuestionDifficulty.EASY
        ),

        q(
            476,
            "Túneles",
            "Retenciones",
            "Si prevé que permanecerá detenido dentro de un túnel durante más de dos minutos, ¿qué debe hacer con el motor?",
            "Apagarlo.",
            "Mantenerlo acelerado.",
            "Dejarlo al ralentí obligatoriamente.",
            0,
            "En una detención prolongada dentro de un túnel debe apagarse el motor, manteniendo las medidas de señalización y seguridad necesarias.",
            248, 9,
            "Reglamento General de Circulación - túneles"
        )
    )
}
