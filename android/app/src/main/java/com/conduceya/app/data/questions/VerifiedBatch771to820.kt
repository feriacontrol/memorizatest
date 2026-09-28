package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object VerifiedBatch771to820 {

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
            771,
            "Emergencias y averías",
            "V-16",
            "Desde el 1 de enero de 2026, para los vehículos obligados, ¿qué dispositivo reglamentario señaliza una inmovilización?",
            "Una V-16 conectada certificada.",
            "Dos triángulos.",
            "Una linterna amarilla.",
            0,
            "Desde 2026 la V-16 conectada es el dispositivo reglamentario de preseñalización para los vehículos obligados.",
            QuestionSourceType.DGT,
            "DGT - V-16 conectada",
            QuestionDifficulty.EASY
        ),

        q(
            772,
            "Emergencias y averías",
            "V-16",
            "¿Es válida desde 2026 una V-16 antigua que no esté conectada?",
            "No.",
            "Sí, siempre.",
            "Solo de noche.",
            0,
            "Las V-16 no conectadas dejaron de ser válidas como dispositivo reglamentario desde el 1 de enero de 2026.",
            QuestionSourceType.DGT,
            "DGT - V-16 conectada",
            QuestionDifficulty.EASY
        ),

        q(
            773,
            "Emergencias y averías",
            "V-16",
            "La V-16 conectada debe colocarse preferentemente...",
            "En la parte más alta posible del vehículo.",
            "Debajo del vehículo.",
            "En el asiento trasero.",
            0,
            "Debe colocarse en el exterior y en una zona lo más alta y visible posible.",
            QuestionSourceType.DGT,
            "DGT - V-16 conectada",
            QuestionDifficulty.EASY
        ),

        q(
            774,
            "Emergencias y averías",
            "V-16",
            "¿Necesita la V-16 conectada el teléfono móvil para transmitir su posición?",
            "No.",
            "Sí, mediante Bluetooth.",
            "Sí, mediante una aplicación obligatoria.",
            0,
            "El dispositivo incorpora sus propios elementos de comunicación.",
            QuestionSourceType.DGT,
            "DGT - V-16 conectada",
            QuestionDifficulty.EASY
        ),

        q(
            775,
            "Emergencias y averías",
            "V-16",
            "La V-16 conectada transmite principalmente...",
            "La ubicación del vehículo inmovilizado.",
            "Los datos personales del conductor.",
            "La velocidad habitual del vehículo.",
            0,
            "La baliza comunica su geoposicionamiento cuando está activada.",
            QuestionSourceType.DGT,
            "DGT - V-16 conectada",
            QuestionDifficulty.EASY
        ),

        q(
            776,
            "Emergencias y averías",
            "V-16",
            "¿Conviene llevar la V-16 en un lugar fácilmente accesible?",
            "Sí.",
            "No, debe ir escondida bajo el equipaje.",
            "Solo en vehículos pesados.",
            0,
            "Llevarla a mano permite utilizarla evitando una exposición innecesaria al tráfico.",
            QuestionSourceType.DGT,
            "DGT - V-16 conectada",
            QuestionDifficulty.EASY
        ),

        q(
            777,
            "Emergencias y averías",
            "V-16",
            "¿Debe comprobarse que una V-16 figure entre los modelos certificados oficialmente?",
            "Sí.",
            "No, cualquier baliza amarilla sirve.",
            "Solo si se compra por Internet.",
            0,
            "Solo deben utilizarse modelos que cumplan los requisitos de certificación exigidos.",
            QuestionSourceType.DGT,
            "DGT - modelos V-16 certificados",
            QuestionDifficulty.EASY
        ),

        q(
            778,
            "Emergencias y averías",
            "V-16",
            "La conectividad reglamentaria de una V-16 debe estar incluida al menos durante...",
            "12 años.",
            "1 año.",
            "3 años.",
            0,
            "La normativa exige una disponibilidad mínima de conectividad de 12 años incluida en el dispositivo.",
            QuestionSourceType.DGT,
            "DGT - V-16 conectada",
            QuestionDifficulty.MEDIUM
        ),

        q(
            779,
            "Emergencias y averías",
            "V-16",
            "¿Hay que pagar necesariamente una cuota mensual a una operadora para que funcione una V-16 certificada?",
            "No.",
            "Sí.",
            "Solo en autopista.",
            0,
            "El coste de la conectividad reglamentaria está incluido en el precio del dispositivo.",
            QuestionSourceType.DGT,
            "DGT - V-16 conectada",
            QuestionDifficulty.EASY
        ),

        q(
            780,
            "Emergencias y averías",
            "V-16",
            "¿La V-16 sustituye por sí sola una llamada a emergencias cuando hay personas heridas?",
            "No.",
            "Sí.",
            "Solo durante el día.",
            0,
            "La V-16 señaliza y comunica la ubicación del vehículo, pero no sustituye la solicitud de asistencia de emergencia.",
            QuestionSourceType.DGT,
            "DGT - V-16 conectada",
            QuestionDifficulty.EASY
        ),

        q(
            781,
            "Señalización",
            "Agentes",
            "Un agente con el brazo levantado verticalmente obliga, como norma general, a...",
            "Detenerse a quienes se aproximen al agente.",
            "Acelerar.",
            "Girar a la derecha.",
            0,
            "Esta señal ordena la detención, salvo a quien no pueda detenerse con seguridad suficiente.",
            QuestionSourceType.BOE,
            "RGC - señales de los agentes",
            QuestionDifficulty.EASY
        ),

        q(
            782,
            "Señalización",
            "Agentes",
            "Uno o ambos brazos del agente extendidos horizontalmente obligan a detenerse a quienes...",
            "Se acerquen desde direcciones que corten la indicada por los brazos.",
            "Circulen paralelos a los brazos exclusivamente.",
            "Estén estacionados.",
            0,
            "La orden afecta a las trayectorias que cortan la dirección marcada por los brazos.",
            QuestionSourceType.BOE,
            "RGC - señales de los agentes",
            QuestionDifficulty.MEDIUM
        ),

        q(
            783,
            "Señalización",
            "Agentes",
            "El balanceo de una luz roja o amarilla por un agente hacia un usuario significa...",
            "Detención.",
            "Paso libre.",
            "Velocidad mínima.",
            0,
            "El usuario hacia el que se dirige la luz debe detenerse.",
            QuestionSourceType.BOE,
            "RGC - señales de los agentes",
            QuestionDifficulty.EASY
        ),

        q(
            784,
            "Señalización",
            "Agentes",
            "Una serie de toques cortos y frecuentes de silbato de un agente ordena...",
            "Detenerse.",
            "Reanudar la marcha.",
            "Aumentar la velocidad.",
            0,
            "Los toques cortos y frecuentes ordenan la detención de los vehículos.",
            QuestionSourceType.BOE,
            "RGC - señales de los agentes",
            QuestionDifficulty.EASY
        ),

        q(
            785,
            "Señalización",
            "Agentes",
            "Un toque largo de silbato de un agente ordena...",
            "Reanudar la marcha.",
            "Detenerse.",
            "Dar marcha atrás.",
            0,
            "El toque largo indica que puede reanudarse la marcha.",
            QuestionSourceType.BOE,
            "RGC - señales de los agentes",
            QuestionDifficulty.EASY
        ),

        q(
            786,
            "Señalización",
            "Agentes",
            "Si un agente mueve un brazo extendido alternativamente de arriba abajo puede estar ordenando...",
            "Disminuir la velocidad a los conductores afectados.",
            "Acelerar.",
            "Estacionar.",
            0,
            "Esta señal del agente obliga a reducir la velocidad a los conductores a quienes afecta.",
            QuestionSourceType.BOE,
            "RGC - señales de los agentes",
            QuestionDifficulty.MEDIUM
        ),

        q(
            787,
            "Señalización",
            "Prioridad de señales",
            "¿Qué señal prevalece sobre un semáforo?",
            "La orden de un agente.",
            "Una marca vial.",
            "Una señal informativa.",
            0,
            "Las órdenes de los agentes ocupan el primer lugar en el orden de prioridad de señales.",
            QuestionSourceType.BOE,
            "RGC artículo 133",
            QuestionDifficulty.EASY
        ),

        q(
            788,
            "Señalización",
            "Prioridad de señales",
            "La señalización circunstancial que modifica el uso normal de la vía prevalece sobre...",
            "Los semáforos, señales verticales y marcas viales.",
            "Las órdenes de los agentes.",
            "Nada.",
            0,
            "Está por debajo de los agentes y por encima de semáforos, señales verticales y marcas.",
            QuestionSourceType.BOE,
            "RGC artículo 133",
            QuestionDifficulty.MEDIUM
        ),

        q(
            789,
            "Señalización",
            "Prioridad de señales",
            "Entre un semáforo y una señal vertical contradictorios, prevalece...",
            "El semáforo.",
            "La señal vertical.",
            "La señal más grande.",
            0,
            "En el orden reglamentario los semáforos preceden a las señales verticales.",
            QuestionSourceType.BOE,
            "RGC artículo 133",
            QuestionDifficulty.EASY
        ),

        q(
            790,
            "Señalización",
            "Prioridad de señales",
            "Entre una señal vertical y una marca vial contradictorias prevalece...",
            "La señal vertical.",
            "La marca vial.",
            "La pintada más recientemente.",
            0,
            "Las señales verticales tienen prioridad sobre las marcas viales.",
            QuestionSourceType.BOE,
            "RGC artículo 133",
            QuestionDifficulty.EASY
        ),

        q(
            791,
            "Señalización",
            "Semáforos",
            "Una luz roja fija significa...",
            "Prohibición de pasar.",
            "Paso permitido con precaución.",
            "Paso libre.",
            0,
            "La luz roja no intermitente prohíbe el paso.",
            QuestionSourceType.BOE,
            "RGC - semáforos",
            QuestionDifficulty.EASY
        ),

        q(
            792,
            "Señalización",
            "Semáforos",
            "Una luz amarilla fija obliga a...",
            "Detenerse, salvo que ya no pueda hacerse con seguridad suficiente.",
            "Acelerar siempre.",
            "Continuar sin precaución.",
            0,
            "Tiene efecto de detención salvo que el vehículo esté demasiado cerca para detenerse con seguridad.",
            QuestionSourceType.BOE,
            "RGC - semáforos",
            QuestionDifficulty.EASY
        ),

        q(
            793,
            "Señalización",
            "Semáforos",
            "Una flecha verde iluminada sobre fondo negro permite...",
            "Avanzar en la dirección indicada, respetando las demás prioridades.",
            "Ir en cualquier dirección.",
            "Superar la velocidad máxima.",
            0,
            "La flecha permite el movimiento indicado, pero exige realizarlo con precaución.",
            QuestionSourceType.BOE,
            "RGC - semáforos",
            QuestionDifficulty.MEDIUM
        ),

        q(
            794,
            "Señalización",
            "Semáforos",
            "Una flecha negra sobre una luz roja limita la prohibición...",
            "Al movimiento indicado por la flecha.",
            "A todos los movimientos sin excepción.",
            "Solo a peatones.",
            0,
            "La flecha negra no cambia el significado de la luz, sino que limita su alcance al movimiento indicado.",
            QuestionSourceType.BOE,
            "RGC - semáforos",
            QuestionDifficulty.MEDIUM
        ),

        q(
            795,
            "Señalización",
            "Semáforos",
            "Al avanzar siguiendo una flecha verde, el conductor debe...",
            "Dejar pasar a quienes circulan por el carril al que se incorpora y no poner en peligro a quien cruza.",
            "Tener prioridad absoluta.",
            "Tocar el claxon.",
            0,
            "La flecha verde no concede una prioridad absoluta sobre los demás usuarios.",
            QuestionSourceType.BOE,
            "RGC - semáforos",
            QuestionDifficulty.MEDIUM
        ),

        q(
            796,
            "Señalización",
            "Semáforos de carril",
            "Un aspa roja sobre un carril significa...",
            "Que está prohibido ocuparlo y debe abandonarse cuanto antes.",
            "Que el carril está libre.",
            "Que solo pueden usarlo turismos.",
            0,
            "El aspa roja cierra el carril indicado.",
            QuestionSourceType.BOE,
            "RGC - semáforos de carril",
            QuestionDifficulty.EASY
        ),

        q(
            797,
            "Señalización",
            "Semáforos de carril",
            "Una flecha verde apuntando hacia abajo sobre un carril indica...",
            "Que está permitido circular por ese carril.",
            "Que debe abandonarse.",
            "Que es obligatorio detenerse.",
            0,
            "La flecha verde habilita la utilización del carril.",
            QuestionSourceType.BOE,
            "RGC - semáforos de carril",
            QuestionDifficulty.EASY
        ),

        q(
            798,
            "Señalización",
            "Semáforos de carril",
            "Una flecha oblicua blanca o amarilla sobre un carril indica que...",
            "Debe ir incorporándose con seguridad al carril señalado porque el suyo va a cerrarse.",
            "Tiene prioridad absoluta.",
            "Puede estacionar.",
            0,
            "La flecha oblicua anuncia el próximo cierre del carril.",
            QuestionSourceType.BOE,
            "RGC - semáforos de carril",
            QuestionDifficulty.MEDIUM
        ),

        q(
            799,
            "Señalización",
            "Balizamiento",
            "Los dispositivos delimitadores de balizamiento sirven para...",
            "Prohibir el paso por la parte de la vía que delimitan.",
            "Autorizar el estacionamiento.",
            "Indicar una gasolinera.",
            0,
            "Los dispositivos delimitadores cierran al paso la zona que delimitan.",
            QuestionSourceType.BOE,
            "RGC artículo 142",
            QuestionDifficulty.EASY
        ),

        q(
            800,
            "Señalización",
            "Circunstancial",
            "La señalización circunstancial puede contener...",
            "Instrucciones de obligado cumplimiento.",
            "Solo publicidad.",
            "Únicamente recomendaciones sin efecto.",
            0,
            "Puede informar, advertir y establecer instrucciones obligatorias.",
            QuestionSourceType.BOE,
            "RGC artículo 142",
            QuestionDifficulty.EASY
        ),

        q(
            801,
            "Prioridad",
            "Glorietas",
            "Al entrar en una glorieta debe ceder el paso normalmente a...",
            "Quienes ya circulan por ella.",
            "Quienes están detrás.",
            "Nadie.",
            0,
            "Los vehículos que circulan por la glorieta tienen prioridad sobre quienes pretenden entrar.",
            QuestionSourceType.BOE,
            "RGC - prioridad en glorietas",
            QuestionDifficulty.EASY
        ),

        q(
            802,
            "Prioridad",
            "Intersecciones",
            "En una intersección sin señalización, como regla general se cede el paso...",
            "A los vehículos que se aproximan por la derecha.",
            "A los que llegan por la izquierda.",
            "Al vehículo más grande.",
            0,
            "La prioridad de la derecha es la regla general, salvo las excepciones reglamentarias.",
            QuestionSourceType.BOE,
            "RGC - prioridad en intersecciones",
            QuestionDifficulty.EASY
        ),

        q(
            803,
            "Prioridad",
            "Vías pavimentadas",
            "En una intersección sin señalizar entre una vía pavimentada y otra sin pavimentar tiene prioridad...",
            "El vehículo de la vía pavimentada.",
            "El de la vía sin pavimentar.",
            "El que toque primero el claxon.",
            0,
            "La vía pavimentada tiene prioridad en este supuesto.",
            QuestionSourceType.BOE,
            "RGC - prioridad en intersecciones",
            QuestionDifficulty.EASY
        ),

        q(
            804,
            "Prioridad",
            "Autopista y autovía",
            "Quien pretende incorporarse a una autopista debe ceder el paso a...",
            "Los vehículos que ya circulan por ella.",
            "Nadie.",
            "Solo a los camiones.",
            0,
            "Los vehículos que circulan por la vía principal tienen prioridad.",
            QuestionSourceType.BOE,
            "RGC - incorporación y prioridad",
            QuestionDifficulty.EASY
        ),

        q(
            805,
            "Prioridad",
            "Intersecciones",
            "Aunque tenga prioridad, ¿puede entrar en una intersección si previsiblemente quedará bloqueándola?",
            "No.",
            "Sí, siempre.",
            "Solo si toca el claxon.",
            0,
            "No debe bloquearse la intersección aunque inicialmente se tenga prioridad o autorización de paso.",
            QuestionSourceType.BOE,
            "RGC artículo 59",
            QuestionDifficulty.EASY
        ),

        q(
            806,
            "Prioridad",
            "Cesión del paso",
            "Ceder correctamente el paso significa no obligar al vehículo prioritario a...",
            "Modificar bruscamente su velocidad o trayectoria.",
            "Encender las luces.",
            "Utilizar el carril derecho.",
            0,
            "La cesión debe permitir al vehículo prioritario continuar sin maniobras bruscas.",
            QuestionSourceType.BOE,
            "RGC - cesión del paso",
            QuestionDifficulty.EASY
        ),

        q(
            807,
            "Prioridad",
            "Vehículos prioritarios",
            "Ante un vehículo prioritario en servicio urgente que advierte reglamentariamente su presencia debe...",
            "Facilitarle el paso.",
            "Impedirle adelantar.",
            "Mantenerse siempre delante de él.",
            0,
            "Los demás conductores deben facilitar el paso del vehículo prioritario en servicio urgente.",
            QuestionSourceType.BOE,
            "RGC - vehículos prioritarios",
            QuestionDifficulty.EASY
        ),

        q(
            808,
            "Prioridad",
            "Vehículos prioritarios",
            "¿Tiene un vehículo de emergencias prioridad especial cuando no circula en servicio urgente?",
            "No por el mero hecho de ser vehículo de emergencias.",
            "Sí, siempre.",
            "Solo si es de color amarillo.",
            0,
            "El régimen prioritario está vinculado al servicio urgente y a su advertencia reglamentaria.",
            QuestionSourceType.BOE,
            "RGC - vehículos prioritarios",
            QuestionDifficulty.MEDIUM
        ),

        q(
            809,
            "Prioridad",
            "Estrechamientos",
            "En un estrechamiento sin señalizar, si se sabe qué vehículo entró primero, tiene preferencia normalmente...",
            "El que entró primero.",
            "El más rápido.",
            "El de menor tamaño.",
            0,
            "Cuando no pueden cruzarse y uno ya ha entrado, este tiene prioridad en el supuesto general.",
            QuestionSourceType.BOE,
            "RGC - estrechamientos",
            QuestionDifficulty.EASY
        ),

        q(
            810,
            "Prioridad",
            "Pendientes",
            "En un tramo estrecho de gran pendiente, como regla general tiene preferencia...",
            "El vehículo que asciende.",
            "El que desciende.",
            "El más nuevo.",
            0,
            "Se facilita el paso al vehículo que asciende por la dificultad de reanudar la marcha.",
            QuestionSourceType.BOE,
            "RGC - tramos en pendiente",
            QuestionDifficulty.MEDIUM
        ),

        q(
            811,
            "Adelantamientos",
            "Visibilidad",
            "¿Debe iniciarse un adelantamiento si no existe visibilidad suficiente para terminarlo con seguridad?",
            "No.",
            "Sí, si se acelera mucho.",
            "Solo de noche.",
            0,
            "El conductor debe comprobar antes de iniciar la maniobra que existe espacio y visibilidad suficientes.",
            QuestionSourceType.BOE,
            "RGC - adelantamiento",
            QuestionDifficulty.EASY
        ),

        q(
            812,
            "Adelantamientos",
            "Vehículo adelantado",
            "El vehículo que está siendo adelantado debe...",
            "No aumentar la velocidad ni dificultar la maniobra.",
            "Acelerar.",
            "Desplazarse a la izquierda.",
            0,
            "No debe impedir o dificultar el adelantamiento.",
            QuestionSourceType.BOE,
            "RGC - adelantamiento",
            QuestionDifficulty.EASY
        ),

        q(
            813,
            "Adelantamientos",
            "Desistimiento",
            "Si aparece un peligro mientras adelanta y ya no puede completar la maniobra con seguridad debe...",
            "Desistir cuando sea posible hacerlo de forma segura.",
            "Acelerar siempre.",
            "Detenerse en el carril contrario.",
            0,
            "La maniobra debe abandonarse si las condiciones dejan de ser seguras.",
            QuestionSourceType.DGT,
            "DGT - adelantamientos",
            QuestionDifficulty.MEDIUM
        ),

        q(
            814,
            "Adelantamientos",
            "Observación",
            "Antes de iniciar un adelantamiento debe comprobar...",
            "Que ningún usuario que le siga haya iniciado ya la maniobra y que dispone de espacio suficiente.",
            "Solo el velocímetro.",
            "Solo el vehículo que va delante.",
            0,
            "Debe comprobar el tráfico delantero y trasero antes de desplazarse.",
            QuestionSourceType.BOE,
            "RGC - adelantamiento",
            QuestionDifficulty.MEDIUM
        ),

        q(
            815,
            "Adelantamientos",
            "Señalización",
            "El desplazamiento lateral para adelantar debe advertirse...",
            "Con el indicador de dirección correspondiente.",
            "Con las luces de emergencia.",
            "Solo con el claxon.",
            0,
            "El cambio lateral debe señalizarse con antelación suficiente.",
            QuestionSourceType.BOE,
            "RGC - adelantamiento",
            QuestionDifficulty.EASY
        ),

        q(
            816,
            "Maniobras",
            "Cambio de carril",
            "Antes de cambiar de carril debe comprobar especialmente...",
            "Los retrovisores y la zona de ángulo muerto.",
            "Solo el cuentakilómetros.",
            "Solo las señales del navegador.",
            0,
            "Los espejos pueden dejar zonas sin visibilidad directa.",
            QuestionSourceType.DGT,
            "DGT - cambio de carril",
            QuestionDifficulty.EASY
        ),

        q(
            817,
            "Maniobras",
            "Incorporación",
            "Al salir de un estacionamiento debe...",
            "Ceder el paso a los vehículos que ya circulan.",
            "Tener siempre prioridad.",
            "Salir sin señalizar.",
            0,
            "Quien se incorpora debe hacerlo sin crear peligro a quienes ya circulan.",
            QuestionSourceType.BOE,
            "RGC - incorporación",
            QuestionDifficulty.EASY
        ),

        q(
            818,
            "Maniobras",
            "Cambio de sentido",
            "¿Puede efectuarse un cambio de sentido cuando la visibilidad es insuficiente?",
            "No.",
            "Sí, si se señaliza.",
            "Sí, siempre.",
            0,
            "No debe realizarse cuando no pueda comprobarse que la maniobra es segura.",
            QuestionSourceType.BOE,
            "RGC - cambio de sentido",
            QuestionDifficulty.EASY
        ),

        q(
            819,
            "Maniobras",
            "Marcha atrás",
            "La marcha atrás debe realizarse...",
            "Lentamente y tras comprobar que puede hacerse sin peligro.",
            "A gran velocidad.",
            "Sin mirar el entorno.",
            0,
            "Es una maniobra de visibilidad limitada que exige especial precaución.",
            QuestionSourceType.BOE,
            "RGC - marcha atrás",
            QuestionDifficulty.EASY
        ),

        q(
            820,
            "Maniobras",
            "Autopistas y autovías",
            "¿Puede utilizarse la marcha atrás en una autopista para recuperar una salida que se ha pasado?",
            "No.",
            "Sí, por el arcén.",
            "Sí, si no viene nadie.",
            0,
            "La marcha atrás está prohibida en autopistas y autovías.",
            QuestionSourceType.BOE,
            "RGC - marcha atrás",
            QuestionDifficulty.EASY
        )
    )
}
