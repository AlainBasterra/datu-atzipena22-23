package com.dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLines {
    // Programa honek xanadu fitxategiko testuko lerroak kopiatzen hasten da "l"
    // deituriko aldagai batetan, eta characteroutput.txt fitxategia sortu,
    // eta bertan pegatzen du lerroka.
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Fitxategia ez da aurkitu");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}