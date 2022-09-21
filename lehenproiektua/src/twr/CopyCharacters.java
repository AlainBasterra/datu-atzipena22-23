package com.dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    // Programa honek xanadu fitxategiko karaktereak banaka banaka c deitzen den aldagai batetan kopiatzen hasten da ascii tablako zenbaki bat bezala
    // eta ondoren characteroutput.txt fitxategia sortu eta bertan idazten c balorean dagoena, baina karaktere bezala, ez ascii kodeko zenbaki bezala
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("./xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
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