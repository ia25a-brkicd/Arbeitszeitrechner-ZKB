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
                String ersteVon = "";
                String ersteBis = "";
                String zweiteVon = "";
                String zweiteBis = "";
                double totalErsteSchicht = 0;
                double totalZweiteSchicht = 0;


                boolean korrekt = false;

                while (!korrekt) {
                    System.out.print("Erste Arbeitsschicht (Von): ");
                    ersteVon = input.next();
                    System.out.print("Erste Arbeitsschicht (Bis): ");
                    ersteBis = input.next();
                    System.out.print("Zweite Arbeitsschicht (Von): ");
                    zweiteVon = input.next();
                    System.out.print("Zweite Arbeitsschicht (Bis): ");
                    zweiteBis = input.next();

                    totalErsteSchicht = BerechnungSchicht1(ersteVon, ersteBis);
                    totalZweiteSchicht = BerechnungSchicht1(zweiteVon, zweiteBis);



                    if (errorDetector(totalErsteSchicht, totalZweiteSchicht)) {
                        System.out.println("❌ Ihre Eingabe entspricht nicht dem Reglement. Bitte erneut eingeben.\n");
                    } else {
                        korrekt = true;
                    }
                }

                double totalDesTages = totalErsteSchicht + totalZweiteSchicht;

                System.out.println(" ");
                System.out.println(" ");

                System.out.println("|--------------------------------------|-----------|-----------|-----------|");
                System.out.println("|  Erste Arbeitsschicht  (Von - Bis):  |   " + ersteVon + "   |   " + ersteBis + "   |" + "    "+ totalErsteSchicht + "     ");
                System.out.println("|--------------------------------------|-----------|-----------|-----------|");
                System.out.println("|  Zweite Arbeitsschicht (Von - Bis):  |   " + zweiteVon + "   |   " + zweiteBis + "   |" + "    "+ totalZweiteSchicht + "       ");
                System.out.println("|--------------------------------------|-----------|-----------|-----------|");
                System.out.println("|  Totale Arbeitszeit:                 |           |           |    " + totalDesTages);
                System.out.println("|--------------------------------------|-----------|-----------|-----------|");

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" Totalbericht des Arbeitstages:");
                System.out.println(" Überstunden: ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" ");
            }
            else {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Sie haben das Programm beendet.");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                terminateProgramm();
            }
        }
    }

    public static double BerechnungSchicht1(String ersteVon, String ersteBis) {


        String[] teile = ersteVon.split(":");
        int stunden = Integer.parseInt(teile[0]);
        int minuten = Integer.parseInt(teile[1]);

        double dezimalErsteVon = stunden + (minuten / 60.0);

        teile = ersteBis.split(":");
        stunden = Integer.parseInt(teile[0]);
        minuten = Integer.parseInt(teile[1]);

        double dezimalErsteBis = stunden + (minuten / 60.0);

        return dezimalErsteBis - dezimalErsteVon;
    }

    public static double BerechnungTotal() {
        return 0;
    }

    public static double berechnungUeberstunden() {
        return 0;
    }

    public static void terminateProgramm() {
        terminate = true;
    }

    public static boolean errorDetector(double Schicht1, double Schicht2) {
        double total = Schicht1 + Schicht2;

        if (total > 9){
            return true;
        }
        else {
            return false;
        }
    }
}


