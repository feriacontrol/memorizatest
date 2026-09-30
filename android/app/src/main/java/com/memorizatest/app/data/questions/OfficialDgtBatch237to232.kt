package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtBatch237to232 {

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

        // ───────── TEST 237 ─────────

        q(
            541,
            "Alumbrado",
            "Luces de gálibo",
            "¿Cuándo son obligatorias las luces de gálibo en un automóvil?",
            "Cuando su anchura supera los 2,10 metros.",
            "Cuando supera los 6 metros de longitud.",
            "Siempre que circule de noche.",
            0,
            "Las luces de gálibo son obligatorias en los automóviles cuya anchura excede de 2,10 metros.",
            237, 2,
            "Reglamento General de Vehículos - alumbrado",
            QuestionDifficulty.MEDIUM
        ),

        q(
            542,
            "Permisos",
            "Permiso B",
            "Además de los vehículos propios del permiso B, ¿permite este permiso conducir ciclomotores?",
            "No.",
            "Sí, ciclomotores de dos, tres y cuatro ruedas.",
            "Solo ciclomotores de dos ruedas.",
            1,
            "El permiso B permite conducir también los vehículos autorizados por determinadas categorías inferiores, incluidos ciclomotores.",
            237, 3,
            "Reglamento General de Conductores",
            QuestionDifficulty.EASY
        ),

        q(
            543,
            "Señalización",
            "Semáforos",
            "Un semáforo con una flecha negra sobre una luz roja fija...",
            "prohíbe circular en la dirección indicada por la flecha.",
            "permite continuar con precaución.",
            "obliga a seguir la dirección indicada.",
            0,
            "La flecha negra limita el significado de la luz roja a la dirección o direcciones indicadas.",
            237, 6,
            "Reglamento General de Circulación - semáforos"
        ),

        q(
            544,
            "Velocidades",
            "Velocidad mínima",
            "Si una niebla intensa obliga a circular por una autovía a menos de 60 km/h, ¿está permitido hacerlo?",
            "No, nunca.",
            "Sí, porque existe una causa justificada.",
            "Solo si se encienden las luces de emergencia.",
            1,
            "Una situación de visibilidad reducida puede justificar circular por debajo de la velocidad mínima ordinaria.",
            237, 7,
            "Reglamento General de Circulación - velocidad anormalmente reducida"
        ),

        q(
            545,
            "Motocicletas",
            "Matrícula",
            "¿Cuántas placas de matrícula lleva normalmente una motocicleta?",
            "Una, situada en la parte posterior.",
            "Dos, una delante y otra detrás.",
            "Una, situada en la parte delantera.",
            0,
            "Las motocicletas llevan una única placa de matrícula posterior.",
            237, 9,
            "Reglamento General de Vehículos",
            QuestionDifficulty.EASY
        ),

        q(
            546,
            "Vehículos especiales",
            "Señal V-2",
            "Un vehículo especial dedicado a conservación o reparación de vías que entra en una autopista, ¿cuándo debe utilizar la señal luminosa V-2 cuando proceda?",
            "Solo al llegar a la zona de trabajo.",
            "Desde su entrada en la autopista.",
            "Únicamente durante la noche.",
            1,
            "La señalización debe advertir con suficiente antelación la presencia y actividad especial del vehículo.",
            237, 14,
            "Reglamento General de Vehículos - señal V-2"
        ),

        q(
            547,
            "Señalización",
            "Velocidad mínima",
            "Una señal circular azul con el número 30 indica...",
            "velocidad máxima de 30 km/h.",
            "velocidad recomendada de 30 km/h.",
            "obligación de circular como mínimo a 30 km/h, salvo causa justificada.",
            2,
            "La señal de velocidad mínima obliga a no circular por debajo de la cifra indicada salvo circunstancias que lo justifiquen.",
            237, 15,
            "Catálogo oficial de señales",
            QuestionDifficulty.EASY
        ),

        // ───────── TEST 236 ─────────

        q(
            548,
            "Conducción segura",
            "Posición al volante",
            "¿Cuál es una posición adecuada para conducir?",
            "Piernas ligeramente flexionadas y tronco correctamente apoyado.",
            "Piernas completamente estiradas.",
            "Cuerpo inclinado hacia delante.",
            0,
            "Una postura correcta permite manejar los mandos con precisión y mantener una distancia adecuada respecto al volante.",
            236, 2,
            "DGT - Posición de conducción",
            QuestionDifficulty.EASY
        ),

        q(
            549,
            "Distracciones",
            "Teléfono móvil",
            "Aunque no se esté utilizando, ¿puede el sonido inesperado de un teléfono móvil distraer al conductor?",
            "Sí.",
            "No.",
            "Solo si el vehículo está detenido.",
            0,
            "Un sonido inesperado puede desviar momentáneamente la atención del conductor.",
            236, 6,
            "DGT - Distracciones",
            QuestionDifficulty.EASY
        ),

        q(
            550,
            "Fatiga y sueño",
            "Monotonía",
            "¿En qué tipo de vía puede aumentar especialmente el riesgo de somnolencia?",
            "En una vía de trazado monótono.",
            "Únicamente en vías con muchas curvas.",
            "Solo en calles urbanas.",
            0,
            "La monotonía reduce el nivel de estimulación y puede favorecer la aparición de somnolencia.",
            236, 7,
            "DGT - Sueño y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            551,
            "Mecánica y mantenimiento",
            "Emisiones",
            "¿Puede circular normalmente un turismo que expulsa por el escape más humo del permitido?",
            "Sí, fuera de poblado.",
            "Sí, si no molesta a otros usuarios.",
            "No.",
            2,
            "El vehículo debe cumplir los límites técnicos y ambientales establecidos para sus emisiones.",
            236, 10,
            "Reglamento General de Vehículos - emisiones"
        ),

        q(
            552,
            "Ciclistas",
            "Condiciones adversas",
            "Cuando llueve o sopla viento fuerte, ¿por qué debe extremarse la precaución cerca de ciclistas?",
            "Porque pueden perder estabilidad con mayor facilidad.",
            "Porque siempre circulan más rápido.",
            "Porque tienen prioridad absoluta.",
            0,
            "El viento, la lluvia y la pérdida de adherencia pueden afectar especialmente al equilibrio de una bicicleta.",
            236, 14,
            "DGT - Ciclistas y condiciones meteorológicas",
            QuestionDifficulty.EASY
        ),

        // ───────── TEST 235 ─────────

        q(
            553,
            "Tipos de vía",
            "Cambio de rasante",
            "¿Qué es un cambio de rasante?",
            "Un tramo donde cambia la dirección horizontal de la carretera.",
            "El lugar donde se unen dos tramos de distinta inclinación.",
            "Una zona en la que cambia el tipo de pavimento.",
            1,
            "Un cambio de rasante se produce donde se encuentran dos tramos de vía con distinta inclinación.",
            235, 6,
            "Ley de Tráfico - definiciones",
            QuestionDifficulty.EASY
        ),

        q(
            554,
            "Accidentes y primeros auxilios",
            "Deber de auxilio",
            "Si presencia un accidente con víctimas y todavía no ha llegado ayuda, ¿debe prestar auxilio dentro de sus posibilidades?",
            "Sí.",
            "No, nunca debe detenerse.",
            "Solo si conoce personalmente a las víctimas.",
            0,
            "Los usuarios deben auxiliar o solicitar auxilio para las víctimas procurando no crear nuevos peligros.",
            235, 10,
            "Reglamento General de Circulación - comportamiento en accidentes",
            QuestionDifficulty.EASY
        ),

        q(
            555,
            "Mecánica y mantenimiento",
            "Envejecimiento de neumáticos",
            "Si la goma de un neumático se endurece por envejecimiento, ¿puede reducirse su adherencia?",
            "Sí.",
            "No, la goma más dura ofrece más agarre.",
            "Solo si está lloviendo.",
            0,
            "El envejecimiento puede endurecer y deteriorar el neumático, reduciendo su capacidad de agarre.",
            235, 13,
            "DGT - Neumáticos",
            QuestionDifficulty.EASY
        ),

        // ───────── TEST 234 ─────────

        q(
            556,
            "Señalización",
            "Línea de borde",
            "¿Puede atravesarse la línea que delimita el borde de la calzada?",
            "Sí, cuando sea necesario y las circunstancias lo permitan.",
            "No, nunca.",
            "Solo si es discontinua.",
            0,
            "La línea de borde no tiene el mismo significado que una línea longitudinal que separa carriles o sentidos.",
            234, 2,
            "Reglamento General de Circulación - marcas viales"
        ),

        q(
            557,
            "Adelantamientos",
            "Carril de aceleración",
            "Si un vehículo que circula por un carril de aceleración avanza más rápido que otro que circula por la vía principal, ¿se considera necesariamente adelantamiento?",
            "No.",
            "Sí.",
            "Solo si ocurre fuera de poblado.",
            0,
            "Cuando los vehículos circulan por carriles con funciones diferentes, este avance no constituye necesariamente un adelantamiento reglamentario.",
            234, 5,
            "Reglamento General de Circulación - adelantamiento"
        ),

        q(
            558,
            "Carga y equipaje",
            "Vehículos estrechos",
            "En un vehículo de anchura inferior a un metro, ¿cuánto puede sobresalir por detrás la carga?",
            "0,25 metros.",
            "0,50 metros.",
            "1 metro.",
            0,
            "En estos vehículos la carga puede sobresalir por detrás un máximo de 0,25 metros.",
            234, 7,
            "Reglamento General de Circulación, artículo 15",
            QuestionDifficulty.MEDIUM
        ),

        q(
            559,
            "Seguridad",
            "Airbag",
            "¿Puede resultar peligroso el funcionamiento del airbag si el ocupante no lleva puesto el cinturón?",
            "Sí.",
            "No, nunca.",
            "Solo a velocidades muy bajas.",
            0,
            "El airbag está diseñado para complementar al cinturón, no para sustituirlo.",
            234, 9,
            "DGT - Airbag y cinturón",
            QuestionDifficulty.EASY
        ),

        q(
            560,
            "Mecánica y mantenimiento",
            "Suspensión",
            "¿Contribuye una amortiguación en buen estado a prevenir accidentes?",
            "Sí.",
            "No, solo mejora el confort.",
            "Solo en vehículos pesados.",
            0,
            "La suspensión y los amortiguadores influyen en la adherencia, estabilidad y eficacia de la frenada.",
            234, 12,
            "DGT - Suspensión y amortiguación",
            QuestionDifficulty.EASY
        ),

        // ───────── TEST 233 ─────────

        q(
            561,
            "Mecánica y mantenimiento",
            "Sistema de escape",
            "¿Cuál es una de las funciones del silenciador del sistema de escape?",
            "Aumentar el ruido del motor.",
            "Reducir el ruido producido por los gases y explosiones del motor.",
            "Refrigerar el líquido de frenos.",
            1,
            "El silenciador forma parte del sistema de escape y reduce el ruido generado por el funcionamiento del motor.",
            233, 2,
            "DGT - Sistema de escape",
            QuestionDifficulty.EASY
        ),

        q(
            562,
            "Señalización",
            "Fin de prohibición",
            "Como norma general, una limitación de velocidad indicada por señal puede dejar de aplicarse al superar una intersección si no se repite ni existe otra indicación que mantenga la restricción.",
            "Verdadero.",
            "Falso.",
            "Solo ocurre en autopistas.",
            0,
            "Determinadas prohibiciones señalizadas dejan de aplicarse tras una intersección cuando no se reiteran ni existe otra indicación específica.",
            233, 3,
            "Reglamento General de Circulación - señales de prohibición"
        ),

        q(
            563,
            "Señalización",
            "Advertencias acústicas",
            "Fuera de poblado, ¿puede utilizarse el claxon para advertir la intención de adelantar?",
            "Sí, en los casos reglamentariamente permitidos.",
            "No, nunca.",
            "Solo de noche.",
            0,
            "Las señales acústicas pueden utilizarse fuera de poblado para advertir la intención de adelantar.",
            233, 6,
            "Reglamento General de Circulación, artículo 110",
            QuestionDifficulty.EASY
        ),

        q(
            564,
            "Adelantamientos",
            "Finalización",
            "Tras adelantar, ¿qué referencia puede ayudar a saber que existe separación suficiente antes de volver al carril derecho?",
            "Poder ver en el retrovisor la parte delantera del vehículo adelantado.",
            "Haber recorrido exactamente 200 metros.",
            "Esperar siempre 15 segundos.",
            0,
            "Ver completamente el vehículo adelantado en el retrovisor es una referencia práctica para evitar cerrarle el paso.",
            233, 7,
            "DGT - Técnica de adelantamiento",
            QuestionDifficulty.EASY
        ),

        q(
            565,
            "Fatiga y sueño",
            "Descansos",
            "Como recomendación general en viajes largos, ¿con qué frecuencia conviene realizar descansos?",
            "Aproximadamente cada dos horas o unos 200 kilómetros.",
            "Cada seis horas.",
            "Solo cuando aparezca sueño intenso.",
            0,
            "La DGT recomienda realizar pausas periódicas antes de que aparezcan síntomas intensos de fatiga.",
            233, 8,
            "DGT - Fatiga y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            566,
            "Motocicletas",
            "Casco",
            "Al elegir un casco de motocicleta, ¿es importante que disponga de una ventilación adecuada?",
            "Sí.",
            "No.",
            "Solo en verano.",
            0,
            "Una buena ventilación ayuda a reducir el empañamiento de la visera y mejora la visibilidad.",
            233, 10,
            "DGT - Casco de protección",
            QuestionDifficulty.EASY
        ),

        q(
            567,
            "Vehículos especiales",
            "Señal V-2",
            "¿Concede por sí sola prioridad de paso la señal luminosa V-2 de un vehículo especial?",
            "No.",
            "Sí, siempre.",
            "Sí, únicamente de noche.",
            0,
            "La señal V-2 advierte de la presencia o actividad especial del vehículo, pero no le concede por sí sola prioridad.",
            233, 11,
            "Reglamento General de Vehículos - señal V-2"
        ),

        // ───────── TEST 232 ─────────

        q(
            568,
            "Mecánica y mantenimiento",
            "Neumáticos y carga",
            "¿Puede una carga excesiva perjudicar el funcionamiento y la seguridad de los neumáticos?",
            "Sí.",
            "No.",
            "Solo cuando los amortiguadores están desgastados.",
            0,
            "Superar los límites de carga somete a los neumáticos a esfuerzos superiores a los previstos y aumenta el riesgo de fallo.",
            232, 1,
            "DGT - Neumáticos y carga",
            QuestionDifficulty.EASY
        ),

        q(
            569,
            "Mecánica y mantenimiento",
            "Filtro de aire",
            "¿Cuál es la función principal del filtro de aire del motor?",
            "Limpiar el aire que entra al motor para mezclarse con el combustible.",
            "Limpiar el líquido refrigerante.",
            "Filtrar el combustible después de quemarse.",
            0,
            "El filtro retiene partículas del aire de admisión antes de que entre en el motor.",
            232, 4,
            "DGT - Mantenimiento del motor",
            QuestionDifficulty.EASY
        ),

        q(
            570,
            "Mecánica y mantenimiento",
            "Presión de neumáticos",
            "Si los neumáticos de un mismo eje tienen presiones muy diferentes, ¿puede el vehículo desviarse hacia un lado?",
            "Sí.",
            "No.",
            "Solo durante la frenada.",
            0,
            "Una diferencia importante de presión entre ruedas del mismo eje puede afectar a la estabilidad y trayectoria.",
            232, 9,
            "DGT - Neumáticos",
            QuestionDifficulty.EASY
        )
    )
}
