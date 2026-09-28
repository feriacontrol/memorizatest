package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object VerifiedBatch971to1000 {

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
            971,
            "Conducción preventiva",
            "Observación",
            "Para anticiparse mejor a los peligros conviene dirigir la mirada...",
            "Lo suficientemente lejos para obtener información con antelación.",
            "Únicamente al vehículo inmediatamente anterior.",
            "Solo a las señales situadas a la derecha.",
            0,
            "Una observación amplia y anticipada permite disponer de más tiempo para reaccionar.",
            QuestionSourceType.DGT,
            "DGT - conducción preventiva",
            QuestionDifficulty.EASY
        ),

        q(
            972,
            "Conducción preventiva",
            "Retrovisores",
            "Durante la marcha conviene consultar los retrovisores...",
            "Periódicamente y especialmente antes de realizar maniobras.",
            "Solo al estacionar.",
            "Únicamente cuando otro conductor toca el claxon.",
            0,
            "La observación frecuente del entorno posterior ayuda a conocer la situación del tráfico.",
            QuestionSourceType.DGT,
            "DGT - conducción preventiva",
            QuestionDifficulty.EASY
        ),

        q(
            973,
            "Conducción preventiva",
            "Espacio de seguridad",
            "Mantener espacio alrededor del vehículo permite...",
            "Disponer de mayor margen para reaccionar ante imprevistos.",
            "Circular más cerca de los obstáculos.",
            "Eliminar la necesidad de observar.",
            0,
            "Un margen de seguridad adecuado ofrece más posibilidades de actuación ante una situación inesperada.",
            QuestionSourceType.DGT,
            "DGT - conducción preventiva",
            QuestionDifficulty.EASY
        ),

        q(
            974,
            "Distancia de seguridad",
            "Tiempo",
            "En condiciones normales, una referencia práctica de DGT para evitar alcances es mantener al menos...",
            "Dos segundos respecto al vehículo precedente.",
            "Medio segundo.",
            "Diez segundos obligatoriamente en cualquier situación.",
            0,
            "DGT propone al menos dos segundos como referencia práctica en condiciones normales.",
            QuestionSourceType.DGT,
            "DGT - conducción preventiva",
            QuestionDifficulty.MEDIUM
        ),

        q(
            975,
            "Distancia de seguridad",
            "Mal tiempo",
            "Con mal tiempo o asfalto mojado, la separación temporal con el vehículo precedente debe...",
            "Aumentarse a tres segundos o más según las circunstancias.",
            "Reducirse a un segundo.",
            "Mantenerse siempre exactamente igual.",
            0,
            "La pérdida de adherencia y visibilidad exige aumentar el margen de seguridad.",
            QuestionSourceType.DGT,
            "DGT - conducción preventiva",
            QuestionDifficulty.MEDIUM
        ),

        q(
            976,
            "Velocidad",
            "Tiempo de reacción",
            "Un tiempo de reacción considerado habitual como referencia por DGT es aproximadamente...",
            "0,75 segundos.",
            "5 segundos.",
            "10 segundos.",
            0,
            "DGT utiliza aproximadamente 0,75 segundos como referencia explicativa del tiempo de reacción normal.",
            QuestionSourceType.DGT,
            "DGT - exceso de velocidad",
            QuestionDifficulty.MEDIUM
        ),

        q(
            977,
            "Velocidad",
            "Reacción",
            "A unos 50 km/h, durante aproximadamente 0,75 segundos de reacción, un vehículo recorre alrededor de...",
            "10 metros.",
            "1 metro.",
            "50 metros.",
            0,
            "Antes de empezar a frenar el vehículo continúa avanzando durante el tiempo de reacción.",
            QuestionSourceType.DGT,
            "DGT - exceso de velocidad",
            QuestionDifficulty.MEDIUM
        ),

        q(
            978,
            "Velocidad",
            "Reacción",
            "A unos 120 km/h, durante aproximadamente 0,75 segundos de reacción, pueden recorrerse alrededor de...",
            "25 metros.",
            "3 metros.",
            "100 metros.",
            0,
            "Al aumentar la velocidad también aumenta la distancia recorrida antes de comenzar a frenar.",
            QuestionSourceType.DGT,
            "DGT - exceso de velocidad",
            QuestionDifficulty.MEDIUM
        ),

        q(
            979,
            "Distancia de seguridad",
            "Detención",
            "La distancia total de detención es la suma de...",
            "La distancia de reacción y la distancia de frenado.",
            "La anchura y longitud del vehículo.",
            "La distancia lateral y la distancia de adelantamiento.",
            0,
            "Primero se recorre espacio mientras el conductor reacciona y después durante la frenada.",
            QuestionSourceType.DGT,
            "DGT - exceso de velocidad",
            QuestionDifficulty.EASY
        ),

        q(
            980,
            "Distancia de seguridad",
            "Frenado",
            "La distancia de frenado puede verse afectada por...",
            "Velocidad, carga, neumáticos, frenos y estado de la vía.",
            "Solo el color del vehículo.",
            "Únicamente la hora del día.",
            0,
            "La frenada depende de múltiples factores del vehículo, la vía y las condiciones de circulación.",
            QuestionSourceType.DGT,
            "DGT - exceso de velocidad",
            QuestionDifficulty.EASY
        ),

        q(
            981,
            "Condiciones adversas",
            "Lluvia",
            "Cuando llueve, para mejorar la visibilidad del vehículo DGT recomienda...",
            "Utilizar las luces de cruce.",
            "Utilizar siempre las luces largas.",
            "Circular únicamente con luces de posición.",
            0,
            "Con lluvia, las luces de cruce ayudan a ver y especialmente a ser visto.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones con lluvia",
            QuestionDifficulty.EASY
        ),

        q(
            982,
            "Condiciones adversas",
            "Lluvia",
            "Con la calzada mojada la distancia de frenado suele...",
            "Aumentar.",
            "Disminuir siempre.",
            "Ser exactamente igual que en seco.",
            0,
            "La menor adherencia disponible puede aumentar considerablemente la distancia necesaria para detenerse.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones con lluvia",
            QuestionDifficulty.EASY
        ),

        q(
            983,
            "Condiciones adversas",
            "Frenos mojados",
            "Después de circular por una zona con abundante agua, cuando sea seguro puede ser conveniente...",
            "Comprobar suavemente la eficacia de los frenos.",
            "Frenar bruscamente a máxima velocidad.",
            "Apagar el motor.",
            0,
            "La humedad puede reducir temporalmente la eficacia y una comprobación suave ayuda a verificar su respuesta.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones con lluvia",
            QuestionDifficulty.MEDIUM
        ),

        q(
            984,
            "Condiciones adversas",
            "Lluvia intensa",
            "Si una lluvia tan intensa impide continuar viendo con seguridad debe...",
            "Buscar un lugar seguro fuera de la calzada y detenerse con precaución.",
            "Continuar a la misma velocidad.",
            "Usar únicamente las luces largas.",
            0,
            "Cuando la visibilidad impide conducir con seguridad debe buscarse una detención segura fuera de la calzada.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones con lluvia",
            QuestionDifficulty.EASY
        ),

        q(
            985,
            "Condiciones adversas",
            "Viento",
            "Con viento lateral fuerte conviene...",
            "Reducir la velocidad y sujetar firmemente el volante.",
            "Aumentar mucho la velocidad.",
            "Circular en punto muerto.",
            0,
            "Reducir la velocidad facilita controlar posibles desviaciones provocadas por el viento.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones con viento",
            QuestionDifficulty.EASY
        ),

        q(
            986,
            "Condiciones adversas",
            "Viento",
            "¿Dónde puede sorprender especialmente un golpe de viento lateral?",
            "A la salida de un túnel o de una zona protegida.",
            "Únicamente dentro de un garaje cerrado.",
            "Solo con el vehículo detenido.",
            0,
            "El cambio repentino de una zona protegida a otra expuesta puede provocar una desviación brusca.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones con viento",
            QuestionDifficulty.EASY
        ),

        q(
            987,
            "Condiciones adversas",
            "Viento",
            "Al adelantar a un vehículo voluminoso con viento lateral debe prever que...",
            "Puede cambiar bruscamente el efecto del viento al quedar protegido y volver a quedar expuesto.",
            "El viento desaparece definitivamente.",
            "El vehículo aumenta automáticamente su adherencia.",
            0,
            "Los vehículos grandes pueden actuar temporalmente como pantalla frente al viento.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones con viento",
            QuestionDifficulty.MEDIUM
        ),

        q(
            988,
            "Condiciones adversas",
            "Lluvia",
            "Una frenada brusca sobre una calzada con mucha agua puede...",
            "Favorecer una pérdida de adherencia.",
            "Aumentar siempre la adherencia.",
            "Secar inmediatamente toda la calzada.",
            0,
            "Con agua debe actuarse suavemente para reducir el riesgo de deslizamiento.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones con lluvia",
            QuestionDifficulty.EASY
        ),

        q(
            989,
            "Condiciones adversas",
            "Agua",
            "Ante un charco importante conviene...",
            "Reducir previamente la velocidad y evitar maniobras bruscas.",
            "Acelerar fuertemente dentro del charco.",
            "Frenar bruscamente mientras se atraviesa.",
            0,
            "Una velocidad moderada y movimientos suaves reducen el riesgo de pérdida de contacto con el firme.",
            QuestionSourceType.DGT,
            "DGT - recomendaciones con lluvia",
            QuestionDifficulty.EASY
        ),

        q(
            990,
            "Fatiga y sueño",
            "Vía desconocida",
            "Circular durante mucho tiempo por una vía poco conocida puede...",
            "Aumentar la fatiga al exigir mayor atención.",
            "Eliminar el cansancio.",
            "Reducir siempre el esfuerzo mental.",
            0,
            "Una carretera poco conocida puede exigir una atención continua mayor y favorecer el cansancio.",
            QuestionSourceType.DGT,
            "DGT - conducir con fatiga",
            QuestionDifficulty.MEDIUM
        ),

        q(
            991,
            "Fatiga y sueño",
            "Vehículo",
            "Vibraciones excesivas causadas por problemas de dirección o suspensión pueden...",
            "Hacer la conducción más incómoda y fatigante.",
            "Mejorar la concentración.",
            "Eliminar la somnolencia.",
            0,
            "El mal estado del vehículo puede aumentar la carga física y mental de la conducción.",
            QuestionSourceType.DGT,
            "DGT - conducir con fatiga",
            QuestionDifficulty.EASY
        ),

        q(
            992,
            "Fatiga y sueño",
            "Microsueños",
            "Uno de los mayores peligros de los microsueños es que...",
            "Pueden pasar inadvertidos para el propio conductor.",
            "Duran siempre varios minutos.",
            "Solo aparecen con el vehículo estacionado.",
            0,
            "El conductor puede permanecer durante unos segundos ajeno al tráfico sin ser consciente de ello.",
            QuestionSourceType.DGT,
            "DGT - sueño y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            993,
            "Fatiga y sueño",
            "Sueño fragmentado",
            "Dormir suficientes horas pero despertarse repetidamente durante la noche...",
            "Puede provocar somnolencia al día siguiente.",
            "Garantiza un descanso perfecto.",
            "Mejora automáticamente los reflejos.",
            0,
            "La calidad del sueño también influye en el nivel de alerta posterior.",
            QuestionSourceType.DGT,
            "DGT - sueño y conducción",
            QuestionDifficulty.MEDIUM
        ),

        q(
            994,
            "Fatiga y sueño",
            "Visión",
            "La somnolencia puede producir...",
            "Dificultad para enfocar y visión borrosa.",
            "Mayor agudeza visual.",
            "Una visión nocturna perfecta.",
            0,
            "El sueño deteriora especialmente determinadas funciones visuales necesarias para conducir.",
            QuestionSourceType.DGT,
            "DGT - sueño y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            995,
            "Conducción eficiente",
            "Motor frío",
            "En un vehículo de combustión moderno, el calentamiento normal del motor debe realizarse principalmente...",
            "Durante la marcha, conduciendo con suavidad.",
            "Manteniéndolo mucho tiempo acelerado en parado.",
            "Acelerándolo repetidamente antes de salir.",
            0,
            "DGT recomienda evitar acelerones en frío y efectuar el calentamiento durante la circulación.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.MEDIUM
        ),

        q(
            996,
            "Conducción eficiente",
            "Arranque",
            "Acelerar innecesariamente un motor todavía frío...",
            "Puede aumentar consumo y desgaste.",
            "Reduce siempre el desgaste.",
            "No tiene ningún efecto.",
            0,
            "DGT desaconseja acelerar innecesariamente el motor durante su fase de calentamiento.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            997,
            "Conducción eficiente",
            "Cambio manual",
            "En un vehículo manual, la primera marcha debe utilizarse principalmente...",
            "Para iniciar la marcha y pasar pronto a una marcha superior cuando sea adecuado.",
            "Para circular durante todo el trayecto.",
            "Solo para bajar pendientes.",
            0,
            "La conducción eficiente recomienda utilizar primera para iniciar el movimiento y cambiar pronto cuando sea posible.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            998,
            "Conducción eficiente",
            "Aerodinámica",
            "Una baca portaequipajes instalada aunque no se utilice puede...",
            "Aumentar la resistencia aerodinámica y el consumo.",
            "Reducir siempre el consumo.",
            "Mejorar necesariamente la estabilidad.",
            0,
            "Los elementos exteriores aumentan la resistencia al avance y pueden incrementar el consumo.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            999,
            "Conducción eficiente",
            "Anticipación",
            "Mantener una distancia adecuada favorece también una conducción eficiente porque...",
            "Permite anticiparse y reducir frenadas y aceleraciones innecesarias.",
            "Obliga a acelerar más.",
            "Impide utilizar la retención del motor.",
            0,
            "La anticipación permite conducir con mayor fluidez y aprovechar mejor la inercia.",
            QuestionSourceType.DGT,
            "DGT - conducción eficiente",
            QuestionDifficulty.EASY
        ),

        q(
            1000,
            "Conducción segura",
            "Principio general",
            "Una conducción segura y preventiva se basa especialmente en...",
            "Observar, anticiparse y mantener márgenes suficientes de seguridad.",
            "Circular siempre al límite máximo permitido.",
            "Confiar exclusivamente en las ayudas electrónicas.",
            0,
            "La observación, la anticipación y el espacio disponible proporcionan tiempo y opciones para reaccionar.",
            QuestionSourceType.DGT,
            "DGT - conducción preventiva",
            QuestionDifficulty.EASY
        )
    )
}
