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
    void maakDriehoekOpConsoleMetMethodes() {

        String top = vraagDeTopPositie ();

        int grootteDriehoek = vraagHoogte (top);

        printWillekeurigeDriehoek (grootteDriehoek, top);
    }

    void printWillekeurigeDriehoek (int grootteDriehoek, String top) {

        if (top.equals ("boven") ) {
            printDriehoekMetTopBoven  (grootteDriehoek);
        }
        else if (top.equals ("onder") ) {
            printDriehoekMetTopOnder  (grootteDriehoek);
        }
        else if (top.equals ("links") ) {
            printDriehoekMetTopLinks  (grootteDriehoek);
        }
        else if (top.equals ("rechts") ) {
            printDriehoekMetTopRechts (grootteDriehoek);
        }
    }

    String vraagDeTopPositie () {
        boolean juisteRichting = false;
        String top = "";
        while (juisteRichting == false) {
            String richtingDriehoek = vraagRichting ();

            if (richtingDriehoek.equals("boven") ) {
                juisteRichting = true;
                top = richtingDriehoek;
            }
            else if (richtingDriehoek.equals ("onder") ) {
                juisteRichting = true;
                top = richtingDriehoek;
            }
            else if (richtingDriehoek.equals ("rechts") ) {
                juisteRichting = true;
                top = richtingDriehoek;
            }
            else if (richtingDriehoek.equals ("links") ) {
                juisteRichting = true;
                top = richtingDriehoek;
            }
        }
        return top;
    }

    String vraagRichting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de positie van de top via console (boven, onder, links of rechts: ");
        String richting = scanner.next();
        System.out.println("De top van de driehoek ligt: " + richting);
        return richting;
    }

    int vraagHoogte (String message){
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Voer de hoogte van de driehoek met de top " + message + " via console: ");
        int hoogte = scanner.nextInt ();
        System.out.println ("De hoogte van de driehoek met top " + message + " is: " + hoogte);
        return hoogte;
        }

    void printDriehoekMetTopBoven(int grootteDriehoek) {
        int printTeller = 0;

        for (int aantalLagen = grootteDriehoek; aantalLagen >= 0 && printTeller <= grootteDriehoek; aantalLagen--, printTeller++) {

            printLinkerSpaties (aantalLagen);

            printLinkerSterretjes (0, printTeller);

            printRechterSterrejes (1, printTeller);

            System.out.println ();
        }
    }

    void printLinkerSpaties(int aantalLagen) {
        for (int loopIndex = 0; loopIndex < aantalLagen; loopIndex++) {
            System.out.print (" ");
        }
    }

    void printLinkerSterretjes (int loopIndex, int printTeller) {
        for (; loopIndex < printTeller; loopIndex++) {
            System.out.print ("*");
        }
    }

    void printRechterSterrejes (int loopIndex, int printTeller) {
        for (; loopIndex < printTeller; loopIndex++) {
            System.out.print ("*");
        }
    }


    @Test
    void printDriehoekMetTopOnder(int grootteDriehoek) {

        int aantalLagen = grootteDriehoek;
        int printTeller = grootteDriehoek;

        printOmgekeerdeDriehoek (grootteDriehoek, aantalLagen, printTeller);
    }

    void printOmgekeerdeDriehoek (int grootteDriehoek, int aantalLagen, int printTeller) {
        for (; aantalLagen >= 0 && printTeller <= grootteDriehoek; aantalLagen--, printTeller--) {

            printLinkerSpatiesOmgekeerd (grootteDriehoek, aantalLagen);

            printLinkerSterretjes (1, printTeller);

            printRechterSterrejes (0, printTeller);

            System.out.println ();
        }
    }

    void printLinkerSpatiesOmgekeerd (int grootteDriehoek, int aantalLagen) {
        for (int loopIndex = grootteDriehoek; loopIndex > aantalLagen; loopIndex--) {
            System.out.print (" ");
        }
    }

    @Test
    void printDriehoekMetTopLinks(int grootteDriehoek) {

        int aantalLagen = grootteDriehoek;
        int printTeller = 1;

        printLiggendeDriehoek (grootteDriehoek, aantalLagen, printTeller);
    }

    void printLiggendeDriehoek (int grootteDriehoek, int aantalLagen, int printTeller) {
        for (; aantalLagen >= 0 && printTeller <= grootteDriehoek; aantalLagen--, printTeller++) {
            for (int loopIndex = 1; loopIndex <= printTeller; loopIndex++ ) {
                System.out.print ("*");
            }
            System.out.println ();
        }

        for (aantalLagen = grootteDriehoek, printTeller = grootteDriehoek; aantalLagen > 0 && printTeller > 0; aantalLagen--, printTeller--) {
            for (int loopIndex = 1; loopIndex < printTeller; loopIndex++) {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }

    @Test
    void printDriehoekMetTopRechts(int grootteDriehoek) {

        int aantalKolommen = grootteDriehoek;
        int printTeller = grootteDriehoek;

        for (; aantalKolommen >= 0 && printTeller <= grootteDriehoek; aantalKolommen--, printTeller--) {
            for (int loopIndex = 1; loopIndex <= printTeller; loopIndex++ ) {
                System.out.print (" ");
            }
            for (int loopIndex = aantalKolommen; loopIndex < grootteDriehoek; loopIndex++ ) {
                System.out.print ("*");
            }
            System.out.println ();
        }

        for (aantalKolommen = grootteDriehoek, printTeller = grootteDriehoek; aantalKolommen > 0 && printTeller > 0; aantalKolommen--, printTeller--) {
            for (int loopIndex = grootteDriehoek; loopIndex > printTeller; loopIndex-- ) {
                System.out.print (" ");
            }
            for (int loopIndex = 1; loopIndex <= printTeller; loopIndex++) {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }

    @Test
    void maakLiggendeDriehoekMetBasisLinksMetSubstring() {

        int grootteDriehoek = vraagHoogte ("liggend (links)");
        String sterretjes = "*****************************************";
        String printSterretjes = "";

        for (int loopIndex = 1; loopIndex <= grootteDriehoek; loopIndex++) {
            printSterretjes = sterretjes.substring (0,loopIndex);
            System.out.println (printSterretjes);
        }
        for (int loopIndex = grootteDriehoek - 1; loopIndex > 0; loopIndex--) {
            printSterretjes = sterretjes.substring (0,loopIndex);
            System.out.println (printSterretjes);
        }
    }

    @Test
    void maakLiggendeDriehoekMetBasisRechtsMetSubstring() {

        int grootteDriehoek = vraagHoogte ("liggend (rechts)");
        String sterretjes = "*****************************************";
        String spaties = "                                         ";

        int offsetSterretjes = 0;
        int aantalSterretjes = 1;
        for (int loopIndex = grootteDriehoek; loopIndex > 0; loopIndex--, aantalSterretjes++) {
            offsetSterretjes = loopIndex + aantalSterretjes;
            String printSpaties = spaties.substring (0,loopIndex - 1);
            String printSterretjes = sterretjes.substring (loopIndex,offsetSterretjes);

            System.out.println (printSpaties + printSterretjes);
        }
        aantalSterretjes = grootteDriehoek - 1;
        for (int loopIndex = 1; loopIndex < grootteDriehoek; loopIndex++, aantalSterretjes--) {
            offsetSterretjes = loopIndex + aantalSterretjes;
            String printSpaties = spaties.substring (0,loopIndex);
            String printSterretjes = sterretjes.substring (loopIndex,offsetSterretjes);

            System.out.println (printSpaties + printSterretjes);
        }
    }
}
