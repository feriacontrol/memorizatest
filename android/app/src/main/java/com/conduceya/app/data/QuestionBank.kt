package com.conduceya.app.data

import com.conduceya.app.data.questions.GeneralRulesQuestions
import com.conduceya.app.data.questions.AlcoholQuestions
import com.conduceya.app.data.questions.PriorityQuestions
import com.conduceya.app.data.questions.VulnerableUsersQuestions
import com.conduceya.app.data.questions.SpeedQuestions
import com.conduceya.app.data.questions.LightingQuestions
import com.conduceya.app.data.questions.ParkingQuestions
import com.conduceya.app.data.questions.OvertakingQuestions
import com.conduceya.app.data.questions.RestraintQuestions
import com.conduceya.app.data.questions.TunnelRailQuestions
import com.conduceya.app.data.questions.SignalsQuestions
import com.conduceya.app.data.questions.ManeuverQuestions
import com.conduceya.app.data.questions.LaneQuestions
import com.conduceya.app.data.questions.DocumentationQuestions
import com.conduceya.app.data.questions.VehicleTechQuestions
import com.conduceya.app.data.questions.AccidentQuestions
import com.conduceya.app.data.questions.AdverseConditionsQuestions
import com.conduceya.app.data.questions.FatigueQuestions
import com.conduceya.app.data.questions.EcoDrivingQuestions
import com.conduceya.app.data.questions.LoadQuestions
import com.conduceya.app.data.questions.V16Questions
import com.conduceya.app.data.questions.MedicationQuestions
import com.conduceya.app.data.questions.DistanceQuestions
import com.conduceya.app.data.questions.RoadMarkingQuestions
import com.conduceya.app.data.questions.PedestrianQuestions
import com.conduceya.app.data.questions.CyclistQuestions
import com.conduceya.app.data.questions.NightDrivingQuestions
import com.conduceya.app.data.questions.RiskQuestions
import com.conduceya.app.data.questions.OfficialDgtQuestions
import com.conduceya.app.data.questions.OfficialDgtQuestions277
import com.conduceya.app.data.questions.OfficialDgtQuestions276
import com.conduceya.app.data.questions.OfficialDgtQuestions275
import com.conduceya.app.data.questions.OfficialDgtQuestions274
import com.conduceya.app.data.questions.OfficialDgtQuestions273
import com.conduceya.app.data.questions.OfficialDgtQuestions272
import com.conduceya.app.data.questions.OfficialDgtQuestions271
import com.conduceya.app.data.questions.OfficialDgtQuestions270
import com.conduceya.app.data.questions.OfficialDgtQuestions269
import com.conduceya.app.data.questions.OfficialDgtQuestions268
import com.conduceya.app.data.questions.OfficialDgtQuestions267
import com.conduceya.app.data.questions.OfficialDgtQuestions266
import com.conduceya.app.data.questions.OfficialDgtQuestions265
import com.conduceya.app.data.questions.OfficialDgtQuestions264
import com.conduceya.app.data.questions.OfficialDgtQuestions263
import com.conduceya.app.data.questions.OfficialDgtQuestions262
import com.conduceya.app.data.questions.OfficialDgtQuestions261
import com.conduceya.app.data.questions.OfficialDgtQuestions260
import com.conduceya.app.data.questions.OfficialDgtQuestions259
import com.conduceya.app.data.questions.OfficialDgtQuestions258
import com.conduceya.app.data.questions.OfficialDgtBatch257to253
import com.conduceya.app.data.questions.OfficialDgtBatch252to248
import com.conduceya.app.data.questions.OfficialDgtBatch247to243
import com.conduceya.app.data.questions.OfficialDgtBatch242to238
import com.conduceya.app.data.questions.OfficialDgtBatch237to232
import com.conduceya.app.data.questions.VerifiedBatch571to670
import com.conduceya.app.data.questions.VerifiedBatch671to770
import com.conduceya.app.data.questions.VerifiedBatch771to820
import com.conduceya.app.data.questions.VerifiedBatch821to870

import com.conduceya.app.model.QuestionDifficulty
import com.conduceya.app.model.QuestionSourceType
import com.conduceya.app.model.TestQuestion

object QuestionBank {

    private val baseQuestions = listOf(

        TestQuestion(
            id = 1,
            topic = "Velocidades",
            subtopic = "Vías urbanas",
            text = "En una vía urbana con plataforma única de calzada y acera, sin una señal que establezca otro límite, ¿cuál es la velocidad máxima genérica?",
            answers = listOf(
                "20 km/h.",
                "30 km/h.",
                "50 km/h."
            ),
            correctAnswer = 0,
            explanation = "En las vías urbanas con plataforma única de calzada y acera el límite genérico es de 20 km/h.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 50.1.a",
            lastVerified = "2026-09-10",
            difficulty = QuestionDifficulty.EASY
        ),

        TestQuestion(
            id = 2,
            topic = "Velocidades",
            subtopic = "Vías urbanas",
            text = "En una vía urbana con un único carril por sentido de circulación, ¿cuál es el límite genérico de velocidad?",
            answers = listOf(
                "20 km/h.",
                "30 km/h.",
                "50 km/h."
            ),
            correctAnswer = 1,
            explanation = "En vías urbanas de un único carril por sentido, el límite genérico es de 30 km/h.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 50.1.b",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 3,
            topic = "Velocidades",
            subtopic = "Vías urbanas",
            text = "En una vía urbana con dos o más carriles por sentido, ¿cuál es el límite genérico de velocidad?",
            answers = listOf(
                "30 km/h.",
                "40 km/h.",
                "50 km/h."
            ),
            correctAnswer = 2,
            explanation = "En vías urbanas de dos o más carriles por sentido el límite genérico es de 50 km/h.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 50.1.c",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 4,
            topic = "Velocidades",
            subtopic = "Autopistas y autovías",
            text = "Como norma general, ¿cuál es la velocidad máxima de un turismo en autopista o autovía?",
            answers = listOf(
                "100 km/h.",
                "120 km/h.",
                "130 km/h."
            ),
            correctAnswer = 1,
            explanation = "Los turismos pueden circular como máximo a 120 km/h en autopistas y autovías, salvo limitación específica inferior.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 48.1.a",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 5,
            topic = "Velocidades",
            subtopic = "Carreteras convencionales",
            text = "Como norma general, ¿cuál es la velocidad máxima de un turismo en una carretera convencional?",
            answers = listOf(
                "80 km/h.",
                "90 km/h.",
                "100 km/h."
            ),
            correctAnswer = 1,
            explanation = "El límite genérico para turismos en carreteras convencionales es de 90 km/h.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 48.1.a",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 6,
            topic = "Velocidades",
            subtopic = "Velocidad mínima",
            text = "Salvo causa justificada, ¿a qué velocidad mínima debe circular un vehículo a motor por una autopista o autovía?",
            answers = listOf(
                "40 km/h.",
                "50 km/h.",
                "60 km/h."
            ),
            correctAnswer = 2,
            explanation = "En autopistas y autovías no se debe circular a menos de 60 km/h salvo que las circunstancias permitan legalmente hacerlo.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 49.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 7,
            topic = "Seguridad",
            subtopic = "Distancia de seguridad",
            text = "Al circular detrás de otro vehículo, ¿qué distancia debe mantener?",
            answers = listOf(
                "La que permita detenerse ante una frenada brusca sin colisionar.",
                "Siempre exactamente 50 metros.",
                "La distancia no importa si circula por debajo del límite."
            ),
            correctAnswer = 0,
            explanation = "Debe mantenerse un espacio que permita detener el vehículo sin colisionar en caso de frenado brusco.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 54.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 8,
            topic = "Prioridades",
            subtopic = "Intersecciones",
            text = "En una intersección sin señalizar, como norma general, ¿a quién debe ceder el paso?",
            answers = listOf(
                "Al vehículo que se aproxima por la izquierda.",
                "Al vehículo que se aproxima por la derecha.",
                "Al vehículo más grande."
            ),
            correctAnswer = 1,
            explanation = "En una intersección sin señalización se debe ceder el paso a los vehículos que se aproximen por la derecha, salvo las excepciones reglamentarias.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 57.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 9,
            topic = "Prioridades",
            subtopic = "Tipo de vía",
            text = "En una intersección sin señalizar entre una vía pavimentada y otra sin pavimentar, ¿quién tiene prioridad?",
            answers = listOf(
                "El que circula por la vía pavimentada.",
                "El que procede de la vía sin pavimentar.",
                "El que llegue primero."
            ),
            correctAnswer = 0,
            explanation = "Los vehículos que circulan por una vía pavimentada tienen prioridad frente a los procedentes de una vía sin pavimentar.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 57.1.a",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 10,
            topic = "Prioridades",
            subtopic = "Glorietas",
            text = "En una glorieta, ¿quién tiene prioridad como norma general?",
            answers = listOf(
                "El vehículo que pretende entrar.",
                "El vehículo que ya circula dentro de la glorieta.",
                "Siempre el vehículo que llega por la derecha."
            ),
            correctAnswer = 1,
            explanation = "Los vehículos que ya se encuentran dentro de la glorieta tienen prioridad sobre los que pretenden acceder.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 57.1.c",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 11,
            topic = "Prioridades",
            subtopic = "Autopistas y autovías",
            text = "Un vehículo se incorpora a una autovía. ¿Quién tiene prioridad?",
            answers = listOf(
                "El que se incorpora.",
                "Los vehículos que ya circulan por la autovía.",
                "El vehículo que circule más rápido."
            ),
            correctAnswer = 1,
            explanation = "Los vehículos que ya circulan por una autopista o autovía tienen prioridad sobre los que pretenden incorporarse.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 57.1.d",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 12,
            topic = "Prioridades",
            subtopic = "Intersecciones señalizadas",
            text = "Al aproximarse a una intersección regulada por señales, ¿qué determina la prioridad de paso?",
            answers = listOf(
                "El tamaño de los vehículos.",
                "La señalización que regula la intersección.",
                "El vehículo que llegue a mayor velocidad."
            ),
            correctAnswer = 1,
            explanation = "En las intersecciones señalizadas la prioridad debe determinarse de acuerdo con la señalización existente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 56.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 13,
            topic = "Prioridades",
            subtopic = "STOP",
            text = "Ante una señal de STOP en una intersección, ¿qué debe hacer el conductor?",
            answers = listOf(
                "Reducir ligeramente la velocidad si no ve vehículos.",
                "Detener completamente el vehículo y ceder el paso.",
                "Detenerse únicamente cuando se aproxime un vehículo por la derecha."
            ),
            correctAnswer = 1,
            explanation = "La señal de STOP obliga a detener completamente la marcha y a ceder el paso a los vehículos de la vía preferente.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 56.5",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 14,
            topic = "Adelantamientos",
            subtopic = "Inicio de la maniobra",
            text = "Antes de iniciar un adelantamiento que exige desplazarse lateralmente, ¿qué debe comprobar el conductor?",
            answers = listOf(
                "Que dispone de espacio suficiente y puede realizarlo sin peligro.",
                "Únicamente que el vehículo de delante circula despacio.",
                "Que circula a la velocidad máxima permitida."
            ),
            correctAnswer = 0,
            explanation = "Antes de adelantar debe comprobarse que existe espacio suficiente y que la maniobra no pone en peligro ni entorpece a otros usuarios.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 84.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 15,
            topic = "Conducción segura",
            subtopic = "Cambio de dirección",
            text = "Antes de realizar un cambio de dirección, el conductor debe...",
            answers = listOf(
                "Advertir la maniobra con antelación y comprobar que puede realizarla sin peligro.",
                "Girar primero y señalizar después.",
                "Acelerar siempre antes de iniciar el giro."
            ),
            correctAnswer = 0,
            explanation = "El cambio de dirección debe advertirse con suficiente antelación y solo realizarse cuando pueda efectuarse con seguridad.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 74.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 16,
            topic = "Estacionamiento",
            subtopic = "Normas generales",
            text = "Una parada o estacionamiento debe realizarse de manera que...",
            answers = listOf(
                "No obstaculice la circulación ni constituya un riesgo.",
                "El vehículo quede siempre sobre la acera.",
                "Permita mantener el motor en marcha."
            ),
            correctAnswer = 0,
            explanation = "La parada y el estacionamiento deben efectuarse sin obstaculizar la circulación ni crear riesgos para otros usuarios.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 91.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 17,
            topic = "Estacionamiento",
            subtopic = "Colocación",
            text = "Como norma general, ¿cómo debe colocarse un vehículo al parar o estacionar?",
            answers = listOf(
                "Perpendicularmente al borde de la calzada.",
                "Paralelamente al borde de la calzada.",
                "En diagonal."
            ),
            correctAnswer = 1,
            explanation = "Como regla general, la parada y el estacionamiento se realizan situando el vehículo paralelamente al borde de la calzada.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 92.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 18,
            topic = "Estacionamiento",
            subtopic = "Inmovilización",
            text = "Cuando el conductor abandona un vehículo estacionado, ¿qué debe hacer con el freno de estacionamiento?",
            answers = listOf(
                "Dejarlo accionado.",
                "Soltarlo siempre.",
                "Solo accionarlo si estaciona de noche."
            ),
            correctAnswer = 0,
            explanation = "Al dejar el puesto de conducción de un vehículo estacionado debe quedar accionado el freno de estacionamiento.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 92.3",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 19,
            topic = "Estacionamiento",
            subtopic = "Lugares prohibidos",
            text = "¿Está permitido parar un turismo sobre un paso para peatones?",
            answers = listOf(
                "Sí, durante menos de dos minutos.",
                "Sí, si permanece el conductor dentro.",
                "No."
            ),
            correctAnswer = 2,
            explanation = "Está prohibido parar en los pasos para peatones.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 94.1.b",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 20,
            topic = "Estacionamiento",
            subtopic = "Túneles",
            text = "¿Está permitido parar dentro de un túnel fuera de los lugares habilitados?",
            answers = listOf(
                "Sí, si se conectan las luces de emergencia.",
                "No.",
                "Sí, cuando la parada dure menos de un minuto."
            ),
            correctAnswer = 1,
            explanation = "Está prohibido parar en túneles, pasos inferiores y tramos afectados por la señal de túnel, salvo situaciones impuestas por la circulación o emergencia.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 94.1.a",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 21,
            topic = "Estacionamiento",
            subtopic = "Autopistas y autovías",
            text = "En una autopista o autovía, ¿se puede parar en cualquier punto del arcén por decisión del conductor?",
            answers = listOf(
                "Sí, si hay buena visibilidad.",
                "No, salvo en las zonas habilitadas o por una situación que obligue a inmovilizarse.",
                "Sí, durante un máximo de cinco minutos."
            ),
            correctAnswer = 1,
            explanation = "La parada está prohibida en autopistas y autovías fuera de las zonas habilitadas, sin perjuicio de las inmovilizaciones impuestas por una emergencia o la circulación.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 94.1.g",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 22,
            topic = "Alumbrado",
            subtopic = "Uso obligatorio",
            text = "¿Cuándo debe llevar un vehículo el alumbrado correspondiente encendido?",
            answers = listOf(
                "Únicamente cuando llueve.",
                "Entre el ocaso y la salida del sol y también al circular por túneles.",
                "Solo fuera de poblado."
            ),
            correctAnswer = 1,
            explanation = "Los vehículos deben utilizar el alumbrado correspondiente entre el ocaso y la salida del sol y al circular por túneles, pasos inferiores y tramos señalizados como túnel.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 98.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 23,
            topic = "Alumbrado",
            subtopic = "Luces de posición",
            text = "Cuando un vehículo circula de noche, ¿debe llevar encendidas las luces de posición?",
            answers = listOf(
                "Sí.",
                "Solo en vías urbanas.",
                "No, si lleva luz de cruce."
            ),
            correctAnswer = 0,
            explanation = "En las circunstancias en que es obligatorio el alumbrado deben estar encendidas las luces de posición correspondientes.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 99.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 24,
            topic = "Alumbrado",
            subtopic = "Luz de carretera",
            text = "¿Puede utilizarse la luz de carretera o largo alcance con el vehículo parado o estacionado?",
            answers = listOf(
                "Sí, en vías interurbanas.",
                "Sí, durante menos de dos minutos.",
                "No."
            ),
            correctAnswer = 2,
            explanation = "Está prohibido utilizar la luz de largo alcance cuando el vehículo se encuentra parado o estacionado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 100.2",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 25,
            topic = "Alumbrado",
            subtopic = "Deslumbramiento",
            text = "Si existe posibilidad de deslumbrar a otro usuario con la luz de carretera, ¿qué debe hacer?",
            answers = listOf(
                "Mantener la luz de carretera.",
                "Sustituirla por la luz de cruce.",
                "Apagar todo el alumbrado."
            ),
            correctAnswer = 1,
            explanation = "La luz de carretera debe sustituirse por la de cruce tan pronto como exista posibilidad de deslumbrar a otros usuarios.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 102.1",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 26,
            topic = "Alumbrado",
            subtopic = "Deslumbramiento",
            text = "Si un conductor resulta deslumbrado, ¿qué debe hacer?",
            answers = listOf(
                "Aumentar la velocidad para salir rápidamente de la zona.",
                "Reducir la velocidad lo necesario, incluso hasta detenerse.",
                "Encender también las luces de carretera."
            ),
            correctAnswer = 1,
            explanation = "Ante un deslumbramiento se debe reducir la velocidad lo necesario, incluso hasta la detención total si fuera preciso.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 102.3",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 27,
            topic = "Alumbrado",
            subtopic = "Antiniebla",
            text = "¿Cuándo debe utilizarse la luz antiniebla trasera?",
            answers = listOf(
                "Siempre que llueva ligeramente.",
                "Cuando las condiciones sean especialmente desfavorables, como niebla espesa o lluvia muy intensa.",
                "Siempre durante la noche."
            ),
            correctAnswer = 1,
            explanation = "La antiniebla trasera debe utilizarse únicamente con condiciones especialmente desfavorables que reduzcan mucho la visibilidad.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 106.2",
            lastVerified = "2026-09-10"
        ),

        TestQuestion(
            id = 28,
            topic = "Alcohol y drogas",
            subtopic = "Alcohol",
            text = "Según el límite general actualmente vigente, ¿qué tasa de alcohol en aire espirado no puede superar un conductor ordinario?",
            answers = listOf(
                "0,15 mg/l.",
                "0,25 mg/l.",
                "0,50 mg/l."
            ),
            correctAnswer = 1,
            explanation = "El límite general vigente es de 0,25 miligramos de alcohol por litro de aire espirado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 20",
            lastVerified = "2026-09-10",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 29,
            topic = "Alcohol y drogas",
            subtopic = "Conductores noveles",
            text = "Durante los dos primeros años desde la obtención del permiso, ¿qué tasa máxima de alcohol en aire espirado establece actualmente el Reglamento?",
            answers = listOf(
                "0,10 mg/l.",
                "0,15 mg/l.",
                "0,25 mg/l."
            ),
            correctAnswer = 1,
            explanation = "Durante los dos años siguientes a la obtención del permiso, el límite actualmente vigente es de 0,15 mg/l de aire espirado.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 20",
            lastVerified = "2026-09-10",
            difficulty = QuestionDifficulty.MEDIUM
        ),

        TestQuestion(
            id = 30,
            topic = "Seguridad",
            subtopic = "Cinturón de seguridad",
            text = "En un turismo equipado con cinturones de seguridad, ¿cuándo deben utilizarlos el conductor y los ocupantes?",
            answers = listOf(
                "Solo en vías interurbanas.",
                "Solo cuando el vehículo supera los 50 km/h.",
                "Tanto en vías urbanas como interurbanas."
            ),
            correctAnswer = 2,
            explanation = "El conductor y los ocupantes están obligados a utilizar correctamente abrochados los cinturones de seguridad tanto en vías urbanas como interurbanas.",
            sourceType = QuestionSourceType.BOE,
            reference = "Reglamento General de Circulación",
            legalReference = "Artículo 117.1",
            lastVerified = "2026-09-10",
            difficulty = QuestionDifficulty.EASY
        )
    )

    val questions =
        baseQuestions +
        GeneralRulesQuestions.questions +
        AlcoholQuestions.questions +
        PriorityQuestions.questions +
        VulnerableUsersQuestions.questions +
        SpeedQuestions.questions +
        LightingQuestions.questions +
        ParkingQuestions.questions +
        OvertakingQuestions.questions +
        RestraintQuestions.questions +
        TunnelRailQuestions.questions +
        SignalsQuestions.questions +
        ManeuverQuestions.questions +
        LaneQuestions.questions +
        DocumentationQuestions.questions +
        VehicleTechQuestions.questions +
        AccidentQuestions.questions +
        AdverseConditionsQuestions.questions +
        FatigueQuestions.questions +
        EcoDrivingQuestions.questions +
        LoadQuestions.questions +
        V16Questions.questions +
        MedicationQuestions.questions +
        DistanceQuestions.questions +
        RoadMarkingQuestions.questions +
        PedestrianQuestions.questions +
        CyclistQuestions.questions +
        NightDrivingQuestions.questions +
        RiskQuestions.questions +
        OfficialDgtQuestions.questions +
        OfficialDgtQuestions277.questions +
        OfficialDgtQuestions276.questions +
        OfficialDgtQuestions275.questions +
        OfficialDgtQuestions274.questions +
        OfficialDgtQuestions273.questions +
        OfficialDgtQuestions272.questions +
        OfficialDgtQuestions271.questions +
        OfficialDgtQuestions270.questions +
        OfficialDgtQuestions269.questions +
        OfficialDgtQuestions268.questions +
        OfficialDgtQuestions267.questions +
        OfficialDgtQuestions266.questions +
        OfficialDgtQuestions265.questions +
        OfficialDgtQuestions264.questions +
        OfficialDgtQuestions263.questions +
        OfficialDgtQuestions262.questions +
        OfficialDgtQuestions261.questions +
        OfficialDgtQuestions260.questions +
        OfficialDgtQuestions259.questions +
        OfficialDgtQuestions258.questions +
        OfficialDgtBatch257to253.questions +
        OfficialDgtBatch252to248.questions +
        OfficialDgtBatch247to243.questions +
        OfficialDgtBatch242to238.questions +
        OfficialDgtBatch237to232.questions +
        VerifiedBatch571to670.questions +
        VerifiedBatch671to770.questions +
        VerifiedBatch771to820.questions +
        VerifiedBatch821to870.questions

}
