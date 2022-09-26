package com.dambi;

import java.util.Scanner;
import java.io.*;

/**
 * Hello world!
 *
 */
public class MainMenua {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUAREN IZENBURUA");
            System.out.println("====================================");
            System.out.println("1.- Mendien zerrenda ikusi");
            System.out.println("2.- Mendirik altuena bistaratu");
            System.out.println("3.- Mendia esportatu");
            System.out.println("4.- ...");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    met1();
                    break;
                case 2:
                    met2();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
        in.next();
    }

    public static void met1() {
        try {
            Scanner sc = new Scanner(new File("Mendiak.csv"));
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                System.out.print(sc.next());

                if (sc.hasNext()) {
                    System.out.print(" | ");
                }

            }
            sc.close();

        } catch (FileNotFoundException exception) {
            System.out.println("Fitxategia ez da aurkitu");
        }

    }

    public static void met2() {

        try {
            String izena = "";
            String izenaF = "";
            int altuera = 0;
            int altueraF = 0;
            String kokalekua = "";
            String kokalekuaF = "";
            Scanner sc = new Scanner(new File("Mendiak.csv"));
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                izena = sc.next();
                izena = sc.next();
                try {
                    altuera = sc.nextInt();
                } catch (Exception e) {
                    kokalekua = sc.next();
                }
                String[] parts = sc.next().split("\n");
                kokalekua = parts[0];

                izena = parts[1];

                if (altuera > altueraF) {
                    izenaF = izena;
                    altueraF = altuera;
                    kokalekuaF = kokalekua;
                }
            }
            System.out.println(kokalekuaF + "-ko " + izenaF + " mendia da altuena, " + altueraF + "m-ko altuerarekin");
            sc.close();

        } catch (FileNotFoundException exception) {
            System.out.println("Fitxategia ez da aurkitu");
        }
    }

}
