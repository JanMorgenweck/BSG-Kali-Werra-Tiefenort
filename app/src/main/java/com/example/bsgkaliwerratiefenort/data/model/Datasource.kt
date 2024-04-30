package com.example.kaliwerra.data

import com.example.bsgkaliwerratiefenort.data.model.News

class Datasource {


    fun loadMannschaften(): List<Mannschaft> {
        val mannschaft = mutableListOf(
            Mannschaft(
                "1. Herren Mannschaft",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-22-23_web-1536x1024.jpg?alt=media&token=6972404a-0f69-48dc-9b31-ed7e3980ad19",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag: 18:30 Uhr bis 20:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Freitag: 18:30 Uhr bis 20:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Ansprechpartner: Pierre Cravaack\n",
                "kali-werra-tiefenort@outlook.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/sg-fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/011MIAF2K0000000VTVG0001VTR8C1K7#!/",
                "",
                2023,
                0,
                6311

            ),
            Mannschaft(
                "2. Herren Mannschaft",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2F2.-Mannschaft.jpg?alt=media&token=f16c7122-180e-4d28-bed5-5f4a542dfe68",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag: 18:30 Uhr bis 20:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Freitag: 18:30 Uhr bis 20:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Ansprechpartner: Pierre Cravaack\n",
                "kali-werra-tiefenort@outlook.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/1-kreisklasse-staffel-2-kreis-westthueringen-1kreisklasse-herren-saison2223-thueringen/-/staffel/02IKCH8RSC000007VS5489B3VVETK79U-G#!/",
                "",
                2023,
                0,
                6311
            ),
            Mannschaft(
                "Edle Herren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FAlte-Herren.jpg?alt=media&token=51d08694-c332-47fe-ae8d-2de7c04804e5",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Mittwoch: 18:30 Uhr bis 20:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Ansprechpartner: Jörg Ebert",
                "kali-werra-tiefenort@outlook.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/sg-fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/011MIBOG34000000VTVG0001VTR8C1K7#!/",
                "",
                2023,
                0,
                6311
            ),
            Mannschaft(
                "B - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-B-Junioren2-1536x1066.jpg?alt=media&token=9d87e0cf-0abe-4025-bc88-1234a448e3ba",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag: 18:00 Uhr bis 19:30 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Mittwoch: 18:00 Uhr bis 19:30 Uhr | Sportplatz Langenfeld\n" +
                        "\n" +
                        "Ansprechpartner: Robert Langer, Florian Scholz",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/sg-fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/02EV21G1SK000000VS5489B1VT0RKM5V#!/",
                "KLST2BJ",
                2023,
                4727,
                6311
            ),
            Mannschaft(
                "C - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-C-Junioren-1536x1066.jpg?alt=media&token=57a122bf-5dd5-40b4-adea-3ef6c60a81c3",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Mittwoch: 17:00 Uhr bis 18:30 Uhr | Sportplatz Langenfeld\n" +
                        "\n" +
                        "Freitag: 17:00 Uhr bis 18:30 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner: Florian Krug, Marcus Noback, Enrico Wagner",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/sg-fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/01KRG0D94S000000VV0AG811VUP4Q6U8#!/",
                "CJST3",
                2023,
                4723,
                6311
            ),
            Mannschaft(
                "D1 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-D1-Junioren-1536x1066.jpg?alt=media&token=bfa69ad5-3fb5-4219-aeeb-644bfca85a14",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag: 16:00 Uhr bis 17:30 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Donnerstag: 16:00 Uhr bis 17:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner: David Wohlfahrt",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/01DN527O10000000VV0AG80NVSQ3PCMQ#!/",
                "",
                2023,
                0,
                6311
            ),
            Mannschaft(
                "D2 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-D2-Junioren-1536x1066.jpg?alt=media&token=a0140db7-4e7a-49d0-9219-bd857bc89de7",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Mittwoch: 16:00 Uhr bis 17:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Freitag: 16:00 Uhr bis 17:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner: Tino Vollmer",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/fsv-kali-werra-tiefenort-ii-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/02IATOMMS4000000VS5489B2VU2I8R4H#!/",
                "D2JKLSt3",
                2023,
                4726,
                6311

            ),
            Mannschaft(
                "E1 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-E1-Junioren-1536x1066.jpg?alt=media&token=74c2d956-7d61-4c3d-9b56-5a349dec2073",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag: 16:30 Uhr bis 18:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Donnerstag: 16:30 Uhr bis 18:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Ansprechpartner: Thomas Bertz",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/01ABBC50F4000000VV0AG80NVTF249LS#!/",
                "",
                2023,
                0,
                6311

            ),
            Mannschaft(
                "E2 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-E2-Junioren-1536x1066.jpg?alt=media&token=ff9b7dc9-60ce-490a-b3c8-9bf82392a9c5",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag: 17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Donnerstag: 17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner: Michael Schulz",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/fsv-kali-werra-tiefenort-ii-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/02IATTEK7S000000VS5489B2VU2I8R4H#!/",
                "",
                2023,
                0,
                6311
            ),
            Mannschaft(
                "E - Juniorinnen",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-E-Juniorinnen-1536x1066.jpg?alt=media&token=1aeffb32-ea84-48bf-a34f-fab10bb9257d",
                "Trainingszeiten:\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Ansprechpartner: Sebastian Brenn, Norbert Beck",
                "nachwuchs@kali-werra.de",
                "",
                "",
                "",
                2023,
                0,
                6311
            ),
            Mannschaft(
                "F1 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-F1-Junioren-1536x1066.jpg?alt=media&token=5a6f2008-dc14-4502-87a7-5be3a967316f",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag: 16:30 Uhr bis 18:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Donnerstag: 16:00 Uhr bis 17:30 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner: Stefan Munk",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/1819/team-id/012UNHUJO0000000VV0AG811VVETIMC3#!/",
                "",
                2023,
                0,
                6311
            ),
            Mannschaft(
                "F2 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-F2-Junioren-1536x1066.jpg?alt=media&token=8506f035-8009-4f30-b70e-d8b47ba73bd1",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag: 16:30 Uhr bis 18:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Donnerstag: 16:00 Uhr bis 17:30 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner: Matthias Möller",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/fsv-kali-werra-tiefenort-ii-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/02IATVGSV0000000VS5489B2VU2I8R4H#!/",
                "",
                2023,
                0,
                6311
            ),
            Mannschaft(
                "F3 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-F3-Junioren-1536x1066.jpg?alt=media&token=400ab1bf-3448-4e6b-9159-d6a56203892c",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag: 16:30 Uhr bis 18:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Donnerstag: 16:00 Uhr bis 17:30 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner: David Matthä",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/fsv-kali-werra-tiefenort-iii-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/02IAU02HDK000000VS5489B2VU2I8R4H#!/",
                "",
                2023,
                0,
                6311
            ),
            Mannschaft(
                "G - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-G-Junioren-1536x1066.jpg?alt=media&token=6adafb44-c8da-4b19-9530-5a7ba31b63e9",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Mittwoch: 16:30 Uhr bis 18:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Freitag: 16:00 Uhr bis 17:30 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Ansprechpartner: Georg Narbei",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/023K51PRN8000000VS548984VTFV1I8K#!/",
                "",
                2023,
                0,
                6311
            )

        )
        return mannschaft
    }

    fun loadNews(): List<News> {

        val news = mutableListOf(

            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FVorschau-HEIM-B-J._KaliWerra-Weilar_28.04.24.jpg?alt=media&token=54536665-5461-4970-aba1-31a4ac053aac",
                "SPITZENSPIEL UM DEN STAFFELSIEG",
                "27.April 2024",
                "Am Sonntag 28 April geht es im Waldstadion Kaffeetälchen heiß her Unsere B Junioren Mannschaft aktuell Tabellenführer in der Kreisliga Staffel 2 empfängt um 11 00 Uhr die zweitplatzierte SG ",
                "Am Sonntag, 28. April, geht es im Waldstadion Kaffeetälchen heiß her! Unsere B-Junioren-Mannschaft, aktuell Tabellenführer in der Kreisliga Staffel 2, empfängt um 11:00 Uhr die zweitplatzierte SG SV Venus 1920 Weilar zum direkten Duell um Platz 1. In diesem absoluten Topspiel kann es drei Spieltage vor Schluss de facto zu einer Vorentscheidung im Kampf um die Meisterschaft kommen.\n" +
                        "\n" +
                        "Sowohl Weilar als auch Kali Werra haben seit ihrem letzten Aufeinandertreffen im Oktober 2023 kein Pflichtspiel mehr verloren. Nun möchte sich die Kali-Elf für die damals erlittene knappe und torreiche 3:4-Hinspielniederlage unbedingt revanchieren. Im epischen Zweikampf um die Tabellenspitze müssen unsere Jungs sozusagen zuerst den “Venushügel” überwinden, um am Saisonende den Kreisliga-Olymp besteigen zu können.\n" +
                        "\n" +
                        "Die Jungs sind hochmotiviert, ein packendes Spiel steht bevor und das altehrwürdige Kaffeetälchen ruft zum Fußball-Spektakel! Wie immer bei den Spielen unserer B-Junioren werden die schönsten Mädchen der gesamten Umgebung im Publikum weilen, ganze Familien-Clans werden sich versammeln und das halbe Dorf wird auf den Beinen sein – nicht zuletzt, weil der Rost brennt! Lasst uns zusammen ein Fußballfest feiern. Die Mannschaft freut sich auf eure Unterstützung!"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FVorschau-Auswaerts_Ifta2-KaliWerra_27.04.24.jpg?alt=media&token=d052246b-4f35-4698-a9fc-169ab1cc8696",
                "HÄLT DIE SIEGES-SERIE GEGEN IFTA II?",
                "25.April 2024",
                "4 Siege am Stück da fehlen selbst uns die Worte Der Traum von Nummer 5 lebt Machen unsere Jungs am Samstag den nächsten großen Schritt zum Klassenerhalt Es wird das ",
                "4 Siege am Stück, da fehlen selbst uns die Worte. Der Traum von Nummer 5 lebt! Machen unsere Jungs am Samstag den nächsten großen Schritt zum Klassenerhalt? Es wird das vielleicht schwerste Spiel der Saison, denn Gastgeber SV Eintracht Ifta e.V. II ist als Schlusslicht zum Siegen verdammt. Dementsprechend werden die Hausherren jede Chance ergreifen, um unserer Mannschaft ein Bein zu stellen, damit sie selbst wieder auf die Füße kommen. Kein Spiel für zarte Gemüter, aber pure Erotik für alle, die es mögen, wenn es untenrum richtig zur Sache geht. Weshalb wir heute ausnahmsweise eine ganz besonders prickelnde Statistik für alle toleranten Singles und Paare unter euch präsentieren.\n" +
                        "\n" +
                        "Der ultimative Schw*nzvergleich:\n" +
                        "Wer hat den dicksten… (***)\n" +
                        "*** Eintrag in der Torjägerliste?\n" +
                        "\n" +
                        "in Ifta: Johannes-Sebastian Schwanz (4)\n" +
                        "\n" +
                        "in Tiefenort: Louis Täubner (6)\n" +
                        "\n" +
                        "Fazit: Vorteil Kali Werra\n" +
                        "\n" +
                        "WANN & WO:\n" +
                        "\n" +
                        "SG IFTA II vs. KALI WERRA\n" +
                        "\n" +
                        "SAMSTAG, 27.04.2024, 15:00 UHR\n" +
                        "\n" +
                        "SPORTPLATZ MIHLA\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FKaliWerra_FC02Barchfeld2_21.04.24.jpg?alt=media&token=38f9bf62-2983-4f79-bd81-119becac2bea",
                "VIERTER SIEG IN SERIE!",
                "23.April 2023",
                "Mit 4:0 löste Kali Werra die anspruchsvolle Aufgabe gegen den Tabellenvierten FC 02 Barchfeld II zu Hause im Waldstadion Kaffeetälchen mit Bravour Gegen nie aufsteckende Gäste fanden die Schwarz ",
                "\n" +
                        "\n" +
                        "Mit 4:0 löste Kali Werra die anspruchsvolle Aufgabe gegen den Tabellenvierten FC 02 Barchfeld II zu Hause im Waldstadion Kaffeetälchen mit Bravour! Gegen nie aufsteckende Gäste fanden die Schwarz-Gelben die richtigen Antworten auf die Angriffsbemühungen der Blauen aus Barchfeld-Immelborn und trafen stets zur rechten Zeit ins Volle.\n" +
                        "\n" +
                        "Sebastian Schließmann gelang der Auftakt zum Tiefenorter Torreigen nach zunächst druckvollem Beginn der Gastmannschaft. Pascal Scharfenberg bewies seinen Torriecher mit dem 2:0 kurz vor der Pause, und dass er an diesem Tag besonders gut roch, wurde auch ganz am Ende noch einmal deutlich, als er ein kurioses Missgeschick in der Barchfelder Verteidigung mit seinem zweiten Treffer “veredelte”. Zwischenzeitlich hatte der eingewechselte Oliver Leipold mit dem 3:0 die Uhren endgültig auf Heimsieg gestellt und die von allen Mannschaftsteilen überzeugende Vorstellung in einen ebenso beruhigenden wie angemessenen Vorsprung gegossen.\n" +
                        "\n" +
                        "Bemerkenswert waren die durchweg starken Leistungen der ewig jungen Kali-Routiniers auf dem Platz, die ihre geballte Erfahrung aus 111 Jahren Tiefenorter Fußballtradition in die Waagschale warfen und somit das zweite “zu Null” in Folge sicherstellten. Das trotz der ungemütlich kalten Witterung erneut zahlreich erschienene Publikum – u.a. wieder ganze Reisegrüppchen aus Berlin und München – goutierte den gelungenen Auftritt seiner Herzbuben mit Applaus und erwärmte sich neben den sportlichen Darbietungen auch am jahreszeitlich untypischen Glühwein mit zunehmendem Genuss! Glücksbesoffen kletterte unser Team derweil über den ominösen Strich, der in der Endabrechnung die Tabelle in Gut und Böse teilen wird, und da soll es von nun an auch bleiben. Amen!\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FBambinis-suchen-Verstaerkung_04-24_JG18.jpg?alt=media&token=f143ad27-73de-4bcc-a235-4f4d2b03d177",
                "BAMBINIS SUCHEN VERSTÄRKUNG!",
                "23.April 2024",
                "Die kleinsten Kali Kicker die G Junioren U7 suchen noch Jungs und Mädels ab dem Jahrgang 2018 und jünger die Lust zum Kicken im Nachwuchszentrum Kali Werra haben Das Schnuppertraining ",
                "\n" +
                        "\n" +
                        "Die kleinsten Kali-Kicker, die G-Junioren (U7), suchen noch Jungs und Mädels ab dem Jahrgang 2018 und jünger, die Lust zum Kicken im Nachwuchszentrum Kali Werra haben. Das Schnuppertraining findet jeden Mittwoch um 16:30 Uhr auf dem Sportplatz in Frauensee statt.\n" +
                        "\n" +
                        "Gerne einfach vorbeischauen! Für weitere Details steht Trainer Georg Narbei per E-Mail unter nachwuchs@kali-werra.de zur Verfügung.\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FVorschau-KaliWerra_FC02Barchfeld2_21.04.24.jpg?alt=media&token=74fcac59-68fa-4cb3-a65b-143dca6b3c22",
                "KALI WERRA GEGEN DIE SG FC 02 BARCHFELD II",
                "19.April 2024",
                "Wer hätte DAS vor ein paar Wochen gedacht Völlig losgelöst von der Erde schwebt die Kali Elf völlig schwerelos Die Erdanziehungskraft scheint überwunden alles läuft perfekt schon seit 3 Runden ",
                "\n" +
                        "\n" +
                        "Wer hätte DAS vor ein paar Wochen gedacht?!! Völlig losgelöst von der Erde schwebt die Kali-Elf völlig schwerelos! Die Erdanziehungskraft scheint überwunden, alles läuft perfekt, schon seit 3 Runden! Nach drei Siegen in Folge ist der Glaube an den Klassenerhalt im Kaffeetälchen größer denn je, aber gerade nach dem jüngsten Höhenflug gilt umso mehr: Jetzt bloß nicht abheben.\n" +
                        "\n" +
                        "Denn mit der Barchfelder Reserve ist am Sonntag eine echte Rasselbande in Tiefenort zu Gast, die aufgrund ihres vierten Tabellenplatzes und auch wegen der Resultate aus den letzten Vergleichen gegeneinander als Favorit gelten muss. Punktgleich mit der drittplatzierten Eintracht aus Eisenach greifen die sportlichen Gemeindevertreter aus Barchfeld-Immelborn nun sogar nach den Sternen. Sprich: Sie nehmen Kurs auf einen Medaillenrang. Ohnehin bekannt dafür, rassigen Duellen nicht aus dem Weg zu gehen, reisen unsere Gäste deshalb mit breiter Brust an.\n" +
                        "\n" +
                        "Dass die Formkurve der Kali-Kumpel gleichfalls nach oben zeigt, hat sich aber auch wenige Kilometer werraaufwärts gewiss herumgesprochen. Der Spielausgang ist deshalb selbst von erfahrenen Wettexperten nur schwer vorherzusagen. Wetter-Experten hingegen haben es da mit einer Prognose deutlich leichter: Ein Heimsieg würde über Tiefenort ein klares Stimmungshoch auslösen und einen Sturm der Begeisterung entfachen. So viel steht fest!\n" +
                        "\n" +
                        "Die besondere Statistik:\n" +
                        "\n" +
                        "Zum Einsatz kamen in dieser Saison\n" +
                        "\n" +
                        "in Tiefenort: 14 Nürnbergerinnen, 14 Wölfinnen (U17)\n" +
                        "\n" +
                        "in Barchfeld: 1 Nürnberger (Tim), 2 Wölfe (Daniel & Max)\n" +
                        "\n" +
                        "Fazit: Vorteil Kali Werra\n" +
                        "\n" +
                        "WANN & WO:\n" +
                        "\n" +
                        "KALI WERRA vs. FC 02 Barchfeld e.V. II\n" +
                        "\n" +
                        "SONNTAG, 21.04.2024, 15:00 UHR\n" +
                        "\n" +
                        "WALDSTADION KAFFEETÄLCHEN\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FA-Junioren_Kali_Werra_Posting.jpg?alt=media&token=5a6a3a30-08fd-432f-8df7-98a697ebaac1",
                "A-JUNIOREN - DIE MANNSCHAFT STEHT!",
                "18.April 2024",
                "Zur nächsten Saison hatten wir es uns zum Ziel gesetzt wieder mit einer A Junioren Mannschaft in den Spielbetrieb zu gehen Denn das gab es bei Kali Werra zuletzt vor",
                "\n" +
                        "\n" +
                        "Zur nächsten Saison hatten wir es uns zum Ziel gesetzt, wieder mit einer A-Junioren Mannschaft in den Spielbetrieb zu gehen. Denn das gab es bei Kali Werra zuletzt vor genau 20 Jahren, im Spieljahr 2004/05.\n" +
                        "\n" +
                        "Wir freuen uns heute verkünden zu dürfen, dass wir eine ambitionierte Mannschaft formiert haben, die ab der Saison 24/25 auf Punkte-Jagd gehen wird. Betreut wird das Team von Trainer Florian Scholz.\n" +
                        "\n" +
                        "Damit sind ab Sommer endlich wieder alle Nachwuchsmannschaften von Kali Werra mindestens einmal besetzt!\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FDiedorf_KaliWerra_14.04.24.jpg?alt=media&token=27e88121-fdf2-46a9-a0c3-e8ac0ae7f957",
                "KALI WERRA SIEGT IN DIEDORF",
                "16.April 2024",
                "Einen fulminant wichtigen 1:0 Auswärtssieg in der Rhön entführten die Tiefenorter Kali Kumpel am Sonntag beim direkten Konkurrenten im Kampf um den Klassenerhalt aus Diedorf Nach einem gelungenen Frühstart ",
                "Einen fulminant wichtigen 1:0-Auswärtssieg in der Rhön entführten die Tiefenorter Kali-Kumpel am Sonntag beim direkten Konkurrenten im Kampf um den Klassenerhalt aus Diedorf. Nach einem gelungenen Frühstart durch einen satten Distanzschuss von Paul Römhild, der unsere Farben bereits nach zwei Minuten in Führung brachte, behielt die erfahrene Kali-Defensive das gesamte Spiel über die Kontrolle über die Angriffsbemühungen der Gastgeber, die dem gut abgeschirmten Gästetor im Großen und Ganzen nur bei Standards gefährlich nahe kamen.\n" +
                        "\n" +
                        "Auf einem aufgrund der anhaltenden Trockenheit knochenharten Platz – durch etliche Löwenzahn-Blümchen in ein sympathisches Gelb getaucht – verpassten es unsere Jungs trotz guter Gelegenheiten in der zweiten Hälfte, den Sack eher zuzubinden. So blieb es bis zum Schluss ein hochspannendes und von beiden Seiten umkämpftes Match, nach dessen Abpfiff sich die zahlreichen Sympathisanten unserer Werkself glücklich auf den Heimweg begaben. Nach drei Siegen in Folge kletterte Kali Werra somit vorläufig um mehrere Plätze in der Tabelle nach oben. Nun heißt es: Nachlegen! Am besten schon im Heimspiel gegen den FC 02 Barchfeld e.V. II am Sonntag, 21. April um 15 Uhr. Also seid unbedingt wieder alle dabei, wenn es heißt: Hält die Super-Serie?!!"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FArbeitseinsatz_April24.jpg?alt=media&token=014700f9-28b0-4497-ba83-17b8eb78760e",
                "ARBEITSEINSATZ!",
                "14.April 2024",
                "\n" +
                        "\n" +
                        "Auch im April finden weitere Arbeitseinsätze zum Frühjahrsputz im Kaffeetälchen statt\n" +
                        "\n" +
                        "Termine\n" +
                        "\n" +
                        "Freitag 19.04.24 16:00 - 18:00 Uhr\n" +
                        "Samstag 20.04.24 ",
                "\n" +
                        "\n" +
                        "Auch im April finden weitere Arbeitseinsätze zum Frühjahrsputz im Kaffeetälchen statt.\n" +
                        "\n" +
                        "Termine:\n" +
                        "\n" +
                        "Freitag 19.04.24, 16:00 – 18:00 Uhr\n" +
                        "\n" +
                        "Samstag 20.04.24, 09:00 – 11:00 Uhr\n" +
                        "\n" +
                        "Wir setzen auf eure zahlreiche Unterstützung! Getreu dem Motto: Viele Hände, schnelles Ende.\n" +
                        "\n" +
                        "PS: Wer hat und kann bringt bitte Gartengeräte (Mäher, Rechen etc.) mit.\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FVorschau-Auswaerts_Diedorf-KaliWerra_14.04.24.jpg?alt=media&token=5da9d627-a9f7-4ba3-aabd-22c8a847f718",
                "KAMPF UM DIE KÖNIGSKLASSE",
                "14.April 2024",
                "In einer unfassbar engen Liga mit einem unglaublich dramatischen Rennen um den Klassenerhalt bestreitet unsere 1 Mannschaft am Sonntag den nächsten Hochkaräter gegen einen direkten Konkurrenten im nervenzerfetzenden Abstiegskampf.",
                "\n" +
                        "\n" +
                        "In einer unfassbar engen Liga mit einem unglaublich dramatischen Rennen um den Klassenerhalt bestreitet unsere 1. Mannschaft am Sonntag den nächsten Hochkaräter gegen einen direkten Konkurrenten im nervenzerfetzenden Abstiegskampf. Bei der SG Diedorf/Klings, die aktuell exakt einen Zähler mehr auf dem Punktekonto hat als unsere Schwarz-Gelben, will die Kali-Elf unter Beweis stellen, dass ihre Siege an den vergangenen beiden Spieltagen keine “Zweitagsfliegen” gewesen sind.\n" +
                        "\n" +
                        "Aber auch die Rhöner befinden sich in ausgezeichneter Form. Zöge man ausschließlich die Rückrundentabelle heran, dann träfe in diesem Spitzenspiel der Dritte (Diedorf) auf den Fünften (Tiefenort). Es geht also zugleich um nichts weniger als um den Einzug in die Champions League. Egal wie, solche Sechs-Punkte-Spiele sollte man tunlichst vermeiden zu verlieren, besser gar gewinnen. Allein schon, um die zuletzt wieder zart aufkeimenden Hoffnungen auf eine große Saisonabschluss-Sause unbedingt am Leben zu erhalten. Deshalb: Alle hin da – für Kali Werra!\n" +
                        "\n" +
                        "Die besondere Statistik:\n" +
                        "\n" +
                        "Bislang höchster Liga-Saisonsieg\n" +
                        "\n" +
                        "Diedorf: 5:2 (gegen Völkershausen)\n" +
                        "\n" +
                        "Tiefenort: 5:1 (gegen Behringen)\n" +
                        "\n" +
                        "Fazit: Vorteil Kali Werra\n" +
                        "\n" +
                        "WANN & WO:\n" +
                        "\n" +
                        "SG DIEDORF/RHÖN vs. KALI WERRA\n" +
                        "\n" +
                        "SONNTAG, 14.04.2024, 15:00 UHR\n" +
                        "\n" +
                        "SPORTPLATZ DIEDORF\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2F1.FCN_VFLW_23.03.24.jpg?alt=media&token=45d8a768-81e8-4914-80ed-0e78279e5db6",
                "VIDEO-REPORTAGE ZUM U17-BUNDESLIGA TESTSPIEL",
                "11.April 2024",
                "Ein sehr schöner Bericht des Südthüringer Regionalfernsehens über das U17 Bundesliga Testspiel der 1 FC Nürnberg Frauen gegen den VfL Wolfsburg Frauenfußball hier bei uns im altehrwürdigen Waldstadion Kaffeetälchen. ",
                "\n" +
                        "\n" +
                        "Ein sehr schöner Bericht des Südthüringer Regionalfernsehens über das U17-Bundesliga-Testspiel der 1. FC Nürnberg Frauen gegen den VfL Wolfsburg Frauenfußball hier bei uns im altehrwürdigen Waldstadion Kaffeetälchen! Es war ein echtes Highlight für die jungen Spielerinnen und die vielen Fans. Vielen Dank an den 1. FC Nürnberg und den VfL Wolfsburg für den Besuch in Tiefenort und bis bald!\n" +
                        "\n" +
                        "Für die Video-Reportage hier klicken.\n" +
                        "https://www.srf-online.de/mediathek/6660/Bundesliga_im_Kaffetaelchen.html"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FKaliWerrra_Spinning_B-Junioren_06.04.24.jpg?alt=media&token=5513868f-0bc5-40c8-9c7b-e94efbdc7817",
                "FIT FÜR DEN SAISON_ENDSPURT",
                "11.April 2024",
                "Am vergangenen Wochenende bereiteten sich unsere B Junioren mit einem Spinning Kurs im JOY Fitness Bad Salzungen auf die fünf letzten Partien der Saison vor Die intensive Einheit auf dem ",
                "\n" +
                        "\n" +
                        "Am vergangenen Wochenende bereiteten sich unsere B-Junioren mit einem Spinning-Kurs im JOY Fitness Bad Salzungen auf die fünf letzten Partien der Saison vor. Die intensive Einheit auf dem Rad mit anschließendem Krafttraining absolvierten unsere Jungs hochmotiviert und ohne Probleme.\n" +
                        "\n" +
                        "Wir drücken die Daumen für die anstehenden Spiele. Konditionell sollte jedenfalls nichts mehr schief gehen!\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FKaliWerra-Behringen07.04.24.jpg?alt=media&token=8d3c4313-0a34-4a0b-9ccf-a31f3e3e7793",
                "WICHTIGER HEIMSIEG GEGEN BEHRINGEN",
                "9.April 2024",
                "Kali Werra mit einer starken Leistung und einem überlebenswichtigen 5 1 Heimsieg gegen Behringen im dramatischen Kampf um den Klassenerhalt Fußballatmosphäre vom Feinsten mit dem besseren Ende für die schwarz ",
                "\n" +
                        "\n" +
                        "Kali Werra mit einer starken Leistung und einem überlebenswichtigen 5:1-Heimsieg gegen Behringen im dramatischen Kampf um den Klassenerhalt. Fußballatmosphäre vom Feinsten mit dem besseren Ende für die schwarz-gelbe Werkself aus Tiefenort! In einer sehenswerten Partie am 7. April 2024 mit vielen Höhepunkten schöpft der Traditionsverein aus Thüringen neue Hoffnung für den Verbleib in der neunten Bundesliga. Gute Besserung an die beiden verletzten Kali-Spieler Jannik Sinn und Maurice Kropf!\n" +
                        "\n" +
                        "Torschützen für schwarz-gelb:\n" +
                        "\n" +
                        "Erik Limpert, Dusty Bänsch (3), Steven Ritz\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FVorschau-HEIM_vs_FSV_Behringen.jpg?alt=media&token=b667ce3f-5cc7-4729-8068-b98542bf0036",
                "DIREKTES DUELL IM ABSTIEGSKAMPF",
                "4.April 2024",
                "Ein absoluter Kracher im Kampf um den Klassenerhalt lockt am Sonntag hoffentlich eine große Kulisse ins legendäre Waldstadion Kaffeetälchen wo Kali Werra mit dem FSV 1968 Behringen e V sowohl",
                "\n" +
                        "\n" +
                        "Ein absoluter Kracher im Kampf um den Klassenerhalt lockt am Sonntag hoffentlich eine große Kulisse ins legendäre Waldstadion Kaffeetälchen, wo Kali Werra mit dem FSV 1968 Behringen e.V. sowohl das Team der Stunde als auch einen direkten Konkurrenten im Ringen um das rettende Ufer empfängt. Die Gäste holten aus den letzten sieben Liga-Partien nicht weniger als fünf Siege (plus ein Unentschieden beim meilenweit enteilten und immer noch ungeschlagenen Tabellenführer in Leimbach). Die Kali-Elf wiederum hat bei ihrem vollkommen verdienten Auswärtssieg in Völkershausen genügend Selbstvertrauen getankt, um nun mit ihren Fans im Rücken auch die nächste enorm wichtige Auseinandersetzung mit Schwung und unbändigem Siegeswillen anzugehen.\n" +
                        "\n" +
                        "Sowohl auf dem Platz als auch von den Rängen braucht es dafür vollsten Einsatz, damit die Punkte am Ende zu Hause im schönsten Stadion der Welt verbleiben. Das mit 0:2 verloren gegangene Hinspiel in Behringen dürfte Warnung genug für alle Kali-Kumpel sein, die Schwere der Aufgabe nicht zu unterschätzen. Kurios: Ihren bisher besten Tabellenplatz in dieser Saison belegten die Behringer nach dem allerersten Spieltag, an dem sie – und jetzt kommt’s – SPIELFREI waren. Dennoch sollte es das erklärte Ziel der Männer von Kali-Trainer Pierre Cravaack sein, unsere Gäste auch diesmal gar nicht erst ins Spiel kommen zu lassen, um stattdessen selbst in der Tabelle weiter nach vorne zu rücken.\n" +
                        "\n" +
                        "Die besondere Statistik:\n" +
                        "\n" +
                        "Beste Saisonplatzierung 2023/24\n" +
                        "\n" +
                        "Tiefenort: Rang 4 (am 2. Spieltag)\n" +
                        "\n" +
                        "Behringen: Rang 10 (am 1. Spieltag)\n" +
                        "\n" +
                        "Fazit: Vorteil Kali Werra\n" +
                        "\n" +
                        "WANN & WO:\n" +
                        "\n" +
                        "KALI WERRA vs. FSV 1968 BEHRINGEN\n" +
                        "\n" +
                        "SONNTAG, 07.04.2024, 15:00 UHR\n" +
                        "\n" +
                        "WALDSTADION KAFFEETÄLCHEN\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FWalter_Schaefer_KaliWerra.jpg?alt=media&token=b201dc3e-1a66-4407-9740-a0123bd302fe",
                "EINMAL KALI, IMMER KALI!",
                "2.April 2024",
                "Jeder Verein lebt vom Engagement seiner Mitglieder, und wir können uns glücklich schätzen, dass Kali Werra auf fantastische Menschen zählen darf, die mit Herzblut und Leidenschaft das Schicksal unseres Traditionsklubs",
                "Jeder Verein lebt vom Engagement seiner Mitglieder, und wir können uns glücklich schätzen, dass Kali Werra auf fantastische Menschen zählen darf, die mit Herzblut und Leidenschaft das Schicksal unseres Traditionsklubs begleiten und mitgestalten. Häufig wirken sie im Verborgenen, aber heute möchten wir exemplarisch einen von ihnen einmal herausheben, der just am 1. April ein ganz besonderes Jubiläum feiert:\n" +
                        "\n" +
                        "Unser Walter Schäfer, als aktiver Spieler in jüngeren Jahren und später als Manschaftsbetreuer und “Mädchen für alles” nicht aus dem Vereinsleben der Tiefenorter Fußballer wegzudenken, ist auf den 1. April 2024 genau seit 65 Jahren ein treues Vereinsmitglied von Kali Werra. In guten wie in schwierigen Zeiten hat er unserer Kali-Elf stets die Treue gehalten und sich eingebracht, wo er konnte. Dafür möchten wir ihm Danke sagen – ebenso wie den vielen anderen treuen Seelen und guten Geistern, die vorbildlich vorleben, was ehrenamtliches Engagement bewirken kann. Ihr alle seid Kali Werra, und ihr seid großartig, so wie ihr seid.\n" +
                        "\n" +
                        "P.S. Falls nun jemand spontan ebenfalls ein Teil von Kali Werra werden möchte: Sehr gern! Allen Neumitgliederinnen und -mitgliedern, die sich im April diesen Jahres unserem Verein anschließen, möchte Kali-Werra-Vorstand Markus Peter in 65 Jahren dann höchstpersönlich zu ihrem Mitgliedschafts-Jubiläum gratulieren. Optimistisch wie er nun mal ist, hat der rüstige Mittvierziger dafür sogar schon eine Termin-Erinnerung in seinen Kalender für den 1. April 2089 eingetragen. Kein Aprilscherz!\n" +
                        "\n" +
                        "\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FFCN-VfL.jpg?alt=media&token=a6ac00b4-958f-49dc-ad74-41aca24b53f5",
                "U17-BUNDESLIGA IM KAFFEETÄLCHEN",
                "28.März 2024",
                "Vier Jahreszeiten an einem Tag und das gleich mehrfach während des 90 minütigen Bundesliga Testspiels zwischen den U17 Juniorinnen des 1 FC Nürnberg und des VfL Wolfsburg erlebten die über ",
                "Vier Jahreszeiten an einem Tag und das gleich mehrfach während des 90-minütigen Bundesliga-Testspiels zwischen den U17-Juniorinnen des 1. FC Nürnberg und des VfL Wolfsburg erlebten die über 300 Fans am Samstag im stimmungsvollen Tiefenorter Waldstadion Kaffeetälchen. Die jungen Akteurinnen auf dem gut präparierten Platz ebenso wie ihre begeisterte Anhängerschaft auf den traditionsreichen Traversen trotzten den teilweise ungemütlichen Wetterbedingungen mit bester Laune und einem flotten Fußballspiel, dass die Jung-Wölfinnen mit 3:1 für sich entscheiden konnten. Ein fantastisches Erlebnis nicht nur für die einheimischen Fußballverrückten, sondern auch für die talentierten Kickerinnen der beiden Bundesligaclubs, die sich nach Spielende ausgesprochen herzlich für die Gastfreundschaft der Tiefenorter bedankten. Es war uns ein Fest!"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FErgebnis-Auswaerts-Voelkershausen.jpg?alt=media&token=ebc7b01f-354a-4cb7-ad18-5f1b7002b16c",
                "4:2 AUSWÄRTSSIEG IN VÖLKERSHAUSEN",
                "24.März 2024",
                "Kali Werra holt den immens wichtigen Dreier in Völkershausen und klettert in der Tabelle um einen Rang nach oben Mann des Spiels war Louis Täubner der gleich zwei Tore erzielte ",
                "Kali Werra holt den immens wichtigen Dreier in Völkershausen und klettert in der Tabelle um einen Rang nach oben. Mann des Spiels war Louis Täubner, der gleich zwei Tore erzielte. Er eröffnete den Torreigen in vollendeter Eleganz und erzielte mit purer Willenskraft auch das vorentscheidende vierte Tor für Tiefenort (hier zu sehen). Die weiteren Kali-Treffer erzielten Dusty Bänsch in bester Torjägermanier und Maurice Kropf mit einem wunderbaren Schlenzer in den Winkel. Fazit: Die Bildqualität ist zwar nur so, als wäre das Video mit dem Toaster aufgenommen worden, die Stimmung im Kali-Lager ist dafür heute umso besser."
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FVorschau-Auswaerts_Voelkershausen-KaliWerra-.jpg?alt=media&token=ea4094e5-a7cc-4b65-a68b-d6615ad54bbf",
                "KALI WERRA GEGEN FSV VÖLKERSHAUSEN",
                "23.März 2024",
                "Heute können wir es kurz machen Auswärts in Völkershausen ist es immer schwer trotzdem müssen Punkte her Schon allein aus ästhetischen Gründen Denn der unbarmherzige Schein der roten Laterne wirft ",
                "\n" +
                        "\n" +
                        "Heute können wir es kurz machen: Auswärts in Völkershausen ist es immer schwer, trotzdem müssen Punkte her. Schon allein aus ästhetischen Gründen. Denn der unbarmherzige Schein der roten Laterne wirft kein gutes Licht auf unsere 1. Mannschaft, die derzeit das Tabellenende “ziert”. Anders als Julian Nagelsmann können wir auch nicht einfach alle Schwarz-Gelben (bis auf einen) zu Hause lassen und stattdessen die halbe Mannschaft des VfB Stuttgart aufstellen, um den Turnaround zu schaffen. Es ist wahrlich vertrackt! Eine Geheimwaffe haben wir aber noch: Wie ihr hoffentlich alle mitbekommen habt, findet am Samstag um 14:00 Uhr ein U17-Bundesliga-Testspiel zwischen dem 1. FC Nürnberg und dem VfL Wolfsburg bei uns in Tiefenort statt. (Schon allein aus ästhetischen Gründen wird es sich dabei um Damenmannschaften handeln.) Jedenfalls hoffen wir, dass sich unsere Kali-Jungs zusammen mit euch da mal ein Auge holen, und zwar, was das Fußballerische anbetrifft. Von den Mädels lernen, heißt siegen lernen! Und Siege haben wir wirklich bitter nötig. Darum: Am Samstag alle ins Kaffeetälchen und am Sonntag dann nach Völkershausen, um der Kali-Elf den Rücken zu stärken. Danke für euren Support!\n" +
                        "\n" +
                        "Die besondere Statistik:\n" +
                        "\n" +
                        "Völkershausen: z.Zt. 39 Gegentore\n" +
                        "\n" +
                        "Tiefenort: z.Zt. 37 Gegentore\n" +
                        "\n" +
                        "Fazit: Vorteil Kali Werra\n" +
                        "\n" +
                        "WANN & WO:\n" +
                        "\n" +
                        "FSV BW VÖLKERSHAUSEN vs. KALI WERRA\n" +
                        "\n" +
                        "SONNTAG, 24.03.2024, 14:00 UHR\n" +
                        "\n" +
                        "STADION AM ÖCHSENBERG\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FBuLi-Freundschaftspiel_1.FC_Nuernberg-VfL-Wolfsburg.jpg?alt=media&token=fc76477c-74e0-4ac3-9ee7-e326168406c2",
                "EIN HAUCH VON BUNDESLIGA IM KAFFEETÄLCHEN",
                "19.März 2024",
                "Erstliga-Flair verströmen zwei große deutsche Fußballvereine am Samstag, 23. März, in einem der schönsten Amateurstadien Deutschlands. Die U17-Bundesliga-Juniorinnen des 1. FC Nürnberg und des VfL Wolfsburg geben sich – im",
                "\n" +
                        "\n" +
                        "Erstliga-Flair verströmen zwei große deutsche Fußballvereine am Samstag, 23. März, in einem der schönsten Amateurstadien Deutschlands. Die U17-Bundesliga-Juniorinnen des 1. FC Nürnberg und des VfL Wolfsburg geben sich – im wahrsten Sinne des Wortes – die Ehre im altehrwürdigen Tiefenorter Waldstadion Kaffeetälchen. Das reizvolle Aufeinandertreffen der beiden Bundesligisten verspricht ein rasantes Highlight für alle Fans, die einmal ein Fußballspiel auf höchstem technischen und taktischen Niveau live in unserer Region miterleben möchten.\n" +
                        "\n" +
                        "Der 1. FCN als einer der traditionsreichsten deutschen Fußballclubs verfügt über eine riesige Anhängerschar bis hin in Thüringer Gefilde. Rein sportlich haben dabei die Nürnberger Frauen gegenüber ihren männlichen Club-Kollegen derzeit sogar die Nase vorn. Der VfL Wolfsburg wiederum ist als zweimaliger Gewinner der UEFA Women’s Champions League sowie als deutscher Bundesliga-Rekordmeister und Rekordpokalsieger der Damen seit Jahren das Maß aller Dinge im deutschen Frauenfußball. Da verwundert es kaum, dass auch die U17-Juniorinnen beider Vereine eine gute Rolle in der Bundesliga spielen: Nürnberg steht aktuell auf Rang 5 in der Staffel Süd, Wolfsburg momentan auf Rang 3 in der Staffel Nord/Nordost.\n" +
                        "\n" +
                        "Die Teams mit ihren sympathischen, hochtalentierten Kickerinnen nutzen nun die günstige geografische Lage des weithin beliebten Kultstadions in Thüringen zu einem Testspiel-Kracher auf halber Wegstrecke zwischen beiden Städten. Neben der willkommenen Möglichkeit eines sportlich aufschlussreichen Vergleiches zweier spielstarker Vertretungen aus verschiedenen Bundesligastaffeln ist es beiden Klubs ebenso wie ihren Gastgebern vom FSV Kali Werra Tiefenort ein Herzensanliegen, auch an Standorten abseits der Zentren des Profifußballs neue Fans und Aktive für den Frauenfußball zu begeistern. Nach der Partie stehen die Trainer und Spielerinnen deshalb allen kleinen und großen Besucherinnen und Besuchern gern für Gespräche und Fragen rund um die schönste Nebensache der Welt zur Verfügung.\n" +
                        "\n" +
                        "Für den Traditionsverein Kali Werra, der sich zum Ziel gesetzt hat, durch eine hervorragende Jugendarbeit langsam, aber stetig wieder an sportlich bessere Zeiten anzuknüpfen, bedeutet das Zustandekommen dieses Spiels eine große Freude. Ein bisschen sind die Gastgeber auch stolz darauf, dass ihr vielfältiges ehrenamtliches Engagement selbst bei den Branchengrößen des deutschen Fußballs auf Resonanz stößt. Gern möchte man den namhaften Gästen im Kaffeetälchen eine bundesligareife Bühne bieten. Und wer weiß: Vielleicht sehen wir am Samstag ja auch die eine oder andere künftige Nationalspielerin, die Deutschland etwa bei der WM 2027 vertreten wird, für die sich der DFB zusammen mit dem belgischen und dem niederländischen Fußballverband als Ausrichter beworben hat?\n" +
                        "\n" +
                        "WANN & WO:\n" +
                        "\n" +
                        "1. FC Nürnberg – VfL Wolfsburg\n" +
                        "U17 Juniorinnen\n" +
                        "Samstag, 23. März, 14:00 Uhr\n" +
                        "Waldstadion Kaffeetälchen, Tiefenort\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FVorschau-Auswaerts_Ruhla_vs_Kali_Werra.jpg?alt=media&token=3ebf4e2d-031e-4fd3-b5e4-96a35c51764c",
                "KALI WERRA GEGEN DIE SG EFC RUHLA II",
                "16.März 2024",
                "Im Duell zweier klassischer Zweitliga Klubs immerhin verbrachte Ruhla einst 3 Jahre in der zweithöchsten Spielklasse der Republik und Kali Werra sogar ganze 20 Tendenz steigend benötigt unsere 1 Mannschaft ",
                "\n" +
                        "\n" +
                        "Im Duell zweier klassischer Zweitliga-Klubs – immerhin verbrachte Ruhla einst 3 Jahre in der zweithöchsten Spielklasse der Republik und Kali Werra sogar ganze 20 (Tendenz steigend) – benötigt unsere 1. Mannschaft erneut jeden Punkt, den sie irgendwie ergattern kann. Leicht wird das nicht, denn während unsere Kali-Elf zuletzt auswärts gegen Suhltal unterlag, holte die Ruhlaer Reserve zuvor ebendort ihren ersten und bislang einzigen Ligasieg im Jahr 2024. Damit so schnell kein zweiter folgt, kommt es darauf an, dass die Abwehr unserer Schwarz-Gelben am Sonntag von der ersten bis zur letzten Spielminute möglichst dicht hält. Und zwar mindestens so dicht wie die bekannten Manufakturerzeugnisse aus der Bergstadt im Thüringer Wald, über die der Volksmund früher gern reimte: “Ruhla-Uhren – wasserdicht, rein geht’s Wasser, raus geht’s nicht!” Apropos Wasser: Das Hinspiel im Kaffeetälchen endete im Dauerregen mit 0:0.\n" +
                        "\n" +
                        "Die besondere Statistik:\n" +
                        "\n" +
                        "Ewige Tabelle der DDR-Liga\n" +
                        "\n" +
                        "Ruhla: Platz 127\n" +
                        "\n" +
                        "Tiefenort: Platz 25\n" +
                        "\n" +
                        "Fazit: Vorteil Kali Werra\n" +
                        "\n" +
                        "WANN & WO:\n" +
                        "\n" +
                        "SG RUHLA/WUTHA II vs. KALI WERRA\n" +
                        "\n" +
                        "SONNTAG, 17.03.2024, 14:00 UHR\n" +
                        "\n" +
                        "SPORTPLATZ WUTHA-FARNRODA\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FKaliWerra_Ergebnisse.jpg?alt=media&token=53b62fae-0a3b-4656-a80d-5059bbdaf7ad",
                "NIEDERLAGE GEGEN DIE SUHLTAL-ELF",
                "13.März 2024",
                "Durch ein Suhltal der Tränen gingen die Kali Fans am Wochenende denn unsere 1 Mannschaft unterlag den Fortunen in Fernbreitenbach letztlich nicht unverdient mit 0:2 Nach rechtzeitigem Anpfiff gerieten ",
                ""
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FVorschau-Auswaerts_Suhltal_vs_Kali_Werra.jpg?alt=media&token=f5b0a9fd-7212-495b-83e9-99a07cbc9714",
                "KALI WERRA ZU GAST IM SUHLTAL",
                "10.März 2024",
                "Oh wie war das schön am letzten Sonntag im Kaffeetälchen So darf soll muss es weitergehen Mit drei Punkten mehr als zuvor im Reisegepäck unternimmt unsere 1 Mannschaft nun einen ",
                "\n" +
                        "\n" +
                        "Oh, wie war das schön am letzten Sonntag im Kaffeetälchen! So darf, soll, muss es weitergehen. Mit drei Punkten mehr als zuvor im Reisegepäck unternimmt unsere 1. Mannschaft nun einen Ausflug zu einem weiteren etablierten Team aus der oberen Tabellenhälfte. Die Suhltaler, gegen die das Hinspiel zu Hause leider mit 0:1 verloren ging, bestimmen seit vielen Jahren das sportliche Niveau in der Liga entscheidend mit und landeten in der vergangenen Dekade stets unter den Top 6. Aktuell nehmen sie ebenfalls wieder den 6. Rang in der Tabelle ein. Allerdings gelang ihnen in der Liga seit 6 Spielen hintereinander kein voller Erfolg mehr.\n" +
                        "\n" +
                        "Es steckt also eine ganze Menge 6-Appeal in dieser Partie, die ihren Reiz auch daraus bezieht, dass Julian Nagelsmann nur wenige Tage später seinen Kader für die anstehenden Länderspiele gegen Frankreich und die Niederlande bekanntgeben will. Da der Bundestrainer hierfür bereits “einige Überraschungen” angekündigt hat, dürften unsere Spieler am Wochenende extra-motiviert sein, sich mit einer guten Leistung für höhere Aufgaben zu empfehlen. Denn was wäre schließlich überraschender als die Berufung eines geilen Kickers aus der Kreisliga? Wir jedenfalls würden es feiern, fast so sehr wie einen starken Auftritt unserer Kali-Elf, mit dem sie die in der Vorwoche gewonnenen Punkte veredeln könnte. Die schwarz-gelben Daumen dafür sind fest gedrückt!\n" +
                        "\n" +
                        "Die besondere Statistik:\n" +
                        "\n" +
                        "Ligabilanz seit Oktober 2023\n" +
                        "\n" +
                        "Suhltal: 2 Siege, 2 Remis = 8 Pkt.\n" +
                        "\n" +
                        "Tiefenort: 3 Siege, 1 Remis = 10 Pkt.\n" +
                        "\n" +
                        "Fazit: Vorteil Kali Werra\n" +
                        "\n" +
                        "WANN & WO:\n" +
                        "\n" +
                        "SG FORTUNA SUHLTAL vs. KALI WERRA\n" +
                        "\n" +
                        "SONNTAG, 10.03.2024, 14:00 UHR\n" +
                        "\n" +
                        "SPORTPLATZ FERNBREITENBACH\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FNeue_Schiris%2Cjpg.webp?alt=media&token=7bee3e56-899c-4bac-86aa-35dd658da0e2",
                "NEUE SCHIEDRICHTER FÜR KALI WERRA TIEFENORT",
                "6.März 2024",
                "Nachdem unser Verein durch die Gründung des Nachwuchszentrums Kali Werra im Jahr 2022 nun mittlerweile 17 Mannschaften im regelmäßigen Spielbetrieb stellt wuchs entsprechend auch der Bedarf an Schiedsrichtern ",
                "\n" +
                        "\n" +
                        "Nachdem unser Verein durch die Gründung des Nachwuchszentrums Kali Werra im Jahr 2022 nun mittlerweile 17 Mannschaften im regelmäßigen Spielbetrieb stellt, wuchs entsprechend auch der Bedarf an Schiedsrichtern.\n" +
                        "\n" +
                        "Deshalb freut es uns umso mehr, dass wir mit Sandra Matthä, Justin Morgenweck, Julius Koch, Frederik Klein und Thomas Klein fünf (!!) Fußball-Enthusiasten für die wichtigste Position auf dem Platz gewinnen konnten. Den notwendigen Schiedsrichter-Lehrgang, der bereits im Januar stattfand, konnten sie allesamt erfolgreich abschließen und vertreten ab sofort unseren Verein als Unparteiische im Spielbetrieb. Das Kali-Werra-Schiedsrichterteam besteht nun mit unseren zwei bisherigen Schiris Finn Domann und Adrian Borrs aus insgesamt sieben Sportfreunden!\n" +
                        "\n" +
                        "Wir finden das großartig und bedanken uns herzlichst für euer Engagement in unserem Verein und im Amateurfußball!\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FTrainingsauftakt_Nachwuchs.jpg?alt=media&token=c3ef4dfd-6b2e-4897-8e0c-541b22094bee",
                "RÜCKRUNDEN - VORBEREITUNG IM NACHWUCHSBEREICH",
                "6.März.2024",
                "Auch die 14 Junioren Mannschaften starteten nach einer Vielzahl von erfolgreichen Hallenturnieren mit den Vorbereitungen auf die Punktspiele der Rückrunde Neben intensiven Trainingseinheiten standen bei zwei Mannschaften bereits erste Testspiele ",
                "\n" +
                        "\n" +
                        "Auch die 14 Junioren-Mannschaften starteten nach einer Vielzahl von erfolgreichen Hallenturnieren mit den Vorbereitungen auf die Punktspiele der Rückrunde. Neben intensiven Trainingseinheiten standen bei zwei Mannschaften bereits erste Testspiele auf dem Programm.\n" +
                        "\n" +
                        "Die B-Junioren absolvierten ein Trainingsspiel gegen die Männermannschaft des SV Blau Weiß 09 Kieselbach. Unsere C-Junioren testeten mit den Gegnern SV Thuringia Struth-Helmershof und dem SV Rot-Weiß Buttlar gegen Mannschaften auf Kreis- und Landesebene.\n" +
                        "\n" +
                        "In den verschiedenen Altersklassen sind darüber hinaus weitere Testspiele für eine optimale Vorbereitung geplant.\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FKali-Werra-E.-Eisenach.jpg?alt=media&token=01fa272e-0a1b-41d0-8378-2e13bd5d688f",
                "KALI WERRA SIEGT 2:1 GEGEN EISENACH",
                "5.März.2024",
                "Blauer Himmel Sonnenschein prima Kulisse und ein starker Beginn der Kali Elf gegen ein Topteam der Liga Der Sonntagnachmittag begann verheißungsvoll für die zahlreich erschienenen kleinen und großen Fußballfreundinnen und ",
                "\n" +
                        "\n" +
                        "Blauer Himmel, Sonnenschein, prima Kulisse und ein starker Beginn der Kali-Elf gegen ein Topteam der Liga. Der Sonntagnachmittag begann verheißungsvoll für die zahlreich erschienenen kleinen und großen Fußballfreundinnen und -freunde im frühlingsbunt herausgeputzten Kaffeetälchen. Mit bester Laune hatten sie trotz misslicher Lage in der Tabelle den Weg ins Waldstadion auf sich genommen, um unseren zum Punkten verdammten Schwarz-Gelben den Rücken zu stärken und die Füße zu küssen – Letzteres allerdings nur im Falle eines Heimsieges, wohlgemerkt.\n" +
                        "\n" +
                        "Aus nah und fern war das treue Tiefenorter Publikum herbeigeströmt. Neben etlichen Lokalgrößen mischten sich traditionell auch wieder Groundhopper aus Dresden, Stuttgart, Hamburg, Düsseldorf und München unters ortsübliche Volk. Selbst Fußballreisende aus dem fernen Österreich kamen eigens angedüst für diese – zugegebenermaßen hoch attraktive – Neuntligabegegnung in Ostdeutschlands bekanntester Stadionperle. Und was für welche! Mit Sebastian Leimhofer war ein waschechter Fußballprofi aus der Alpenrepublik darunter, der tags zuvor gerade noch selbst in der 2. Bundesliga für den Kapfenberger SV gegen Schwarz Weiß Bregenz auf dem Platz gestanden hatte. Da dieses Spiel für seine Mannschaft verloren gegangen war, hoffte er nun umso inständiger auf einen Erfolg von Kali Werra, bevor er nach Spielschluss wieder auf die Tube drücken musste, um rechtzeitig zurück zur montäglichen Trainingseinheit im Nachbarland zu sein. Für alle Transfermarkt.de-Insider: Unser spontanes Angebot, zukünftig doch lieber für Tiefenort aufzulaufen, um sich die langen Fahrten zu ersparen, entlockte dem jungen Mann ein hocherfreutes Lächeln. Wir deuten dies mal als feste Zusage und planen ihn als ersten Neuzugang für 2025 ein. So lange läuft nämlich noch sein Vertrag beim Ex-Erstligisten in Kapfenberg. Ein Wechsel an den Krayenberg als nächster Schritt auf der Karriereleiter ist dann nur folgerichtig!\n" +
                        "\n" +
                        "Es gäbe noch so viel mehr zu erzählen über diesen formidablen Fußballnachmittag, der sich dann doch wieder so anließ wie immer: Trotz bester Gelegenheiten für unsere Jungs gingen kurz nach der Pause die Gäste in Führung. Das kennen wir ja leider zur Genüge. Wie es viel öfter sein sollte, folgte anschließend aber eine überraschende Wendung: Kali Werra schüttelte sich kurz, machte einfach unbeirrt weiter und kam durch Fredi Klein zum verdienten Ausgleich. Die Kali-Abwehr verteidigte aufopferungsvoll alles weg, was ihr vor die Füße kam, und kurz vor Schluss explodierten dann die Endorphine: Louis Täubner bugsierte nach einem verlängerten Freistoß irgendwie den Ball über die Linie und brachte damit den ersten Heimsieg 2024 unter Dach und Fach, den auch ein Pfostentreffer für die Eisenacher nicht mehr verhindern konnte. Drei goldene Punkte für unsere Mannschaft und fürs Gemüt, die sich irgendwie genau richtig anfühlten in dem Moment. Nur das mit dem Füße küssen, das würden wir dann vielleicht doch lieber in die Hände einer erfahrenen Hobby-Podologin legen. Bewerbungen für dieses Ehrenamt bitte vertrauensvoll per Email!\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FVorschau-HEIM_vs_E.Eisenach.jpg?alt=media&token=b63b890a-308a-4adf-b91f-fcd96be72b41",
                "KALI WERRA EMPFÄNGT EINTRACHT EISENACH",
                "1.März.2024",
                "AUSGERECHNET mit einer besonders schmerzlichen Niederlage der Sorte 8220 ausgerechnet 8221 startete unsere 1 Mannschaft am vergangenen Sonntag in die Rückrunde Denn AUSGERECHNET Ex Kali Kicker Ricardo Weber sorgte mit ",
                "\n" +
                        "\n" +
                        "AUSGERECHNET mit einer besonders schmerzlichen Niederlage der Sorte “ausgerechnet” startete unsere 1. Mannschaft am vergangenen Sonntag in die Rückrunde. Denn AUSGERECHNET Ex-Kali-Kicker Ricardo Weber sorgte mit seinem Doppelpack für den knappen Marksuhler Erfolg gegen eine tapfer kämpfende Tiefenorter Kali-Elf, die AUSGERECHNET in der letzten Minute der Partie das Spielglück verließ, so dass ihr der bis dahin zum Greifen nahe Punktgewinn noch aus den Händen glitt. Und AUSGERECHNET jetzt kommt mit der Eintracht aus Eisenach ein weiterer spielstarker Gegner ins Kaffeetälchen, der aktuell auf Rang 2 liegend die beste Platzierung seiner Vereinsgeschichte anstrebt und sich anschickt, die jahrzehntelang zementierten fußballerischen Kräfteverhältnisse unterhalb der Wartburg neu zu ordnen und dem traditionsreichen FC Eisenach die prestigeträchtige Rolle des Platzhirsches streitig zu machen.\n" +
                        "\n" +
                        "Dennoch werden unsere Gäste durchaus mit gemischten Gefühlen ins unzweifelhaft schnuckeligste Waldstadion der Welt anreisen, denn in den bislang erst drei Ligavergleichen zwischen der Eintracht und Kali Werra trugen ausnahmslos unsere Schwarz-Gelben den Sieg davon. Zuletzt im Hinspiel gewannen die Kali-Kumpel in der Wartburgstadt mit 3:1. Gegen eine Fortführung dieser stolzen Serie hätten wohl nur die wenigsten Fußballfans im Kali-Revier etwas einzuwenden, zumal ein Erfolgserlebnis fraglos frische Kräfte im Kampf um den Klassenerhalt freisetzen würde. Frisch, frech, fröhlich, frei (von Abstiegssorgen) – so sehen wir unsere Jungs schließlich am liebsten. Ob aber AUSGERECHNET die Eisenacher das auch so sehen?\n" +
                        "\n" +
                        "Die besondere Statistik:\n" +
                        "\n" +
                        "Aus Eisenach: Miss Ostdeutschland 2014\n" +
                        "\n" +
                        "Aus Tiefenort: Miss Germany 2021\n" +
                        "\n" +
                        "Germany > Ostdeutschland\n" +
                        "\n" +
                        "Fazit: Vorteil Tiefenort\n" +
                        "\n" +
                        "WANN & WO:\n" +
                        "\n" +
                        "KALI WERRA vs. FSV Eintracht Eisenach e.V.\n" +
                        "\n" +
                        "SONNTAG, 03.03.2024, 14:00 Uhr\n" +
                        "\n" +
                        "WALDSTADION KAFFEETÄLCHEN\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FMarksuhler_SV_Kali_Werra.jpg?alt=media&token=0bf9b8c6-625d-4f6c-8c14-f823a62a106d",
                " K.o. in der Nachspielzeit ",
                "26.Februar.2024",
                "Es wäre eine super Gelegenheit gewesen unseren Trainer Pierre zum Geburtstag zu beschenken Stattdessen sind die Geschenke bei unserem Gegner gelandet Das ist zwar sehr sozial von uns aber sicher ",
                "Es wäre eine super Gelegenheit gewesen, unseren Trainer Pierre zum Geburtstag zu beschenken. Stattdessen sind die Geschenke bei unserem Gegner gelandet. Das ist zwar sehr sozial von uns, aber sicher nicht im Sinne des Erfinders. Es war ein Rückrundenauftakt, wie er für unsere Kali-Elf kaum bitterer hätte laufen können. Wir standen kurz vor einem Punkt, den wir bitter nötig gehabt hätten. Am Ende stehen wir wieder mit leeren Händen da.\n" +
                        "\n" +
                        "Marksuhl dominierte die erste Hälfte und ging in der 13. Minute folgerichtig in Führung. In der Folge zauberte unser Torhüter David Matthä eine Parade nach der anderen aufs Feld und hielt uns somit im Spiel. In der zweiten Halbzeit entdeckte unsere Kali-Elf die gegnerische Spielhälfte für sich. Vor allem bei Standards wurden wir gefährlich. David Wohlfahrt (55. Min.) warf sich mit voller Körperwucht in einen scharf geschossenen Eckball und köpfte ihn ins lange linke Eck. Den vielumjubelten Ausgleich bezahlte unser Wohli aber mit einer blutenden Platzwunde, sodass er ausgewechselt werden musste. Danach wurde es ein Spiel ohne Mittelfeld. Chancen auf beiden Seiten. Bis zur 90. Minute hielten wir das 1:1. Weil der Schiedsrichter dem drängenden Flehen des Kali-Publikums nach sofortigem Abpfiff nicht nachkam, mussten wir dann doch noch den bitteren Gegentreffer zum 1:2 hinnehmen.\n" +
                        "\n" +
                        "Wieder keine Punkte. Aber es hilft nichts: Wir müssen alle auffindbaren Kräfte zusammenkratzen, um in den kommenden Wochen zu punkten und den Abstieg abzuwenden. Kopf hoch, Männer! Und trotzdem herzlichen Glückwunsch zum Geburtstag, Trainer!\n" +
                        "\n" +
                        "Foto & Text: Jonas Schulte @groundblogging\n"

            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FVorschau-Auswaerts_vs-Marksuhl.jpg?alt=media&token=ae2fc37f-80ef-4f57-8a69-80d95172280a",
                "Auswärts gegen den Marksuhler SV",
                "25. Februar 2024 ",
                "Leute holt die Tennisbälle raus und bringt schon mal eure ferngesteuerten Spielzeugautos in Stellung Am Sonntag startet unsere 1 Mannschaft in die Rückrunde Und weil im Trubel um den geplatzten ",
                "\n" +
                        "\n" +
                        "Leute, holt die Tennisbälle raus und bringt schon mal eure ferngesteuerten Spielzeugautos in Stellung: Am Sonntag startet unsere 1. Mannschaft in die Rückrunde! Und weil im Trubel um den geplatzten Investorendeal der DFL glatt unterging, dass im deutschen Fußball auch die missliche Tabellensituation von Kali Werra ausreichend Anlass für Fanproteste bietet, fordern wir im Namen der Initiativen “Unsere Kurve” und “Unser fragiles Nervenkostüm” umgehend die Umsetzung eines dringlichen Drei-Punkte-Plans, der da lautet: Am liebsten hätten wir nach jeder Partie drei Pluspunkte mehr auf dem Konto. Sieg oder Spielabbruch sozusagen, und da wir uns Letzteres nicht leisten können und wollen, ist stattdessen unsere Kali-Elf gefordert. Die Jungs in Schwarz-Gelb müssen bereit sein, mehr zu investieren als Blackstone oder CVC – und ihr ganzes Herz auf dem Platz lassen. Nur so können sie gegen die Gastgeber aus Marksuhl bestehen, die aktuell auf Rang 3 liegen und ihre letzten fünf Pflichtspiele allesamt gewonnen haben. Im Hinspiel im Kaffeetälchen trennten sich beide Teams unentschieden 1:1.\n" +
                        "\n" +
                        "Die besondere Statistik:\n" +
                        "\n" +
                        "Michel Hotzel (Marksuhl) – 13 Tore\n" +
                        "\n" +
                        "Kali Werra (gesamt) – 17 Tore\n" +
                        "\n" +
                        "Fazit: Vorteil Tiefenort\n" +
                        "\n" +
                        "WANN & WO:\n" +
                        "\n" +
                        "SG MARKSUHLER SV vs. KALI WERRA\n" +
                        "\n" +
                        "SONNTAG, 25.02.2024, 14:00 UHR\n" +
                        "\n" +
                        "SPORTPLATZ MARKSUHL\n"
            ),
            News(
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/news%2FArbeitseinsaetze_Fruehjahr24.jpg?alt=media&token=23d034e8-654e-4124-966f-92d9857ebc41",
                "ARBEITSEINSATZ!",
                "14.Februar 2024",
                "\n" +
                        "\n" +
                        "Zum Start der Rückrunde findet am 23. & 24. Februar unser erster von drei geplanten Arbeitseinsätzen im Kaffeetälchen statt\n" +
                        "\n" +
                        "Termine\n" +
                        "Freitag 23.02.24 16:00 ",
                "\n" +
                        "\n" +
                        "Zum Start der Rückrunde findet am 23. & 24. Februar unser erster von drei geplanten Arbeitseinsätzen im Kaffeetälchen statt.\n" +
                        "\n" +
                        "Termine:\n" +
                        "Freitag 23.02.24, 16:00 – 18:00 Uhr\n" +
                        "Samstag 24.02.24, 09:00 – 11:00 Uhr\n" +
                        "\n" +
                        "Es wäre schön, wenn jedes Mitglied an mindestens einem teilnehmen könnte. Getreu dem Motto: Viele Hände, schnelles Ende.\n" +
                        "\n" +
                        "PS: Wer hat und kann bringt bitte Gartengeräte (Mäher, Rechen etc.) mit.\n"
            )
        )
        return news
    }
}