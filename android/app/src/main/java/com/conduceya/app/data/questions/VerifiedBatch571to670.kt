package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object VerifiedBatch571to670 {

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
            571,
            "Circulación",
            "Utilización de carriles",
            "En una vía interurbana con varios carriles para su sentido, ¿por cuál debe circular normalmente un turismo?",
            "Por el carril situado más a la derecha.",
            "Por el carril central.",
            "Por cualquiera indistintamente.",
            0,
            "Como norma general debe utilizarse el carril derecho y los demás cuando las circunstancias lo aconsejen.",
            QuestionSourceType.BOE,
            "RGC - utilización de carriles",
            QuestionDifficulty.EASY
        ),

        q(
            572,
            "Circulación",
            "Cambio de carril",
            "Al cambiar de carril, ¿debe ceder el paso a los vehículos que ya circulan por el carril que pretende ocupar?",
            "Sí.",
            "No.",
            "Solo en autopista.",
            0,
            "Quien cambia de carril debe respetar a los vehículos que ya circulan por él.",
            QuestionSourceType.BOE,
            "RGC - cambios de carril",
            QuestionDifficulty.EASY
        ),

        q(
            573,
            "Circulación",
            "Arcén",
            "¿Puede un turismo utilizar normalmente el arcén para avanzar durante una retención?",
            "Sí.",
            "No.",
            "Solo a menos de 30 km/h.",
            1,
            "Una retención no convierte el arcén en un carril ordinario para turismos.",
            QuestionSourceType.BOE,
            "RGC - utilización del arcén",
            QuestionDifficulty.EASY
        ),

        q(
            574,
            "Maniobras",
            "Carril de aceleración",
            "Al incorporarse mediante un carril de aceleración, ¿quién debe asegurarse de que puede entrar sin peligro?",
            "El conductor que se incorpora.",
            "El vehículo que circula por la vía principal.",
            "El vehículo de mayor tamaño.",
            0,
            "El vehículo que se incorpora debe hacerlo sin obligar a otros usuarios a modificar bruscamente su trayectoria.",
            QuestionSourceType.BOE,
            "RGC - incorporación",
            QuestionDifficulty.EASY
        ),

        q(
            575,
            "Maniobras",
            "Carril de deceleración",
            "Para abandonar una vía mediante un carril de deceleración, ¿cuándo conviene reducir la velocidad de forma importante?",
            "Antes de entrar en el carril de deceleración.",
            "Una vez situado en el carril de deceleración, siempre que las condiciones lo permitan.",
            "Después de abandonar completamente la vía.",
            1,
            "El carril de deceleración permite reducir la velocidad sin entorpecer innecesariamente la vía principal.",
            QuestionSourceType.DGT,
            "DGT - carriles de deceleración",
            QuestionDifficulty.MEDIUM
        ),

        q(
            576,
            "Circulación",
            "Carril reversible",
            "Al circular por un carril reversible, ¿debe llevar encendida al menos la luz de cruce?",
            "Sí.",
            "No.",
            "Solo de noche.",
            0,
            "Los vehículos que utilizan un carril reversible deben utilizar el alumbrado reglamentario exigido para este carril.",
            QuestionSourceType.BOE,
            "RGC - carriles reversibles",
            QuestionDifficulty.EASY
        ),

        q(
            577,
            "Circulación",
            "Carril adicional",
            "Al circular por un carril adicional circunstancial, ¿debe utilizar la luz de cruce también de día?",
            "Sí.",
            "No.",
            "Solo si llueve.",
            0,
            "El alumbrado de cruce es obligatorio en estos carriles especiales.",
            QuestionSourceType.BOE,
            "RGC - carril adicional circunstancial",
            QuestionDifficulty.EASY
        ),

        q(
            578,
            "Circulación",
            "Sentido contrario al habitual",
            "En un carril habilitado en sentido contrario al habitual, ¿debe extremarse la atención y respetarse la señalización específica?",
            "Sí.",
            "No.",
            "Solo los vehículos pesados.",
            0,
            "La circulación en estos carriles está sometida a reglas y limitaciones especiales.",
            QuestionSourceType.BOE,
            "RGC - carriles en sentido contrario",
            QuestionDifficulty.EASY
        ),

        q(
            579,
            "Circulación",
            "Carril bus",
            "¿Puede un turismo utilizar normalmente un carril reservado exclusivamente para autobuses?",
            "Sí, para adelantar.",
            "No.",
            "Sí, cuando no venga ningún autobús.",
            1,
            "Los carriles reservados únicamente pueden ser utilizados por los vehículos autorizados.",
            QuestionSourceType.BOE,
            "RGC - carriles reservados",
            QuestionDifficulty.EASY
        ),

        q(
            580,
            "Circulación",
            "Autopistas",
            "En autopista, ¿puede detenerse voluntariamente en el arcén para consultar el teléfono?",
            "Sí.",
            "No.",
            "Solo durante menos de dos minutos.",
            1,
            "La parada voluntaria en el arcén de una autopista no está permitida salvo causas justificadas.",
            QuestionSourceType.BOE,
            "RGC - autopistas",
            QuestionDifficulty.EASY
        ),

        q(
            581,
            "Señalización",
            "Prioridad de señales",
            "¿Qué tiene mayor prioridad: las órdenes de un agente o un semáforo?",
            "El semáforo.",
            "Las órdenes del agente.",
            "La señal más cercana.",
            1,
            "Las señales y órdenes de los agentes ocupan el primer nivel de prioridad.",
            QuestionSourceType.BOE,
            "RGC - prioridad entre señales",
            QuestionDifficulty.EASY
        ),

        q(
            582,
            "Señalización",
            "Semáforos",
            "Una luz amarilla fija de un semáforo obliga a...",
            "Acelerar.",
            "Detenerse, salvo que no pueda hacerse con seguridad suficiente.",
            "Continuar siempre.",
            1,
            "La luz amarilla fija obliga a detenerse con la excepción prevista cuando hacerlo ya no sea seguro.",
            QuestionSourceType.BOE,
            "RGC - semáforos",
            QuestionDifficulty.EASY
        ),

        q(
            583,
            "Señalización",
            "Semáforos",
            "Ante una luz amarilla intermitente debe...",
            "Pasar con prioridad absoluta.",
            "Extremar la precaución y, cuando proceda, ceder el paso.",
            "Detenerse siempre como ante una luz roja.",
            1,
            "La luz amarilla intermitente exige precaución y no elimina otras reglas de prioridad.",
            QuestionSourceType.BOE,
            "RGC - semáforos",
            QuestionDifficulty.MEDIUM
        ),

        q(
            584,
            "Señalización",
            "Intersecciones",
            "Aunque el semáforo esté verde, ¿debe evitar entrar en una intersección si previsiblemente quedará bloqueándola?",
            "Sí.",
            "No.",
            "Solo si hay peatones.",
            0,
            "No debe bloquearse una intersección aunque se tenga autorización para entrar.",
            QuestionSourceType.BOE,
            "RGC - intersecciones",
            QuestionDifficulty.EASY
        ),

        q(
            585,
            "Prioridad",
            "Intersecciones",
            "En una intersección sin señalizar, como norma general, ¿a quién debe ceder el paso?",
            "A quien se aproxima por la derecha.",
            "A quien se aproxima por la izquierda.",
            "Al vehículo más grande.",
            0,
            "En ausencia de señalización se aplica la regla general de prioridad de la derecha, con sus excepciones.",
            QuestionSourceType.BOE,
            "RGC - prioridad de paso",
            QuestionDifficulty.EASY
        ),

        q(
            586,
            "Prioridad",
            "Vías pavimentadas",
            "En una intersección sin señalizar entre una vía pavimentada y otra sin pavimentar, ¿quién tiene prioridad?",
            "Quien circula por la vía sin pavimentar.",
            "Quien circula por la vía pavimentada.",
            "El vehículo que llegue después.",
            1,
            "La normativa establece prioridad para quien circula por la vía pavimentada.",
            QuestionSourceType.BOE,
            "RGC - prioridad de paso",
            QuestionDifficulty.EASY
        ),

        q(
            587,
            "Prioridad",
            "Glorietas",
            "En una glorieta, ¿quién tiene prioridad como norma general?",
            "Quien pretende entrar.",
            "Quien ya circula por ella.",
            "El vehículo situado a la derecha fuera de la glorieta.",
            1,
            "Los vehículos que ya circulan por la glorieta tienen prioridad respecto de quienes pretenden entrar.",
            QuestionSourceType.BOE,
            "RGC - glorietas",
            QuestionDifficulty.EASY
        ),

        q(
            588,
            "Pasos a nivel",
            "Señalización",
            "Ante una luz roja intermitente en un paso a nivel debe...",
            "Continuar rápidamente.",
            "Detenerse.",
            "Hacer sonar el claxon y pasar.",
            1,
            "La señal roja prohíbe temporalmente el paso.",
            QuestionSourceType.BOE,
            "RGC - pasos a nivel",
            QuestionDifficulty.EASY
        ),

        q(
            589,
            "Señalización",
            "STOP",
            "Ante una señal de STOP, ¿es obligatorio detener completamente el vehículo?",
            "Sí.",
            "Solo si se aproxima otro vehículo.",
            "No, basta con reducir mucho la velocidad.",
            0,
            "La señal STOP obliga a detenerse antes de continuar cuando pueda hacerse con seguridad.",
            QuestionSourceType.BOE,
            "RGC - señal STOP",
            QuestionDifficulty.EASY
        ),

        q(
            590,
            "Señalización",
            "Ceda el paso",
            "Ante una señal de Ceda el paso, ¿es obligatorio detenerse siempre?",
            "Sí.",
            "No; debe cederse el paso y detenerse cuando sea necesario.",
            "Solo de noche.",
            1,
            "La señal obliga a ceder prioridad, pero la detención depende de las circunstancias.",
            QuestionSourceType.BOE,
            "RGC - ceda el paso",
            QuestionDifficulty.EASY
        ),

        q(
            591,
            "Maniobras",
            "Señalización",
            "Antes de cambiar de carril debe...",
            "Advertir la maniobra con suficiente antelación.",
            "Tocar el claxon.",
            "Encender las luces de emergencia.",
            0,
            "Las maniobras deben señalizarse con antelación suficiente.",
            QuestionSourceType.BOE,
            "RGC - advertencia de maniobras",
            QuestionDifficulty.EASY
        ),

        q(
            592,
            "Maniobras",
            "Marcha atrás",
            "¿Debe realizarse la marcha atrás lentamente y después de comprobar que no existe peligro?",
            "Sí.",
            "No.",
            "Solo fuera de poblado.",
            0,
            "La marcha atrás requiere especial precaución por la limitada visibilidad posterior.",
            QuestionSourceType.BOE,
            "RGC - marcha atrás",
            QuestionDifficulty.EASY
        ),

        q(
            593,
            "Maniobras",
            "Cambio de sentido",
            "¿Debe evitarse un cambio de sentido cuando no existe visibilidad suficiente para realizarlo con seguridad?",
            "Sí.",
            "No.",
            "Solo si circulan camiones.",
            0,
            "Un cambio de sentido no debe realizarse cuando pueda crear peligro.",
            QuestionSourceType.BOE,
            "RGC - cambio de sentido",
            QuestionDifficulty.EASY
        ),

        q(
            594,
            "Adelantamientos",
            "Inicio",
            "Antes de adelantar debe comprobar que podrá regresar al carril correspondiente sin peligro.",
            "Verdadero.",
            "Falso.",
            "Solo en carreteras convencionales.",
            0,
            "El adelantamiento no debe iniciarse sin espacio suficiente para terminarlo.",
            QuestionSourceType.BOE,
            "RGC - adelantamiento",
            QuestionDifficulty.EASY
        ),

        q(
            595,
            "Adelantamientos",
            "Vehículo adelantado",
            "Cuando otro vehículo está adelantando, ¿puede el vehículo adelantado aumentar la velocidad para dificultar la maniobra?",
            "Sí.",
            "No.",
            "Solo en autopista.",
            1,
            "El vehículo adelantado no debe aumentar la velocidad ni dificultar el adelantamiento.",
            QuestionSourceType.BOE,
            "RGC - adelantamiento",
            QuestionDifficulty.EASY
        ),

        q(
            596,
            "Adelantamientos",
            "Poblado",
            "Dentro de poblado, en una calzada con varios carriles delimitados para el mismo sentido, ¿puede realizarse un adelantamiento por la derecha cuando sea seguro?",
            "Sí.",
            "No, nunca.",
            "Solo a motocicletas.",
            0,
            "La normativa contempla esta posibilidad en vías urbanas con varios carriles para el mismo sentido.",
            QuestionSourceType.BOE,
            "RGC - adelantamiento",
            QuestionDifficulty.MEDIUM
        ),

        q(
            597,
            "Seguridad",
            "Puertas",
            "Antes de abrir una puerta del vehículo debe comprobar que...",
            "no se pone en peligro ni se entorpece a otros usuarios.",
            "están encendidas las luces de carretera.",
            "el motor sigue funcionando.",
            0,
            "Abrir una puerta sin comprobar el entorno puede provocar atropellos o colisiones.",
            QuestionSourceType.BOE,
            "RGC - apertura de puertas",
            QuestionDifficulty.EASY
        ),

        q(
            598,
            "Estacionamiento",
            "Vía urbana",
            "En una vía urbana de doble sentido, como norma general, debe estacionarse...",
            "lo más cerca posible del borde derecho.",
            "siempre en el lado izquierdo.",
            "en cualquiera de los lados.",
            0,
            "En las vías urbanas de doble sentido se estaciona normalmente junto al borde derecho.",
            QuestionSourceType.BOE,
            "RGC - estacionamiento",
            QuestionDifficulty.EASY
        ),

        q(
            599,
            "Estacionamiento",
            "Doble fila",
            "¿Está permitido estacionar en doble fila?",
            "Sí, menos de dos minutos.",
            "No.",
            "Solo con las luces de emergencia.",
            1,
            "El estacionamiento en doble fila está prohibido.",
            QuestionSourceType.BOE,
            "RGC - estacionamiento",
            QuestionDifficulty.EASY
        ),

        q(
            600,
            "Estacionamiento",
            "Paso de peatones",
            "¿Está permitido parar sobre un paso señalizado para peatones?",
            "Sí.",
            "No.",
            "Solo durante menos de un minuto.",
            1,
            "La parada sobre un paso para peatones está prohibida.",
            QuestionSourceType.BOE,
            "RGC - parada y estacionamiento",
            QuestionDifficulty.EASY
        ),

        q(
            601,
            "Alumbrado",
            "Conducción nocturna",
            "Durante la noche, un turismo que circula debe llevar...",
            "solo luces de posición.",
            "el alumbrado que corresponda junto con las luces de posición.",
            "ninguna luz si hay alumbrado público.",
            1,
            "Entre el ocaso y la salida del sol debe utilizarse el alumbrado reglamentario.",
            QuestionSourceType.BOE,
            "RGC - alumbrado",
            QuestionDifficulty.EASY
        ),

        q(
            602,
            "Alumbrado",
            "Luz de carretera",
            "Al utilizar la luz de carretera, ¿debe sustituirse por la de cruce cuando pueda deslumbrar?",
            "Sí.",
            "No.",
            "Solo dentro de poblado.",
            0,
            "El conductor debe evitar deslumbrar a otros usuarios.",
            QuestionSourceType.BOE,
            "RGC - luz de carretera",
            QuestionDifficulty.EASY
        ),

        q(
            603,
            "Alumbrado",
            "Antiniebla trasera",
            "¿Debe utilizarse la luz antiniebla trasera con una niebla ligera?",
            "Sí, siempre.",
            "No; se reserva para condiciones especialmente desfavorables.",
            "Es indiferente.",
            1,
            "La antiniebla trasera es muy intensa y solo debe utilizarse en condiciones especialmente adversas.",
            QuestionSourceType.BOE,
            "RGC - antiniebla trasera",
            QuestionDifficulty.MEDIUM
        ),

        q(
            604,
            "Alumbrado",
            "Antiniebla delantera",
            "¿Puede utilizarse la luz antiniebla delantera cuando existen condiciones de visibilidad reducida en los supuestos reglamentarios?",
            "Sí.",
            "No.",
            "Solo en autopista.",
            0,
            "La antiniebla delantera puede emplearse en las situaciones previstas por la normativa.",
            QuestionSourceType.BOE,
            "RGC - antiniebla delantera",
            QuestionDifficulty.EASY
        ),

        q(
            605,
            "Motocicletas",
            "Alumbrado",
            "¿Debe una motocicleta llevar encendida la luz de cruce durante el día?",
            "Sí.",
            "No.",
            "Solo fuera de poblado.",
            0,
            "Las motocicletas deben utilizar luz de cruce también durante el día.",
            QuestionSourceType.BOE,
            "RGC - motocicletas",
            QuestionDifficulty.EASY
        ),

        q(
            606,
            "Emergencias y averías",
            "Señal de emergencia",
            "Si el vehículo queda inmovilizado creando peligro, ¿debe advertirse la situación utilizando la señalización disponible y reglamentaria?",
            "Sí.",
            "No.",
            "Solo de noche.",
            0,
            "La inmovilización debe advertirse para reducir el riesgo de nuevas colisiones.",
            QuestionSourceType.BOE,
            "RGC - inmovilizaciones",
            QuestionDifficulty.EASY
        ),

        q(
            607,
            "Señalización",
            "Claxon",
            "¿Puede utilizarse excepcionalmente el claxon para evitar un accidente?",
            "Sí.",
            "No, nunca.",
            "Solo fuera de poblado.",
            0,
            "Las señales acústicas pueden emplearse para evitar un posible accidente.",
            QuestionSourceType.BOE,
            "RGC - advertencias acústicas",
            QuestionDifficulty.EASY
        ),

        q(
            608,
            "Maniobras",
            "Señales con el brazo",
            "Si una señal reglamentaria realizada con el brazo contradice al intermitente y es claramente visible, ¿cuál prevalece?",
            "El intermitente.",
            "La señal con el brazo.",
            "Ninguna.",
            1,
            "La señal manual perceptible prevalece sobre una indicación óptica contradictoria.",
            QuestionSourceType.BOE,
            "RGC - advertencias del conductor",
            QuestionDifficulty.MEDIUM
        ),

        q(
            609,
            "Señalización",
            "Semáforos de carril",
            "Una aspa roja iluminada sobre un carril indica...",
            "que debe abandonarse ese carril.",
            "que puede circularse libremente.",
            "que el carril es exclusivo para turismos.",
            0,
            "El aspa roja prohíbe ocupar el carril sobre el que está situada.",
            QuestionSourceType.BOE,
            "RGC - semáforos de carril",
            QuestionDifficulty.EASY
        ),

        q(
            610,
            "Señalización",
            "Semáforos de carril",
            "Una flecha verde situada sobre un carril indica...",
            "que el carril está abierto a la circulación, sin eliminar las demás obligaciones.",
            "prioridad absoluta.",
            "que puede superarse la velocidad máxima.",
            0,
            "La flecha verde autoriza la utilización del carril, pero no elimina el resto de normas.",
            QuestionSourceType.BOE,
            "RGC - semáforos de carril",
            QuestionDifficulty.EASY
        ),

        q(
            611,
            "Velocidades",
            "Adaptación",
            "¿Debe adaptarse la velocidad a la visibilidad disponible?",
            "Sí.",
            "No.",
            "Solo de noche.",
            0,
            "La velocidad debe permitir controlar el vehículo ante las circunstancias reales de la vía.",
            QuestionSourceType.BOE,
            "RGC - velocidad adecuada",
            QuestionDifficulty.EASY
        ),

        q(
            612,
            "Distancia de seguridad",
            "Reacción",
            "Si aumenta la velocidad, ¿aumenta la distancia recorrida durante el tiempo de reacción?",
            "Sí.",
            "No.",
            "Solo con lluvia.",
            0,
            "A igual tiempo de reacción, una velocidad superior implica recorrer más metros antes de empezar a frenar.",
            QuestionSourceType.DGT,
            "DGT - tiempo de reacción",
            QuestionDifficulty.EASY
        ),

        q(
            613,
            "Distancia de seguridad",
            "Frenado",
            "Con la calzada mojada, ¿puede aumentar la distancia de frenado?",
            "Sí.",
            "No.",
            "Solo en vehículos sin ABS.",
            0,
            "La menor adherencia puede aumentar considerablemente la distancia de frenado.",
            QuestionSourceType.DGT,
            "DGT - distancia de frenado",
            QuestionDifficulty.EASY
        ),

        q(
            614,
            "Distancia de seguridad",
            "Detención",
            "La distancia de detención está formada por...",
            "solo la distancia de frenado.",
            "la distancia de reacción más la distancia de frenado.",
            "solo la distancia recorrida durante la reacción.",
            1,
            "La detención completa requiere primero reaccionar y después frenar.",
            QuestionSourceType.DGT,
            "DGT - distancia de detención",
            QuestionDifficulty.EASY
        ),

        q(
            615,
            "Distancia de seguridad",
            "Vehículo precedente",
            "La separación con el vehículo precedente debe permitir...",
            "detenerse sin colisionar si frena bruscamente.",
            "circular siempre a su misma velocidad.",
            "ver únicamente sus luces traseras.",
            0,
            "Debe existir margen suficiente para reaccionar y detenerse.",
            QuestionSourceType.BOE,
            "RGC - distancia entre vehículos",
            QuestionDifficulty.EASY
        ),

        q(
            616,
            "Túneles",
            "Separación",
            "En un túnel, ¿debe prestarse especial atención a mantener una separación suficiente con el vehículo precedente?",
            "Sí.",
            "No.",
            "Solo los camiones.",
            0,
            "Las posibilidades de evasión son menores dentro de un túnel.",
            QuestionSourceType.BOE,
            "RGC - túneles",
            QuestionDifficulty.EASY
        ),

        q(
            617,
            "Condiciones adversas",
            "Aquaplaning",
            "¿Aumenta el riesgo de aquaplaning con mucha agua y una velocidad elevada?",
            "Sí.",
            "No.",
            "Solo en motocicletas.",
            0,
            "La velocidad, la cantidad de agua y el estado de los neumáticos influyen en el aquaplaning.",
            QuestionSourceType.DGT,
            "DGT - aquaplaning",
            QuestionDifficulty.EASY
        ),

        q(
            618,
            "Conducción segura",
            "Curvas",
            "¿Conviene adaptar la velocidad antes de entrar en una curva?",
            "Sí.",
            "No.",
            "Solo si la curva es a la izquierda.",
            0,
            "Frenar y adaptar la velocidad antes de la curva mejora la estabilidad durante su trazado.",
            QuestionSourceType.DGT,
            "DGT - conducción en curvas",
            QuestionDifficulty.EASY
        ),

        q(
            619,
            "Conducción segura",
            "Pendientes",
            "En un descenso prolongado, ¿puede ayudar la retención del motor a controlar la velocidad?",
            "Sí.",
            "No.",
            "Solo en vehículos automáticos.",
            0,
            "Utilizar adecuadamente una relación de marchas permite reducir el uso continuo de los frenos.",
            QuestionSourceType.DGT,
            "DGT - conducción en pendientes",
            QuestionDifficulty.MEDIUM
        ),

        q(
            620,
            "Carga y equipaje",
            "Frenado",
            "¿Puede una carga elevada aumentar la distancia necesaria para detener un vehículo?",
            "Sí.",
            "No.",
            "Solo si la carga está en el techo.",
            0,
            "Una mayor masa puede modificar la respuesta del vehículo y aumentar la distancia de frenado.",
            QuestionSourceType.DGT,
            "DGT - carga y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            621,
            "Condiciones adversas",
            "Lluvia",
            "Al comenzar a llover tras un periodo seco, ¿puede la calzada resultar especialmente deslizante?",
            "Sí.",
            "No.",
            "Solo en autopista.",
            0,
            "Las primeras gotas pueden mezclarse con polvo y residuos formando una película resbaladiza.",
            QuestionSourceType.DGT,
            "DGT - lluvia",
            QuestionDifficulty.MEDIUM
        ),

        q(
            622,
            "Condiciones adversas",
            "Niebla",
            "Con niebla debe...",
            "adaptar la velocidad y aumentar la distancia de seguridad.",
            "circular muy cerca del vehículo de delante.",
            "utilizar siempre la luz de carretera.",
            0,
            "La visibilidad reducida exige mayor margen de seguridad.",
            QuestionSourceType.DGT,
            "DGT - conducción con niebla",
            QuestionDifficulty.EASY
        ),

        q(
            623,
            "Condiciones adversas",
            "Nieve",
            "Sobre nieve conviene realizar aceleraciones, frenadas y giros...",
            "de forma suave.",
            "de forma brusca.",
            "a la máxima velocidad posible.",
            0,
            "La suavidad ayuda a evitar pérdidas de adherencia.",
            QuestionSourceType.DGT,
            "DGT - conducción con nieve",
            QuestionDifficulty.EASY
        ),

        q(
            624,
            "Condiciones adversas",
            "Hielo",
            "¿Puede aparecer hielo con especial facilidad en puentes y zonas sombrías?",
            "Sí.",
            "No.",
            "Solo durante el día.",
            0,
            "Determinadas zonas se enfrían antes y conservan durante más tiempo las bajas temperaturas.",
            QuestionSourceType.DGT,
            "DGT - hielo",
            QuestionDifficulty.EASY
        ),

        q(
            625,
            "Condiciones adversas",
            "Viento",
            "Al salir de una zona protegida por edificios o un vehículo grande con fuerte viento lateral, ¿puede producirse un desplazamiento brusco?",
            "Sí.",
            "No.",
            "Solo en vehículos pesados.",
            0,
            "El cambio repentino de exposición al viento puede alterar la trayectoria.",
            QuestionSourceType.DGT,
            "DGT - viento lateral",
            QuestionDifficulty.MEDIUM
        ),

        q(
            626,
            "Condiciones adversas",
            "Deslumbramiento solar",
            "Con el sol de frente, ¿conviene reducir la velocidad si la visibilidad disminuye?",
            "Sí.",
            "No.",
            "Solo si llueve.",
            0,
            "La velocidad debe adaptarse a la distancia realmente visible.",
            QuestionSourceType.DGT,
            "DGT - deslumbramiento",
            QuestionDifficulty.EASY
        ),

        q(
            627,
            "Conducción nocturna",
            "Visibilidad",
            "¿Se reduce normalmente la capacidad visual durante la noche?",
            "Sí.",
            "No.",
            "Solo para conductores noveles.",
            0,
            "La falta de luz dificulta distinguir objetos, colores y distancias.",
            QuestionSourceType.DGT,
            "DGT - conducción nocturna",
            QuestionDifficulty.EASY
        ),

        q(
            628,
            "Fatiga y sueño",
            "Calor",
            "Un habitáculo excesivamente caliente puede...",
            "favorecer la fatiga y la somnolencia.",
            "mejorar los reflejos.",
            "reducir siempre el tiempo de reacción.",
            0,
            "El calor elevado puede deteriorar la atención y favorecer el cansancio.",
            QuestionSourceType.DGT,
            "DGT - calor y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            629,
            "Condiciones adversas",
            "Frenos mojados",
            "Después de atravesar bastante agua, ¿conviene comprobar suavemente la respuesta de los frenos cuando sea seguro hacerlo?",
            "Sí.",
            "No.",
            "Solo en motocicletas.",
            0,
            "La humedad puede reducir temporalmente la eficacia de frenado.",
            QuestionSourceType.DGT,
            "DGT - frenos mojados",
            QuestionDifficulty.MEDIUM
        ),

        q(
            630,
            "Condiciones adversas",
            "Gravilla",
            "En una zona con gravilla suelta debe...",
            "reducir la velocidad y evitar movimientos bruscos.",
            "acelerar.",
            "frenar bruscamente dentro de las curvas.",
            0,
            "La gravilla reduce la adherencia y puede provocar proyecciones.",
            QuestionSourceType.DGT,
            "DGT - adherencia",
            QuestionDifficulty.EASY
        ),

        q(
            631,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "La presión de los neumáticos debe ajustarse normalmente a...",
            "la recomendada por el fabricante.",
            "la máxima indicada en cualquier neumático.",
            "la que elija cada conductor.",
            0,
            "La presión correcta depende de las especificaciones del fabricante y de las condiciones previstas.",
            QuestionSourceType.DGT,
            "DGT - neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            632,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "En un turismo, la profundidad mínima reglamentaria del dibujo principal del neumático es...",
            "1,6 mm.",
            "0,5 mm.",
            "4 mm.",
            0,
            "La profundidad mínima reglamentaria en las ranuras principales es de 1,6 mm.",
            QuestionSourceType.BOE,
            "Reglamento General de Vehículos - neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            633,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "Un desgaste irregular de los neumáticos puede estar relacionado con...",
            "presiones incorrectas o problemas de alineación.",
            "tener lleno el depósito.",
            "utilizar el cinturón de seguridad.",
            0,
            "Presión, alineación y estado de la suspensión influyen en el desgaste.",
            QuestionSourceType.DGT,
            "DGT - neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            634,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "Una presión de inflado demasiado baja puede...",
            "aumentar el consumo y el desgaste.",
            "reducir siempre el consumo.",
            "no producir ningún efecto.",
            0,
            "Una presión insuficiente aumenta la resistencia a la rodadura.",
            QuestionSourceType.DGT,
            "DGT - neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            635,
            "Mecánica y mantenimiento",
            "Amortiguadores",
            "Unos amortiguadores en mal estado pueden afectar...",
            "a la estabilidad y la frenada.",
            "solo al sonido de la radio.",
            "únicamente al consumo de aceite.",
            0,
            "La amortiguación mantiene el contacto adecuado de los neumáticos con la vía.",
            QuestionSourceType.DGT,
            "DGT - amortiguadores",
            QuestionDifficulty.EASY
        ),

        q(
            636,
            "Mecánica y mantenimiento",
            "ABS",
            "La función principal del ABS es...",
            "evitar el bloqueo de las ruedas durante una frenada intensa.",
            "aumentar la potencia del motor.",
            "reducir la presión de los neumáticos.",
            0,
            "El ABS ayuda a mantener capacidad direccional evitando el bloqueo de las ruedas.",
            QuestionSourceType.DGT,
            "DGT - ABS",
            QuestionDifficulty.EASY
        ),

        q(
            637,
            "Mecánica y mantenimiento",
            "Control de estabilidad",
            "El control electrónico de estabilidad puede ayudar a...",
            "corregir determinadas pérdidas de trayectoria.",
            "eliminar cualquier riesgo de accidente.",
            "acortar siempre a la mitad la distancia de frenado.",
            0,
            "El sistema ayuda a estabilizar el vehículo dentro de sus límites físicos.",
            QuestionSourceType.DGT,
            "DGT - control de estabilidad",
            QuestionDifficulty.MEDIUM
        ),

        q(
            638,
            "Mecánica y mantenimiento",
            "Frenos",
            "¿Debe mantenerse el sistema de frenado siguiendo las revisiones indicadas por el fabricante?",
            "Sí.",
            "No.",
            "Solo cuando aparezca una avería grave.",
            0,
            "Los frenos son un elemento esencial de seguridad activa.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento de frenos",
            QuestionDifficulty.EASY
        ),

        q(
            639,
            "Mecánica y mantenimiento",
            "Refrigeración",
            "La función principal del líquido refrigerante es...",
            "ayudar a controlar la temperatura del motor.",
            "lubricar los neumáticos.",
            "limpiar el parabrisas.",
            0,
            "El sistema de refrigeración evita temperaturas excesivas del motor.",
            QuestionSourceType.DGT,
            "DGT - sistema de refrigeración",
            QuestionDifficulty.EASY
        ),

        q(
            640,
            "Mecánica y mantenimiento",
            "Aceite",
            "¿Debe comprobarse periódicamente el nivel de aceite siguiendo las indicaciones del fabricante?",
            "Sí.",
            "No.",
            "Solo antes de la ITV.",
            0,
            "Un nivel correcto es necesario para la lubricación y protección del motor.",
            QuestionSourceType.DGT,
            "DGT - lubricación",
            QuestionDifficulty.EASY
        ),

        q(
            641,
            "Seguridad",
            "Cinturón",
            "¿Debe utilizarse el cinturón de seguridad también en los asientos traseros cuando sea obligatorio?",
            "Sí.",
            "No.",
            "Solo en autopista.",
            0,
            "El cinturón reduce el riesgo de lesiones graves en todas las plazas.",
            QuestionSourceType.BOE,
            "RGC - cinturón de seguridad",
            QuestionDifficulty.EASY
        ),

        q(
            642,
            "Seguridad",
            "Cinturón",
            "La banda abdominal del cinturón debe colocarse...",
            "sobre la pelvis.",
            "sobre el abdomen.",
            "sobre el pecho.",
            0,
            "La banda inferior debe apoyarse en una zona ósea resistente.",
            QuestionSourceType.DGT,
            "DGT - cinturón",
            QuestionDifficulty.EASY
        ),

        q(
            643,
            "Seguridad",
            "Reposacabezas",
            "La parte central del reposacabezas debe quedar aproximadamente...",
            "a la altura de la cabeza.",
            "a la altura de los hombros.",
            "por debajo del cuello.",
            0,
            "Una posición adecuada ayuda a reducir lesiones cervicales.",
            QuestionSourceType.DGT,
            "DGT - reposacabezas",
            QuestionDifficulty.EASY
        ),

        q(
            644,
            "Seguridad",
            "Airbag",
            "El airbag...",
            "complementa al cinturón de seguridad.",
            "sustituye completamente al cinturón.",
            "hace innecesario el reposacabezas.",
            0,
            "El airbag está diseñado para trabajar conjuntamente con el cinturón.",
            QuestionSourceType.DGT,
            "DGT - airbag",
            QuestionDifficulty.EASY
        ),

        q(
            645,
            "Carga y equipaje",
            "Objetos sueltos",
            "¿Pueden los objetos sueltos dentro del habitáculo convertirse en un peligro durante una frenada o colisión?",
            "Sí.",
            "No.",
            "Solo los objetos metálicos.",
            0,
            "La inercia puede proyectarlos contra los ocupantes.",
            QuestionSourceType.DGT,
            "DGT - carga interior",
            QuestionDifficulty.EASY
        ),

        q(
            646,
            "Seguridad",
            "Animales",
            "Los animales transportados en un vehículo deben...",
            "ir colocados de forma que no interfieran con la conducción.",
            "viajar siempre sueltos.",
            "ir obligatoriamente en el asiento delantero.",
            0,
            "El conductor debe conservar libertad de movimientos y campo de visión.",
            QuestionSourceType.BOE,
            "RGC - obligaciones del conductor",
            QuestionDifficulty.EASY
        ),

        q(
            647,
            "Seguridad",
            "Sistemas infantiles",
            "Un sistema de retención infantil debe utilizarse...",
            "siguiendo las instrucciones de instalación y siendo adecuado para el menor.",
            "sin anclarlo para facilitar su retirada.",
            "solo en viajes largos.",
            0,
            "Una instalación incorrecta puede reducir notablemente su eficacia.",
            QuestionSourceType.DGT,
            "DGT - sistemas de retención infantil",
            QuestionDifficulty.EASY
        ),

        q(
            648,
            "Conducción segura",
            "Posición",
            "Para conducir correctamente, los brazos deben permitir manejar el volante...",
            "sin quedar completamente estirados.",
            "con los codos bloqueados.",
            "con una sola mano de forma permanente.",
            0,
            "Una ligera flexión permite controlar mejor el volante y reaccionar con precisión.",
            QuestionSourceType.DGT,
            "DGT - posición de conducción",
            QuestionDifficulty.EASY
        ),

        q(
            649,
            "Conducción segura",
            "Retrovisores",
            "¿Conviene regular los retrovisores antes de iniciar la marcha?",
            "Sí.",
            "No.",
            "Solo en viajes largos.",
            0,
            "Los espejos deben ajustarse con el vehículo detenido antes de circular.",
            QuestionSourceType.DGT,
            "DGT - retrovisores",
            QuestionDifficulty.EASY
        ),

        q(
            650,
            "Seguridad",
            "Salida del vehículo",
            "Antes de que un ocupante abra una puerta debe...",
            "comprobar que puede hacerlo sin peligro.",
            "abrirla rápidamente.",
            "encender la luz de carretera.",
            0,
            "Una puerta abierta sin comprobar el tráfico puede poner en peligro a ciclistas, motociclistas y otros usuarios.",
            QuestionSourceType.BOE,
            "RGC - puertas",
            QuestionDifficulty.EASY
        ),

        q(
            651,
            "Alcohol y drogas",
            "Alcohol",
            "¿Puede el alcohol afectar a la capacidad para conducir incluso antes de que el conductor se sienta claramente ebrio?",
            "Sí.",
            "No.",
            "Solo de noche.",
            0,
            "El alcohol puede deteriorar atención, percepción y reacción desde cantidades bajas.",
            QuestionSourceType.DGT,
            "DGT - alcohol y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            652,
            "Alcohol y drogas",
            "Drogas",
            "Mezclar drogas y alcohol puede producir efectos...",
            "imprevisibles y peligrosos.",
            "siempre menores.",
            "beneficiosos para la atención.",
            0,
            "La combinación puede potenciar o modificar los efectos de forma peligrosa.",
            QuestionSourceType.DGT,
            "DGT - alcohol y drogas",
            QuestionDifficulty.EASY
        ),

        q(
            653,
            "Alcohol y drogas",
            "Cannabis",
            "El cannabis puede...",
            "aumentar el tiempo de reacción.",
            "mejorar la atención.",
            "eliminar la somnolencia.",
            0,
            "La DGT advierte de alteraciones en percepción, atención y tiempo de reacción.",
            QuestionSourceType.DGT,
            "DGT - cannabis y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            654,
            "Medicamentos y conducción",
            "Precauciones",
            "Antes de conducir mientras se toma un medicamento nuevo conviene...",
            "comprobar sus posibles efectos sobre la conducción.",
            "duplicar la dosis.",
            "mezclarlo con alcohol.",
            0,
            "Algunos medicamentos producen somnolencia, mareo u otras alteraciones.",
            QuestionSourceType.DGT,
            "DGT - medicamentos",
            QuestionDifficulty.EASY
        ),

        q(
            655,
            "Medicamentos y conducción",
            "Antihistamínicos",
            "Algunos antihistamínicos pueden producir...",
            "somnolencia.",
            "mayor agudeza visual.",
            "mejores reflejos.",
            0,
            "Los antihistamínicos sedantes pueden afectar negativamente a la conducción.",
            QuestionSourceType.DGT,
            "DGT - antihistamínicos",
            QuestionDifficulty.EASY
        ),

        q(
            656,
            "Fatiga y sueño",
            "Descansos",
            "En un viaje largo, ¿conviene realizar descansos periódicos antes de llegar a estar muy fatigado?",
            "Sí.",
            "No.",
            "Solo los conductores profesionales.",
            0,
            "Los descansos periódicos ayudan a mantener la atención y retrasar la fatiga.",
            QuestionSourceType.DGT,
            "DGT - fatiga",
            QuestionDifficulty.EASY
        ),

        q(
            657,
            "Fatiga y sueño",
            "Microsueños",
            "Un microsueño es peligroso porque...",
            "durante unos instantes el conductor deja de atender a la conducción.",
            "mejora la concentración después.",
            "solo ocurre con el vehículo parado.",
            0,
            "Unos pocos segundos sin atención pueden equivaler a recorrer muchos metros sin control consciente.",
            QuestionSourceType.DGT,
            "DGT - microsueños",
            QuestionDifficulty.EASY
        ),

        q(
            658,
            "Conducción segura",
            "Estrés",
            "El estrés intenso puede...",
            "aumentar errores y distracciones.",
            "mejorar siempre la toma de decisiones.",
            "eliminar la fatiga.",
            0,
            "El estrés altera la atención y puede favorecer conductas impulsivas.",
            QuestionSourceType.DGT,
            "DGT - estrés",
            QuestionDifficulty.EASY
        ),

        q(
            659,
            "Distracciones",
            "Teléfono móvil",
            "Manipular el teléfono móvil mientras se conduce...",
            "distrae y aumenta el riesgo.",
            "mejora la percepción.",
            "es seguro si se circula despacio.",
            0,
            "Apartar la vista, las manos o la atención de la conducción aumenta el riesgo.",
            QuestionSourceType.DGT,
            "DGT - teléfono móvil",
            QuestionDifficulty.EASY
        ),

        q(
            660,
            "Distracciones",
            "Manos libres",
            "Hablar mediante manos libres...",
            "puede seguir generando distracción cognitiva.",
            "elimina totalmente cualquier distracción.",
            "mejora los reflejos.",
            0,
            "Aunque no se sostenga el teléfono, una conversación puede reducir la atención disponible.",
            QuestionSourceType.DGT,
            "DGT - distracciones",
            QuestionDifficulty.EASY
        ),

        q(
            661,
            "Accidentes y primeros auxilios",
            "PAS",
            "La conducta PAS ante un accidente significa...",
            "Proteger, Avisar y Socorrer.",
            "Parar, Acelerar y Salir.",
            "Prevenir, Aparcar y Señalizar.",
            0,
            "Primero se evita crear nuevos peligros, después se pide ayuda y finalmente se auxilia dentro de las propias posibilidades.",
            QuestionSourceType.DGT,
            "DGT - conducta PAS",
            QuestionDifficulty.EASY
        ),

        q(
            662,
            "Accidentes y primeros auxilios",
            "Obligaciones",
            "Si está implicado en un accidente debe...",
            "detenerse procurando no crear un nuevo peligro.",
            "continuar siempre la marcha.",
            "abandonar el lugar sin avisar.",
            0,
            "Los implicados tienen obligaciones específicas de detención, seguridad y auxilio.",
            QuestionSourceType.BOE,
            "RGC - accidentes",
            QuestionDifficulty.EASY
        ),

        q(
            663,
            "Accidentes y primeros auxilios",
            "Emergencias",
            "Al llamar al 112 tras un accidente conviene indicar...",
            "el lugar, número aproximado de víctimas y riesgos existentes.",
            "solo la matrícula propia.",
            "únicamente el nombre del conductor.",
            0,
            "Una información clara permite movilizar los recursos adecuados.",
            QuestionSourceType.DGT,
            "DGT - emergencias",
            QuestionDifficulty.EASY
        ),

        q(
            664,
            "Accidentes y primeros auxilios",
            "Heridos",
            "Como norma general, ¿debe evitarse mover innecesariamente a un herido grave salvo que exista un peligro mayor?",
            "Sí.",
            "No.",
            "Solo si está consciente.",
            0,
            "Mover incorrectamente a una víctima puede agravar determinadas lesiones.",
            QuestionSourceType.DGT,
            "DGT - primeros auxilios",
            QuestionDifficulty.MEDIUM
        ),

        q(
            665,
            "Túneles",
            "Incendio",
            "Ante un incendio grave dentro de un túnel debe...",
            "apagar el motor cuando proceda y seguir las vías e instrucciones de evacuación.",
            "permanecer siempre dentro del vehículo.",
            "dar marcha atrás por el túnel.",
            0,
            "En un incendio debe priorizarse la evacuación segura y seguir la señalización y las instrucciones de emergencia.",
            QuestionSourceType.BOE,
            "RGC - túneles",
            QuestionDifficulty.EASY
        ),

        q(
            666,
            "Conducción eficiente",
            "Aceleración",
            "Una conducción con aceleraciones suaves y anticipación puede...",
            "reducir el consumo.",
            "aumentarlo siempre.",
            "no influir nunca.",
            0,
            "Una conducción fluida evita aceleraciones y frenadas innecesarias.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            667,
            "Conducción eficiente",
            "Aerodinámica",
            "Transportar equipaje en una baca puede...",
            "aumentar el consumo por mayor resistencia aerodinámica.",
            "reducir siempre el consumo.",
            "no modificar nunca el consumo.",
            0,
            "La carga exterior aumenta la resistencia al avance.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            668,
            "Conducción eficiente",
            "Neumáticos",
            "Mantener la presión correcta de los neumáticos puede ayudar a...",
            "reducir consumo y desgaste innecesarios.",
            "aumentar la resistencia a la rodadura.",
            "eliminar la necesidad de revisarlos.",
            0,
            "Una presión correcta disminuye pérdidas por resistencia a la rodadura.",
            QuestionSourceType.DGT,
            "DGT - neumáticos y consumo",
            QuestionDifficulty.EASY
        ),

        q(
            669,
            "Documentación",
            "Seguro",
            "¿Debe un vehículo a motor sometido a la obligación legal disponer del seguro obligatorio correspondiente?",
            "Sí.",
            "No.",
            "Solo si circula fuera de poblado.",
            0,
            "La circulación de vehículos sujetos a aseguramiento exige mantener la cobertura obligatoria.",
            QuestionSourceType.BOE,
            "Seguro obligatorio de vehículos",
            QuestionDifficulty.EASY
        ),

        q(
            670,
            "Documentación",
            "Permiso de conducción",
            "Para conducir un vehículo debe poseerse...",
            "el permiso o autorización válida que corresponda.",
            "cualquier permiso aunque no corresponda al vehículo.",
            "únicamente el permiso de circulación del vehículo.",
            0,
            "El conductor debe estar autorizado para la categoría de vehículo que conduce.",
            QuestionSourceType.BOE,
            "Reglamento General de Conductores",
            QuestionDifficulty.EASY
        )
    )
}
