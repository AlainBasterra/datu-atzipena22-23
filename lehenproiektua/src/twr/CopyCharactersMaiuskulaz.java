package com.dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersMaiuskulaz {

    // CopyCharacters berdina, baina kasu honetan, ascii kodeko zenbakia 97 eta 122 bitartean badago 32 kentzen dio, zeren tarte horretako zenbakiak
    // a-tik z-tara dauden letra minuskulen kodeak dira, eta 65-etik 90-era letra maiuskulen kodeak dira, eta ikusten da maiuskuletatik minuskuletara 32-ko
    // diferentzia dagoela. Horrela beti karaktereak maiuskulez kopiatuko dira.
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("./xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                if(c >= 97 && c <= 122){
                    c = c - 32;
                }
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