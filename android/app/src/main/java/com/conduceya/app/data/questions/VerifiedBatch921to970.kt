package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object VerifiedBatch921to970 {

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
            921,
            "Documentación",
            "Documentos obligatorios",
            "Al conducir un turismo, ¿qué tres documentos básicos deben estar disponibles y en vigor?",
            "Permiso de conducir, permiso de circulación y tarjeta ITV.",
            "Solo DNI, seguro y matrícula.",
            "Permiso de conducir, factura del coche y recibo del seguro.",
            0,
            "La DGT identifica estos tres documentos como la documentación básica obligatoria para circular.",
            QuestionSourceType.DGT,
            "DGT - documentación obligatoria",
            QuestionDifficulty.EASY
        ),

        q(
            922,
            "Documentación",
            "Documentos obligatorios",
            "¿La documentación obligatoria debe estar en vigor también en trayectos cortos?",
            "Sí.",
            "No, solo en viajes interurbanos.",
            "Solo en autopista.",
            0,
            "La obligación no depende de la duración del trayecto.",
            QuestionSourceType.DGT,
            "DGT - documentación obligatoria",
            QuestionDifficulty.EASY
        ),

        q(
            923,
            "Documentación",
            "Documentos obligatorios",
            "Los documentos físicos exigibles pueden llevarse...",
            "En original o copia compulsada cuando corresponda.",
            "Solo mediante una fotografía sin validez oficial.",
            "Únicamente en fotocopia simple.",
            0,
            "La DGT admite originales o copias compulsadas en los supuestos indicados.",
            QuestionSourceType.DGT,
            "DGT - documentación obligatoria",
            QuestionDifficulty.MEDIUM
        ),

        q(
            924,
            "Documentación",
            "Vehículo de alquiler",
            "Si conduce un vehículo de alquiler, ¿debe comprobar que dispone de la documentación obligatoria?",
            "Sí.",
            "No, porque es responsabilidad exclusiva de la empresa.",
            "Solo si sale de España.",
            0,
            "Los vehículos de alquiler están igualmente sujetos a la documentación exigible.",
            QuestionSourceType.DGT,
            "DGT - documentación de vehículos de alquiler",
            QuestionDifficulty.EASY
        ),

        q(
            925,
            "Documentación",
            "Seguro",
            "¿Es obligatorio llevar físicamente en el vehículo la póliza del seguro o el último recibo de pago?",
            "No.",
            "Sí, ambos siempre.",
            "Solo el recibo.",
            0,
            "Desde 2008 no es obligatorio portar físicamente la póliza ni el recibo, aunque el seguro obligatorio debe estar vigente.",
            QuestionSourceType.DGT,
            "DGT - documentación obligatoria",
            QuestionDifficulty.EASY
        ),

        q(
            926,
            "Documentación",
            "miDGT",
            "Dentro de España, el permiso de conducir disponible en la aplicación miDGT...",
            "Tiene la misma validez legal que el documento físico.",
            "No tiene ninguna validez.",
            "Solo sirve para consultar puntos.",
            0,
            "La DGT reconoce validez legal al permiso digital de miDGT dentro del territorio nacional.",
            QuestionSourceType.DGT,
            "DGT - miDGT",
            QuestionDifficulty.EASY
        ),

        q(
            927,
            "Documentación",
            "miDGT",
            "Dentro de España, el permiso de circulación mostrado en miDGT...",
            "Tiene la misma validez legal que el físico.",
            "Solo es informativo.",
            "Solo vale durante 24 horas.",
            0,
            "El permiso de circulación digital disponible en miDGT tiene validez legal dentro de España.",
            QuestionSourceType.DGT,
            "DGT - miDGT",
            QuestionDifficulty.EASY
        ),

        q(
            928,
            "Documentación",
            "Permiso de circulación",
            "El permiso de circulación sirve principalmente para...",
            "Identificar la titularidad y datos administrativos del vehículo.",
            "Acreditar que el conductor ha aprobado el examen teórico.",
            "Sustituir al seguro obligatorio.",
            0,
            "Es uno de los documentos administrativos fundamentales del vehículo.",
            QuestionSourceType.DGT,
            "DGT - permiso de circulación",
            QuestionDifficulty.EASY
        ),

        q(
            929,
            "Documentación",
            "Tarjeta ITV",
            "La tarjeta ITV o ficha técnica acredita principalmente...",
            "Las características técnicas y homologación del vehículo.",
            "Los puntos del permiso del conductor.",
            "La identidad de todos los pasajeros.",
            0,
            "La ficha técnica recoge las características del vehículo y su situación de inspección técnica.",
            QuestionSourceType.DGT,
            "DGT - tarjeta ITV",
            QuestionDifficulty.EASY
        ),

        q(
            930,
            "Documentación",
            "Vehículo",
            "Para circular legalmente, el vehículo debe disponer de permiso de circulación y tarjeta ITV...",
            "En vigor cuando corresponda.",
            "Solo el día de la compra.",
            "Únicamente para circular por autopista.",
            0,
            "Ambos forman parte de la documentación necesaria del vehículo.",
            QuestionSourceType.DGT,
            "DGT - documentación del vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            931,
            "Documentación",
            "Duplicados",
            "Si se pierde o deteriora el permiso de circulación o la tarjeta ITV, ¿debe solicitarse un duplicado?",
            "Sí.",
            "No.",
            "Solo si el vehículo tiene más de diez años.",
            0,
            "La DGT prevé la solicitud de duplicados por pérdida, robo o deterioro.",
            QuestionSourceType.DGT,
            "DGT - duplicado de documentación",
            QuestionDifficulty.EASY
        ),

        q(
            932,
            "Documentación",
            "Robo de documentos",
            "Ante el robo de la documentación del vehículo, además de solicitar duplicados, la DGT aconseja...",
            "Denunciarlo para evitar un uso fraudulento.",
            "No comunicarlo a nadie.",
            "Cambiar la matrícula por cuenta propia.",
            0,
            "La denuncia ayuda a dejar constancia del robo y prevenir un uso indebido.",
            QuestionSourceType.DGT,
            "DGT - pérdida o robo de documentación",
            QuestionDifficulty.EASY
        ),

        q(
            933,
            "ITV",
            "Resultado favorable",
            "Una ITV con resultado favorable permite...",
            "Circular normalmente hasta la siguiente inspección obligatoria.",
            "Circular únicamente hasta el taller.",
            "No circular por vías públicas.",
            0,
            "El resultado favorable mantiene la autorización ordinaria para circular.",
            QuestionSourceType.DGT,
            "DGT - resultados de la ITV",
            QuestionDifficulty.EASY
        ),

        q(
            934,
            "ITV",
            "Defectos leves",
            "Si la ITV es favorable pero se detectan defectos leves...",
            "Deben repararse cuanto antes aunque el vehículo pueda seguir circulando.",
            "Debe llevarse el vehículo obligatoriamente en grúa.",
            "No es necesario repararlos nunca.",
            0,
            "Los defectos leves no impiden circular, pero deben subsanarse.",
            QuestionSourceType.DGT,
            "DGT - resultados de la ITV",
            QuestionDifficulty.MEDIUM
        ),

        q(
            935,
            "ITV",
            "Resultado desfavorable",
            "Una ITV desfavorable permite circular únicamente...",
            "Para ir al taller a reparar los defectos y volver a inspección en los términos permitidos.",
            "Con total normalidad durante dos meses.",
            "Solo por autopista.",
            0,
            "El resultado desfavorable limita la circulación a los desplazamientos necesarios para reparación y reinspección.",
            QuestionSourceType.DGT,
            "DGT - resultados de la ITV",
            QuestionDifficulty.MEDIUM
        ),

        q(
            936,
            "ITV",
            "Plazo",
            "Tras una ITV desfavorable, el plazo ordinario indicado para reparar los defectos y volver a inspección es de...",
            "Dos meses.",
            "Un año.",
            "Cinco años.",
            0,
            "La información de DGT establece un plazo máximo ordinario de dos meses.",
            QuestionSourceType.DGT,
            "DGT - resultados de la ITV",
            QuestionDifficulty.MEDIUM
        ),

        q(
            937,
            "ITV",
            "Resultado negativo",
            "Si la ITV resulta negativa por defectos muy graves, el vehículo...",
            "No puede circular por vías públicas y debe trasladarse al taller por medios ajenos, como una grúa.",
            "Puede circular libremente dos meses.",
            "Puede circular solo de noche.",
            0,
            "La ITV negativa implica un riesgo directo e inmediato y prohíbe circular incluso para ir al taller.",
            QuestionSourceType.DGT,
            "DGT - resultados de la ITV",
            QuestionDifficulty.HARD
        ),

        q(
            938,
            "ITV",
            "ITV caducada",
            "Un vehículo con la ITV periódica caducada cuando ya le corresponde pasarla...",
            "No está autorizado para circular normalmente.",
            "Puede circular indefinidamente hasta que sea sancionado.",
            "Solo tiene prohibido circular de noche.",
            0,
            "La inspección periódica debe encontrarse vigente cuando resulte exigible.",
            QuestionSourceType.DGT,
            "DGT - inspección técnica",
            QuestionDifficulty.EASY
        ),

        q(
            939,
            "Documentación",
            "Seguro",
            "Aunque no sea obligatorio llevar el recibo físicamente, el vehículo...",
            "Debe disponer del seguro obligatorio en vigor.",
            "Puede circular sin seguro.",
            "Solo necesita seguro fuera de poblado.",
            0,
            "No portar el justificante no elimina la obligación de mantener el aseguramiento exigido.",
            QuestionSourceType.DGT,
            "DGT - seguro y documentación",
            QuestionDifficulty.EASY
        ),

        q(
            940,
            "Documentación",
            "Vigencia",
            "Antes de iniciar un viaje conviene comprobar que la documentación y autorizaciones necesarias...",
            "No están caducadas.",
            "Están guardadas en casa aunque hayan caducado.",
            "Solo coinciden en color.",
            0,
            "La documentación exigible debe estar válida y actualizada.",
            QuestionSourceType.DGT,
            "DGT - documentación obligatoria",
            QuestionDifficulty.EASY
        ),

        q(
            941,
            "Seguridad pasiva",
            "Cinturón",
            "El cinturón de seguridad es considerado por la DGT...",
            "Un elemento fundamental de seguridad pasiva.",
            "Un elemento decorativo.",
            "Un sistema exclusivo para autopistas.",
            0,
            "El cinturón reduce las consecuencias de una colisión para conductor y pasajeros.",
            QuestionSourceType.DGT,
            "DGT - cinturón de seguridad",
            QuestionDifficulty.EASY
        ),

        q(
            942,
            "Seguridad pasiva",
            "Cinturón",
            "¿Debe utilizarse el cinturón también en los asientos traseros cuando resulte obligatorio?",
            "Sí.",
            "No.",
            "Solo por menores.",
            0,
            "El cinturón protege tanto a ocupantes delanteros como traseros.",
            QuestionSourceType.DGT,
            "DGT - cinturón de seguridad",
            QuestionDifficulty.EASY
        ),

        q(
            943,
            "Seguridad pasiva",
            "Airbag",
            "El airbag debe entenderse como...",
            "Un complemento del cinturón, no un sustituto.",
            "Un sustituto completo del cinturón.",
            "Un sistema que hace innecesario el reposacabezas.",
            0,
            "El airbag está diseñado para trabajar conjuntamente con el cinturón correctamente colocado.",
            QuestionSourceType.DGT,
            "DGT - airbag y cinturón",
            QuestionDifficulty.EASY
        ),

        q(
            944,
            "Seguridad pasiva",
            "Sistemas de retención",
            "Airbags y reposacabezas forman parte de un conjunto de seguridad que...",
            "Funciona correctamente junto con el uso adecuado del cinturón.",
            "Hace innecesario utilizar cinturón.",
            "Solo funciona a menos de 30 km/h.",
            0,
            "Los distintos elementos de seguridad pasiva se complementan entre sí.",
            QuestionSourceType.DGT,
            "DGT - seguridad pasiva",
            QuestionDifficulty.EASY
        ),

        q(
            945,
            "Seguridad pasiva",
            "Cinturón",
            "Durante una colisión, el cinturón ayuda principalmente a...",
            "Controlar la desaceleración del cuerpo y evitar desplazamientos violentos.",
            "Aumentar la velocidad del ocupante.",
            "Impedir que se activen los frenos.",
            0,
            "El cinturón distribuye y controla las fuerzas que actúan sobre el cuerpo.",
            QuestionSourceType.DGT,
            "DGT - cinturón de seguridad",
            QuestionDifficulty.EASY
        ),

        q(
            946,
            "Visibilidad",
            "Parabrisas",
            "El parabrisas es importante únicamente porque permite ver hacia delante.",
            "Falso.",
            "Verdadero.",
            "Solo en coches antiguos.",
            0,
            "Además de la visibilidad, el parabrisas participa en la resistencia estructural y en otros sistemas del vehículo.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.MEDIUM
        ),

        q(
            947,
            "Visibilidad",
            "Parabrisas",
            "Un parabrisas muy dañado puede afectar también a...",
            "La eficacia de determinados sistemas de seguridad y sensores.",
            "La capacidad del depósito de combustible.",
            "La matrícula trasera.",
            0,
            "El parabrisas puede servir de soporte a cámaras y sensores y participar en la estructura del vehículo.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.MEDIUM
        ),

        q(
            948,
            "Visibilidad",
            "Alumbrado",
            "Las luces del vehículo sirven...",
            "Para ver y también para ser visto.",
            "Solo para iluminar señales.",
            "Únicamente para decorar el vehículo.",
            0,
            "La DGT recuerda que el alumbrado cumple ambas funciones de seguridad.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del alumbrado",
            QuestionDifficulty.EASY
        ),

        q(
            949,
            "Visibilidad",
            "Retrovisores",
            "Mantener limpios los retrovisores ayuda a...",
            "Conservar una visión adecuada del tráfico posterior y lateral.",
            "Aumentar la potencia del motor.",
            "Reducir la presión de los neumáticos.",
            0,
            "La suciedad puede disminuir significativamente la información visual disponible.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones de tráfico",
            QuestionDifficulty.EASY
        ),

        q(
            950,
            "Confort y seguridad",
            "Climatización",
            "Un sistema de climatización que mantiene una temperatura adecuada puede contribuir a...",
            "Reducir fatiga y mejorar el confort del conductor.",
            "Eliminar la necesidad de descansar.",
            "Aumentar obligatoriamente la velocidad.",
            0,
            "Un habitáculo excesivamente caluroso favorece cansancio y pérdida de atención.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento y fatiga",
            QuestionDifficulty.EASY
        ),

        q(
            951,
            "Mecánica y mantenimiento",
            "Frenos",
            "En una revisión del sistema de frenado conviene comprobar...",
            "Pastillas o elementos de fricción, discos o tambores y líquido de frenos.",
            "Solo el claxon.",
            "Únicamente la batería.",
            0,
            "El sistema de frenado requiere comprobar sus principales componentes y el estado del líquido.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            952,
            "Mecánica y mantenimiento",
            "Líquidos",
            "El nivel del líquido de frenos debe...",
            "Revisarse periódicamente siguiendo las indicaciones del fabricante.",
            "Ignorarse hasta que el vehículo deje de frenar.",
            "Mezclarse con aceite de motor.",
            0,
            "El líquido de frenos es un componente esencial del sistema de frenado.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            953,
            "Mecánica y mantenimiento",
            "Aceite",
            "El aceite del motor debe revisarse...",
            "Conforme a las indicaciones del fabricante y manteniendo el nivel adecuado.",
            "Solo cuando aparezca humo.",
            "Nunca.",
            0,
            "La lubricación correcta es esencial para el funcionamiento y durabilidad del motor.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            954,
            "Mecánica y mantenimiento",
            "Limpiaparabrisas",
            "Mantener suficiente líquido limpiaparabrisas es importante porque...",
            "Permite recuperar visibilidad cuando se ensucia el parabrisas.",
            "Reduce la temperatura de los neumáticos.",
            "Lubrica los frenos.",
            0,
            "El sistema lavaparabrisas es una ayuda directa a la visibilidad.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones de tráfico",
            QuestionDifficulty.EASY
        ),

        q(
            955,
            "Mecánica y mantenimiento",
            "Escobillas",
            "Unas escobillas deterioradas pueden...",
            "Reducir notablemente la visibilidad con lluvia.",
            "Mejorar la frenada.",
            "Reducir el consumo.",
            0,
            "Deben mantenerse en condiciones para limpiar correctamente el cristal.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            956,
            "Mecánica y mantenimiento",
            "Batería",
            "Si el vehículo presenta dificultades frecuentes para arrancar, uno de los elementos que conviene revisar es...",
            "La batería.",
            "El cinturón de seguridad.",
            "El espejo interior únicamente.",
            0,
            "Una batería deteriorada puede causar problemas de arranque y alimentación eléctrica.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            957,
            "Mecánica y mantenimiento",
            "Batería",
            "Unos bornes de batería muy sulfatados pueden ser indicio de que...",
            "Conviene revisar y mantener la batería y sus conexiones.",
            "Los neumáticos tienen demasiada presión.",
            "El depósito está lleno.",
            0,
            "Las conexiones y bornes forman parte del mantenimiento de la batería.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.MEDIUM
        ),

        q(
            958,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "La presión de los neumáticos debe comprobarse preferentemente...",
            "En frío.",
            "Inmediatamente después de circular muchos kilómetros a alta velocidad.",
            "Solo cuando estén visiblemente desinflados.",
            0,
            "La presión de referencia se comprueba con los neumáticos fríos.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            959,
            "Mecánica y mantenimiento",
            "Rueda de repuesto",
            "Si el vehículo lleva rueda de repuesto, ¿debe comprobarse también su presión?",
            "Sí.",
            "No.",
            "Solo después de pinchar.",
            0,
            "La rueda de repuesto debe encontrarse preparada para poder utilizarse cuando sea necesaria.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            960,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "Un neumático no debe presentar...",
            "Deformaciones, cortes o roturas peligrosas.",
            "Dibujo visible.",
            "La presión recomendada.",
            0,
            "Los daños estructurales pueden comprometer gravemente su seguridad.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            961,
            "Mecánica y mantenimiento",
            "Ruedas",
            "Si aparecen vibraciones anormales en el volante, puede ser conveniente revisar...",
            "El equilibrado y la alineación de las ruedas.",
            "El volumen de la radio.",
            "El combustible restante.",
            0,
            "Las vibraciones pueden estar relacionadas con problemas de ruedas o neumáticos.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.MEDIUM
        ),

        q(
            962,
            "Mecánica y mantenimiento",
            "Suspensión",
            "Una suspensión en mal estado puede perjudicar...",
            "La estabilidad y la capacidad de frenado.",
            "Solo el funcionamiento de la radio.",
            "La documentación del vehículo.",
            0,
            "Los amortiguadores y la suspensión ayudan a mantener las ruedas en contacto adecuado con la vía.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            963,
            "Mecánica y mantenimiento",
            "Faros",
            "Unos faros mal reglados pueden...",
            "Iluminar insuficientemente o deslumbrar a otros usuarios.",
            "Mejorar siempre la visibilidad.",
            "No influir en la seguridad.",
            0,
            "El alumbrado debe estar en buen estado y correctamente regulado.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del alumbrado",
            QuestionDifficulty.EASY
        ),

        q(
            964,
            "Mecánica y mantenimiento",
            "Intermitentes",
            "Antes de un viaje conviene comprobar el funcionamiento de...",
            "Los intermitentes y demás luces de señalización.",
            "Solo la luz interior del habitáculo.",
            "Únicamente la radio.",
            0,
            "Las luces de señalización permiten comunicar maniobras a los demás usuarios.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del alumbrado",
            QuestionDifficulty.EASY
        ),

        q(
            965,
            "Mecánica y mantenimiento",
            "Antiniebla",
            "¿Conviene comprobar también el funcionamiento y reglaje del alumbrado antiniebla?",
            "Sí.",
            "No.",
            "Solo en verano.",
            0,
            "La DGT incluye el alumbrado antiniebla entre los elementos a revisar.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones de tráfico",
            QuestionDifficulty.EASY
        ),

        q(
            966,
            "Viajes",
            "Revisión previa",
            "La revisión de los puntos esenciales del vehículo antes de un viaje largo debe hacerse...",
            "Con suficiente anticipación para poder corregir posibles fallos.",
            "Cuando ya se está circulando.",
            "Solo al llegar al destino.",
            0,
            "Revisar con tiempo permite detectar y solucionar problemas antes de salir.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            967,
            "Viajes",
            "Meteorología",
            "Antes de viajar conviene consultar...",
            "Las previsiones meteorológicas y posibles condiciones adversas.",
            "Solo el precio del combustible.",
            "Únicamente la temperatura interior del vehículo.",
            0,
            "Conocer la meteorología permite adaptar horario, ruta y preparación.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones de tráfico",
            QuestionDifficulty.EASY
        ),

        q(
            968,
            "Viajes",
            "Tráfico",
            "Antes de un desplazamiento largo es útil consultar...",
            "El estado del tráfico y posibles incidencias en la ruta.",
            "Solo la velocidad máxima del vehículo.",
            "Únicamente la matrícula.",
            0,
            "La planificación ayuda a evitar incidencias y trayectos innecesarios.",
            QuestionSourceType.DGT,
            "DGT - información de tráfico",
            QuestionDifficulty.EASY
        ),

        q(
            969,
            "Visibilidad",
            "Limpieza",
            "Mantener limpios cristales, faros, pilotos y retrovisores ayuda principalmente a...",
            "Ver y ser visto correctamente.",
            "Reducir el peso del vehículo.",
            "Aumentar la potencia.",
            0,
            "La limpieza de los elementos ópticos y de visión mejora la seguridad.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones de tráfico",
            QuestionDifficulty.EASY
        ),

        q(
            970,
            "Mecánica y mantenimiento",
            "Prevención",
            "Un mantenimiento preventivo adecuado del vehículo...",
            "Puede reducir averías y contribuir a una conducción más segura.",
            "Hace innecesaria la ITV.",
            "Permite ignorar cualquier testigo de avería.",
            0,
            "El mantenimiento preventivo ayuda a conservar en buen estado los sistemas esenciales del vehículo.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.EASY
        )
    )
}
