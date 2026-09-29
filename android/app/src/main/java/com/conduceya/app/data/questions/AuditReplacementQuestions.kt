package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

/*
 * Reemplazos surgidos de la auditoría del banco.
 *
 * Conservamos los mismos IDs para no romper historiales ni referencias,
 * pero sustituimos preguntas redundantes por contenido nuevo verificado.
 */
object AuditReplacementQuestions {

    val byId: Map<Int, TestQuestion> = listOf(
        TestQuestion(
            id = 57,
            topic = "Sistemas de seguridad",
            subtopic = "ISA",
            text = "¿Cuál es la función principal del asistente inteligente de velocidad ISA?",
            answers = listOf(
                "Ayudar al conductor a conocer y respetar el límite de velocidad de la vía.",
                "Controlar automáticamente la presión de los neumáticos.",
                "Detectar únicamente vehículos situados detrás."
            ),
            correctAnswer = 0,
            explanation = "El ISA ayuda a identificar y respetar los límites de velocidad y puede intervenir sobre el sistema de propulsión según su configuración.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - ISA",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 5,
            topic = "Sistemas de seguridad",
            subtopic = "Ángulo muerto",
            text = "¿Para qué sirve un sistema BSM de monitorización de ángulos muertos?",
            answers = listOf(
                "Para advertir de usuarios situados en zonas que pueden quedar fuera de la visión directa del conductor.",
                "Para mantener automáticamente la presión de los neumáticos.",
                "Para sustituir los retrovisores en cualquier circunstancia."
            ),
            correctAnswer = 0,
            explanation = "El BSM ayuda a detectar vehículos o usuarios presentes en ángulos muertos y puede emitir avisos ópticos o acústicos.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - BSM",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 58,
            topic = "Sistemas de seguridad",
            subtopic = "LDW",
            text = "El sistema LDW puede advertir al conductor cuando...",
            answers = listOf(
                "El vehículo abandona involuntariamente su carril sin haber señalizado la maniobra.",
                "Se supera el nivel mínimo de combustible.",
                "Un pasajero abre una puerta."
            ),
            correctAnswer = 0,
            explanation = "El LDW supervisa la posición del vehículo y avisa de salidas involuntarias del carril.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - LDW",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 585,
            topic = "Sistemas de seguridad",
            subtopic = "Reconocimiento de señales",
            text = "¿Qué hace un sistema TSR de reconocimiento de señales de tráfico?",
            answers = listOf(
                "Detecta determinadas señales y puede mostrarlas al conductor en el cuadro de instrumentos.",
                "Modifica automáticamente la matrícula del vehículo.",
                "Controla exclusivamente la temperatura del motor."
            ),
            correctAnswer = 0,
            explanation = "El TSR identifica señales relevantes para la conducción y facilita esa información al conductor.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - TSR",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 9,
            topic = "Sistemas de seguridad",
            subtopic = "Somnolencia",
            text = "¿Cuál es el objetivo de un sistema DDR de advertencia de somnolencia y distracción?",
            answers = listOf(
                "Avisar cuando detecta indicios de pérdida de concentración, sueño o fatiga.",
                "Mantener automáticamente el vehículo estacionado.",
                "Regular la presión de frenado de cada rueda."
            ),
            correctAnswer = 0,
            explanation = "El DDR busca que el conductor detecte una pérdida de alerta y se detenga cuando no esté en condiciones óptimas.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - DDR",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 46,
            topic = "Sistemas de seguridad",
            subtopic = "AEB peatones y ciclistas",
            text = "Un sistema AEB con detección de peatones y ciclistas puede...",
            answers = listOf(
                "Frenar automáticamente para evitar o mitigar una colisión.",
                "Dar prioridad legal al vehículo frente al peatón.",
                "Eliminar la necesidad de que el conductor observe la vía."
            ),
            correctAnswer = 0,
            explanation = "El sistema detecta determinadas situaciones de emergencia y puede actuar sobre los frenos.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - AEB P+C",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 586,
            topic = "Sistemas de seguridad",
            subtopic = "Detector de marcha atrás",
            text = "El detector de marcha atrás REV sirve principalmente para...",
            answers = listOf(
                "Advertir de personas u objetos situados detrás al circular marcha atrás.",
                "Dirigir siempre el vehículo de forma automática.",
                "Activar el freno de estacionamiento al iniciar la marcha."
            ),
            correctAnswer = 0,
            explanation = "Este sistema avisa mediante señales visuales o acústicas de obstáculos situados detrás.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - REV",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 687,
            topic = "Sistemas de seguridad",
            subtopic = "Aviso de colisión",
            text = "El sistema FCW con detección de peatones y ciclistas tiene como función...",
            answers = listOf(
                "Advertir visual y acústicamente de un posible riesgo de colisión frontal.",
                "Aplicar siempre el freno de estacionamiento.",
                "Determinar quién tiene prioridad en una intersección."
            ),
            correctAnswer = 0,
            explanation = "El FCW monitoriza el entorno delantero y alerta ante determinados riesgos de colisión.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - FCW P+C",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 803,
            topic = "Sistemas de seguridad",
            subtopic = "Tráfico cruzado",
            text = "¿En qué situación resulta especialmente útil la alerta de tráfico cruzado trasero RCTA?",
            answers = listOf(
                "Al salir marcha atrás de un estacionamiento en batería.",
                "Al circular por una autopista completamente recta.",
                "Al comprobar el nivel de aceite."
            ),
            correctAnswer = 0,
            explanation = "El RCTA vigila el tráfico que se aproxima transversalmente por detrás durante una salida marcha atrás.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - RCTA",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 587,
            topic = "Sistemas de seguridad",
            subtopic = "Mantenimiento de carril",
            text = "Un sistema LKA de mantenimiento de carril puede...",
            answers = listOf(
                "Actuar suavemente sobre la dirección para ayudar a mantener el vehículo dentro del carril.",
                "Eliminar la obligación de sujetar el volante.",
                "Autorizar a circular por un carril cerrado."
            ),
            correctAnswer = 0,
            explanation = "El LKA supervisa los límites del carril y puede intervenir sobre la dirección en determinadas situaciones.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - LKA",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 77,
            topic = "Sistemas de seguridad",
            subtopic = "Frenada de emergencia",
            text = "El sistema ESS de aviso de frenada de emergencia puede advertir a los vehículos posteriores mediante...",
            answers = listOf(
                "Un parpadeo rápido de las luces de freno durante una frenada intensa.",
                "Las luces de carretera permanentemente.",
                "El claxon de forma automática durante varios minutos."
            ),
            correctAnswer = 0,
            explanation = "El ESS busca advertir rápidamente a quienes circulan detrás de una frenada especialmente intensa.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Sistemas ADAS - ESS",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 600,
            topic = "Conducción segura",
            subtopic = "Frenada de emergencia",
            text = "En una frenada de emergencia con ABS, si nota vibraciones en el pedal de freno debe...",
            answers = listOf(
                "Mantener una presión firme sobre el pedal.",
                "Soltar inmediatamente el freno.",
                "Accionar únicamente el freno de estacionamiento."
            ),
            correctAnswer = 0,
            explanation = "La vibración puede indicar que el ABS está actuando; en una emergencia debe mantenerse la frenada con decisión.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Frenos: cómo usarlos correctamente",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 71,
            topic = "Conducción segura",
            subtopic = "Frenada de emergencia",
            text = "En un turismo con cambio manual, ante una frenada de emergencia la DGT recomienda...",
            answers = listOf(
                "Pisar el freno a fondo y también el embrague.",
                "Poner punto muerto antes de empezar a frenar.",
                "Accionar únicamente el embrague."
            ),
            correctAnswer = 0,
            explanation = "En una frenada de emergencia se busca aprovechar toda la capacidad de frenado sin que el motor interfiera.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Frenada de emergencia",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 73,
            topic = "Conducción segura",
            subtopic = "Emergencia",
            text = "Durante una frenada de emergencia, si necesita evitar un obstáculo conviene dirigir la mirada...",
            answers = listOf(
                "Hacia la zona por la que se quiere escapar.",
                "Directamente al obstáculo sin apartarla.",
                "Exclusivamente al cuadro de instrumentos."
            ),
            correctAnswer = 0,
            explanation = "La mirada ayuda a orientar correctamente la trayectoria hacia una posible vía de escape.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Reacción ante frenadas de emergencia",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 677,
            topic = "Conducción segura",
            subtopic = "Curvas",
            text = "Para afrontar correctamente una curva, la velocidad debe adaptarse preferentemente...",
            answers = listOf(
                "Antes de entrar en ella.",
                "Solo cuando ya se está en el centro de la curva.",
                "Después de haberla superado."
            ),
            correctAnswer = 0,
            explanation = "Llegar a la curva a una velocidad adecuada reduce la necesidad de frenar mientras se gira.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Frenos en curvas",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 679,
            topic = "Maniobras",
            subtopic = "Carril de deceleración",
            text = "Al abandonar una autopista mediante un carril de deceleración, la reducción importante de velocidad debe realizarse...",
            answers = listOf(
                "Una vez incorporado al carril de deceleración, siempre que las condiciones lo permitan.",
                "En el carril derecho de la autopista antes de alcanzar la salida.",
                "Deteniéndose antes de entrar en el carril."
            ),
            correctAnswer = 0,
            explanation = "El carril de deceleración permite reducir la velocidad sin entorpecer innecesariamente la corriente principal.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Frenado en salidas de autopista",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 681,
            topic = "Conducción preventiva",
            subtopic = "Observación",
            text = "Antes de realizar una frenada previsible conviene comprobar...",
            answers = listOf(
                "El tráfico posterior mediante los retrovisores.",
                "Únicamente el nivel de combustible.",
                "Solo el velocímetro."
            ),
            correctAnswer = 0,
            explanation = "La observación posterior permite conocer si otros vehículos circulan demasiado cerca antes de reducir la velocidad.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Frenos y observación",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 599,
            topic = "Conducción segura",
            subtopic = "Descensos",
            text = "En un descenso prolongado es aconsejable...",
            answers = listOf(
                "Utilizar una relación de marchas adecuada para aprovechar la retención del motor.",
                "Mantener pisado continuamente el embrague.",
                "Utilizar exclusivamente el freno de estacionamiento."
            ),
            correctAnswer = 0,
            explanation = "El freno motor ayuda a controlar la velocidad y evita abusar del sistema de frenos.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Conducción en descensos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 83,
            topic = "Mecánica y mantenimiento",
            subtopic = "Frenos",
            text = "Abusar de los frenos durante un descenso prolongado puede...",
            answers = listOf(
                "Sobrecalentarlos y reducir su eficacia.",
                "Enfriarlos y aumentar siempre su eficacia.",
                "Reducir automáticamente el desgaste de las pastillas."
            ),
            correctAnswer = 0,
            explanation = "El uso excesivo puede elevar la temperatura del sistema y provocar pérdida de eficacia.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Frenos en pendientes",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 87,
            topic = "Permiso por puntos",
            subtopic = "Saldo inicial",
            text = "Como norma general, ¿con cuántos puntos comienza un conductor en el sistema de permiso por puntos?",
            answers = listOf(
                "12 puntos.",
                "8 puntos en todos los casos.",
                "15 puntos."
            ),
            correctAnswer = 0,
            explanation = "El saldo inicial general es de 12 puntos, con excepciones para determinados conductores.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 113,
            topic = "Permiso por puntos",
            subtopic = "Conductores noveles",
            text = "Un conductor novel comienza normalmente con un saldo de...",
            answers = listOf(
                "8 puntos.",
                "12 puntos.",
                "15 puntos."
            ),
            correctAnswer = 0,
            explanation = "Los conductores noveles parten de un saldo inicial de 8 puntos.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 798,
            topic = "Permiso por puntos",
            subtopic = "Recuperación del permiso",
            text = "Quien obtiene de nuevo el permiso después de haber perdido su vigencia por agotamiento de puntos comienza con...",
            answers = listOf(
                "8 puntos.",
                "15 puntos.",
                "2 puntos."
            ),
            correctAnswer = 0,
            explanation = "La DGT indica que quien recupera el permiso tras su retirada vuelve a comenzar con 8 puntos.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 128,
            topic = "Permiso por puntos",
            subtopic = "Conductores noveles",
            text = "Un conductor novel que no comete infracciones que resten puntos pasa de 8 a 12 puntos después de...",
            answers = listOf(
                "2 años.",
                "6 meses.",
                "5 años."
            ),
            correctAnswer = 0,
            explanation = "Tras dos años sin infracciones con pérdida de puntos, pasa al saldo general de 12.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 615,
            topic = "Permiso por puntos",
            subtopic = "Bonificación",
            text = "Un conductor con 12 puntos puede alcanzar 14 si permanece sin infracciones que resten puntos durante...",
            answers = listOf(
                "3 años.",
                "1 año.",
                "10 años."
            ),
            correctAnswer = 0,
            explanation = "El sistema premia tres años sin pérdida de puntos añadiendo dos puntos al saldo general.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 682,
            topic = "Permiso por puntos",
            subtopic = "Bonificación",
            text = "Después de alcanzar 14 puntos, ¿cuánto tiempo adicional sin infracciones que resten puntos permite llegar a 15?",
            answers = listOf(
                "3 años.",
                "6 meses.",
                "10 años."
            ),
            correctAnswer = 0,
            explanation = "Tras otros tres años sin pérdida de puntos se añade un punto más, hasta 15.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 693,
            topic = "Permiso por puntos",
            subtopic = "Permisos múltiples",
            text = "Si una persona posee varios permisos de conducción, los puntos...",
            answers = listOf(
                "Son comunes a todos sus permisos.",
                "Se contabilizan de forma independiente para cada permiso.",
                "Solo se aplican al permiso B."
            ),
            correctAnswer = 0,
            explanation = "El saldo de puntos está asociado al conductor, no a cada clase de permiso.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 814,
            topic = "Permiso por puntos",
            subtopic = "Saldo máximo",
            text = "¿Cuál es el saldo máximo ordinario que puede alcanzar un conductor en el sistema por puntos?",
            answers = listOf(
                "15 puntos.",
                "20 puntos.",
                "30 puntos."
            ),
            correctAnswer = 0,
            explanation = "El sistema permite alcanzar como máximo ordinario un saldo de 15 puntos.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 573,
            topic = "Permiso por puntos",
            subtopic = "Pérdida de puntos",
            text = "Según la gravedad de una infracción que conlleve pérdida de puntos, pueden detraerse...",
            answers = listOf(
                "2, 3, 4 o 6 puntos.",
                "Siempre exactamente 1 punto.",
                "Siempre exactamente 10 puntos."
            ),
            correctAnswer = 0,
            explanation = "La DGT establece distintas detracciones en función de la infracción.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 784,
            topic = "Permiso por puntos",
            subtopic = "Límite diario",
            text = "Como regla general, ¿cuántos puntos como máximo pueden perderse en un mismo día, sin contar las excepciones previstas?",
            answers = listOf(
                "8 puntos.",
                "2 puntos.",
                "15 puntos."
            ),
            correctAnswer = 0,
            explanation = "La regla general limita a ocho la pérdida diaria, aunque determinadas infracciones muy graves constituyen excepciones.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.HARD
        ),

        TestQuestion(
            id = 853,
            topic = "Permiso por puntos",
            subtopic = "Pérdida de vigencia",
            text = "Si el saldo llega a cero, la prohibición de conducir comienza...",
            answers = listOf(
                "Cuando se notifica la resolución de pérdida de vigencia correspondiente.",
                "Automáticamente en el mismo instante en que se registra la última infracción.",
                "Solo después de cinco años."
            ),
            correctAnswer = 0,
            explanation = "La DGT tramita la pérdida de vigencia; la prohibición comienza tras la notificación de la resolución.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Permiso por puntos",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.HARD
        ),

        TestQuestion(
            id = 855,
            topic = "Conducción preventiva",
            subtopic = "Ángulos muertos",
            text = "En un cambio de carril, para comprobar una zona que no cubren bien los retrovisores puede ser necesario...",
            answers = listOf(
                "Girar ligeramente la cabeza para comprobar el ángulo muerto.",
                "Cerrar los ojos unos segundos.",
                "Mirar únicamente al vehículo precedente."
            ),
            correctAnswer = 0,
            explanation = "La DGT recomienda comprobar visualmente los ángulos muertos antes de ciertos desplazamientos laterales.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Conducción preventiva",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 742,
            topic = "Conducción preventiva",
            subtopic = "Paso de peatones",
            text = "Si un obstáculo impide ver bien un paso para peatones al aproximarse, debe...",
            answers = listOf(
                "Reducir la velocidad y extremar la observación.",
                "Acelerar para atravesarlo rápidamente.",
                "Mantener la velocidad máxima permitida sin cambios."
            ),
            correctAnswer = 0,
            explanation = "La falta de visibilidad obliga a aproximarse a una velocidad que permita evitar un atropello.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Conducción preventiva",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 843,
            topic = "Conducción preventiva",
            subtopic = "Glorietas",
            text = "Si circula por el carril exterior de una glorieta, conviene vigilar especialmente...",
            answers = listOf(
                "El retrovisor izquierdo por si otro vehículo intenta cruzarse desde el interior.",
                "Únicamente el espejo interior para observar a los pasajeros.",
                "El indicador de combustible."
            ),
            correctAnswer = 0,
            explanation = "Observar el lateral izquierdo permite anticipar una posible trayectoria incorrecta desde un carril interior.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Conducción preventiva",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 958,
            topic = "Conducción preventiva",
            subtopic = "Vehículos voluminosos",
            text = "¿Qué efecto puede tener circular demasiado cerca detrás de un vehículo voluminoso?",
            answers = listOf(
                "Reducir el campo de visión hacia delante y dificultar la anticipación.",
                "Mejorar la visibilidad de la carretera.",
                "Eliminar la necesidad de guardar distancia de seguridad."
            ),
            correctAnswer = 0,
            explanation = "Una separación insuficiente detrás de un vehículo grande reduce las referencias y la visión del tráfico delantero.",
            origin = QuestionOrigin.VERIFIED,
            sourceType = QuestionSourceType.DGT,
            reference = "DGT - Conducción preventiva",
            lastVerified = "2026-09-29",
            difficulty = QuestionDifficulty.EASY
        )
    ).associateBy { it.id }
}
