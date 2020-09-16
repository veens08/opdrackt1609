package org.example.sjoerd.Opdracht1609;

import org.assertj.core.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.ARRAY;

public class MijnTest {
    @Test
    void experimentMetString1() {
        String naam = "Sjoerd van der Veen";
        String achternaam = naam.substring (15);
        System.out.println (achternaam);
    }
    @Test
    void experimentMetString2() {
        String naam = "Sjoerd van der Veen";
        String achternaam = naam.toUpperCase ();
        System.out.println (achternaam);
    }

    @Test
    void experimentMetString3() {
         String naam = "Sjoerd van der Veen";
         String tussenvoegsel = naam.substring (5,6);
         String achternaam = naam.substring (15);
         System.out.println (tussenvoegsel);

   }
    @Test
    void eenManierOmEenGrootAantalVariabelenTeDeclareren() {
        int[] leeftijden; // hier declareer je een array
        leeftijden = new int[10];
        int leeftijdOpIndexNul = leeftijden[0];

        leeftijden[0] = 58;
        leeftijden[1] = 23;
        leeftijden[2] = 28;
        leeftijden[3] = 21;
        leeftijden[4] = 18;
        leeftijden[5] = 24;
        leeftijden[6] = 22;
        leeftijden[7] = 25;
        leeftijden[8] = 27;
        leeftijden[9] = 30;

        int som = 0;
        for (int index = 0; index <leeftijden.length; index = index + 1) {
           som = som + leeftijden[index];
        }
        int gemLeeftijd = som / 10;
        System.out.println(som);
        System.out.println (gemLeeftijd);
    }

    @Test
    void eenHandigerManierOmEenGrootAantalVariabelenTeDeclareren() {
        int[] leeftijden = {58,23,28,21,18,24,22,25,27,30};

        int som = 0;
        //Deze for loop is bewerkelijk
        for (int index = 0; index <leeftijden.length; index = index + 1) {
            som = som + leeftijden[index];
        }
        int gemLeeftijd = som / 10;
        System.out.println(som);
        System.out.println (gemLeeftijd);
    }
    @Test
    void eenHandigerForLoopDeEnhancedForloop() {
        int[] leeftijden = {58,23,28,21,18,24,22,25,27,30};

        int som = 0;
        //Enhanced forloop gaat na alle array items af
        for (int leeftijd : leeftijden) {
            som = som + leeftijd;
        }
        int gemLeeftijd = som / 10;
        System.out.println(som);
        System.out.println (gemLeeftijd);
    }

    @Test
    void eenStringArray() {
        String[] namen = {"Sjoerd","Sam","Dave","Majid","Cihangir","Rein","Evan","Dennis","Mike","Joshua"};

        Arrays.sort (namen);

        int lengteNamen = 0;
        int maxNaamLengte = 0;
        int gemLengteNaam = 0;
        int kortsteNaamlengte = 99;
        int langsteNaamLengte = 0;
        String kortsteNaam = "";
        String langsteNaam = "";

        System.out.println("Alle namen:");

        for (String naam : namen) {
            System.out.println(naam);

            if (naam.length () < kortsteNaamlengte) {
                kortsteNaamlengte = naam.length ();
                kortsteNaam = naam.substring (0);

            }
            if (naam.length () > langsteNaamLengte) {
                langsteNaamLengte = naam.length ();
                langsteNaam = naam.substring (0);
            }

            lengteNamen = lengteNamen + naam.length ();

        }

        System.out.println("");
        System.out.println("Totale lengte namen   : " + lengteNamen);
        gemLengteNaam = lengteNamen / 10;
        System.out.println("Gemiddelde naam lengte: " + gemLengteNaam);
        System.out.println("Kortste naam lengte   : " + kortsteNaamlengte);
        System.out.println("Kortste naam          : " + kortsteNaam);
        System.out.println("Langtse naam lengte   : " + langsteNaamLengte);
        System.out.println("Langtse naam          : " + langsteNaam);

    }

    @Test
    void maakStaandeDriehoekOpConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer de hoogte van de staande driehoek via de console: ");
        int grootteDriehoek = scanner.nextInt();
        System.out.println("De hoogte van de staande driehoek is: " + grootteDriehoek);

        int aantalLagen = grootteDriehoek;
        int printTeller = 0;
        for (; aantalLagen >= 0 && printTeller <= grootteDriehoek; aantalLagen--, printTeller++) {
            for (int loopIndex = 0; loopIndex < aantalLagen; loopIndex++) {
                System.out.print (" ");
            }
            for (int loopIndex = 0; loopIndex < printTeller; loopIndex++) {
                System.out.print ("*");
            }
            for (int loopIndex = 1; loopIndex < printTeller; loopIndex++ ) {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
    @Test
    void maakStaandeDriehoekOpConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer de hoogte van de staande driehoek via de console: ");
        int grootteDriehoek = scanner.nextInt();
        System.out.println("De hoogte van de staande driehoek is: " + grootteDriehoek);

        int aantalLagen = grootteDriehoek;
        int printTeller = 0;
        for (; aantalLagen >= 0 && printTeller <= grootteDriehoek; aantalLagen--, printTeller++) {
            for (int loopIndex = 0; loopIndex < aantalLagen; loopIndex++) {
                System.out.print (" ");
            }
            for (int loopIndex = 0; loopIndex < printTeller; loopIndex++) {
                System.out.print ("*");
            }
            for (int loopIndex = 1; loopIndex < printTeller; loopIndex++ ) {
                System.out.print ("*");
            }
            System.out.println ();
        }

    }


    @Test
    void maakStaandeDriehoekOpConsoleMetMethodes() {

        int grootteDriehoek = vraagHoogte ();
        int aantalLagen = grootteDriehoek;
        int printTeller = 0;
        for (; aantalLagen >= 0 && printTeller <= grootteDriehoek; aantalLagen--, printTeller++) {
            for (int loopIndex = 0; loopIndex < aantalLagen; loopIndex++) {
                System.out.print (" ");
            }
            for (int loopIndex = 0; loopIndex < printTeller; loopIndex++) {
                System.out.print ("*");
            }
            for (int loopIndex = 1; loopIndex < printTeller; loopIndex++) {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
    int vraagHoogte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer de hoogte van de staande driehoek via de console: ");
        int hoogte = scanner.nextInt();
        System.out.println("De hoogte van de staande driehoek is: " + hoogte);
        return hoogte;
    }
}
