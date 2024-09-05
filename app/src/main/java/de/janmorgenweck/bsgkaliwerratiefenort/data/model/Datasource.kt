package de.janmorgenweck.bsgkaliwerratiefenort.data

class Datasource {


    fun loadMannschaften(): List<Mannschaft> {
        val mannschaft = mutableListOf(
            Mannschaft(
                "01",
                "1. Herren Mannschaft",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-22-23_web-1536x1024.jpg?alt=media&token=6972404a-0f69-48dc-9b31-ed7e3980ad19",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag: 18:30 Uhr bis 20:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Freitag: 18:30 Uhr bis 20:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Ansprechpartner: Jörg Sauerbrei\n",
                "kali-werra-tiefenort@outlook.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/sg-fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/011MIAF2K0000000VTVG0001VTR8C1K7#!/",
                "1HKLST2",
                2024,
                4768,
                6311

            ),
            Mannschaft(
                "02",
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
                "1KKHST2",
                2024,
                4771,
                6475
            ),
            Mannschaft(
                "03",
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
                "KLAHST1",
                2024,
                4770,
                6311
            ),
            Mannschaft(
                "04",
                "A -Junioren",
                "",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag: 17:30 Uhr bis 19:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Mittwoch: 17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner: Florian Scholz",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/a-junioren-kol-kreis-westthueringen-a-junioren-kreisoberliga-a-junioren-saison2425-thueringen/-/staffel/02Q4QVKRAO000004VS5489B3VUHDH0E9-G#!/",
                "KOLAJ",
                2024,
                4772,
                6311
            ),


            Mannschaft(
                "05",
                "B - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-B-Junioren2-1536x1066.jpg?alt=media&token=9d87e0cf-0abe-4025-bc88-1234a448e3ba",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag: 17:30 Uhr bis 19:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Mittwoch: 17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner: Robert Langer, Enrico Wagner",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/sg-fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/02EV21G1SK000000VS5489B1VT0RKM5V#!/",
                "KOLWTBJ",
                2024,
                4773,
                6311
            ),
            Mannschaft(
                "06",
                "C1 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-C-Junioren-1536x1066.jpg?alt=media&token=57a122bf-5dd5-40b4-adea-3ef6c60a81c3",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Mittwoch: 17:00 Uhr bis 18:30 Uhr | Sportplatz Tiefenort\n" +
                        "\n" +
                        "Freitag: 17:00 Uhr bis 18:30 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner: Florian Krug, Marcus Noback",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/sg-fsv-kali-werra-tiefenort-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/01KRG0D94S000000VV0AG811VUP4Q6U8#!/",
                "LKST2CJ",
                2024,
                4774,
                6311
            ),
            Mannschaft(
              "07",
                "C2 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-C2-Junioren.jpeg?alt=media&token=e327a5de-3dc0-45a7-9b02-1adb3f164e72",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Mittwoch: 16:00 Uhr bis 17:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Freitag: 16:00 Uhr bis 17:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner: Tino Vollmer, Jan Morgenweck",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/c-junioren-kreisliga-st-1-kreis-westthueringen-c-junioren-kreisliga-c-junioren-saison2425-thueringen/-/staffel/02Q50BJOT4000004VS5489B3VUHDH0E9-G#!/",
                "KLWTST2CJ",
                2024,
                4775,
                6475
                ),
            Mannschaft(
                "08",
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
                0,
                0,
                6311
            ),
            Mannschaft(
                "09",
                "D2 - Junioren",
                "",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag: 17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Donnerstag: 17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner: ",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/fsv-kali-werra-tiefenort-ii-fsv-kali-werra-tiefenort-thueringen/-/saison/2324/team-id/02IATOMMS4000000VS5489B2VU2I8R4H#!/",
                "",
                0,
                0,
                6311

            ),
            Mannschaft(
                "10",
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
                "11",
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
                "12",
                "E - Juniorinnen",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-E-Juniorinnen.jpeg?alt=media&token=dbfa7c51-8aca-4faf-a18e-b3c2373c81ec",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag: 16:00 Uhr bis 17:30 Uhr | Waldstadion Kaffeetälchen\n" +
                        " \n" +
                        "Dienstag: 17:00 Uhr bis 18:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Donnerstag: 17:00 Uhr bis 18:30 | Sportplatz Kaltenborn\n" +
                        "\n" +
                        "Ansprechpartner: Partick Schellenberg, Rene Tschaar",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/tfv-turnierserie-e-juniorinnen-2024-2025-thueringen-e-juniorinnen-landesturnier-e-juniorinnen-saison2425-thueringen/-/staffel/02QJ5HU07C000000VS5489B3VUHJP2M3-C#!/",
                "",
                0,
                0,
                6311
            ),
            Mannschaft(
                "13",
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
                "14",
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
                "15",
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
                "16",
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

}