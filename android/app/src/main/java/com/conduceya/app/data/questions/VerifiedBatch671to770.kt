package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object VerifiedBatch671to770 {

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
        sourceType: QuestionSourceType,
        reference: String,
        difficulty: QuestionDifficulty
    ) = TestQuestion(
        id = id,
        topic = topic,
        subtopic = subtopic,
        text = text,
        answers = listOf(a, b, c),
        correctAnswer = correct,
        explanation = explanation,
        origin = QuestionOrigin.VERIFIED,
        sourceType = sourceType,
        reference = reference,
        legalReference = reference,
        lastVerified = "2026-09-29",
        difficulty = difficulty
    )

    val questions = listOf(
        q(
            671,
            "Velocidades",
            "Vía sin pavimentar",
            "Como norma general, ¿cuál es la velocidad máxima en una vía sin pavimentar?",
            "30 km/h.",
            "50 km/h.",
            "70 km/h.",
            0,
            "El Reglamento fija 30 km/h como límite máximo en vías sin pavimentar.",
            QuestionSourceType.BOE,
            "RGC, artículo 48",
            QuestionDifficulty.EASY
        ),

        q(
            672,
            "Velocidades",
            "Vehículos especiales",
            "Un vehículo especial que carece de señalización de frenado o lleva remolque tiene, como norma general, una velocidad máxima de...",
            "25 km/h.",
            "40 km/h.",
            "70 km/h.",
            0,
            "Para estos vehículos especiales el límite general es de 25 km/h.",
            QuestionSourceType.BOE,
            "RGC, artículo 48",
            QuestionDifficulty.MEDIUM
        ),

        q(
            673,
            "Velocidades",
            "Vehículos especiales",
            "Como norma general, un vehículo especial que no pertenece al grupo limitado a 25 km/h tiene una velocidad máxima de...",
            "40 km/h.",
            "60 km/h.",
            "90 km/h.",
            0,
            "El límite general para los restantes vehículos especiales es 40 km/h, salvo determinados supuestos.",
            QuestionSourceType.BOE,
            "RGC, artículo 48",
            QuestionDifficulty.MEDIUM
        ),

        q(
            674,
            "Velocidades",
            "Vehículos especiales",
            "Determinados vehículos especiales capaces de superar 60 km/h en llano y que cumplen las condiciones reglamentarias pueden alcanzar como máximo...",
            "70 km/h.",
            "90 km/h.",
            "100 km/h.",
            0,
            "El Reglamento contempla para esos vehículos especiales una velocidad máxima de 70 km/h.",
            QuestionSourceType.BOE,
            "RGC, artículo 48",
            QuestionDifficulty.HARD
        ),

        q(
            675,
            "Velocidades",
            "Triciclos y cuadriciclos",
            "Como norma general, el límite máximo para vehículos de tres ruedas y cuadriciclos donde esté permitida su circulación es...",
            "70 km/h.",
            "90 km/h.",
            "120 km/h.",
            0,
            "La normativa establece un máximo de 70 km/h para estos vehículos.",
            QuestionSourceType.BOE,
            "RGC, artículo 48",
            QuestionDifficulty.MEDIUM
        ),

        q(
            676,
            "Velocidades",
            "Ciclomotores",
            "Como norma general, la velocidad máxima de un ciclomotor es...",
            "45 km/h.",
            "60 km/h.",
            "80 km/h.",
            0,
            "Los ciclomotores tienen fijada una velocidad máxima de 45 km/h.",
            QuestionSourceType.BOE,
            "RGC, artículo 48",
            QuestionDifficulty.EASY
        ),

        q(
            677,
            "Velocidades",
            "Señalización específica",
            "Si una señal fija una velocidad máxima inferior al límite genérico de la vía, ¿qué límite debe respetarse?",
            "El indicado por la señal.",
            "El límite genérico.",
            "El más alto de los dos.",
            0,
            "Las limitaciones específicas señalizadas prevalecen sobre las genéricas.",
            QuestionSourceType.BOE,
            "RGC, artículos 47 y 52",
            QuestionDifficulty.EASY
        ),

        q(
            678,
            "Velocidades",
            "Limitaciones temporales",
            "¿Puede la autoridad competente establecer temporalmente un límite de velocidad distinto mediante señalización variable o circunstancial?",
            "Sí.",
            "No.",
            "Solo dentro de poblado.",
            0,
            "Las condiciones del tráfico o de la vía pueden justificar limitaciones temporales señalizadas.",
            QuestionSourceType.BOE,
            "RGC, artículo 47",
            QuestionDifficulty.MEDIUM
        ),

        q(
            679,
            "Velocidades",
            "Velocidad mínima",
            "¿Puede circularse por debajo de la velocidad mínima cuando las condiciones del tráfico, del vehículo o de la vía impiden mantenerla sin riesgo?",
            "Sí.",
            "No, nunca.",
            "Solo en ciudad.",
            0,
            "La normativa permite circular por debajo del mínimo cuando existe una causa justificada.",
            QuestionSourceType.BOE,
            "RGC, artículo 49",
            QuestionDifficulty.EASY
        ),

        q(
            680,
            "Velocidades",
            "Velocidad anormalmente reducida",
            "Si un vehículo no puede alcanzar la velocidad mínima y existe peligro de alcance, ¿debe advertir su presencia mediante la señal de emergencia?",
            "Sí.",
            "No.",
            "Solo de noche.",
            0,
            "La señal de emergencia debe utilizarse en este supuesto para advertir a quienes se aproximan por detrás.",
            QuestionSourceType.BOE,
            "RGC, artículo 49",
            QuestionDifficulty.MEDIUM
        ),

        q(
            681,
            "Distancia de seguridad",
            "Reducción de velocidad",
            "Salvo peligro inminente, antes de reducir considerablemente la velocidad debe...",
            "comprobar que puede hacerlo sin riesgo y advertirlo cuando proceda.",
            "frenar bruscamente.",
            "encender la luz de carretera.",
            0,
            "Una reducción importante no debe realizarse de forma brusca si puede crear riesgo de alcance.",
            QuestionSourceType.BOE,
            "RGC, artículo 53",
            QuestionDifficulty.EASY
        ),

        q(
            682,
            "Distancia de seguridad",
            "Vehículo precedente",
            "La separación con el vehículo precedente debe permitir...",
            "detenerse si éste frena bruscamente sin colisionar.",
            "circular a menos de un metro.",
            "adelantar siempre inmediatamente.",
            0,
            "La distancia debe adaptarse a velocidad, adherencia y capacidad de frenado.",
            QuestionSourceType.BOE,
            "RGC, artículo 54",
            QuestionDifficulty.EASY
        ),

        q(
            683,
            "Distancia de seguridad",
            "Vehículos pesados",
            "Fuera de determinados supuestos, un vehículo de más de 3.500 kg que no pretende adelantar debe dejar para facilitar adelantamientos una separación mínima de...",
            "50 metros.",
            "25 metros.",
            "100 metros.",
            0,
            "La normativa establece 50 metros para determinados vehículos pesados o conjuntos largos.",
            QuestionSourceType.BOE,
            "RGC, artículo 54",
            QuestionDifficulty.HARD
        ),

        q(
            684,
            "Distancia de seguridad",
            "Poblado",
            "¿Se aplica en poblado la obligación especial de 50 metros destinada a facilitar el adelantamiento de ciertos vehículos pesados?",
            "No.",
            "Sí, siempre.",
            "Solo de noche.",
            0,
            "El Reglamento excluye expresamente el poblado de esta obligación adicional.",
            QuestionSourceType.BOE,
            "RGC, artículo 54",
            QuestionDifficulty.HARD
        ),

        q(
            685,
            "Distancia de seguridad",
            "Adelantamiento prohibido",
            "¿Se exige la separación especial destinada a facilitar un adelantamiento donde adelantar está prohibido?",
            "No.",
            "Sí.",
            "Solo a camiones.",
            0,
            "La obligación adicional no se aplica donde el adelantamiento está prohibido.",
            QuestionSourceType.BOE,
            "RGC, artículo 54",
            QuestionDifficulty.MEDIUM
        ),

        q(
            686,
            "Prioridad",
            "Intersecciones señalizadas",
            "En una intersección señalizada, la prioridad se determina principalmente por...",
            "la señalización existente.",
            "el tamaño de los vehículos.",
            "quién llegue más rápido.",
            0,
            "En las intersecciones señalizadas debe obedecerse la señalización que regula la preferencia.",
            QuestionSourceType.BOE,
            "RGC, artículo 56",
            QuestionDifficulty.EASY
        ),

        q(
            687,
            "Prioridad",
            "Vía pavimentada",
            "En una intersección sin señalizar entre una vía pavimentada y otra sin pavimentar, tiene prioridad...",
            "quien circula por la vía pavimentada.",
            "quien llega por la izquierda.",
            "quien circula por la vía sin pavimentar.",
            0,
            "La vía pavimentada constituye una excepción a la regla general de prioridad de la derecha.",
            QuestionSourceType.BOE,
            "RGC, artículo 57",
            QuestionDifficulty.EASY
        ),

        q(
            688,
            "Prioridad",
            "Vehículos sobre raíles",
            "En una intersección sin señalizar, un vehículo que circula sobre raíles...",
            "tiene prioridad sobre los demás usuarios.",
            "debe ceder siempre.",
            "solo tiene prioridad dentro de poblado.",
            0,
            "Los vehículos que circulan por raíles tienen prioridad en este supuesto.",
            QuestionSourceType.BOE,
            "RGC, artículo 57",
            QuestionDifficulty.MEDIUM
        ),

        q(
            689,
            "Prioridad",
            "Autopista y autovía",
            "Los vehículos que ya circulan por una autopista o autovía tienen prioridad sobre...",
            "los que pretenden incorporarse.",
            "los que circulan por el carril izquierdo.",
            "los vehículos pesados.",
            0,
            "Quien se incorpora debe respetar a quienes ya circulan por la vía.",
            QuestionSourceType.BOE,
            "RGC, artículo 57",
            QuestionDifficulty.EASY
        ),

        q(
            690,
            "Prioridad",
            "Cesión del paso",
            "Cuando debe ceder el paso, no debe obligar al vehículo prioritario a...",
            "modificar bruscamente su trayectoria o velocidad.",
            "encender los intermitentes.",
            "circular por la derecha.",
            0,
            "La cesión debe ser clara y realizarse con suficiente antelación.",
            QuestionSourceType.BOE,
            "RGC, artículo 58",
            QuestionDifficulty.MEDIUM
        ),

        q(
            691,
            "Señalización",
            "Línea discontinua",
            "Una línea longitudinal discontinua puede atravesarse...",
            "cuando la maniobra está permitida y puede realizarse con seguridad.",
            "nunca.",
            "solo por motocicletas.",
            0,
            "La línea discontinua permite determinadas maniobras si las demás normas también las permiten.",
            QuestionSourceType.BOE,
            "RGC - marcas viales",
            QuestionDifficulty.EASY
        ),

        q(
            692,
            "Señalización",
            "Línea continua",
            "Como norma general, una línea longitudinal continua...",
            "no debe atravesarse ni circular sobre ella.",
            "puede cruzarse libremente.",
            "solo afecta a camiones.",
            0,
            "La marca continua impone una prohibición de atravesarla o circular sobre ella, salvo excepciones reglamentarias.",
            QuestionSourceType.BOE,
            "RGC - marcas viales",
            QuestionDifficulty.EASY
        ),

        q(
            693,
            "Señalización",
            "Doble línea continua",
            "Dos líneas longitudinales continuas juntas tienen...",
            "el mismo significado básico que una línea continua.",
            "el mismo significado que una discontinua.",
            "únicamente valor informativo.",
            0,
            "La doble línea continua mantiene la prohibición de atravesarla.",
            QuestionSourceType.BOE,
            "RGC - marcas viales",
            QuestionDifficulty.EASY
        ),

        q(
            694,
            "Señalización",
            "Línea de detención",
            "Una línea transversal de detención indica...",
            "el lugar ante el que debe detenerse cuando una señal obliga a hacerlo.",
            "un lugar reservado para estacionar.",
            "el comienzo de un carril bus.",
            0,
            "La línea señala el punto de detención asociado a la regulación correspondiente.",
            QuestionSourceType.BOE,
            "RGC - marcas viales",
            QuestionDifficulty.EASY
        ),

        q(
            695,
            "Señalización",
            "STOP horizontal",
            "Una marca de STOP pintada en un carril obliga...",
            "a los vehículos que circulan por ese carril.",
            "a todos los vehículos de cualquier vía próxima.",
            "solo a motocicletas.",
            0,
            "Cuando la marca está en un carril delimitado, afecta a quienes circulan por él.",
            QuestionSourceType.BOE,
            "Catálogo oficial de señales - marcas horizontales",
            QuestionDifficulty.MEDIUM
        ),

        q(
            696,
            "Señalización",
            "Ceda el paso horizontal",
            "Una marca horizontal de Ceda el paso obliga a...",
            "ceder la prioridad y detenerse si es necesario.",
            "detenerse siempre aunque no exista tráfico.",
            "acelerar para cruzar antes.",
            0,
            "El conductor debe ceder el paso y detenerse cuando resulte preciso.",
            QuestionSourceType.BOE,
            "Catálogo oficial de señales - marcas horizontales",
            QuestionDifficulty.EASY
        ),

        q(
            697,
            "Señalización",
            "Flechas de carril",
            "Las flechas de selección de carril sirven para...",
            "indicar las direcciones que pueden o deben seguirse desde el carril correspondiente.",
            "fijar una velocidad mínima.",
            "indicar una zona de estacionamiento.",
            0,
            "Las flechas ayudan a ordenar los movimientos por carriles.",
            QuestionSourceType.BOE,
            "Catálogo oficial de señales - marcas viales",
            QuestionDifficulty.EASY
        ),

        q(
            698,
            "Señalización",
            "Aspa roja de carril",
            "Un aspa roja iluminada sobre un carril obliga a...",
            "abandonar ese carril cuanto antes.",
            "continuar por él.",
            "detenerse exactamente bajo el semáforo.",
            0,
            "El aspa roja prohíbe ocupar el carril indicado.",
            QuestionSourceType.BOE,
            "RGC - semáforos de carril",
            QuestionDifficulty.EASY
        ),

        q(
            699,
            "Señalización",
            "Flecha verde de carril",
            "Una flecha verde sobre un carril significa que...",
            "puede utilizarse el carril, respetando el resto de normas.",
            "se tiene prioridad absoluta.",
            "puede superarse el límite de velocidad.",
            0,
            "La flecha verde habilita el carril, pero no anula otras obligaciones.",
            QuestionSourceType.BOE,
            "RGC - semáforos de carril",
            QuestionDifficulty.EASY
        ),

        q(
            700,
            "Señalización",
            "Panel variable",
            "Una indicación obligatoria mostrada en un panel de mensaje variable...",
            "debe respetarse.",
            "es solo una recomendación.",
            "solo afecta a vehículos pesados.",
            0,
            "Los paneles variables pueden utilizarse para regular el tráfico y establecer instrucciones obligatorias.",
            QuestionSourceType.BOE,
            "RGC - señalización variable",
            QuestionDifficulty.MEDIUM
        ),

        q(
            701,
            "Maniobras",
            "Incorporación desde propiedad",
            "Al salir desde un garaje o propiedad privada hacia una vía pública debe...",
            "ceder el paso a quienes circulan por la vía.",
            "tener siempre prioridad.",
            "hacer sonar el claxon y entrar.",
            0,
            "Quien accede desde una propiedad privada debe incorporarse sin crear peligro y ceder el paso.",
            QuestionSourceType.BOE,
            "RGC - incorporación",
            QuestionDifficulty.EASY
        ),

        q(
            702,
            "Maniobras",
            "Incorporación",
            "Antes de incorporarse a la circulación debe...",
            "observar, señalizar y asegurarse de que puede hacerlo sin peligro.",
            "acelerar sin observar.",
            "detener a quienes circulan por la vía.",
            0,
            "La incorporación exige comprobación previa y señalización de la maniobra.",
            QuestionSourceType.BOE,
            "RGC - incorporación",
            QuestionDifficulty.EASY
        ),

        q(
            703,
            "Maniobras",
            "Desplazamiento lateral",
            "Un desplazamiento lateral debe señalizarse...",
            "con suficiente antelación.",
            "después de realizarlo.",
            "solo de noche.",
            0,
            "La señal debe permitir que los demás usuarios anticipen la maniobra.",
            QuestionSourceType.BOE,
            "RGC - maniobras",
            QuestionDifficulty.EASY
        ),

        q(
            704,
            "Maniobras",
            "Cambio de sentido",
            "¿Puede realizarse un cambio de sentido si obliga a otros usuarios a frenar bruscamente?",
            "No.",
            "Sí.",
            "Solo dentro de poblado.",
            0,
            "La maniobra debe realizarse sin crear peligro ni obstaculización indebida.",
            QuestionSourceType.BOE,
            "RGC - cambio de sentido",
            QuestionDifficulty.EASY
        ),

        q(
            705,
            "Maniobras",
            "Marcha atrás",
            "La marcha atrás debe efectuarse...",
            "lentamente y tras comprobar que puede realizarse sin peligro.",
            "a velocidad normal.",
            "sin mirar por los retrovisores.",
            0,
            "La limitada visibilidad obliga a extremar la precaución.",
            QuestionSourceType.BOE,
            "RGC - marcha atrás",
            QuestionDifficulty.EASY
        ),

        q(
            706,
            "Estacionamiento",
            "Curvas",
            "¿Puede pararse en una curva donde la visibilidad es insuficiente?",
            "No.",
            "Sí, con las luces de emergencia.",
            "Solo durante un minuto.",
            0,
            "La parada en lugares de visibilidad reducida puede crear un riesgo grave.",
            QuestionSourceType.BOE,
            "RGC - parada y estacionamiento",
            QuestionDifficulty.EASY
        ),

        q(
            707,
            "Estacionamiento",
            "Túneles",
            "Como norma general, ¿está permitido parar o estacionar dentro de un túnel fuera de lugares habilitados?",
            "No.",
            "Sí.",
            "Solo de día.",
            0,
            "Los túneles son lugares de especial riesgo y la parada voluntaria está prohibida.",
            QuestionSourceType.BOE,
            "RGC - parada y estacionamiento",
            QuestionDifficulty.EASY
        ),

        q(
            708,
            "Estacionamiento",
            "Pasos a nivel",
            "¿Está permitido estacionar sobre un paso a nivel?",
            "No.",
            "Sí, si no viene ningún tren.",
            "Solo por la noche.",
            0,
            "Debe mantenerse libre la zona del paso ferroviario.",
            QuestionSourceType.BOE,
            "RGC - parada y estacionamiento",
            QuestionDifficulty.EASY
        ),

        q(
            709,
            "Estacionamiento",
            "Carril reservado",
            "¿Puede estacionarse un turismo en un carril reservado exclusivamente para otros vehículos?",
            "No.",
            "Sí durante menos de cinco minutos.",
            "Solo con emergencia encendida.",
            0,
            "No puede ocuparse mediante estacionamiento un carril reservado a otros usuarios.",
            QuestionSourceType.BOE,
            "RGC - parada y estacionamiento",
            QuestionDifficulty.EASY
        ),

        q(
            710,
            "Estacionamiento",
            "Señales",
            "¿Puede estacionarse de forma que el vehículo oculte una señal a quienes deben verla?",
            "No.",
            "Sí, si queda espacio suficiente.",
            "Solo fuera de poblado.",
            0,
            "Está prohibido obstaculizar la visibilidad de señales relevantes para otros usuarios.",
            QuestionSourceType.BOE,
            "RGC - parada y estacionamiento",
            QuestionDifficulty.EASY
        ),

        q(
            711,
            "Peatones",
            "Paso de peatones",
            "Al aproximarse a un paso para peatones debe...",
            "adaptar la velocidad y ceder cuando corresponda.",
            "acelerar.",
            "utilizar obligatoriamente el claxon.",
            0,
            "Debe poder detenerse con seguridad y respetar la prioridad de los peatones.",
            QuestionSourceType.DGT,
            "DGT - peatones",
            QuestionDifficulty.EASY
        ),

        q(
            712,
            "Peatones",
            "Giro",
            "Al girar para entrar en otra vía, debe prestar especial atención a...",
            "peatones que estén cruzando la calzada.",
            "solo vehículos pesados.",
            "únicamente semáforos.",
            0,
            "Los giros generan conflictos frecuentes con peatones y requieren observación específica.",
            QuestionSourceType.DGT,
            "DGT - usuarios vulnerables",
            QuestionDifficulty.EASY
        ),

        q(
            713,
            "Ciclistas",
            "Paso para ciclistas",
            "Un ciclista que circula correctamente por un paso para ciclistas...",
            "puede tener prioridad en los supuestos establecidos.",
            "debe detenerse siempre aunque tenga prioridad.",
            "nunca tiene prioridad.",
            0,
            "Los pasos para ciclistas están regulados específicamente y deben respetarse.",
            QuestionSourceType.BOE,
            "RGC - prioridad de ciclistas",
            QuestionDifficulty.MEDIUM
        ),

        q(
            714,
            "Ciclistas",
            "Grupo",
            "Si varios ciclistas circulan en grupo y el primero ya ha entrado en una glorieta, ¿puede existir prioridad para el grupo en los términos reglamentarios?",
            "Sí.",
            "No.",
            "Solo si son profesionales.",
            0,
            "La normativa contempla específicamente la circulación de ciclistas en grupo.",
            QuestionSourceType.BOE,
            "RGC - prioridad de ciclistas",
            QuestionDifficulty.MEDIUM
        ),

        q(
            715,
            "Peatones",
            "Niños",
            "Cerca de colegios o zonas con niños debe...",
            "reducir la velocidad y prever movimientos inesperados.",
            "mantener siempre la velocidad máxima.",
            "circular más cerca de la acera.",
            0,
            "Los niños pueden aparecer repentinamente en la calzada.",
            QuestionSourceType.DGT,
            "DGT - seguridad infantil",
            QuestionDifficulty.EASY
        ),

        q(
            716,
            "Peatones",
            "Personas mayores",
            "Ante peatones de edad avanzada conviene...",
            "darles tiempo suficiente y prever que puedan calcular peor velocidad o distancia.",
            "pasar rápidamente junto a ellos.",
            "utilizar el claxon para que aceleren.",
            0,
            "Algunas capacidades perceptivas y de movilidad pueden disminuir con la edad.",
            QuestionSourceType.DGT,
            "DGT - peatones mayores",
            QuestionDifficulty.EASY
        ),

        q(
            717,
            "Ciclistas",
            "Viento",
            "Con fuerte viento lateral, un ciclista puede...",
            "desviarse inesperadamente de su trayectoria.",
            "mantener siempre una trayectoria perfecta.",
            "aumentar automáticamente su velocidad.",
            0,
            "El bajo peso de la bicicleta hace que el viento lateral influya especialmente.",
            QuestionSourceType.DGT,
            "DGT - ciclistas",
            QuestionDifficulty.EASY
        ),

        q(
            718,
            "Conducción segura",
            "Ángulos muertos",
            "Al circular junto a un vehículo pesado debe recordar que...",
            "puede tener amplios ángulos muertos.",
            "siempre puede verlo perfectamente.",
            "no necesita guardar separación lateral.",
            0,
            "Camiones y autobuses tienen zonas amplias que el conductor puede no ver.",
            QuestionSourceType.DGT,
            "DGT - ángulos muertos",
            QuestionDifficulty.EASY
        ),

        q(
            719,
            "Motocicletas",
            "Visibilidad",
            "Una motocicleta puede resultar más difícil de detectar porque...",
            "tiene menor tamaño visual que un turismo.",
            "siempre circula sin luces.",
            "no puede utilizar retrovisores.",
            0,
            "Su menor volumen aparente puede dificultar calcular distancia y velocidad.",
            QuestionSourceType.DGT,
            "DGT - motocicletas",
            QuestionDifficulty.EASY
        ),

        q(
            720,
            "Ciclistas",
            "Puertas de vehículos",
            "Antes de abrir una puerta junto a un carril por el que pueden circular bicicletas debe...",
            "comprobar cuidadosamente que no se aproxima ningún ciclista.",
            "abrirla rápidamente.",
            "hacer sonar el claxon.",
            0,
            "La apertura de puertas es un riesgo importante para ciclistas y motociclistas.",
            QuestionSourceType.DGT,
            "DGT - convivencia vial",
            QuestionDifficulty.EASY
        ),

        q(
            721,
            "Motocicletas",
            "Casco",
            "El casco de protección debe llevarse...",
            "correctamente ajustado y abrochado.",
            "desabrochado en ciudad.",
            "solo en viajes largos.",
            0,
            "Un casco sin abrochar puede desprenderse durante un accidente.",
            QuestionSourceType.DGT,
            "DGT - casco",
            QuestionDifficulty.EASY
        ),

        q(
            722,
            "Motocicletas",
            "Pasajero",
            "El pasajero de una motocicleta debe utilizar...",
            "los reposapiés destinados a él.",
            "el suelo cuando el vehículo se detiene.",
            "el manillar para apoyar los pies.",
            0,
            "La posición correcta del pasajero mejora la estabilidad y seguridad.",
            QuestionSourceType.DGT,
            "DGT - pasajeros en motocicleta",
            QuestionDifficulty.EASY
        ),

        q(
            723,
            "Motocicletas",
            "Alumbrado",
            "Durante el día una motocicleta debe llevar encendida...",
            "la luz de cruce.",
            "solo la luz de posición.",
            "ninguna luz.",
            0,
            "La luz de cruce diurna mejora la visibilidad de la motocicleta.",
            QuestionSourceType.BOE,
            "RGC, artículo 104",
            QuestionDifficulty.EASY
        ),

        q(
            724,
            "Motocicletas",
            "Frenado",
            "En una frenada normal de motocicleta, utilizar correctamente ambos frenos puede...",
            "mejorar la eficacia y estabilidad.",
            "ser siempre peligroso.",
            "hacer imposible dirigir.",
            0,
            "La distribución adecuada de la frenada permite aprovechar la adherencia disponible.",
            QuestionSourceType.DGT,
            "DGT - conducción de motocicletas",
            QuestionDifficulty.MEDIUM
        ),

        q(
            725,
            "Motocicletas",
            "Lluvia",
            "Cuando llueve, una motocicleta debe circular...",
            "con movimientos suaves y mayor margen de seguridad.",
            "con frenadas bruscas.",
            "más rápido para reducir el tiempo de exposición.",
            0,
            "La adherencia disminuye y los movimientos bruscos aumentan el riesgo de caída.",
            QuestionSourceType.DGT,
            "DGT - motocicletas y lluvia",
            QuestionDifficulty.EASY
        ),

        q(
            726,
            "Ciclomotores",
            "Autopistas y autovías",
            "¿Puede un ciclomotor circular por autopistas o autovías?",
            "No.",
            "Sí por el arcén.",
            "Sí si supera 45 km/h.",
            0,
            "Los ciclomotores tienen prohibida la circulación por autopistas y autovías.",
            QuestionSourceType.BOE,
            "RGC - autopistas y autovías",
            QuestionDifficulty.EASY
        ),

        q(
            727,
            "Ciclomotores",
            "Arcén",
            "Fuera de poblado, cuando existe arcén transitable y suficiente, un ciclomotor debe circular normalmente...",
            "por el arcén de la derecha.",
            "por el centro del carril.",
            "por el arcén izquierdo.",
            0,
            "Los ciclomotores están entre los vehículos obligados a utilizar el arcén en esos supuestos.",
            QuestionSourceType.BOE,
            "RGC, artículo 36",
            QuestionDifficulty.EASY
        ),

        q(
            728,
            "Motocicletas",
            "Neumáticos",
            "La presión de los neumáticos de una motocicleta debe...",
            "ajustarse a las recomendaciones del fabricante.",
            "reducirse siempre cuando llueve.",
            "ser idéntica delante y detrás.",
            0,
            "Una presión incorrecta altera estabilidad, desgaste y comportamiento.",
            QuestionSourceType.DGT,
            "DGT - neumáticos de motocicleta",
            QuestionDifficulty.EASY
        ),

        q(
            729,
            "Motocicletas",
            "Pasajero",
            "Transportar un pasajero en una motocicleta puede...",
            "modificar aceleración, frenada y comportamiento del vehículo.",
            "no producir ningún cambio.",
            "reducir siempre la distancia de frenado.",
            0,
            "El peso adicional modifica el reparto de masas y la respuesta dinámica.",
            QuestionSourceType.DGT,
            "DGT - conducción con pasajero",
            QuestionDifficulty.MEDIUM
        ),

        q(
            730,
            "Motocicletas",
            "Equipamiento",
            "Guantes, chaqueta y pantalones adecuados pueden...",
            "reducir las consecuencias de una caída.",
            "sustituir al casco.",
            "eliminar todo riesgo de lesión.",
            0,
            "La ropa de protección reduce abrasiones y otras lesiones.",
            QuestionSourceType.DGT,
            "DGT - equipamiento motorista",
            QuestionDifficulty.EASY
        ),

        q(
            731,
            "Mecánica y mantenimiento",
            "Líquido de frenos",
            "¿Debe revisarse el líquido de frenos siguiendo las indicaciones del fabricante?",
            "Sí.",
            "No.",
            "Solo al pasar la ITV.",
            0,
            "El sistema de frenado necesita mantenimiento periódico para funcionar correctamente.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento",
            QuestionDifficulty.EASY
        ),

        q(
            732,
            "Mecánica y mantenimiento",
            "Refrigerante",
            "El nivel del líquido refrigerante debe comprobarse preferentemente...",
            "siguiendo las indicaciones del fabricante y evitando abrir el sistema en caliente.",
            "abriendo el tapón inmediatamente después de un viaje.",
            "solo una vez en la vida del vehículo.",
            0,
            "Un sistema caliente puede estar presurizado y causar quemaduras.",
            QuestionSourceType.DGT,
            "DGT - refrigeración",
            QuestionDifficulty.MEDIUM
        ),

        q(
            733,
            "Mecánica y mantenimiento",
            "Batería",
            "Una batería en mal estado puede provocar...",
            "dificultades de arranque y fallos eléctricos.",
            "mayor adherencia.",
            "menor desgaste de neumáticos.",
            0,
            "La batería alimenta sistemas esenciales y permite el arranque del motor.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento",
            QuestionDifficulty.EASY
        ),

        q(
            734,
            "Mecánica y mantenimiento",
            "Parabrisas",
            "Una grieta importante en el parabrisas puede...",
            "reducir la visibilidad y comprometer su resistencia.",
            "mejorar la visión nocturna.",
            "no tener ninguna importancia.",
            0,
            "El parabrisas forma parte tanto del campo visual como de la estructura de seguridad.",
            QuestionSourceType.DGT,
            "DGT - visibilidad",
            QuestionDifficulty.EASY
        ),

        q(
            735,
            "Mecánica y mantenimiento",
            "Limpiaparabrisas",
            "Si las escobillas dejan zonas sin limpiar deben...",
            "revisarse o sustituirse.",
            "engrasarse con aceite de motor.",
            "utilizarse solo a mayor velocidad.",
            0,
            "Un parabrisas mal limpiado reduce sensiblemente la visibilidad con lluvia.",
            QuestionSourceType.DGT,
            "DGT - limpiaparabrisas",
            QuestionDifficulty.EASY
        ),

        q(
            736,
            "Mecánica y mantenimiento",
            "Faros",
            "Mantener limpios los faros ayuda a...",
            "conservar una iluminación eficaz.",
            "aumentar la potencia del motor.",
            "reducir la presión de los neumáticos.",
            0,
            "La suciedad puede reducir la cantidad de luz emitida.",
            QuestionSourceType.DGT,
            "DGT - alumbrado",
            QuestionDifficulty.EASY
        ),

        q(
            737,
            "Mecánica y mantenimiento",
            "Dirección",
            "Una holgura anormal en la dirección debe...",
            "ser revisada.",
            "ignorarse.",
            "compensarse aumentando la velocidad.",
            0,
            "Una dirección defectuosa puede dificultar controlar la trayectoria.",
            QuestionSourceType.DGT,
            "DGT - dirección",
            QuestionDifficulty.EASY
        ),

        q(
            738,
            "Mecánica y mantenimiento",
            "Suspensión",
            "Una suspensión deteriorada puede...",
            "reducir el contacto adecuado de los neumáticos con la calzada.",
            "mejorar la frenada.",
            "no afectar a la estabilidad.",
            0,
            "La suspensión influye directamente en adherencia, estabilidad y frenado.",
            QuestionSourceType.DGT,
            "DGT - suspensión",
            QuestionDifficulty.EASY
        ),

        q(
            739,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "Un neumático con bultos, cortes importantes o daños visibles debe...",
            "ser revisado y sustituido cuando corresponda.",
            "seguir utilizándose hasta que pierda aire.",
            "inflarse por encima de la presión máxima.",
            0,
            "Los daños estructurales pueden provocar un fallo repentino.",
            QuestionSourceType.DGT,
            "DGT - neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            740,
            "Mecánica y mantenimiento",
            "Reparación de pinchazos",
            "Si el vehículo utiliza un kit reparapinchazos en lugar de rueda de repuesto debe...",
            "usarse según las instrucciones y limitaciones del fabricante.",
            "permitir siempre circular indefinidamente.",
            "utilizarse para cualquier daño del neumático.",
            0,
            "Los kits tienen condiciones y limitaciones concretas de utilización.",
            QuestionSourceType.DGT,
            "DGT - averías y neumáticos",
            QuestionDifficulty.MEDIUM
        ),

        q(
            741,
            "Sistemas de seguridad",
            "ABS",
            "El ABS ayuda principalmente a...",
            "evitar el bloqueo de las ruedas durante una frenada intensa.",
            "evitar cualquier accidente.",
            "aumentar la potencia del motor.",
            0,
            "Al evitar el bloqueo facilita conservar capacidad de dirección durante la frenada.",
            QuestionSourceType.DGT,
            "DGT - ABS",
            QuestionDifficulty.EASY
        ),

        q(
            742,
            "Sistemas de seguridad",
            "ESC",
            "El control electrónico de estabilidad puede ayudar a...",
            "corregir determinadas pérdidas de trayectoria.",
            "sustituir al conductor.",
            "aumentar el límite legal de velocidad.",
            0,
            "El ESC actúa sobre el vehículo para ayudar a recuperar estabilidad dentro de los límites físicos.",
            QuestionSourceType.DGT,
            "DGT - ESC",
            QuestionDifficulty.EASY
        ),

        q(
            743,
            "Sistemas de seguridad",
            "Frenado automático",
            "Un sistema de frenado automático de emergencia...",
            "puede ayudar a evitar o reducir determinadas colisiones.",
            "hace innecesario mirar la carretera.",
            "garantiza que nunca habrá un accidente.",
            0,
            "Es una ayuda al conductor, no un sustituto de la atención.",
            QuestionSourceType.DGT,
            "DGT - ADAS",
            QuestionDifficulty.EASY
        ),

        q(
            744,
            "Sistemas de seguridad",
            "Asistente de carril",
            "Un asistente de mantenimiento de carril...",
            "puede ayudar a corregir una salida involuntaria, pero el conductor sigue siendo responsable.",
            "permite dormir al conductor.",
            "elimina la necesidad de utilizar intermitentes.",
            0,
            "Los sistemas de asistencia no sustituyen la conducción activa.",
            QuestionSourceType.DGT,
            "DGT - ADAS",
            QuestionDifficulty.EASY
        ),

        q(
            745,
            "Sistemas de seguridad",
            "Ángulo muerto",
            "Un detector de ángulo muerto...",
            "es una ayuda, pero no sustituye comprobar el entorno antes de cambiar de carril.",
            "garantiza que nunca existe ningún vehículo al lado.",
            "permite cambiar de carril sin señalizar.",
            0,
            "Los sensores pueden tener limitaciones y deben complementarse con observación.",
            QuestionSourceType.DGT,
            "DGT - ADAS",
            QuestionDifficulty.EASY
        ),

        q(
            746,
            "Sistemas de seguridad",
            "Control de crucero adaptativo",
            "El control de crucero adaptativo puede...",
            "ayudar a mantener velocidad y distancia, pero exige supervisión del conductor.",
            "conducir siempre de forma autónoma.",
            "sustituir los frenos del vehículo.",
            0,
            "Es un sistema de asistencia que debe supervisarse continuamente.",
            QuestionSourceType.DGT,
            "DGT - ADAS",
            QuestionDifficulty.EASY
        ),

        q(
            747,
            "Sistemas de seguridad",
            "Sensores de aparcamiento",
            "Los sensores de aparcamiento...",
            "no eliminan la necesidad de observar el entorno.",
            "permiten maniobrar sin mirar.",
            "detectan siempre cualquier obstáculo.",
            0,
            "Pueden existir objetos o zonas que el sensor no detecte correctamente.",
            QuestionSourceType.DGT,
            "DGT - ayudas al estacionamiento",
            QuestionDifficulty.EASY
        ),

        q(
            748,
            "Sistemas de seguridad",
            "Cámara trasera",
            "Al dar marcha atrás con cámara posterior debe...",
            "seguir comprobando espejos y entorno.",
            "mirar únicamente la pantalla.",
            "aumentar la velocidad.",
            0,
            "La cámara ayuda, pero puede tener ángulos muertos o distorsiones.",
            QuestionSourceType.DGT,
            "DGT - ayudas a la conducción",
            QuestionDifficulty.EASY
        ),

        q(
            749,
            "Sistemas de seguridad",
            "TPMS",
            "El sistema de control de presión de neumáticos sirve para...",
            "advertir de determinadas pérdidas o anomalías de presión.",
            "medir el nivel de combustible.",
            "controlar el líquido refrigerante.",
            0,
            "El TPMS ayuda a detectar problemas de presión de los neumáticos.",
            QuestionSourceType.DGT,
            "DGT - neumáticos y ADAS",
            QuestionDifficulty.EASY
        ),

        q(
            750,
            "Sistemas de seguridad",
            "ADAS",
            "Los sistemas avanzados de ayuda a la conducción...",
            "complementan al conductor, pero no eliminan su responsabilidad.",
            "permiten dejar de prestar atención.",
            "permiten ignorar las señales.",
            0,
            "Las ayudas electrónicas tienen límites y necesitan supervisión humana.",
            QuestionSourceType.DGT,
            "DGT - ADAS",
            QuestionDifficulty.EASY
        ),

        q(
            751,
            "Fatiga y sueño",
            "Descanso",
            "Dormir pocas horas antes de un viaje puede...",
            "aumentar el riesgo de somnolencia.",
            "mejorar la capacidad de reacción.",
            "no producir ningún efecto.",
            0,
            "La falta de sueño deteriora atención, percepción y tiempo de reacción.",
            QuestionSourceType.DGT,
            "DGT - sueño y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            752,
            "Fatiga y sueño",
            "Cafeína",
            "El café puede sustituir completamente al descanso cuando existe sueño intenso.",
            "Falso.",
            "Verdadero.",
            "Solo de noche.",
            0,
            "La cafeína puede producir un efecto temporal, pero no elimina la necesidad de dormir.",
            QuestionSourceType.DGT,
            "DGT - sueño y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            753,
            "Fatiga y sueño",
            "Síntomas",
            "Si aparecen bostezos frecuentes, dificultad para mantener la atención o pesadez de ojos debe...",
            "detenerse en un lugar seguro y descansar.",
            "subir la velocidad.",
            "continuar hasta llegar al destino.",
            0,
            "Son señales típicas de fatiga o somnolencia.",
            QuestionSourceType.DGT,
            "DGT - fatiga",
            QuestionDifficulty.EASY
        ),

        q(
            754,
            "Fatiga y sueño",
            "Comidas",
            "Una comida muy copiosa antes de conducir puede...",
            "favorecer somnolencia.",
            "mejorar los reflejos.",
            "eliminar la fatiga.",
            0,
            "Las comidas abundantes pueden aumentar la sensación de sueño.",
            QuestionSourceType.DGT,
            "DGT - alimentación y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            755,
            "Conducción segura",
            "Hidratación",
            "Durante viajes largos y con calor conviene...",
            "mantener una hidratación adecuada.",
            "evitar cualquier líquido.",
            "consumir alcohol para refrescarse.",
            0,
            "La deshidratación puede contribuir al cansancio y reducir el bienestar y la concentración.",
            QuestionSourceType.DGT,
            "DGT - conducción con calor",
            QuestionDifficulty.EASY
        ),

        q(
            756,
            "Conducción segura",
            "Emociones",
            "Conducir muy enfadado puede...",
            "aumentar impulsividad y aceptación del riesgo.",
            "mejorar siempre la atención.",
            "reducir el tiempo de reacción.",
            0,
            "Las emociones intensas pueden alterar la toma de decisiones.",
            QuestionSourceType.DGT,
            "DGT - emociones y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            757,
            "Conducción segura",
            "Visión",
            "Si se produce un fuerte deslumbramiento debe...",
            "reducir la velocidad incluso hasta detenerse si es necesario.",
            "acelerar.",
            "cerrar los ojos momentáneamente.",
            0,
            "La velocidad debe adaptarse a la visibilidad real disponible.",
            QuestionSourceType.BOE,
            "RGC, artículo 102",
            QuestionDifficulty.MEDIUM
        ),

        q(
            758,
            "Medicamentos y conducción",
            "Prospecto",
            "Antes de conducir tomando un medicamento conviene comprobar...",
            "si puede afectar a la capacidad de conducción.",
            "solo su precio.",
            "el color del envase.",
            0,
            "El prospecto y el profesional sanitario informan de efectos como somnolencia o mareo.",
            QuestionSourceType.DGT,
            "DGT - medicamentos",
            QuestionDifficulty.EASY
        ),

        q(
            759,
            "Alcohol y drogas",
            "Alcohol",
            "Desde el punto de vista de la seguridad vial, la tasa más segura de alcohol es...",
            "0,0.",
            "0,5.",
            "la máxima permitida.",
            0,
            "Cualquier cantidad de alcohol puede afectar capacidades necesarias para conducir.",
            QuestionSourceType.DGT,
            "DGT - alcohol",
            QuestionDifficulty.EASY
        ),

        q(
            760,
            "Alcohol y drogas",
            "Drogas",
            "¿Existe una forma segura de conducir bajo los efectos de drogas ilegales?",
            "No.",
            "Sí, conduciendo despacio.",
            "Sí, tomando café.",
            0,
            "Las drogas pueden alterar percepción, atención, coordinación y conducta de forma imprevisible.",
            QuestionSourceType.DGT,
            "DGT - drogas",
            QuestionDifficulty.EASY
        ),

        q(
            761,
            "Permisos",
            "Permiso B",
            "El permiso B autoriza, con carácter general, a conducir automóviles cuya MMA no exceda de...",
            "3.500 kg.",
            "7.500 kg.",
            "12.000 kg.",
            0,
            "El límite general de MMA de los automóviles del permiso B es 3.500 kg.",
            QuestionSourceType.BOE,
            "Reglamento General de Conductores, artículo 4",
            QuestionDifficulty.EASY
        ),

        q(
            762,
            "Permisos",
            "Permiso B",
            "Un automóvil conducido con permiso B puede estar diseñado para transportar como máximo...",
            "ocho pasajeros además del conductor.",
            "dieciséis pasajeros además del conductor.",
            "veinte pasajeros además del conductor.",
            0,
            "El permiso B comprende automóviles de hasta ocho pasajeros además del conductor.",
            QuestionSourceType.BOE,
            "Reglamento General de Conductores, artículo 4",
            QuestionDifficulty.EASY
        ),

        q(
            763,
            "Permisos",
            "Remolques",
            "Con el permiso B, un automóvil de los autorizados por esta clase puede llevar un remolque de hasta...",
            "750 kg de MMA.",
            "1.500 kg de MMA sin ninguna condición.",
            "3.500 kg de MMA sin ninguna condición.",
            0,
            "El permiso B contempla directamente remolques cuya MMA no excede de 750 kg.",
            QuestionSourceType.BOE,
            "Reglamento General de Conductores, artículo 4",
            QuestionDifficulty.EASY
        ),

        q(
            764,
            "Permisos",
            "Conjuntos de vehículos",
            "El permiso B puede autorizar determinados conjuntos con remolque de más de 750 kg cuando la MMA del conjunto no exceda de...",
            "4.250 kg, cumpliendo los requisitos aplicables.",
            "7.500 kg.",
            "12.000 kg.",
            0,
            "El Reglamento contempla conjuntos de la categoría B hasta 4.250 kg en las condiciones previstas.",
            QuestionSourceType.BOE,
            "Reglamento General de Conductores, artículo 4",
            QuestionDifficulty.HARD
        ),

        q(
            765,
            "Permisos",
            "Ciclomotores",
            "¿Autoriza el permiso B a conducir ciclomotores?",
            "Sí.",
            "No.",
            "Solo ciclomotores de cuatro ruedas.",
            0,
            "Los ciclomotores se encuentran entre los vehículos autorizados por el permiso B.",
            QuestionSourceType.BOE,
            "Reglamento General de Conductores, artículo 4",
            QuestionDifficulty.EASY
        ),

        q(
            766,
            "Permisos",
            "Triciclos y cuadriciclos",
            "El permiso B autoriza a conducir...",
            "triciclos y cuadriciclos de motor en los términos reglamentarios.",
            "solo turismos.",
            "únicamente vehículos de dos ruedas.",
            0,
            "El Reglamento incluye triciclos y cuadriciclos entre los vehículos del permiso B.",
            QuestionSourceType.BOE,
            "Reglamento General de Conductores, artículo 4",
            QuestionDifficulty.MEDIUM
        ),

        q(
            767,
            "Permisos",
            "Motocicletas A1",
            "En España, un titular del permiso B con más de tres años de antigüedad puede conducir determinadas motocicletas autorizadas por...",
            "el permiso A1.",
            "el permiso A sin limitaciones.",
            "el permiso A2 completo.",
            0,
            "El Reglamento permite dentro del territorio nacional conducir vehículos A1 con B de más de tres años.",
            QuestionSourceType.BOE,
            "Reglamento General de Conductores, artículo 5",
            QuestionDifficulty.MEDIUM
        ),

        q(
            768,
            "Documentación",
            "Matrícula",
            "Las placas de matrícula deben mantenerse...",
            "legibles y correctamente visibles.",
            "tapadas parcialmente para evitar suciedad.",
            "sin importancia mientras exista seguro.",
            0,
            "La identificación del vehículo debe poder realizarse correctamente.",
            QuestionSourceType.BOE,
            "Reglamento General de Vehículos",
            QuestionDifficulty.EASY
        ),

        q(
            769,
            "Documentación",
            "Seguro obligatorio",
            "Un vehículo sometido a la obligación de aseguramiento debe disponer...",
            "del seguro obligatorio correspondiente.",
            "solo de seguro si circula por autopista.",
            "de seguro únicamente si tiene más de cinco años.",
            0,
            "Los vehículos incluidos en el ámbito legal deben mantener la cobertura obligatoria.",
            QuestionSourceType.BOE,
            "Ley sobre responsabilidad civil y seguro de vehículos a motor",
            QuestionDifficulty.EASY
        ),

        q(
            770,
            "Documentación",
            "ITV",
            "Cuando a un vehículo le corresponde inspección técnica periódica, debe circular...",
            "con la ITV en vigor en los términos legalmente exigidos.",
            "sin inspección hasta que aparezca una avería.",
            "solo con seguro, aunque la ITV esté caducada.",
            0,
            "La inspección técnica periódica verifica que el vehículo mantiene las condiciones exigibles de seguridad y emisiones.",
            QuestionSourceType.BOE,
            "Normativa de inspección técnica de vehículos",
            QuestionDifficulty.EASY
        )
    )
}
