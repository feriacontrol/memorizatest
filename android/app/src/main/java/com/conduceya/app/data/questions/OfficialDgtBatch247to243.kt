package com.conduceya.app.data.questions

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionOrigin
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object OfficialDgtBatch247to243 {

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

        // ───────────── TEST 247 ─────────────

        q(
            477,
            "Distancia de seguridad",
            "Frenado",
            "¿Puede aumentar considerablemente la distancia de frenado si hay nieve o hielo en la calzada?",
            "Sí.",
            "No.",
            "Solo si el vehículo no tiene ABS.",
            0,
            "La nieve y el hielo reducen mucho la adherencia, aumentando la distancia necesaria para detener el vehículo.",
            247, 2,
            "DGT - Adherencia y distancia de frenado",
            QuestionDifficulty.EASY
        ),

        q(
            478,
            "Mecánica y mantenimiento",
            "Frenos mojados",
            "Después de atravesar una zona con bastante agua, ¿pueden perder temporalmente eficacia los frenos?",
            "Sí.",
            "No.",
            "Solo los frenos de disco.",
            0,
            "La humedad puede reducir temporalmente la eficacia del sistema de frenado.",
            247, 4,
            "DGT - Sistema de frenado"
        ),

        q(
            479,
            "Estacionamiento",
            "Isletas",
            "¿Puede detenerse o estacionarse sobre una isleta destinada a canalizar la circulación?",
            "Puede pararse, pero no estacionarse.",
            "No puede pararse ni estacionarse.",
            "Sí, cuando exista poco tráfico.",
            1,
            "Las isletas de canalización deben permanecer libres y no pueden utilizarse para parar o estacionar.",
            247, 6,
            "Reglamento General de Circulación - parada y estacionamiento",
            QuestionDifficulty.EASY
        ),

        q(
            480,
            "Motocicletas",
            "Condiciones adversas",
            "¿Aumentan la lluvia, el viento o el hielo el riesgo de accidente para una motocicleta?",
            "Sí, especialmente si se realizan maniobras bruscas.",
            "No.",
            "Solo cuando se circula de noche.",
            0,
            "Las motocicletas son especialmente sensibles a la pérdida de adherencia y a las alteraciones de estabilidad.",
            247, 8,
            "DGT - Motocicletas y meteorología",
            QuestionDifficulty.EASY
        ),

        q(
            481,
            "Conducción segura",
            "Medio ambiente",
            "¿Pueden los accidentes de tráfico producir también daños al medio ambiente?",
            "Sí.",
            "No.",
            "Solo los accidentes de vehículos pesados.",
            0,
            "Un accidente puede provocar vertidos, daños en infraestructuras, incendios y otras afecciones ambientales.",
            247, 10,
            "DGT - Seguridad vial y medio ambiente",
            QuestionDifficulty.EASY
        ),

        q(
            482,
            "Fatiga y sueño",
            "Calor",
            "Ante temperaturas muy elevadas, ¿conviene extremar las precauciones y realizar descansos?",
            "Sí.",
            "No.",
            "Solo en vehículos sin aire acondicionado.",
            0,
            "El calor puede aumentar la fatiga, las distracciones y el tiempo de reacción.",
            247, 11,
            "DGT - Calor y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            483,
            "Alcohol y drogas",
            "Alteraciones perceptivas",
            "El consumo de determinadas drogas puede provocar...",
            "ilusiones o alteraciones en la percepción.",
            "una mejora constante del campo visual.",
            "una reducción del tiempo de reacción.",
            0,
            "Algunas drogas pueden alterar gravemente la percepción de la realidad y aumentar el riesgo de accidente.",
            247, 12,
            "DGT - Drogas y conducción"
        ),

        q(
            484,
            "Distracciones",
            "Fumar",
            "Fumar mientras se conduce puede provocar...",
            "distracciones y problemas de visión producidos por el humo.",
            "una mayor capacidad de atención.",
            "una mejora del tiempo de reacción.",
            0,
            "Encender, manipular o fumar un cigarrillo desvía la atención de la conducción.",
            247, 14,
            "DGT - Distracciones",
            QuestionDifficulty.EASY
        ),

        q(
            485,
            "Maniobras",
            "Cambio de sentido",
            "Como norma general, ¿está prohibido cambiar el sentido de la marcha en un tramo donde está prohibido adelantar?",
            "Sí.",
            "No.",
            "Solo durante la noche.",
            0,
            "Los lugares donde el adelantamiento está prohibido por falta de seguridad tampoco son adecuados para realizar un cambio de sentido, salvo excepciones reglamentarias.",
            247, 15,
            "Reglamento General de Circulación - cambio de sentido"
        ),

        // ───────────── TEST 246 ─────────────

        q(
            486,
            "Conducción segura",
            "Estado emocional",
            "Si durante la conducción una discusión le altera mucho, ¿qué actuación resulta aconsejable?",
            "Aumentar la velocidad para llegar antes.",
            "Detenerse en un lugar permitido hasta recuperar la tranquilidad.",
            "Tomar inmediatamente un tranquilizante.",
            1,
            "Un estado emocional intenso puede perjudicar la atención y la toma de decisiones.",
            246, 4,
            "DGT - Estado emocional y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            487,
            "Distancia de seguridad",
            "Frenada",
            "Para mantener una separación que permita detenerse ante una frenada brusca, debe tener especialmente en cuenta...",
            "solo la velocidad.",
            "la velocidad y las condiciones de adherencia y frenado.",
            "únicamente el tamaño del vehículo de delante.",
            1,
            "La distancia necesaria depende de la velocidad y de la capacidad real de adherencia y frenado.",
            246, 10,
            "Reglamento General de Circulación - distancia entre vehículos"
        ),

        q(
            488,
            "Señalización",
            "Semáforos",
            "Ante una luz amarilla fija de un semáforo, ¿qué debe hacer?",
            "Continuar siempre.",
            "Detenerse, salvo que no pueda hacerlo con suficiente seguridad.",
            "Acelerar antes de que aparezca la luz roja.",
            1,
            "La luz amarilla fija obliga a detenerse, excepto cuando la detención no pueda realizarse con seguridad suficiente.",
            246, 12,
            "Reglamento General de Circulación - semáforos"
        ),

        q(
            489,
            "Maniobras",
            "Giro a la izquierda",
            "En una vía de doble sentido sin línea que separe ambos sentidos, ¿dónde debe colocarse para girar a la izquierda?",
            "Junto al eje de la calzada sin invadir el sentido contrario.",
            "En el arcén derecho.",
            "Invadiendo parcialmente el sentido contrario.",
            0,
            "El conductor debe aproximarse al eje de la calzada sin invadir la zona destinada al sentido contrario.",
            246, 13,
            "Reglamento General de Circulación - cambio de dirección"
        ),

        q(
            490,
            "Estacionamiento",
            "Carril bus",
            "¿Puede un turismo efectuar una parada en un carril reservado para autobuses?",
            "Sí, si dura menos de dos minutos.",
            "Sí, si no viene ningún autobús.",
            "No.",
            2,
            "La utilización del carril reservado está limitada a los vehículos autorizados por su señalización.",
            246, 14,
            "DGT - Carriles reservados",
            QuestionDifficulty.EASY
        ),

        q(
            491,
            "Motocicletas",
            "Casco",
            "Para que un casco de motocicleta cumpla correctamente su función, la correa de sujeción debe...",
            "llevarse correctamente abrochada.",
            "llevarse desabrochada en ciudad.",
            "aflojarse durante trayectos cortos.",
            0,
            "Un casco que no está correctamente abrochado puede desprenderse durante una caída.",
            246, 15,
            "DGT - Casco de protección",
            QuestionDifficulty.EASY
        ),

        // ───────────── TEST 245 ─────────────

        q(
            492,
            "Señalización",
            "Prioridad entre señales",
            "En la jerarquía de señalización, ¿prevalece una señal vertical sobre una marca vial?",
            "Sí.",
            "No, la marca vial siempre tiene prioridad.",
            "Solo en autopista.",
            0,
            "En el orden de prioridad reglamentario, las señales verticales se encuentran por encima de las marcas viales.",
            245, 2,
            "Reglamento General de Circulación - prioridad entre señales",
            QuestionDifficulty.EASY
        ),

        q(
            493,
            "Circulación",
            "Carril adicional",
            "Al circular por un carril adicional circunstancial, ¿debe llevarse encendida al menos la luz de cruce?",
            "Sí.",
            "No.",
            "Solo de noche.",
            0,
            "El alumbrado de cruce debe utilizarse mientras se circula por estos carriles especiales.",
            245, 3,
            "Reglamento General de Circulación, artículo 42"
        ),

        q(
            494,
            "Seguridad",
            "Entrada y salida del vehículo",
            "Como norma general, una vez detenido el vehículo, ¿por qué lado deben entrar o salir sus ocupantes?",
            "Por el lado más próximo a la acera o al arcén.",
            "Siempre por el lado izquierdo.",
            "Por cualquier lado sin necesidad de comprobar el tráfico.",
            0,
            "Debe utilizarse, como norma general, el lado que ofrezca mayor seguridad respecto a la circulación.",
            245, 7,
            "DGT - Entrada y salida del vehículo",
            QuestionDifficulty.EASY
        ),

        q(
            495,
            "Fatiga y sueño",
            "Ventilación",
            "Para retrasar la aparición de la fatiga, ¿conviene mantener bien ventilado el habitáculo?",
            "Sí.",
            "No.",
            "Solo durante el invierno.",
            0,
            "Una temperatura adecuada y una buena ventilación ayudan a evitar somnolencia y fatiga.",
            245, 8,
            "DGT - Fatiga y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            496,
            "Adelantamientos",
            "Vehículo adelantado",
            "Si el vehículo que le adelanta necesita regresar rápidamente al carril por la aparición de un peligro, ¿qué debe hacer?",
            "Aumentar la velocidad.",
            "Facilitarle el regreso reduciendo la velocidad si fuera necesario.",
            "Mantener obligatoriamente la misma velocidad.",
            1,
            "El conductor adelantado debe colaborar para evitar una situación peligrosa y facilitar la finalización segura de la maniobra.",
            245, 10,
            "Reglamento General de Circulación - comportamiento durante el adelantamiento"
        ),

        q(
            497,
            "Condiciones adversas",
            "Nieve",
            "Sobre una calzada con nieve, ¿puede una frenada brusca provocar un derrape?",
            "Sí.",
            "No, si los neumáticos están equilibrados.",
            "No, si la presión es correcta.",
            0,
            "Una frenada intensa puede hacer que los neumáticos pierdan adherencia sobre nieve.",
            245, 11,
            "DGT - Conducción con nieve",
            QuestionDifficulty.EASY
        ),

        // ───────────── TEST 244 ─────────────

        q(
            498,
            "Conducción eficiente",
            "Arranque del motor",
            "Después de arrancar un motor de gasolina, ¿es aconsejable iniciar la marcha sin mantenerlo varios minutos calentándose al ralentí?",
            "Sí.",
            "No, debe mantenerse acelerado en vacío.",
            "No, debe permanecer siempre cinco minutos detenido.",
            0,
            "En condiciones normales no es necesario mantener durante varios minutos el motor al ralentí antes de iniciar la marcha.",
            244, 2,
            "DGT - Conducción eficiente"
        ),

        q(
            499,
            "Seguridad",
            "Cinturón de seguridad",
            "¿Dónde debe apoyarse la banda abdominal del cinturón de seguridad?",
            "Sobre los huesos de la cadera.",
            "Sobre el abdomen.",
            "Sobre los muslos.",
            0,
            "La banda inferior debe descansar sobre la zona ósea de la pelvis y no sobre el abdomen.",
            244, 3,
            "DGT - Cinturón de seguridad",
            QuestionDifficulty.EASY
        ),

        q(
            500,
            "Señalización",
            "Agentes",
            "Si un agente regula una intersección que también tiene semáforos y señales verticales, ¿qué indicaciones debe obedecer?",
            "Las del agente.",
            "Las del semáforo.",
            "Las de la señal vertical.",
            0,
            "Las señales y órdenes de los agentes ocupan el primer lugar en la jerarquía de señalización.",
            244, 4,
            "Reglamento General de Circulación - prioridad entre señales",
            QuestionDifficulty.EASY
        ),

        q(
            501,
            "Motocicletas",
            "Pasajero",
            "¿Cómo debe colocarse normalmente el pasajero de una motocicleta?",
            "A horcajadas y con los pies apoyados en los reposapiés laterales.",
            "Entre el conductor y el manillar.",
            "De lado sin utilizar los reposapiés.",
            0,
            "El pasajero debe ocupar el asiento correspondiente y utilizar los reposapiés previstos.",
            244, 6,
            "Reglamento General de Circulación - pasajeros en motocicleta",
            QuestionDifficulty.EASY
        ),

        q(
            502,
            "Conducción segura",
            "Factor vía",
            "¿Puede el conductor reducir el riesgo relacionado con las condiciones de la vía?",
            "Sí, adaptando su conducción al entorno.",
            "No, porque la vía no depende de él.",
            "Solo si el vehículo tiene sistemas de ayuda avanzados.",
            0,
            "El conductor puede compensar muchos riesgos del entorno adaptando velocidad, distancia y forma de conducir.",
            244, 9,
            "DGT - Factores de riesgo",
            QuestionDifficulty.EASY
        ),

        q(
            503,
            "Conducción segura",
            "Estrés",
            "Bajo los efectos del estrés, la conducción puede volverse...",
            "más temeraria.",
            "siempre más prudente.",
            "más segura.",
            0,
            "El estrés puede favorecer la impaciencia, la agresividad y una mayor aceptación del riesgo.",
            244, 14,
            "DGT - Estrés y conducción",
            QuestionDifficulty.EASY
        ),

        q(
            504,
            "Accidentes y primeros auxilios",
            "Impacto social",
            "¿A quién afecta económicamente la siniestralidad vial?",
            "Únicamente a las aseguradoras.",
            "Únicamente a quienes sufren directamente un accidente.",
            "Al conjunto de la sociedad, directa o indirectamente.",
            2,
            "Los accidentes generan costes sanitarios, humanos, materiales y productivos que afectan al conjunto de la sociedad.",
            244, 15,
            "DGT - Costes de la siniestralidad"
        ),

        // ───────────── TEST 243 ─────────────

        q(
            505,
            "Mecánica y mantenimiento",
            "Neumáticos",
            "Para comprobar correctamente la presión de los neumáticos, ¿cómo deben encontrarse preferentemente?",
            "Fríos.",
            "Muy calientes.",
            "Es indiferente.",
            0,
            "La presión recomendada suele comprobarse con el neumático frío para obtener una medición fiable.",
            243, 5,
            "DGT - Mantenimiento de neumáticos",
            QuestionDifficulty.EASY
        ),

        q(
            506,
            "Circulación",
            "Autopistas",
            "En una autopista con varios carriles para el mismo sentido, ¿por cuál debe circular normalmente?",
            "Por el carril derecho.",
            "Por el carril central.",
            "Por cualquiera indistintamente.",
            0,
            "Debe utilizarse normalmente el carril derecho, empleando los demás cuando las circunstancias lo aconsejen.",
            243, 6,
            "Reglamento General de Circulación - utilización de carriles",
            QuestionDifficulty.EASY
        ),

        q(
            507,
            "Documentación",
            "Seguro obligatorio",
            "Si un conductor causa un accidente, ¿cubre el seguro obligatorio sus propias lesiones personales como conductor responsable?",
            "Sí, siempre.",
            "No, esas lesiones están excluidas de la cobertura obligatoria.",
            "Solo si el vehículo contrario también tiene seguro.",
            1,
            "La cobertura obligatoria de responsabilidad civil no cubre las lesiones del propio conductor responsable del accidente.",
            243, 7,
            "Ley sobre responsabilidad civil y seguro en la circulación de vehículos a motor"
        ),

        q(
            508,
            "Maniobras",
            "Señales con el brazo",
            "¿Son válidas las señales reglamentarias realizadas por el conductor con el brazo cuando pueden ser vistas claramente?",
            "Sí.",
            "Solo durante el día.",
            "Solo dentro de poblado.",
            0,
            "Las señales manuales reglamentarias pueden utilizarse para advertir determinadas maniobras cuando sean claramente visibles.",
            243, 10,
            "Reglamento General de Circulación - advertencia de maniobras"
        )
    )
}
