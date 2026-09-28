package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object VerifiedBatch821to870 {

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
            821,
            "Alumbrado",
            "Luz de cruce",
            "Entre el ocaso y la salida del sol, en una vía suficientemente iluminada, un vehículo de motor debe utilizar...",
            "Las luces de posición y de cruce.",
            "Solo las luces de posición.",
            "Únicamente las luces de emergencia.",
            0,
            "En estas condiciones debe utilizarse el alumbrado de posición junto con el de corto alcance o cruce.",
            QuestionSourceType.BOE,
            "RGC artículos 98, 99 y 101",
            QuestionDifficulty.EASY
        ),

        q(
            822,
            "Alumbrado",
            "Luz de carretera",
            "Fuera de poblado, de noche y en una vía insuficientemente iluminada, la luz de carretera puede utilizarse cuando...",
            "No se deslumbre a otros usuarios y concurran las condiciones reglamentarias.",
            "Se circule a cualquier velocidad y siempre.",
            "Haya alumbrado público suficiente.",
            0,
            "La luz de carretera está prevista para determinadas vías insuficientemente iluminadas, evitando siempre el deslumbramiento.",
            QuestionSourceType.BOE,
            "RGC artículo 100",
            QuestionDifficulty.MEDIUM
        ),

        q(
            823,
            "Alumbrado",
            "Deslumbramiento",
            "Si la luz de carretera puede deslumbrar a otro usuario debe...",
            "Sustituirse por la luz de cruce.",
            "Mantenerse siempre.",
            "Apagarse todo el alumbrado.",
            0,
            "El conductor debe cambiar a corto alcance cuando exista riesgo de deslumbramiento.",
            QuestionSourceType.BOE,
            "RGC artículos 100 a 102",
            QuestionDifficulty.EASY
        ),

        q(
            824,
            "Túneles",
            "Alumbrado",
            "Al circular por un túnel durante el día debe...",
            "Llevar encendido el alumbrado reglamentario correspondiente.",
            "Circular sin luces si el túnel está iluminado.",
            "Usar únicamente las luces de emergencia.",
            0,
            "El uso de alumbrado es obligatorio en túneles con independencia de la hora del día.",
            QuestionSourceType.BOE,
            "RGC artículo 98",
            QuestionDifficulty.EASY
        ),

        q(
            825,
            "Alumbrado",
            "Luces de posición",
            "Cuando es obligatorio utilizar alumbrado de circulación, las luces de posición sirven principalmente para...",
            "Hacer visible la presencia y anchura del vehículo.",
            "Iluminar a gran distancia la carretera.",
            "Sustituir siempre a la luz de cruce.",
            0,
            "Las luces de posición permiten advertir la presencia y dimensiones del vehículo.",
            QuestionSourceType.BOE,
            "RGC artículo 99",
            QuestionDifficulty.EASY
        ),

        q(
            826,
            "Alumbrado",
            "Antiniebla delantera",
            "La luz antiniebla delantera puede emplearse...",
            "En los supuestos de visibilidad reducida previstos reglamentariamente.",
            "Siempre que sea de noche.",
            "Únicamente cuando no funcione la luz de cruce.",
            0,
            "Su utilización está vinculada a las situaciones reglamentarias de visibilidad reducida y otros supuestos autorizados.",
            QuestionSourceType.BOE,
            "RGC artículo 106",
            QuestionDifficulty.MEDIUM
        ),

        q(
            827,
            "Alumbrado",
            "Antiniebla trasera",
            "La luz antiniebla trasera debe reservarse para...",
            "Condiciones especialmente desfavorables de visibilidad.",
            "Cualquier lluvia ligera.",
            "Toda conducción nocturna.",
            0,
            "Su elevada intensidad hace que se reserve para situaciones especialmente adversas.",
            QuestionSourceType.BOE,
            "RGC artículo 106",
            QuestionDifficulty.EASY
        ),

        q(
            828,
            "Túneles",
            "Retención",
            "Si queda inmovilizado por necesidades del tráfico dentro de un túnel durante un tiempo prolongado debe, cuando corresponda...",
            "Mantener las luces de posición, advertir temporalmente con emergencia y apagar el motor.",
            "Dar marcha atrás.",
            "Mantener el motor acelerado.",
            0,
            "La normativa establece medidas específicas para inmovilizaciones dentro de túneles.",
            QuestionSourceType.BOE,
            "RGC - circulación en túneles",
            QuestionDifficulty.MEDIUM
        ),

        q(
            829,
            "Túneles",
            "Seguridad",
            "Dentro de un túnel debe mantenerse con el vehículo precedente...",
            "Una separación suficiente para poder detenerse con seguridad.",
            "La menor distancia posible.",
            "Siempre menos de un metro.",
            0,
            "La menor posibilidad de evasión en un túnel hace especialmente importante la distancia de seguridad.",
            QuestionSourceType.BOE,
            "RGC - túneles y distancia de seguridad",
            QuestionDifficulty.EASY
        ),

        q(
            830,
            "Alumbrado",
            "Visibilidad",
            "Si por lluvia, niebla u otra causa la visibilidad disminuye considerablemente debe...",
            "Adaptar la velocidad y utilizar el alumbrado que corresponda.",
            "Mantener siempre la velocidad máxima.",
            "Apagar las luces para evitar reflejos.",
            0,
            "La conducción debe adaptarse a la distancia visible y a las condiciones ambientales.",
            QuestionSourceType.BOE,
            "RGC artículos 45 y 106",
            QuestionDifficulty.EASY
        ),

        q(
            831,
            "Fatiga y sueño",
            "Causas",
            "Una de las principales causas de fatiga al volante es...",
            "Conducir durante mucho tiempo sin descansar adecuadamente.",
            "Utilizar el cinturón.",
            "Circular con neumáticos nuevos.",
            0,
            "La DGT señala la conducción prolongada sin descanso como factor fundamental en la aparición de fatiga.",
            QuestionSourceType.DGT,
            "DGT - conducir con fatiga",
            QuestionDifficulty.EASY
        ),

        q(
            832,
            "Fatiga y sueño",
            "Movimientos",
            "La fatiga puede hacer que los movimientos del conductor sean...",
            "Más lentos, menos precisos y menos eficaces.",
            "Siempre más rápidos.",
            "Más precisos.",
            0,
            "La fatiga deteriora la coordinación y eficacia de los movimientos.",
            QuestionSourceType.DGT,
            "DGT - conducir con fatiga",
            QuestionDifficulty.EASY
        ),

        q(
            833,
            "Fatiga y sueño",
            "Visión",
            "Una fatiga elevada puede provocar...",
            "Visión borrosa y dificultades para enfocar.",
            "Mejor visión nocturna.",
            "Mayor campo visual.",
            0,
            "La DGT recoge alteraciones visuales entre los efectos de la fatiga.",
            QuestionSourceType.DGT,
            "DGT - conducir con fatiga",
            QuestionDifficulty.EASY
        ),

        q(
            834,
            "Fatiga y sueño",
            "Síntomas",
            "Bostezar repetidamente mientras conduce puede ser...",
            "Un síntoma de fatiga o somnolencia.",
            "Una señal de mayor concentración.",
            "Una prueba de que ha descansado bien.",
            0,
            "Los bostezos frecuentes son una señal habitual de cansancio.",
            QuestionSourceType.DGT,
            "DGT - conducir con fatiga",
            QuestionDifficulty.EASY
        ),

        q(
            835,
            "Fatiga y sueño",
            "Habitáculo",
            "Una temperatura excesivamente alta dentro del vehículo puede...",
            "Favorecer la fatiga y hacer más incómoda la conducción.",
            "Mejorar los reflejos.",
            "Eliminar la somnolencia.",
            0,
            "La DGT incluye el calor y la mala ventilación entre los factores que pueden favorecer el cansancio.",
            QuestionSourceType.DGT,
            "DGT - conducir con fatiga",
            QuestionDifficulty.EASY
        ),

        q(
            836,
            "Fatiga y sueño",
            "Monotonía",
            "Conducir durante mucho tiempo por una vía monótona puede...",
            "Disminuir el nivel de alerta.",
            "Eliminar el sueño.",
            "Mejorar automáticamente la atención.",
            0,
            "La monotonía favorece la pérdida de atención y la somnolencia.",
            QuestionSourceType.DGT,
            "DGT - sueño y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            837,
            "Fatiga y sueño",
            "Tiempo de reacción",
            "La somnolencia puede...",
            "Aumentar el tiempo de reacción.",
            "Reducir siempre el tiempo de reacción.",
            "No afectar a la respuesta del conductor.",
            0,
            "El sueño ralentiza la respuesta ante los estímulos del tráfico.",
            QuestionSourceType.DGT,
            "DGT - sueño y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            838,
            "Fatiga y sueño",
            "Microsueños",
            "Los microsueños son especialmente peligrosos porque...",
            "El conductor puede perder durante segundos la percepción del tráfico sin darse cuenta.",
            "Solo aparecen con el vehículo parado.",
            "Mejoran la concentración después.",
            0,
            "Durante un microsueño puede recorrerse una distancia considerable sin control consciente adecuado.",
            QuestionSourceType.DGT,
            "DGT - sueño y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            839,
            "Fatiga y sueño",
            "Descanso nocturno",
            "Dormir de forma fragmentada durante la noche puede...",
            "Aumentar la somnolencia al día siguiente.",
            "Mejorar la conducción.",
            "No tener ninguna influencia.",
            0,
            "Un sueño de mala calidad reduce el nivel de alerta aunque el conductor crea haber dormido suficientes horas.",
            QuestionSourceType.DGT,
            "DGT - sueño y conducción",
            QuestionDifficulty.MEDIUM
        ),

        q(
            840,
            "Fatiga y sueño",
            "Prevención",
            "Si aparece sueño intenso mientras conduce, la medida adecuada es...",
            "Detenerse en un lugar seguro y descansar.",
            "Subir el volumen de la radio y continuar indefinidamente.",
            "Aumentar la velocidad para llegar antes.",
            0,
            "Los trucos para mantenerse despierto no sustituyen el descanso cuando existe somnolencia significativa.",
            QuestionSourceType.DGT,
            "DGT - sueño y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            841,
            "Distracciones",
            "Navegador",
            "¿Cuándo es preferible introducir una ruta en el navegador?",
            "Antes de iniciar la marcha o con el vehículo correctamente detenido.",
            "Mientras se atraviesa una intersección.",
            "Durante un adelantamiento.",
            0,
            "La DGT recomienda manipular el navegador con el vehículo parado.",
            QuestionSourceType.DGT,
            "DGT - distracciones al conducir",
            QuestionDifficulty.EASY
        ),

        q(
            842,
            "Distracciones",
            "Manos libres",
            "Una conversación telefónica mediante manos libres...",
            "Puede seguir reduciendo la concentración necesaria para conducir.",
            "Elimina completamente la distracción.",
            "Mejora la percepción del tráfico.",
            0,
            "Aunque no se sostenga el teléfono, la conversación puede producir distracción cognitiva.",
            QuestionSourceType.DGT,
            "DGT - distracciones al conducir",
            QuestionDifficulty.EASY
        ),

        q(
            843,
            "Distracciones",
            "Teléfono móvil",
            "Manipular el teléfono móvil mientras se conduce...",
            "Aumenta considerablemente el riesgo de accidente.",
            "Es seguro si se circula despacio.",
            "Mejora el tiempo de reacción.",
            0,
            "El móvil aparta atención visual, manual y mental de la conducción.",
            QuestionSourceType.DGT,
            "DGT - distracciones al conducir",
            QuestionDifficulty.EASY
        ),

        q(
            844,
            "Distracciones",
            "Vías conocidas",
            "En una ruta que el conductor conoce muy bien puede ocurrir que...",
            "Baje la atención por exceso de confianza o monotonía.",
            "Sea imposible distraerse.",
            "Aumenten automáticamente los reflejos.",
            0,
            "Las vías familiares pueden favorecer que el conductor baje la guardia.",
            QuestionSourceType.DGT,
            "DGT - distracciones al conducir",
            QuestionDifficulty.MEDIUM
        ),

        q(
            845,
            "Distracciones",
            "Entorno",
            "Mirar durante demasiado tiempo un accidente ocurrido en el otro sentido puede...",
            "Provocar una distracción peligrosa.",
            "Mejorar la anticipación.",
            "No afectar nunca a la conducción.",
            0,
            "Los sucesos ajenos a la propia trayectoria pueden desviar la atención de la conducción.",
            QuestionSourceType.DGT,
            "DGT - distracciones al conducir",
            QuestionDifficulty.EASY
        ),

        q(
            846,
            "Alcohol y drogas",
            "Visión",
            "El alcohol puede reducir...",
            "El campo visual útil del conductor.",
            "La distancia de frenado del vehículo.",
            "El desgaste de los neumáticos.",
            0,
            "Entre sus efectos perceptivos se encuentra una reducción del campo visual.",
            QuestionSourceType.DGT,
            "DGT - consumo de alcohol",
            QuestionDifficulty.EASY
        ),

        q(
            847,
            "Alcohol y drogas",
            "Percepción",
            "Bajo los efectos del alcohol puede resultar más difícil...",
            "Calcular correctamente distancias y velocidades.",
            "Escuchar la radio.",
            "Abrocharse el cinturón únicamente.",
            0,
            "El alcohol deteriora distintas funciones perceptivas necesarias para conducir.",
            QuestionSourceType.DGT,
            "DGT - consumo de alcohol",
            QuestionDifficulty.EASY
        ),

        q(
            848,
            "Alcohol y drogas",
            "Conducta",
            "El alcohol puede hacer que una persona...",
            "Asuma más riesgos y valore peor sus capacidades.",
            "Sea siempre más prudente.",
            "Tenga mejores reflejos.",
            0,
            "El alcohol altera tanto la aptitud como la actitud para conducir.",
            QuestionSourceType.DGT,
            "DGT - consumo de alcohol",
            QuestionDifficulty.EASY
        ),

        q(
            849,
            "Alcohol y drogas",
            "Eliminación",
            "Tomar café después de beber alcohol...",
            "No acelera de forma suficiente la eliminación del alcohol como para hacer segura la conducción.",
            "Elimina inmediatamente el alcohol de la sangre.",
            "Reduce siempre la tasa a cero.",
            0,
            "El organismo necesita tiempo para metabolizar el alcohol.",
            QuestionSourceType.DGT,
            "DGT - consumo de alcohol",
            QuestionDifficulty.EASY
        ),

        q(
            850,
            "Alcohol y drogas",
            "Medicamentos",
            "Combinar alcohol con medicamentos que producen somnolencia puede...",
            "Potenciar efectos peligrosos para la conducción.",
            "Mejorar los reflejos.",
            "Eliminar el cansancio.",
            0,
            "La combinación puede intensificar alteraciones incompatibles con una conducción segura.",
            QuestionSourceType.DGT,
            "DGT - alcohol, medicamentos y conducción",
            QuestionDifficulty.MEDIUM
        ),

        q(
            851,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "La presión de los neumáticos debe comprobarse preferentemente...",
            "Con los neumáticos fríos.",
            "Después de circular mucho tiempo a alta velocidad.",
            "Solo cuando parezcan desinflados.",
            0,
            "La presión recomendada se comprueba normalmente con los neumáticos fríos.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento de neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            852,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "La presión correcta de un neumático es principalmente la indicada por...",
            "El fabricante del vehículo.",
            "El conductor de otro vehículo.",
            "La estación de servicio más próxima.",
            0,
            "Debe seguirse la presión especificada por el fabricante para las condiciones de uso.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento de neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            853,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "En un turismo, la profundidad mínima legal del dibujo principal del neumático es...",
            "1,6 mm.",
            "0,5 mm.",
            "5 mm.",
            0,
            "El límite legal de profundidad del dibujo principal es de 1,6 milímetros.",
            QuestionSourceType.DGT,
            "DGT - neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            854,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "Si un neumático presenta cortes, deformaciones o bultos importantes debe...",
            "Revisarse y sustituirse si procede.",
            "Seguir utilizándose hasta que pierda todo el aire.",
            "Inflarse por encima de la presión recomendada.",
            0,
            "Los daños visibles pueden indicar un deterioro estructural peligroso.",
            QuestionSourceType.DGT,
            "DGT - revisión de neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            855,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "Una presión de inflado demasiado baja puede...",
            "Provocar desgaste irregular, calentamiento y empeorar el comportamiento del neumático.",
            "Mejorar siempre la seguridad.",
            "Reducir siempre la distancia de frenado.",
            0,
            "Una presión insuficiente perjudica el funcionamiento y la duración del neumático.",
            QuestionSourceType.DGT,
            "DGT - presión de neumáticos",
            QuestionDifficulty.MEDIUM
        ),

        q(
            856,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "¿Conviene revisar periódicamente la presión y el estado visual de los neumáticos?",
            "Sí.",
            "No.",
            "Solo antes de pasar la ITV.",
            0,
            "La inspección periódica permite detectar pérdidas de presión, cortes, deformaciones y desgaste.",
            QuestionSourceType.DGT,
            "DGT - revisión de neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            857,
            "Mecánica y mantenimiento",
            "Ruedas",
            "Si el volante vibra de forma anormal durante la marcha puede ser conveniente comprobar...",
            "El equilibrado y la alineación de las ruedas.",
            "El volumen de la radio.",
            "El nivel del lavaparabrisas únicamente.",
            0,
            "Las vibraciones pueden estar relacionadas con problemas de equilibrado o alineación.",
            QuestionSourceType.DGT,
            "DGT - ruedas y neumáticos",
            QuestionDifficulty.MEDIUM
        ),

        q(
            858,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "Los neumáticos son especialmente importantes porque...",
            "Constituyen el contacto directo del vehículo con la carretera.",
            "Solo sirven para mejorar el aspecto del vehículo.",
            "No intervienen en la frenada.",
            0,
            "Transmiten las fuerzas de aceleración, frenado y dirección entre el vehículo y la calzada.",
            QuestionSourceType.DGT,
            "DGT - ruedas y neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            859,
            "Mecánica y mantenimiento",
            "Rueda de repuesto",
            "Si el vehículo equipa rueda de repuesto, ¿conviene revisar también su presión y estado?",
            "Sí.",
            "No.",
            "Solo después de utilizarla.",
            0,
            "La rueda de repuesto debe estar preparada para utilizarse cuando sea necesaria.",
            QuestionSourceType.DGT,
            "DGT - planificación de viaje seguro",
            QuestionDifficulty.EASY
        ),

        q(
            860,
            "Mecánica y mantenimiento",
            "Frenos",
            "El sistema de frenado debe...",
            "Mantenerse y revisarse conforme a las indicaciones del fabricante.",
            "Revisarse únicamente cuando deje de frenar por completo.",
            "No necesitar mantenimiento.",
            0,
            "Frenos, líquido y elementos asociados forman parte de los puntos esenciales de seguridad del vehículo.",
            QuestionSourceType.DGT,
            "DGT - mantenimiento del vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            861,
            "Conducción eficiente",
            "Anticipación",
            "Anticiparse a las condiciones del tráfico permite...",
            "Evitar aceleraciones y frenadas innecesarias.",
            "Consumir siempre más combustible.",
            "Conducir sin distancia de seguridad.",
            0,
            "La anticipación favorece una conducción más fluida, segura y eficiente.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            862,
            "Conducción eficiente",
            "Velocidad",
            "Mantener una velocidad adecuada y lo más uniforme posible puede...",
            "Reducir el consumo frente a acelerar y frenar continuamente.",
            "Aumentar siempre el consumo.",
            "No influir nunca en el consumo.",
            0,
            "Una circulación fluida limita desperdicios de energía.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            863,
            "Conducción eficiente",
            "Baca",
            "Utilizar una baca o cofre de techo cuando no es necesario puede...",
            "Aumentar la resistencia aerodinámica y el consumo.",
            "Reducir siempre el consumo.",
            "No modificar la aerodinámica.",
            0,
            "Los elementos exteriores aumentan la resistencia al avance.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            864,
            "Conducción eficiente",
            "Carga",
            "Transportar peso innecesario en el vehículo puede...",
            "Aumentar el consumo.",
            "Reducir siempre el consumo.",
            "No influir en absoluto.",
            0,
            "El exceso de carga exige más energía para desplazar el vehículo.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            865,
            "Conducción eficiente",
            "Planificación",
            "Planificar la ruta antes de un viaje puede ayudar a...",
            "Evitar kilómetros innecesarios y reducir consumo.",
            "Aumentar siempre el recorrido.",
            "Eliminar la necesidad de observar señales.",
            0,
            "Una ruta bien planificada puede reducir trayectos innecesarios.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            866,
            "Conducción eficiente",
            "Paradas prolongadas",
            "En determinadas paradas prolongadas, cuando sea seguro y apropiado, apagar el motor puede...",
            "Evitar consumo innecesario.",
            "Aumentar siempre el consumo.",
            "Dañar necesariamente el vehículo.",
            0,
            "La DGT incluye evitar mantener innecesariamente el motor funcionando entre sus consejos de eficiencia.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.MEDIUM
        ),

        q(
            867,
            "Conducción eficiente",
            "Arranque",
            "En un vehículo convencional de combustión, al arrancar normalmente debe...",
            "Evitarse acelerar innecesariamente el motor.",
            "Pisarse el acelerador a fondo.",
            "Mantenerse el motor a altas revoluciones varios minutos.",
            0,
            "La conducción eficiente recomienda arrancar sin pisar innecesariamente el acelerador.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            868,
            "Conducción eficiente",
            "Cambio manual",
            "En un vehículo con cambio manual, la primera marcha se utiliza principalmente...",
            "Para iniciar la marcha, pasando pronto a una relación superior cuando las condiciones lo permitan.",
            "Para circular siempre a velocidad elevada.",
            "Para bajar cualquier pendiente prolongada.",
            0,
            "La DGT recomienda utilizar primera para iniciar la marcha y cambiar pronto cuando sea adecuado.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.MEDIUM
        ),

        q(
            869,
            "Conducción eficiente",
            "Distancia de seguridad",
            "Mantener una distancia de seguridad adecuada favorece la eficiencia porque...",
            "Permite anticipar cambios de tráfico y evitar frenadas bruscas.",
            "Obliga a frenar más veces.",
            "Impide prever lo que ocurre delante.",
            0,
            "La anticipación y una separación suficiente mejoran tanto seguridad como eficiencia.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            870,
            "Conducción eficiente",
            "Mantenimiento",
            "Un vehículo correctamente mantenido puede...",
            "Contribuir a una conducción más segura y eficiente.",
            "Consumir siempre más.",
            "Hacer innecesaria la revisión de neumáticos.",
            0,
            "El mantenimiento adecuado ayuda a evitar pérdidas de eficiencia y problemas de seguridad.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente y mantenimiento",
            QuestionDifficulty.EASY
        )
    )
}
