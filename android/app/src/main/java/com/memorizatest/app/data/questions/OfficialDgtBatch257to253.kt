package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object OfficialDgtBatch257to253 {

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

        // ───────────────── TEST 257 ─────────────────

        q(
            416,
            "Mecánica y mantenimiento",
            "Catadióptricos",
            "¿Qué es un catadióptrico?",
            "Un dispositivo que refleja la luz procedente de una fuente luminosa.",
            "Una placa de matrícula reflectante.",
            "Un dispositivo que produce luz propia.",
            0,
            "El catadióptrico refleja hacia su origen la luz que recibe, ayudando a hacer visible el vehículo.",
            257, 1,
            "Reglamento General de Vehículos - dispositivos reflectantes",
            QuestionDifficulty.EASY
        ),

        q(
            417,
            "Mecánica y mantenimiento",
            "Emisiones y ruido",
            "¿Está permitida la circulación de un vehículo cuyo nivel de ruido supere los límites reglamentariamente establecidos?",
            "Sí, cuando circula fuera de poblado.",
            "No.",
            "Sí, si circula a velocidad reducida.",
            1,
            "Los vehículos deben respetar los límites reglamentarios de emisión de ruidos.",
            257, 2,
            "DGT - Emisiones y ruido",
            QuestionDifficulty.EASY
        ),

        q(
            418,
            "Medicamentos y conducción",
            "Somníferos",
            "Los fármacos somníferos o hipnóticos pueden provocar normalmente...",
            "una disminución del tiempo de reacción.",
            "un aumento del tiempo de reacción.",
            "un aumento del campo visual.",
            1,
            "Los medicamentos sedantes pueden producir somnolencia y ralentizar las respuestas del conductor.",
            257, 5,
            "DGT - Medicamentos y conducción"
        ),

        q(
            419,
            "Motocicletas",
            "Alumbrado",
            "Durante el día, ¿deben las motocicletas llevar encendida la luz de cruce?",
            "Sí, al circular por cualquier tipo de vía.",
            "Solo en vías interurbanas.",
            "Solo con meteorología adversa.",
            0,
            "Las motocicletas deben utilizar la luz de cruce también durante el día.",
            257, 6,
            "Reglamento General de Circulación - alumbrado de motocicletas",
            QuestionDifficulty.EASY
        ),

        q(
            420,
            "Motocicletas",
            "Frenos",
            "En una motocicleta con mandos independientes para cada freno, ¿dónde se acciona normalmente el freno delantero?",
            "En el manillar con la mano derecha.",
            "En el manillar con la mano izquierda.",
            "Con el pie izquierdo.",
            0,
            "En la configuración habitual de una motocicleta, la maneta derecha acciona el freno delantero.",
            257, 8,
            "DGT - Mandos de motocicletas",
            QuestionDifficulty.EASY
        ),

        q(
            421,
            "Circulación",
            "Carril adicional circunstancial",
            "Como norma general, ¿cuál es la velocidad mínima al circular por un carril adicional circunstancial?",
            "60 km/h, o una inferior si así está específicamente señalizado.",
            "80 km/h.",
            "La mitad de la velocidad genérica de la vía.",
            0,
            "En estos carriles se circula normalmente entre 60 y 80 km/h, salvo que se establezcan límites inferiores.",
            257, 10,
            "Reglamento General de Circulación, artículo 42"
        ),

        q(
            422,
            "Seguridad",
            "Animales en el vehículo",
            "¿Cómo debe viajar una mascota dentro de un vehículo?",
            "Libre en los asientos traseros.",
            "Sin interferir en la conducción y adecuadamente sujeta.",
            "Siempre en el asiento delantero.",
            1,
            "El conductor debe mantener libertad de movimientos y evitar que animales interfieran con la conducción.",
            257, 12,
            "DGT - Animales y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            423,
            "Señalización",
            "Vehículo largo",
            "Una placa trasera amarilla reflectante rodeada de rojo fluorescente indica...",
            "que el vehículo o conjunto supera los 12 metros de longitud.",
            "que transporta mercancías peligrosas.",
            "que no puede superar los 90 km/h.",
            0,
            "La señal específica identifica a los vehículos o conjuntos considerados vehículos largos.",
            257, 13,
            "Reglamento General de Vehículos - señal V-6"
        ),

        // ───────────────── TEST 256 ─────────────────

        q(
            424,
            "Carga y equipaje",
            "Estabilidad",
            "La carga transportada en un turismo nunca debe...",
            "descargarse por el lado próximo al borde de la calzada.",
            "colocarse dentro del maletero.",
            "comprometer la estabilidad del vehículo.",
            2,
            "La carga debe acondicionarse para que no comprometa la estabilidad ni la seguridad del vehículo.",
            256, 2,
            "Reglamento General de Circulación - disposición de la carga",
            QuestionDifficulty.EASY
        ),

        q(
            425,
            "Conducción segura",
            "Reducción de velocidad",
            "¿Puede reducirse la velocidad de un vehículo utilizando tanto el sistema de frenado como el motor?",
            "No, únicamente los frenos.",
            "No, únicamente el motor.",
            "Sí.",
            2,
            "La retención del motor también puede contribuir a reducir la velocidad, además del sistema de frenos.",
            256, 3,
            "DGT - Técnicas de conducción",
            QuestionDifficulty.EASY
        ),

        q(
            426,
            "Condiciones adversas",
            "Nieve",
            "Si solo dispone de cadenas para dos ruedas, ¿en cuáles debe instalarlas?",
            "Siempre en las delanteras.",
            "En las ruedas motrices.",
            "Siempre en las traseras.",
            1,
            "Las cadenas deben instalarse en las ruedas motrices para proporcionar tracción.",
            256, 7,
            "DGT - Conducción con nieve",
            QuestionDifficulty.EASY
        ),

        q(
            427,
            "Pasos a nivel",
            "Avería",
            "Si un vehículo queda inmovilizado por avería en un paso a nivel, ¿qué debe hacerse en primer lugar?",
            "Adoptar las medidas necesarias para que los ocupantes abandonen el vehículo.",
            "Desconectar la batería.",
            "Esperar dentro del vehículo.",
            0,
            "La prioridad inmediata es poner a salvo a los ocupantes y evitar que permanezcan sobre la vía ferroviaria.",
            256, 9,
            "Reglamento General de Circulación - pasos a nivel"
        ),

        q(
            428,
            "Condiciones adversas",
            "Viento lateral",
            "Al adelantar a un vehículo voluminoso con fuerte viento lateral, ¿puede producirse el efecto pantalla?",
            "No.",
            "Solo si ambos vehículos tienen el mismo peso.",
            "Sí, y el vehículo puede aproximarse bruscamente al vehículo adelantado.",
            2,
            "Al quedar temporalmente protegido del viento por otro vehículo y volver a recibirlo después, pueden producirse desplazamientos bruscos.",
            256, 11,
            "DGT - Viento lateral y efecto pantalla"
        ),

        q(
            429,
            "Conducción eficiente",
            "Motocicletas",
            "¿Puede el estilo de conducción de una motocicleta influir en el consumo de combustible?",
            "No.",
            "Solo depende de la cilindrada.",
            "Sí.",
            2,
            "Aceleraciones, frenadas, velocidad y utilización de marchas influyen en el consumo.",
            256, 14,
            "DGT - Conducción eficiente",
            QuestionDifficulty.EASY
        ),

        // ───────────────── TEST 255 ─────────────────

        q(
            430,
            "Mecánica y mantenimiento",
            "Lavaparabrisas",
            "¿Conviene revisar periódicamente el nivel del líquido lavaparabrisas?",
            "Sí.",
            "Solo durante el verano.",
            "Solo antes de pasar la ITV.",
            0,
            "Mantener suficiente líquido lavaparabrisas permite limpiar el parabrisas cuando sea necesario y conservar una buena visibilidad.",
            255, 6,
            "DGT - Mantenimiento del vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            431,
            "Seguridad",
            "Descenso del vehículo",
            "Antes de que un niño abra una puerta para bajar de un vehículo, este debe...",
            "estar completamente inmovilizado.",
            "circular a menos de 10 km/h.",
            "tener únicamente accionadas las luces de emergencia.",
            0,
            "Ningún ocupante debe abrir una puerta o apearse antes de que el vehículo esté completamente inmovilizado y sea seguro hacerlo.",
            255, 11,
            "DGT - Seguridad en el entorno escolar",
            QuestionDifficulty.EASY
        ),

        // ───────────────── TEST 254 ─────────────────

        q(
            432,
            "Emergencias y averías",
            "Chaleco reflectante",
            "Si el conductor de un turismo sale del vehículo y ocupa el arcén de una vía interurbana, ¿debe utilizar chaleco reflectante?",
            "Sí.",
            "Solo en autopistas y autovías.",
            "No.",
            0,
            "El conductor debe utilizar el chaleco reflectante cuando abandone el vehículo y ocupe la calzada o el arcén de una vía interurbana.",
            254, 3,
            "Reglamento General de Circulación - chaleco reflectante",
            QuestionDifficulty.EASY
        ),

        q(
            433,
            "Conducción segura",
            "Curvas",
            "Si entra demasiado rápido en una curva hacia la izquierda, la fuerza centrífuga tenderá a desplazar el vehículo...",
            "hacia la izquierda.",
            "hacia la derecha.",
            "sin modificar su trayectoria.",
            1,
            "La fuerza centrífuga tiende a desplazar el vehículo hacia el exterior de la curva.",
            254, 4,
            "DGT - Conducción en curvas",
            QuestionDifficulty.EASY
        ),

        q(
            434,
            "Accidentes y primeros auxilios",
            "Costes de los accidentes",
            "¿Cómo se denominan los costes derivados de la pérdida de vidas, capacidad productiva y sufrimiento físico o psicológico ocasionados por un accidente?",
            "Costes sanitarios.",
            "Costes materiales.",
            "Costes humanos.",
            2,
            "Las pérdidas de vida y el sufrimiento físico y psicológico forman parte de los costes humanos de la siniestralidad.",
            254, 5,
            "DGT - Siniestralidad vial"
        ),

        q(
            435,
            "Peatones",
            "Definición",
            "A efectos de circulación, es peatón la persona que...",
            "sin ser conductor, transita a pie por la vía.",
            "conduce una bicicleta.",
            "conduce un ciclomotor.",
            0,
            "La normativa considera peatón a quien, sin ser conductor, transita a pie por las vías o terrenos afectados.",
            254, 7,
            "Ley de Tráfico - definiciones",
            QuestionDifficulty.EASY
        ),

        q(
            436,
            "Fatiga y sueño",
            "Horarios de riesgo",
            "¿En qué momentos es especialmente probable la aparición de somnolencia durante la conducción?",
            "Solo a última hora de la mañana.",
            "Durante la madrugada y las primeras horas de la tarde.",
            "Únicamente al anochecer.",
            1,
            "Los ritmos biológicos favorecen especialmente la somnolencia durante la madrugada y después del mediodía.",
            254, 9,
            "DGT - Sueño y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            437,
            "Peatones",
            "Patines y monopatines",
            "A una persona que utiliza patines o un monopatín, ¿le está permitido ser arrastrada por otro vehículo?",
            "No.",
            "Sí, a velocidad reducida.",
            "Solo dentro de poblado.",
            0,
            "Está prohibido utilizar otro vehículo para ser arrastrado mientras se circula con patines o dispositivos similares.",
            254, 12,
            "Reglamento General de Circulación - patines y aparatos similares",
            QuestionDifficulty.EASY
        ),

        // ───────────────── TEST 253 ─────────────────

        q(
            438,
            "Circulación",
            "Vías con varias calzadas",
            "Como norma general, en una vía con tres calzadas, ¿en qué sentido se utilizan las calzadas laterales?",
            "En sentido único, aunque algún carril pueda habilitarse para sentido contrario.",
            "Siempre en ambos sentidos.",
            "Solo en sentido único cuando existe tráfico intenso.",
            0,
            "En este tipo de vía las calzadas laterales se utilizan normalmente en sentido único.",
            253, 3,
            "Reglamento General de Circulación - utilización de calzadas"
        ),

        q(
            439,
            "Condiciones adversas",
            "Viento lateral",
            "Ante un fuerte viento lateral, ¿qué actuación es adecuada?",
            "Reducir la velocidad y corregir suavemente las desviaciones de trayectoria.",
            "Aumentar la velocidad.",
            "Soltar ligeramente el volante.",
            0,
            "Con viento fuerte deben evitarse movimientos bruscos y adaptar la velocidad para conservar el control.",
            253, 4,
            "DGT - Conducción con viento",
            QuestionDifficulty.EASY
        ),

        q(
            440,
            "Mecánica y mantenimiento",
            "Limpiaparabrisas",
            "¿Cuándo deben sustituirse las escobillas del limpiaparabrisas?",
            "Obligatoriamente cada dos años.",
            "Cuando las gomas estén dañadas o hayan perdido eficacia.",
            "Solo antes de pasar la ITV.",
            1,
            "Las escobillas deterioradas limpian peor y pueden reducir sensiblemente la visibilidad.",
            253, 5,
            "DGT - Mantenimiento del limpiaparabrisas",
            QuestionDifficulty.EASY
        ),

        q(
            441,
            "Vehículos prioritarios",
            "Ambulancias",
            "¿Tiene prioridad especial una ambulancia que circula sin utilizar las señales que anuncian un servicio urgente?",
            "No.",
            "Sí, pero solo en poblado.",
            "Sí, siempre.",
            0,
            "La prioridad especial corresponde al vehículo prioritario cuando circula en servicio urgente y advierte reglamentariamente su presencia.",
            253, 7,
            "Reglamento General de Circulación - vehículos prioritarios"
        ),

        q(
            442,
            "Maniobras",
            "Incorporación",
            "Un vehículo que se incorpora a la circulación desde una posición de estacionamiento, ¿debe ceder el paso?",
            "Solo si se incorpora desde la izquierda.",
            "Sí, a los usuarios que ya circulan por la vía.",
            "Solo si se incorpora desde la derecha.",
            1,
            "Quien se incorpora a la circulación debe asegurarse de que puede hacerlo sin peligro y respetar a quienes ya circulan.",
            253, 8,
            "Reglamento General de Circulación - incorporación a la circulación",
            QuestionDifficulty.EASY
        ),

        q(
            443,
            "Velocidades",
            "Carreteras convencionales",
            "Como norma general, ¿cuál es la velocidad máxima de un turismo en una carretera convencional?",
            "90 km/h.",
            "100 km/h.",
            "120 km/h.",
            0,
            "El límite genérico para turismos en carreteras convencionales es de 90 km/h, salvo señalización que establezca otro límite.",
            253, 9,
            "Reglamento General de Circulación, artículo 48",
            QuestionDifficulty.EASY
        ),

        q(
            444,
            "Mecánica y mantenimiento",
            "Aceite del motor",
            "¿Por qué debe sustituirse periódicamente el aceite lubricante del motor?",
            "Porque con el uso pierde propiedades y un aceite en buen estado reduce el desgaste.",
            "Porque siempre aumenta mucho su viscosidad.",
            "Únicamente porque disminuye su volumen.",
            0,
            "El aceite se degrada con el uso y el tiempo, por lo que debe cambiarse siguiendo las recomendaciones del fabricante.",
            253, 11,
            "DGT - Mantenimiento del motor",
            QuestionDifficulty.EASY
        ),

        q(
            445,
            "Estacionamiento",
            "Pendientes",
            "En un vehículo con cambio manual estacionado en una pendiente ascendente, además del freno de estacionamiento debe dejarse...",
            "la primera velocidad.",
            "la marcha atrás.",
            "el punto muerto.",
            0,
            "En pendiente ascendente debe dejarse engranada la primera velocidad; en descendente, la marcha atrás.",
            253, 14,
            "Reglamento General de Circulación, artículo 92"
        ),

        q(
            446,
            "Maniobras",
            "Giro a la izquierda",
            "En una calzada de doble sentido con tres carriles separados por líneas discontinuas, ¿dónde debe colocarse para girar a la izquierda?",
            "En el carril central.",
            "En el arcén derecho.",
            "En el carril destinado al sentido contrario.",
            0,
            "En una calzada de doble sentido con tres carriles, el cambio de dirección a la izquierda se prepara ocupando el carril central.",
            253, 15,
            "Reglamento General de Circulación, artículo 75"
        )
    )
}
