package com.dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersOrdezkatuz {
    // CopyCharacters-en berdina da, baina horain "a" eta "A" guztiak "o" eta "O"-rekin aldatu behar dira, horretarako ascii kodea 
    // detektatzen duenean 97 edo 65 dela, aldatu egingo du 111 edo 79 gatik, 111 minuskulaz bada eta 79 maiskulaz
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("./xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                if(c == 97){
                    c = 111;
                }
                if(c == 65){
                    c = 79;
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