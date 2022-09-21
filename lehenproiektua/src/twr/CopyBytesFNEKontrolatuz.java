package com.dambi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// CopyBytes berdina, baina kasu honetan, programa ez bada kapaz xanadu fitxategia aurkitzeko, errore mezu bat agertuko da esaten "Fitxategia ez da aurkitu".

public class CopyBytesFNEKontrolatuz {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("./xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }catch (FileNotFoundException exception) {
            System.out.println("Fitxategia ez da aurkitu");
          } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}