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
                case 3:
                    met3();
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

    public static void met1() throws IOException  {
        String izena;
        String altuera;
        String kokalekua;
        int tarteak;
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("Mendiak.csv"));

            String l;
            while ((l = inputStream.readLine()) != null) {

                String[] parts = l.split(";");
                izena = parts[0];
                altuera = parts[1];
                kokalekua = parts[2];

                // Izena
                tarteak = 13 - izena.length();
                System.out.print(izena);
                while (tarteak > 0) {
                    System.out.print(" ");
                    tarteak--;
                }
                System.out.print("| ");

                // Altuera
                tarteak = 9 - altuera.length();
                System.out.print(altuera);
                while (tarteak > 0) {
                    System.out.print(" ");
                    tarteak--;
                }
                System.out.print("| ");

                // kokalekua
                System.out.println(kokalekua);
            }
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
            boolean handiagoa = false;
            Scanner sc = new Scanner(new File("Mendiak.csv"));
            sc.useDelimiter(";");
            izena = sc.next(); // 2 salto
            izena = sc.next();
            try {
                while (sc.hasNext()) {
                    if (!handiagoa) {
                        try {
                            String[] parts = sc.next().split("\n");
                            kokalekua = parts[0];
                            izena = parts[1];
                        } catch (Exception e) {
                            kokalekua = sc.next();
                        }
                    } else {
                        handiagoa = false;
                    }
                    altuera = sc.nextInt();

                    if (altuera > altueraF) {
                        handiagoa = true;
                        izenaF = izena;
                        altueraF = altuera;
                        try {
                            String[] parts = sc.next().split("\n");
                            kokalekua = parts[0];
                            izena = parts[1];

                        } catch (Exception e) {
                            kokalekua = sc.next();
                        } finally {
                            kokalekuaF = kokalekua;
                        }

                    }
                }
            } catch (Exception e) {
            }

            System.out.println(kokalekuaF + "-ko " + izenaF + " mendia da altuena, " + altueraF + "m-ko altuerarekin");
            sc.close();

        } catch (FileNotFoundException exception) {
            System.out.println("Fitxategia ez da aurkitu");
        }
    }

    public static void met3() throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStreamBizkaia = null;
        PrintWriter outputStreamAraba = null;
        PrintWriter outputStreamNafarroa = null;
        PrintWriter outputStreamGipuzkoa = null;

        String kokalekua;

        try {

            boolean titulua = false;
            inputStream = new BufferedReader(new FileReader("Mendiak.csv"));
            outputStreamBizkaia = new PrintWriter(new FileWriter("BizkaiaMendiak.csv"));
            outputStreamAraba = new PrintWriter(new FileWriter("ArabaMendiak.csv"));
            outputStreamNafarroa = new PrintWriter(new FileWriter("NafarroaMendiak.csv"));
            outputStreamGipuzkoa = new PrintWriter(new FileWriter("GipuzkoaMendiak.csv"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                if (!titulua) {
                    outputStreamBizkaia.println(l);
                    outputStreamAraba.println(l);
                    outputStreamNafarroa.println(l);
                    outputStreamGipuzkoa.println(l);
                    titulua = true;
                }
                String[] parts = l.split(";");
                kokalekua = parts[2];

                switch (kokalekua) {
                    case "Bizkaia":
                        outputStreamBizkaia.println(l);
                        break;
                    case "Araba":
                        outputStreamAraba.println(l);
                        break;
                    case "Nafarroa":
                        outputStreamNafarroa.println(l);
                        break;
                    case "Gipuzkoa":
                        outputStreamGipuzkoa.println(l);
                        break;
                    default:
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Fitxategia ez da aurkitu");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStreamBizkaia != null) {
                outputStreamBizkaia.close();
            }
            if (outputStreamAraba != null) {
                outputStreamAraba.close();
            }
            if (outputStreamNafarroa != null) {
                outputStreamNafarroa.close();
            }
            if (outputStreamGipuzkoa != null) {
                outputStreamGipuzkoa.close();
            }
        }
    }

}
