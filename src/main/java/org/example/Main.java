package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static boolean terminate = false;

    public static void main(String[] args) {
        ArrayList<Double> arbeitszeit = new ArrayList<>();
        while (!terminate) {

            System.out.println("|-------------------------------------------------|");
            System.out.println("|        Wählen Sie Ihre Gewünschte Aktion:       |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("|             [1]Arbeitszeit berechnen            |");
            System.out.println("|             [2]Programm Beenden                 |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("|               Wichtiger Hinweis!:               |");
            System.out.println("|      Die tägliche Arbeitszeit beträgt 8.4h      |");
            System.out.println("|      Es ist verpflichtend, eine Mittagspause    |");
            System.out.println("|      von mindestens 30Min einzuhalten.          |");
            System.out.println("|      Ausserdem ist es verboten mehr als         |");
            System.out.println("|      9h Zu Arbeiten. Vielen Dank!               |");
            System.out.println("|-------------------------------------------------|");
            System.out.println(" ");


            int choiceProgramm = input.nextInt();

            if (choiceProgramm == 1) {

                System.out.print("Erste Arbeitsschicht (Von): ");
                String ersteVon = input.next();
                System.out.print("Erste Arbeitsschicht (Bis): ");
                String ersteBis = input.next();
                System.out.print("Zweite Arbeitsschicht (Von): ");
                String zweiteVon = input.next();
                System.out.print("Zweite Arbeitsschicht (Bis): ");
                String zweiteBis = input.next();

                double totalErsteSchicht = BerechnungSchicht1(ersteVon,ersteBis);

                double totalZweiteSchicht = BerechnungSchicht2(zweiteVon,zweiteBis);




                System.out.println(" ");
                System.out.println(" ");

                System.out.println("|--------------------------------------|-----------|-----------|-----------|");
                System.out.println("|  Erste Arbeitsschicht  (Von - Bis):  |   " + ersteVon + "   |   " + ersteBis + "   |" + "          |");
                System.out.println("|--------------------------------------|-----------|-----------|-----------|");
                System.out.println("|  Zweite Arbeitsschicht (Von - Bis):  |   " + zweiteVon + "   |   " + zweiteBis + "   |" + "          |");
                System.out.println("|--------------------------------------|-----------|-----------|-----------|");
                System.out.println("|  Totale Arbeitszeit: ");

                System.out.println(" ");
                System.out.println(" ");
            }
            else {
                System.out.println("Sie haben das Programm beendet.");
                terminateProgramm();
            }
        }
    }

    public static double BerechnungSchicht1(String ersteVon, String ersteBis) {
        return 0;
    }

    public static double BerechnungSchicht2(String zweiteVon, String zweiteBis) {
        return 0;
    }

    public static double BerechnungTotal() {
        return 0;
    }

    public static double berechnungUeberstunden () {
        return 0;
    }

    public static void terminateProgramm() {
        terminate = true;
    }
}


