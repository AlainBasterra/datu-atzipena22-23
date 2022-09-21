package com.dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLinesZenbakiekin {
    // CopyLines-en berdina da, baina horain lerro hasieran zenbaki bat agertzen da adierazten zenbatgarren lerroa den. Horretarako x aldagai bat sortzen da
    // eta 1 balioa eman, ondoren lerroa pegatzerakoan, x-en balioa konkatenatzen zaio. Ondoren x-en balioa 1 gatik handitu eta berriro errepikatu.
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

            String l;
            int x = 1;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(x + ". " + l);
                x++;
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