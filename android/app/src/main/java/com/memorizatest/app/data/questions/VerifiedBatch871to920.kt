package com.memorizatest.app.data.questions

import com.memorizatest.app.model.QuestionDifficulty
import com.memorizatest.app.model.QuestionOrigin
import com.memorizatest.app.model.QuestionSourceType
import com.memorizatest.app.model.TestQuestion

object VerifiedBatch871to920 {

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
            871,
            "Seguridad infantil",
            "SRI",
            "Un menor de edad que mide 130 cm debe utilizar...",
            "Un sistema de retención infantil homologado adecuado.",
            "Únicamente el cinturón de adulto en cualquier caso.",
            "Ningún sistema si viaja detrás.",
            0,
            "Los menores de edad de estatura igual o inferior a 135 cm deben utilizar un sistema de retención infantil homologado.",
            QuestionSourceType.BOE,
            "RGC artículo 117",
            QuestionDifficulty.EASY
        ),

        q(
            872,
            "Seguridad infantil",
            "SRI",
            "Como norma general, un menor de hasta 135 cm que viaja en un turismo debe ocupar...",
            "Los asientos traseros con su SRI adecuado.",
            "Siempre el asiento delantero.",
            "Cualquier asiento sin sistema de retención.",
            0,
            "Los menores de hasta 135 cm deben situarse normalmente en los asientos traseros.",
            QuestionSourceType.DGT,
            "DGT - viajar con niños",
            QuestionDifficulty.EASY
        ),

        q(
            873,
            "Seguridad infantil",
            "SRI",
            "¿Puede un menor de hasta 135 cm viajar delante si el vehículo no dispone de asientos traseros?",
            "Sí, utilizando el SRI adecuado.",
            "No, nunca.",
            "Solo sin cinturón.",
            0,
            "La inexistencia de asientos traseros es una de las excepciones que permiten instalar el SRI delante.",
            QuestionSourceType.BOE,
            "RGC artículo 117",
            QuestionDifficulty.MEDIUM
        ),

        q(
            874,
            "Seguridad infantil",
            "SRI",
            "Si todos los asientos traseros están ya ocupados por otros menores con sus sistemas de retención y no cabe otro SRI, ¿puede existir una excepción para llevar otro menor delante?",
            "Sí.",
            "No, nunca.",
            "Solo si mide menos de 100 cm.",
            0,
            "La ocupación de todos los asientos traseros por otros SRI puede constituir una excepción reglamentaria.",
            QuestionSourceType.BOE,
            "RGC artículo 117",
            QuestionDifficulty.MEDIUM
        ),

        q(
            875,
            "Seguridad infantil",
            "SRI",
            "Si no es posible instalar correctamente todos los sistemas de retención infantil en los asientos traseros, ¿puede aplicarse una excepción reglamentaria?",
            "Sí.",
            "No.",
            "Solo en autopista.",
            0,
            "La imposibilidad de instalar todos los SRI detrás es una de las excepciones previstas.",
            QuestionSourceType.BOE,
            "RGC artículo 117",
            QuestionDifficulty.MEDIUM
        ),

        q(
            876,
            "Seguridad infantil",
            "SRI",
            "Al elegir un sistema de retención infantil debe atenderse principalmente a...",
            "La talla y características del menor y a la homologación del sistema.",
            "El color del asiento.",
            "La marca del vehículo exclusivamente.",
            0,
            "El sistema debe ser adecuado al menor y estar homologado.",
            QuestionSourceType.DGT,
            "DGT - viajar con niños",
            QuestionDifficulty.EASY
        ),

        q(
            877,
            "Seguridad infantil",
            "SRI",
            "¿Debe instalarse un SRI siguiendo las instrucciones de su fabricante?",
            "Sí.",
            "No.",
            "Solo la primera vez.",
            0,
            "Una instalación incorrecta puede reducir notablemente su eficacia.",
            QuestionSourceType.DGT,
            "DGT - viajar con niños",
            QuestionDifficulty.EASY
        ),

        q(
            878,
            "Seguridad infantil",
            "SRI",
            "Un sistema infantil homologado pero mal instalado...",
            "Puede ofrecer una protección muy inferior a la prevista.",
            "Protege exactamente igual.",
            "Es siempre más seguro que uno bien instalado.",
            0,
            "La correcta fijación del sistema al vehículo es esencial.",
            QuestionSourceType.DGT,
            "DGT - viajar con niños",
            QuestionDifficulty.EASY
        ),

        q(
            879,
            "Seguridad infantil",
            "Homologación",
            "¿Debe comprobarse que el sistema de retención infantil esté homologado?",
            "Sí.",
            "No.",
            "Solo para viajes internacionales.",
            0,
            "Los SRI utilizados deben cumplir la homologación correspondiente.",
            QuestionSourceType.DGT,
            "DGT - viajar con niños",
            QuestionDifficulty.EASY
        ),

        q(
            880,
            "Seguridad infantil",
            "SRI",
            "Para elegir una sillita infantil, ¿debe utilizarse únicamente la edad del niño como criterio?",
            "No.",
            "Sí, siempre.",
            "Solo a partir de 10 años.",
            0,
            "La DGT indica que deben considerarse especialmente talla y características del menor, no únicamente su edad.",
            QuestionSourceType.DGT,
            "DGT - viajar con niños",
            QuestionDifficulty.EASY
        ),

        q(
            881,
            "Seguridad infantil",
            "Airbag",
            "Si excepcionalmente se instala delante un SRI orientado hacia atrás, ¿debe tenerse en cuenta el airbag frontal?",
            "Sí, porque un airbag frontal activo puede resultar peligroso.",
            "No tiene ninguna importancia.",
            "Solo en vehículos diésel.",
            0,
            "Un SRI orientado hacia atrás no debe exponerse a un airbag frontal activo en las condiciones prohibidas por la normativa e instrucciones.",
            QuestionSourceType.DGT,
            "DGT - sistemas de retención infantil",
            QuestionDifficulty.MEDIUM
        ),

        q(
            882,
            "Seguridad infantil",
            "Cinturón",
            "El cinturón o arnés de un SRI debe ir...",
            "Correctamente ajustado, sin holguras innecesarias.",
            "Muy flojo para que el niño pueda moverse.",
            "Desabrochado en ciudad.",
            0,
            "El sistema solo protege adecuadamente cuando está correctamente utilizado.",
            QuestionSourceType.DGT,
            "DGT - viajar con niños",
            QuestionDifficulty.EASY
        ),

        q(
            883,
            "Seguridad infantil",
            "Objetos",
            "Los objetos sueltos alrededor de un menor pueden ser peligrosos porque...",
            "Pueden salir proyectados en una frenada o choque.",
            "Reducen siempre la velocidad del vehículo.",
            "Mejoran la protección del SRI.",
            0,
            "Los objetos no sujetos pueden convertirse en proyectiles dentro del habitáculo.",
            QuestionSourceType.DGT,
            "DGT - seguridad en el vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            884,
            "Seguridad infantil",
            "Trayectos cortos",
            "En un trayecto urbano muy corto, ¿puede prescindirse del SRI obligatorio?",
            "No.",
            "Sí, si dura menos de cinco minutos.",
            "Sí, si se circula despacio.",
            0,
            "La obligación y el riesgo existen también en desplazamientos cortos.",
            QuestionSourceType.BOE,
            "RGC artículo 117",
            QuestionDifficulty.EASY
        ),

        q(
            885,
            "Seguridad infantil",
            "Asientos traseros",
            "¿Viajar correctamente sujeto en los asientos traseros suele ser la ubicación ordinaria para los menores de hasta 135 cm?",
            "Sí.",
            "No, deben viajar siempre delante.",
            "Solo de noche.",
            0,
            "La regla general sitúa a estos menores en los asientos traseros con el SRI correspondiente.",
            QuestionSourceType.BOE,
            "RGC artículo 117",
            QuestionDifficulty.EASY
        ),

        q(
            886,
            "Seguridad",
            "Cinturón",
            "El cinturón de seguridad es obligatorio, cuando el vehículo lo equipa y resulta exigible, en...",
            "Vías urbanas e interurbanas.",
            "Solo autopistas.",
            "Solo viajes de más de 50 km.",
            0,
            "La obligación se aplica tanto en circulación urbana como interurbana.",
            QuestionSourceType.BOE,
            "RGC artículo 117",
            QuestionDifficulty.EASY
        ),

        q(
            887,
            "Seguridad",
            "Cinturón",
            "Un pasajero de los asientos traseros debe utilizar el cinturón cuando sea obligatorio...",
            "Sí.",
            "No.",
            "Solo si es menor de edad.",
            0,
            "La obligación de utilizar cinturón alcanza también a los ocupantes de plazas traseras.",
            QuestionSourceType.BOE,
            "RGC artículo 117",
            QuestionDifficulty.EASY
        ),

        q(
            888,
            "Seguridad",
            "Cinturón",
            "Llevar el cinturón colocado pero sin abrochar correctamente...",
            "No proporciona la protección reglamentaria adecuada.",
            "Es equivalente a llevarlo bien puesto.",
            "Es recomendable en ciudad.",
            0,
            "El cinturón debe utilizarse correctamente abrochado.",
            QuestionSourceType.BOE,
            "RGC artículo 117",
            QuestionDifficulty.EASY
        ),

        q(
            889,
            "Seguridad",
            "Cinturón",
            "La banda diagonal del cinturón debe pasar normalmente...",
            "Por el hombro y el pecho, evitando el cuello.",
            "Por debajo del brazo.",
            "Por detrás de la espalda.",
            0,
            "Una colocación correcta permite repartir mejor las fuerzas en caso de impacto.",
            QuestionSourceType.DGT,
            "DGT - cinturón de seguridad",
            QuestionDifficulty.EASY
        ),

        q(
            890,
            "Seguridad",
            "Cinturón",
            "La banda inferior del cinturón debe apoyarse preferentemente...",
            "Sobre la pelvis.",
            "Sobre el abdomen.",
            "Sobre el cuello.",
            0,
            "Debe apoyarse en una zona ósea resistente y no sobre el abdomen.",
            QuestionSourceType.DGT,
            "DGT - cinturón de seguridad",
            QuestionDifficulty.EASY
        ),

        q(
            891,
            "Carga y equipaje",
            "Maletero",
            "El lugar preferente para transportar equipaje en un turismo es...",
            "El maletero.",
            "La bandeja trasera.",
            "El suelo delante de los pedales.",
            0,
            "La DGT recomienda colocar la carga preferentemente en el maletero.",
            QuestionSourceType.DGT,
            "DGT - transporte de cargas",
            QuestionDifficulty.EASY
        ),

        q(
            892,
            "Carga y equipaje",
            "Distribución",
            "Los bultos más pesados deben colocarse preferentemente...",
            "En la parte baja y bien apoyados del maletero.",
            "En la parte más alta posible.",
            "Sobre la bandeja trasera.",
            0,
            "Una posición baja ayuda a mantener mejor el centro de gravedad y la estabilidad.",
            QuestionSourceType.DGT,
            "DGT - equipaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            893,
            "Carga y equipaje",
            "Sujeción",
            "¿Debe sujetarse adecuadamente el equipaje para evitar desplazamientos?",
            "Sí.",
            "No.",
            "Solo si pesa más de 100 kg.",
            0,
            "La carga debe acondicionarse y sujetarse para evitar desplazamientos y proyecciones.",
            QuestionSourceType.DGT,
            "DGT - transporte de cargas",
            QuestionDifficulty.EASY
        ),

        q(
            894,
            "Carga y equipaje",
            "Bandeja trasera",
            "¿Es recomendable colocar objetos pesados en la bandeja trasera?",
            "No.",
            "Sí.",
            "Solo si están junto al cristal.",
            0,
            "Pueden impedir la visión y convertirse en proyectiles durante una frenada o choque.",
            QuestionSourceType.DGT,
            "DGT - equipaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            895,
            "Carga y equipaje",
            "Visibilidad",
            "La carga transportada dentro del habitáculo...",
            "No debe reducir peligrosamente el campo de visión del conductor.",
            "Puede tapar completamente la luneta siempre.",
            "Debe sujetarse al volante.",
            0,
            "La carga no puede comprometer la visibilidad necesaria para conducir.",
            QuestionSourceType.DGT,
            "DGT - transporte de cargas",
            QuestionDifficulty.EASY
        ),

        q(
            896,
            "Carga y equipaje",
            "Estabilidad",
            "Una mala distribución de la carga puede...",
            "Perjudicar la estabilidad del vehículo.",
            "Mejorar siempre el comportamiento.",
            "No tener ningún efecto.",
            0,
            "El reparto de masas modifica el comportamiento dinámico del vehículo.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente y carga",
            QuestionDifficulty.EASY
        ),

        q(
            897,
            "Carga y equipaje",
            "Sobrecarga",
            "¿Puede sobrepasarse la Masa Máxima Autorizada porque el trayecto sea corto?",
            "No.",
            "Sí, hasta un 20 %.",
            "Solo dentro de poblado.",
            0,
            "La carga transportada debe respetar la masa máxima autorizada del vehículo.",
            QuestionSourceType.DGT,
            "DGT - transporte de cargas",
            QuestionDifficulty.EASY
        ),

        q(
            898,
            "Carga y equipaje",
            "Baca",
            "Llevar carga sobre una baca puede...",
            "Aumentar el consumo y modificar la estabilidad.",
            "Reducir siempre el consumo.",
            "No tener ningún efecto aerodinámico.",
            0,
            "La carga exterior aumenta la resistencia aerodinámica y puede elevar el centro de gravedad.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            899,
            "Carga y equipaje",
            "Baca",
            "La carga colocada en una baca debe ir...",
            "Correctamente sujeta y protegida frente a su caída.",
            "Suelta para que se adapte al viento.",
            "Apoyada únicamente contra el techo.",
            0,
            "El equipaje exterior debe asegurarse para que no pueda desplazarse o caer.",
            QuestionSourceType.DGT,
            "DGT - transporte de cargas",
            QuestionDifficulty.EASY
        ),

        q(
            900,
            "Carga y equipaje",
            "Comportamiento",
            "Al conducir un vehículo muy cargado debe tenerse en cuenta que...",
            "Puede cambiar su aceleración, estabilidad y distancia de frenado.",
            "Se comportará exactamente como vacío.",
            "Frenará siempre en menos distancia.",
            0,
            "La masa adicional modifica la dinámica del vehículo.",
            QuestionSourceType.DGT,
            "DGT - equipaje seguro",
            QuestionDifficulty.MEDIUM
        ),

        q(
            901,
            "Animales",
            "Transporte",
            "Un animal transportado en un turismo debe colocarse de forma que...",
            "No interfiera con la conducción ni pueda desplazarse peligrosamente.",
            "Pueda moverse libremente por los asientos delanteros.",
            "Se siente sobre el conductor.",
            0,
            "Los animales deben viajar correctamente ubicados y sujetos o separados para no interferir con el conductor.",
            QuestionSourceType.DGT,
            "DGT - transporte de animales",
            QuestionDifficulty.EASY
        ),

        q(
            902,
            "Animales",
            "Conducción",
            "¿Es seguro llevar un perro suelto entre el conductor y los mandos del vehículo?",
            "No.",
            "Sí.",
            "Solo a menos de 30 km/h.",
            0,
            "El animal no debe interferir con la libertad de movimientos, atención o campo de visión del conductor.",
            QuestionSourceType.DGT,
            "DGT - transporte de animales",
            QuestionDifficulty.EASY
        ),

        q(
            903,
            "Animales",
            "Sujeción",
            "Un animal correctamente sujeto reduce...",
            "El riesgo de interferir con la conducción o salir proyectado.",
            "La necesidad de llevar cinturón los ocupantes.",
            "La velocidad máxima legal.",
            0,
            "Los sistemas de sujeción o separación mejoran la seguridad de ocupantes y animal.",
            QuestionSourceType.DGT,
            "DGT - transporte de animales",
            QuestionDifficulty.EASY
        ),

        q(
            904,
            "Viajes",
            "Descanso",
            "En un viaje largo, la DGT recomienda descansar aproximadamente...",
            "Cada dos horas o unos 200-300 km.",
            "Cada ocho horas.",
            "Solo cuando se encienda una avería.",
            0,
            "Los descansos periódicos ayudan a reducir fatiga y pérdida de atención.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            905,
            "Viajes",
            "Alimentación",
            "Antes y durante un viaje largo conviene realizar comidas...",
            "Ligeras y de fácil digestión.",
            "Muy abundantes.",
            "Acompañadas de alcohol.",
            0,
            "Las comidas copiosas favorecen el amodorramiento y la somnolencia.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            906,
            "Viajes",
            "Alcohol",
            "¿Es recomendable tomar una bebida alcohólica para mantenerse más despierto durante un viaje?",
            "No.",
            "Sí.",
            "Solo durante la comida.",
            0,
            "El alcohol tiene efectos negativos sobre la conducción y no es un método contra la fatiga.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            907,
            "Viajes",
            "Planificación",
            "Antes de iniciar un viaje largo conviene...",
            "Informarse del itinerario y del estado del tráfico.",
            "Improvisar siempre la ruta mientras se conduce.",
            "Evitar revisar el vehículo.",
            0,
            "Planificar el desplazamiento permite anticipar incidencias y reducir distracciones.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            908,
            "Viajes",
            "Fatiga",
            "Si comienza a notar cansancio antes de que transcurran dos horas, ¿debe esperar necesariamente hasta cumplir las dos horas para descansar?",
            "No.",
            "Sí.",
            "Solo puede parar después de 200 km.",
            0,
            "Las dos horas son una referencia; si aparece fatiga debe descansarse antes.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.MEDIUM
        ),

        q(
            909,
            "Viajes",
            "Parada",
            "Un descanso durante un viaje sirve, entre otras cosas, para...",
            "Recuperar atención y reducir fatiga.",
            "Aumentar la somnolencia deliberadamente.",
            "Evitar tener que beber agua.",
            0,
            "Parar periódicamente ayuda a mantener un nivel adecuado de alerta.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            910,
            "Accidentes y primeros auxilios",
            "PAS",
            "Las siglas PAS significan...",
            "Proteger, Avisar y Socorrer.",
            "Parar, Acelerar y Salir.",
            "Prevenir, Adelantar y Señalizar.",
            0,
            "La conducta PAS establece el orden básico de actuación ante una emergencia.",
            QuestionSourceType.DGT,
            "DGT - qué hacer ante un accidente",
            QuestionDifficulty.EASY
        ),

        q(
            911,
            "Accidentes y primeros auxilios",
            "Proteger",
            "En la conducta PAS, antes de atender a las víctimas debe...",
            "Evitar crear nuevos peligros y proteger el lugar y a las personas.",
            "Mover inmediatamente todos los vehículos y heridos.",
            "Llamar a familiares antes que a emergencias.",
            0,
            "La seguridad del escenario es la primera prioridad.",
            QuestionSourceType.DGT,
            "DGT - qué hacer ante un accidente",
            QuestionDifficulty.EASY
        ),

        q(
            912,
            "Accidentes y primeros auxilios",
            "Avisar",
            "Después de proteger la zona de un accidente debe...",
            "Avisar a los servicios de emergencia cuando sea necesario.",
            "Continuar el viaje sin más.",
            "Dar comida a los heridos.",
            0,
            "Tras proteger, la segunda fase de PAS es alertar a emergencias.",
            QuestionSourceType.DGT,
            "DGT - qué hacer ante un accidente",
            QuestionDifficulty.EASY
        ),

        q(
            913,
            "Accidentes y primeros auxilios",
            "112",
            "El número general de emergencias en España es...",
            "112.",
            "118.",
            "911 exclusivamente.",
            0,
            "El 112 permite contactar con los servicios de emergencia.",
            QuestionSourceType.DGT,
            "DGT - emergencias",
            QuestionDifficulty.EASY
        ),

        q(
            914,
            "Accidentes y primeros auxilios",
            "112",
            "Al llamar al 112 conviene indicar...",
            "La localización, qué ha ocurrido y el número o estado aproximado de víctimas.",
            "Solo la matrícula propia.",
            "Únicamente el color de los vehículos.",
            0,
            "La información clara permite movilizar los recursos adecuados.",
            QuestionSourceType.DGT,
            "DGT - qué hacer ante un accidente",
            QuestionDifficulty.EASY
        ),

        q(
            915,
            "Accidentes y primeros auxilios",
            "Heridos",
            "Como regla general, una víctima grave de un accidente...",
            "No debe moverse innecesariamente salvo peligro mayor u otra necesidad justificada.",
            "Debe ponerse de pie inmediatamente.",
            "Debe trasladarse siempre en un vehículo particular.",
            0,
            "Un movimiento inadecuado puede agravar ciertas lesiones.",
            QuestionSourceType.DGT,
            "DGT - primeros auxilios",
            QuestionDifficulty.MEDIUM
        ),

        q(
            916,
            "Accidentes y primeros auxilios",
            "Socorrer",
            "Si no se tienen conocimientos sanitarios suficientes, al socorrer a un herido conviene...",
            "Seguir las instrucciones de los servicios de emergencia y evitar actuaciones que puedan agravarlo.",
            "Realizar cualquier maniobra aunque se desconozca.",
            "Dar siempre comida y bebida.",
            0,
            "El auxilio debe prestarse dentro de las propias capacidades y siguiendo indicaciones profesionales.",
            QuestionSourceType.DGT,
            "DGT - qué hacer ante un accidente",
            QuestionDifficulty.MEDIUM
        ),

        q(
            917,
            "Accidentes y primeros auxilios",
            "Curiosos",
            "Reducir mucho la velocidad solo para observar un accidente en el sentido contrario...",
            "Puede generar distracciones y nuevos riesgos.",
            "Es recomendable.",
            "Es obligatorio.",
            0,
            "La DGT aconseja continuar con prudencia cuando la ayuda ya está organizada y no detenerse a curiosear.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            918,
            "Accidentes y primeros auxilios",
            "Seguridad propia",
            "Al auxiliar en un accidente debe evitarse...",
            "Ponerse innecesariamente en peligro.",
            "Proteger el escenario.",
            "Avisar a emergencias.",
            0,
            "La primera parte de PAS consiste también en proteger al propio auxiliador.",
            QuestionSourceType.DGT,
            "DGT - qué hacer ante un accidente",
            QuestionDifficulty.EASY
        ),

        q(
            919,
            "Accidentes y primeros auxilios",
            "Víctimas",
            "Si una víctima está consciente conviene...",
            "Tranquilizarla y seguir las indicaciones de los servicios de emergencia.",
            "Obligarla a caminar.",
            "Darle alcohol.",
            0,
            "La asistencia debe evitar actuaciones que puedan empeorar su estado.",
            QuestionSourceType.DGT,
            "DGT - primeros auxilios",
            QuestionDifficulty.EASY
        ),

        q(
            920,
            "Accidentes y primeros auxilios",
            "Orden de actuación",
            "¿Cuál es el orden correcto ante un accidente?",
            "Proteger, Avisar y Socorrer.",
            "Socorrer, Avisar y Proteger.",
            "Avisar, marcharse y volver.",
            0,
            "PAS establece primero seguridad, después aviso y finalmente asistencia a las víctimas.",
            QuestionSourceType.DGT,
            "DGT - qué hacer ante un accidente",
            QuestionDifficulty.EASY
        )
    )
}
