package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtBatch242to238 {

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

        // ───────── TEST 242 ─────────

        q(
            509,
            "Carga y equipaje",
            "Carga en turismos",
            "En un turismo, ¿cuánto puede sobresalir por detrás una carga?",
            "Hasta un 10 % de la longitud del vehículo y, si es indivisible, hasta un 15 %.",
            "Siempre un máximo del 5 %.",
            "Nunca puede sobresalir.",
            0,
            "En vehículos no destinados exclusivamente al transporte de mercancías puede sobresalir por detrás hasta un 10 %, o un 15 % si la carga es indivisible.",
            242, 4,
            "Reglamento General de Circulación, artículo 15",
            QuestionDifficulty.MEDIUM
        ),

        q(
            510,
            "Fatiga y sueño",
            "Síntomas",
            "¿Qué síntomas pueden advertir de la aparición de fatiga durante la conducción?",
            "Aumento de los parpadeos y posible visión borrosa.",
            "Mayor agudeza visual.",
            "Sensación permanente de euforia.",
            0,
            "La fatiga puede aumentar la frecuencia y duración de los parpadeos y deteriorar la visión.",
            242, 5,
            "DGT - Fatiga y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            511,
            "Emergencias y averías",
            "Luz de emergencia",
            "Si un vehículo queda inmovilizado en una autopista, ¿debe utilizar la luz de emergencia si dispone de ella?",
            "Sí.",
            "No.",
            "Solo durante la noche.",
            0,
            "Una inmovilización en autopista o autovía debe advertirse mediante la señalización reglamentaria y la luz de emergencia cuando se dispone de ella.",
            242, 6,
            "Reglamento General de Circulación, artículo 109",
            QuestionDifficulty.EASY
        ),

        q(
            512,
            "Seguridad",
            "Cinturón",
            "Si un pasajero adulto de un turismo no utiliza el cinturón obligatorio, ¿quién responde directamente por esa infracción?",
            "El propio pasajero.",
            "Siempre el conductor.",
            "El propietario del vehículo.",
            0,
            "Como norma general, la responsabilidad por una infracción recae en su autor; existen reglas específicas para menores y sistemas de retención infantil.",
            242, 11,
            "Ley de Tráfico, artículo 82",
            QuestionDifficulty.MEDIUM
        ),

        q(
            513,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "En un turismo, ¿cuál es la profundidad mínima reglamentaria de las ranuras principales de los neumáticos?",
            "1 mm.",
            "1,6 mm.",
            "3 mm.",
            1,
            "Los neumáticos de los turismos deben conservar al menos 1,6 mm en las ranuras principales de la banda de rodadura.",
            242, 12,
            "Reglamento General de Vehículos, anexo VII",
            QuestionDifficulty.EASY
        ),

        q(
            514,
            "Conducción segura",
            "Tiempo de reacción",
            "¿Qué es el tiempo de reacción?",
            "El tiempo desde que se percibe un peligro hasta que el conductor responde.",
            "El tiempo total de frenado.",
            "El tiempo necesario para arrancar el vehículo.",
            0,
            "Es el intervalo transcurrido entre la percepción de una situación y el inicio de la respuesta del conductor.",
            242, 13,
            "DGT - Tiempo de reacción",
            QuestionDifficulty.EASY
        ),

        q(
            515,
            "Conducción segura",
            "Factores de riesgo",
            "El hielo, la nieve, la calzada mojada o unas obras forman parte principalmente del...",
            "factor humano.",
            "factor vehículo.",
            "factor vía y entorno.",
            2,
            "Son circunstancias vinculadas a la vía o a su entorno y pueden modificar considerablemente el riesgo.",
            242, 14,
            "DGT - Factores de riesgo",
            QuestionDifficulty.EASY
        ),

        q(
            516,
            "Conducción segura",
            "Estrés",
            "¿Puede el estrés alterar las capacidades necesarias para conducir con seguridad?",
            "Sí.",
            "No.",
            "Solo en conductores noveles.",
            0,
            "El estrés puede afectar a la atención, la percepción del riesgo y la toma de decisiones.",
            242, 15,
            "DGT - Estrés y conducción",
            QuestionDifficulty.EASY
        ),

        // ───────── TEST 241 ─────────

        q(
            517,
            "Peatones",
            "Autobuses",
            "Al pasar junto a un autobús detenido, ¿qué peligro debe prever especialmente?",
            "Que puedan aparecer peatones ocultos por el propio autobús.",
            "Que el autobús circule marcha atrás obligatoriamente.",
            "Ninguno.",
            0,
            "Un autobús puede ocultar peatones que estén a punto de cruzar la calzada.",
            241, 1,
            "DGT - Peatones y transporte público"
        ),

        q(
            518,
            "Señalización",
            "Obras",
            "¿Tienen las señales colocadas en un tramo de obras el mismo significado básico que las equivalentes utilizadas fuera de las obras?",
            "Sí.",
            "No.",
            "Solo las señales de velocidad.",
            0,
            "La señalización de obras puede presentar características específicas de colocación o color, pero conserva el significado reglamentario correspondiente.",
            241, 3,
            "DGT - Señalización de obras"
        ),

        q(
            519,
            "Conducción segura",
            "Tiempo de reacción",
            "¿Puede aumentar el tiempo de reacción después de una fuerte discusión?",
            "Sí.",
            "No.",
            "Solo si se conduce de noche.",
            0,
            "Una alteración emocional intensa puede reducir la concentración y ralentizar la respuesta.",
            241, 4,
            "DGT - Estado emocional y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            520,
            "Fatiga y sueño",
            "Descanso",
            "Conducir durante mucho tiempo sin descansar...",
            "favorece la aparición de fatiga.",
            "reduce el riesgo de accidente.",
            "mejora progresivamente la atención.",
            0,
            "La conducción prolongada sin pausas aumenta la fatiga y deteriora el rendimiento.",
            241, 6,
            "DGT - Fatiga",
            QuestionDifficulty.EASY
        ),

        q(
            521,
            "Seguridad",
            "Reposacabezas",
            "¿A qué altura debe colocarse correctamente el reposacabezas?",
            "A la altura de la cabeza.",
            "A la altura del cuello.",
            "Lo más bajo posible.",
            0,
            "El reposacabezas debe ajustarse a la altura adecuada de la cabeza para limitar su desplazamiento en una colisión.",
            241, 7,
            "DGT - Reposacabezas",
            QuestionDifficulty.EASY
        ),

        q(
            522,
            "Condiciones adversas",
            "Hielo",
            "Si existe hielo en la calzada, ¿cómo conviene circular?",
            "A velocidad reducida, procurando evitar frenadas bruscas.",
            "Aumentando la velocidad.",
            "Pisando continuamente el freno.",
            0,
            "El hielo reduce drásticamente la adherencia, por lo que deben evitarse maniobras y frenadas bruscas.",
            241, 8,
            "DGT - Conducción con hielo",
            QuestionDifficulty.EASY
        ),

        q(
            523,
            "Mecánica y mantenimiento",
            "Aceite",
            "¿Para qué sirve la varilla de aceite del motor?",
            "Para comprobar su temperatura.",
            "Para comprobar su nivel.",
            "Para comprobar la presión de los neumáticos.",
            1,
            "La varilla permite comprobar si el nivel de aceite se encuentra dentro del margen previsto.",
            241, 9,
            "DGT - Mantenimiento del motor",
            QuestionDifficulty.EASY
        ),

        q(
            524,
            "Alumbrado",
            "Travesías",
            "Para circular de noche por una travesía, como norma general, ¿qué luces debe utilizar un turismo?",
            "Posición y cruce.",
            "Posición y carretera.",
            "Solo posición.",
            0,
            "Durante la noche debe utilizarse el alumbrado de posición junto con el de cruce en este supuesto.",
            241, 11,
            "Reglamento General de Circulación - alumbrado"
        ),

        // ───────── TEST 239 ─────────

        q(
            525,
            "Alumbrado",
            "Humo",
            "Si una nube de humo reduce sensiblemente la visibilidad durante el día, ¿debe utilizarse alumbrado?",
            "No.",
            "Sí, el alumbrado adecuado a las condiciones de visibilidad.",
            "Solo las luces de posición.",
            1,
            "Cuando el humo reduce sensiblemente la visibilidad debe utilizarse el alumbrado previsto para estas condiciones.",
            239, 1,
            "Reglamento General de Circulación, artículo 106"
        ),

        q(
            526,
            "Señalización",
            "Conos",
            "¿Qué indican los conos colocados formando una línea en la calzada?",
            "Que puede atravesarse libremente entre ellos.",
            "Que está prohibido rebasar la línea real o imaginaria que los une.",
            "Únicamente que debe reducirse la velocidad.",
            1,
            "Los conos y dispositivos análogos prohíben el paso a través de la línea real o imaginaria que forman.",
            239, 3,
            "Reglamento General de Circulación - elementos de balizamiento"
        ),

        q(
            527,
            "Maniobras",
            "Cambio de carril",
            "Al cambiar de carril, ¿quién tiene prioridad?",
            "El vehículo que ya circula por el carril que se pretende ocupar.",
            "El vehículo que cambia de carril.",
            "El vehículo de mayor tamaño.",
            0,
            "Quien cambia de carril debe respetar la prioridad de los vehículos que ya circulan por él.",
            239, 4,
            "Reglamento General de Circulación - utilización de carriles",
            QuestionDifficulty.EASY
        ),

        q(
            528,
            "Circulación",
            "Arcén",
            "¿Puede un turismo utilizar el arcén simplemente para avanzar durante una retención?",
            "Sí.",
            "No.",
            "Solo si circula a menos de 30 km/h.",
            1,
            "La congestión no autoriza por sí sola a un turismo a utilizar el arcén como un carril adicional.",
            239, 5,
            "Reglamento General de Circulación - utilización del arcén",
            QuestionDifficulty.EASY
        ),

        q(
            529,
            "Adelantamientos",
            "Inicio",
            "Antes de adelantar, ¿debe comprobar que ningún conductor que circula detrás ha iniciado ya el adelantamiento de su vehículo?",
            "Sí.",
            "No.",
            "Solo en carreteras convencionales.",
            0,
            "Antes de iniciar la maniobra debe asegurarse de que puede realizarse sin interferir con otro adelantamiento ya iniciado.",
            239, 6,
            "Reglamento General de Circulación - adelantamiento"
        ),

        q(
            530,
            "Maniobras",
            "Señales con el brazo",
            "Si una señal reglamentaria realizada con el brazo contradice al intermitente del mismo vehículo, ¿cuál prevalece?",
            "La señal realizada con el brazo, si es perceptible.",
            "Siempre el intermitente.",
            "Ninguna.",
            0,
            "Las señales reglamentarias realizadas con el brazo, cuando son visibles, anulan las indicaciones ópticas contradictorias.",
            239, 7,
            "Reglamento General de Circulación, artículo 108"
        ),

        q(
            531,
            "Estacionamiento",
            "Doble fila",
            "¿Qué maniobra está expresamente prohibida en doble fila?",
            "El estacionamiento.",
            "Toda parada en cualquier circunstancia.",
            "La circulación.",
            0,
            "El estacionamiento en doble fila está prohibido; además, cualquier parada que genere peligro u obstaculización puede ser sancionable.",
            239, 8,
            "Reglamento General de Circulación, artículo 94",
            QuestionDifficulty.MEDIUM
        ),

        q(
            532,
            "Prioridad",
            "Intersecciones",
            "Si un semáforo está fuera de servicio y no existe otra señal que regule la prioridad, ¿qué regla general se aplica?",
            "Ceder a los vehículos que se aproximan por la derecha.",
            "Ceder siempre a los de la izquierda.",
            "Tiene prioridad el vehículo de mayor tamaño.",
            0,
            "En ausencia de señalización aplicable se utiliza la regla general de prioridad de la derecha, con las excepciones reglamentarias.",
            239, 9,
            "Reglamento General de Circulación - prioridad en intersecciones"
        ),

        q(
            533,
            "Condiciones adversas",
            "Hielo",
            "Al descender un puerto con placas de hielo, ¿qué forma de conducción resulta más adecuada?",
            "Baja velocidad y una relación de marchas corta, evitando frenadas bruscas.",
            "Punto muerto.",
            "Velocidad elevada para evitar detenerse.",
            0,
            "En un descenso con hielo conviene aprovechar la retención del motor y evitar maniobras bruscas.",
            239, 11,
            "DGT - Conducción invernal"
        ),

        q(
            534,
            "Fatiga y sueño",
            "Meteorología adversa",
            "Cuando se conduce con condiciones climatológicas adversas, ¿puede ser necesario descansar con mayor frecuencia?",
            "Sí.",
            "No.",
            "Solo los conductores profesionales.",
            0,
            "Las condiciones difíciles exigen mayor esfuerzo y concentración y pueden acelerar la aparición de fatiga.",
            239, 13,
            "DGT - Fatiga y condiciones adversas",
            QuestionDifficulty.EASY
        ),

        // ───────── TEST 238 ─────────

        q(
            535,
            "Seguridad",
            "Cinturón",
            "Si las cintas del cinturón no quedan correctamente estiradas, ¿puede perder eficacia?",
            "Sí.",
            "No.",
            "Solo en los asientos traseros.",
            0,
            "Un cinturón mal colocado o con holguras puede proteger peor y aumentar el riesgo de lesiones.",
            238, 1,
            "DGT - Cinturón de seguridad",
            QuestionDifficulty.EASY
        ),

        q(
            536,
            "Adelantamientos",
            "Finalización",
            "Al terminar un adelantamiento, ¿cómo debe volver al carril correspondiente?",
            "De forma gradual y sin obstaculizar al vehículo adelantado.",
            "De forma brusca.",
            "Frenando inmediatamente delante del vehículo adelantado.",
            0,
            "La reincorporación debe realizarse progresivamente y dejando separación suficiente.",
            238, 4,
            "Reglamento General de Circulación - adelantamiento",
            QuestionDifficulty.EASY
        ),

        q(
            537,
            "Señalización",
            "Agentes",
            "Una serie de toques de silbato cortos y frecuentes realizados por un agente ordena...",
            "reanudar la marcha.",
            "detener los vehículos.",
            "aumentar la velocidad.",
            1,
            "Los toques cortos y frecuentes ordenan la detención; un toque largo ordena reanudar la marcha.",
            238, 7,
            "Reglamento General de Circulación - señales de los agentes",
            QuestionDifficulty.EASY
        ),

        q(
            538,
            "Conducción segura",
            "Enfermedades",
            "¿Qué efectos puede producir un resfriado que afecten a la conducción?",
            "Somnolencia y pérdida de concentración.",
            "Mayor rapidez de reacción.",
            "Mayor agudeza visual.",
            0,
            "La enfermedad y algunos de sus tratamientos pueden disminuir la atención y producir somnolencia.",
            238, 8,
            "DGT - Salud y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            539,
            "Estacionamiento",
            "Abandono del puesto",
            "Si el conductor deja su puesto para bajar del vehículo y descargar equipaje, ¿qué debe hacer con el motor?",
            "Mantenerlo en marcha.",
            "Pararlo y desconectar el sistema de arranque o contacto.",
            "Acelerarlo ligeramente.",
            1,
            "Cuando el conductor deja su puesto debe parar el motor y desconectar el sistema de arranque, además de adoptar las restantes medidas de inmovilización aplicables.",
            238, 9,
            "Reglamento General de Circulación, artículo 92"
        ),

        q(
            540,
            "Maniobras",
            "Cambio de sentido",
            "Si para efectuar un cambio de sentido obstaculiza a los vehículos que circulan detrás, ¿qué debe hacer cuando sea posible?",
            "Salir de la calzada por la derecha y esperar hasta poder realizar la maniobra.",
            "Detenerse en medio de la calzada.",
            "Realizar el cambio inmediatamente.",
            0,
            "La maniobra no debe efectuarse creando un obstáculo innecesario; si es posible debe apartarse y esperar condiciones seguras.",
            238, 11,
            "Reglamento General de Circulación - cambio de sentido"
        )
    )
}
