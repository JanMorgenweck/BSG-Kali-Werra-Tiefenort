package de.janmorgenweck.bsgkaliwerratiefenort.data

class Datasource {


    fun loadMannschaften(): List<Mannschaft> {
        val mannschaft = mutableListOf(
            Mannschaft(
                "01",
                "1.Herren Mannschaft",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-22-23_web-1536x1066.jpg?alt=media&token=139e41a8-6887-457e-bd9f-39c79f13e48f",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag:\n" +
                        "18:30 Uhr bis 20:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Freitag:\n" +
                        "18:30 Uhr bis 20:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Jörg Sauerbrei",
                "kali-werra-tiefenort@outlook.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/kreisliga-staffel-2-kreis-westthueringen-kreisliga-herren-saison2425-thueringen/-/staffel/02Q252LM78000008VS5489B4VVGB4UUN-G#!/",
                "1HKLST2",
                2024,
                4768,
                6311
            ),
            Mannschaft(
                "02",
                "2. Herren Mannschaft",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2F2.-Mannschaft.jpg?alt=media&token=bec5c8e3-3d74-4fb7-8305-cc2758a15643",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag:\n" +
                        "18:30 Uhr bis 20:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Freitag:\n" +
                        "18:30 Uhr bis 20:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Pierre Cravaack",
                "kali-werra-tiefenort@outlook.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/1-kreisklasse-staffel-2-kreis-westthueringen-1kreisklasse-herren-saison2425-thueringen/-/staffel/02Q27GD85S000008VS5489B4VVGB4UUN-G#!/",
                "1KKHST2",
                2024,
                4771,
                6475
            ),
            Mannschaft(
                "03",
                "Edle Herren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FAlte-Herren.jpg?alt=media&token=96c16c67-66ea-43a6-971d-27b91f2aa885",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Mittwoch:\n" +
                        "18:30 Uhr bis 20:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Jörg Ebert",
                "kali-werra-tiefenort@outlook.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/kreisliga-ah-ue35-staffel-1-kreis-westthueringen-herren-ue35-kreisliga-herren-ue35-saison2425-thueringen/-/staffel/02Q2PCPKVS000007VS5489B3VVLDQQH4-G#!/",
                "KLAHST1",
                2024,
                4770,
                6311
            ),
            Mannschaft(
                "04",
                "A - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-A-Junioren.jpg?alt=media&token=ea982d1b-4ff9-4068-817c-b1ca2d0c8778",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag:\n" +
                        "18:30 Uhr bis 20:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Mittwoch:\n" +
                        "18:30 Uhr bis 20:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Florian Scholz, Steffen Domann",
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
                        "Montag:\n" +
                        "17:30 Uhr bis 19:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Mittwoch:\n" +
                        "17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Robert Langer, Enrico Wagner",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/b-junioren-kol-kreis-westthueringen-b-junioren-kreisoberliga-b-junioren-saison2425-thueringen/-/staffel/02Q4VJJEDG000004VS5489B3VUHDH0E9-G#!/",
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
                        "Mittwoch:\n" +
                        "17:00 Uhr bis 18:30 Uhr | Sportplatz Tiefenort\n" +
                        "\n" +
                        "Freitag:\n" +
                        "17:00 Uhr bis 18:30 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Florian Krug, Marcus Noback, Tobias Wilhelm",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/landesklasse-st-2-thueringen-c-junioren-landesklasse-c-junioren-saison2425-thueringen/-/staffel/02PUBONJ7G000004VS5489B4VVTKJJ35-G#!/",
                "LKST2CJ",
                2024,
                4774,
                6311
            ),
            Mannschaft(
                "07",
                "C2 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-C2-Junioren.jpg?alt=media&token=e0bf0703-fe1f-45cb-8625-50100809e5cb",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Mittwoch:\n" +
                        "16:00 Uhr bis 17:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Freitag:\n" +
                        "16:00 Uhr bis 17:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Tino Vollmer, Jan Morgenweck",
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
                        "Montag:\n" +
                        "16:00 Uhr bis 17:30 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Donnerstag:\n" +
                        "15:30 Uhr bis 17:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "David Wohlfahrt, Tobias Hoerschelmann",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/d-junioren-kreisoberliga-kreis-westthueringen-d-junioren-kreisoberliga-d-junioren-saison2425-thueringen/-/staffel/02Q51MJJFO000004VS5489B4VTH92TNV-G#!/",
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
                        "Montag:\n" +
                        "17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Donnerstag:\n" +
                        "17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Michael Schulz, Sebastian Happ",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/d-junioren-kreisliga-st1-kreis-westthueringen-d-junioren-kreisliga-d-junioren-saison2425-thueringen/-/staffel/02Q51UA0RC000004VS5489B4VTH92TNV-G#!/",
                "",
                0,
                0,
                6311
            ),
            Mannschaft(
                "10",
                "D - Juniorinnen",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-D-Juniorinnen.jpg?alt=media&token=a8f4e1ab-da0e-458f-8c2b-5666745609b5",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag:\n" +
                        "16:00 Uhr bis 17:30 Uhr | Waldstadtion Kaffeetälchen\n" +
                        "\n" +
                        "Dienstag:\n" +
                        "17:00 Uhr bis 18:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Donnerstag:\n" +
                        "17:00 Uhr bis 18:30 Uhr | Sportplatz Kaltenborn\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Norbert Beck, Sebastian Brenn",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/verbandsliga-thueringen-d-juniorinnen-verbandsliga-d-juniorinnen-saison2425-thueringen/-/staffel/02Q1T7KLK0000004VS5489B3VVLDQQH4-G#!/",
                "",
                0,
                0,
                6311
            ),
            Mannschaft(
                "11",
                "E1 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-E1-Junioren-1536x1066.jpg?alt=media&token=74c2d956-7d61-4c3d-9b56-5a349dec2073",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag:\n" +
                        "17:00 Uhr bis 18:30 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Donnerstag:\n" +
                        "17:00 Uhr bis 18:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Thomas Bertz, Christian Fiehler, Andre Nelkert, Franz Josupeit",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/e-junioren-kreisliga-st1-kreis-westthueringen-e-junioren-kreisliga-e-junioren-saison2425-thueringen/-/staffel/02Q5DUO8HC000000VS5489B3VUHDH0E9-G#!/",
                "",
                0,
                0,
                6311
            ),
            Mannschaft(
                "12",
                "E2 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-F1-Junioren-1536x1066.jpg?alt=media&token=5a6f2008-dc14-4502-87a7-5be3a967316f",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag:\n" +
                        "17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Donnerstag:\n" +
                        "17:30 Uhr bis 19:00 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Stefan Munk, Florian Hoffmann, Manfred Munk",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/e-junioren-kreisliga-st4-kreis-westthueringen-e-junioren-kreisliga-e-junioren-saison2425-thueringen/-/staffel/02Q5DV2KES000000VS5489B3VUHDH0E9-G#!/",
                "",
                0,
                0,
                6311
            ),
            Mannschaft(
                "13",
                "E - Juniorinnen",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-E-Juniorinnen.jpg?alt=media&token=8bc851ad-bb73-4ef9-992c-c881e3afe13e",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag:\n" +
                        "16:00 Uhr bis 17:30 Uhr | Waldstadtion Kaffeetälchen\n" +
                        "\n" +
                        "Dienstag:\n" +
                        "17:00 Uhr bis 18:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Donnerstag:\n" +
                        "17:00 Uhr bis 18:30 Uhr | Sportplatz Kaltenborn\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Partick Schellenberg, Rene Tschaar",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/tfv-turnierserie-e-juniorinnen-2024-2025-thueringen-e-juniorinnen-landesturnier-e-juniorinnen-saison2425-thueringen/-/staffel/02QJ5HU07C000000VS5489B3VUHJP2M3-C#!/",
                "",
                0,
                0,
                6311
            ),
            Mannschaft(
                "14",
                "F1 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-F3-Junioren-1536x1066.jpg?alt=media&token=400ab1bf-3448-4e6b-9159-d6a56203892c",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag:\n" +
                        "16:30 Uhr bis 18:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Donnerstag:\n" +
                        "16:30 Uhr bis 18:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Matthias Möller, David Matthä, Frank Reichardt",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/fsv-kali-werra-tiefenort-bsg-kali-werra-tiefenort-thueringen/-/saison/1819/team-id/012UNHUJO0000000VV0AG811VVETIMC3#!/",
                "",
                0,
                0,
                6311
            ),
            Mannschaft(
                "15",
                "F2 - Junioren",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-G-Junioren-1536x1066.jpg?alt=media&token=6adafb44-c8da-4b19-9530-5a7ba31b63e9",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Dienstag:\n" +
                        "16:30 Uhr bis 18:00 Uhr | Waldstadion Kaffeetälchen\n" +
                        "\n" +
                        "Donnerstag:\n" +
                        "16:30 Uhr bis 18:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Georg Narbei, Andreas Schramm, Daniel Gerlach, Philipp Narbei",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/bsg-kali-werra-tiefenort-ii-bsg-kali-werra-tiefenort-thueringen/-/saison/2425/team-id/02IATVGSV0000000VS5489B2VU2I8R4H#!/",
                "",
                0,
                0,
                6311
            ),
            Mannschaft(
                "16",
                "F - Juniorinnen",
                "https://firebasestorage.googleapis.com/v0/b/kali-werra-tiefenort.appspot.com/o/Mannschaft%2FMannschaftsfoto-E-Juniorinnen.jpg?alt=media&token=8bc851ad-bb73-4ef9-992c-c881e3afe13e",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Montag:\n" +
                        "16:00 Uhr bis 17:30 Uhr | Waldstadtion Kaffeetälchen\n" +
                        "\n" +
                        "Dienstag:\n" +
                        "17:00 Uhr bis 18:30 Uhr | Sportplatz Kieselbach\n" +
                        "\n" +
                        "Donnerstag:\n" +
                        "17:00 Uhr bis 18:30 Uhr | Sportplatz Kaltenborn\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Partick Schellenberg, Rene Tschaar",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/spieltagsuebersicht/tfv-turnierserie-e-juniorinnen-2024-2025-thueringen-e-juniorinnen-landesturnier-e-juniorinnen-saison2425-thueringen/-/staffel/02QJ5HU07C000000VS5489B3VUHJP2M3-C#!/",
                "",
                0,
                0,
                6311
            ),
            Mannschaft(
                "17",
                "G - Junioren",
                "",
                "Trainingszeiten:\n" +
                        "\n" +
                        "Mittwoch:\n" +
                        "16:30 Uhr bis 18:00 Uhr | Sportplatz Frauensee\n" +
                        "\n" +
                        "Ansprechpartner:\n" +
                        "Michael Hessel",
                "nachwuchs@kali-werra.de",
                "Ergebnisse auf FUSSBALL.DE",
                "https://www.fussball.de/mannschaft/bsg-kali-werra-tiefenort-bsg-kali-werra-tiefenort-thueringen/-/saison/2425/team-id/023K51PRN8000000VS548984VTFV1I8K#!/",
                "",
                0,
                0,
                6311
            )

        )
        return mannschaft
    }

}