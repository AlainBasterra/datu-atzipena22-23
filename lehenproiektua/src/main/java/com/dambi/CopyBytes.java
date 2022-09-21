package com.dambi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

    //xanadu.txt fitxategia irakurri eta fitxategiko Byte-ak banaka kopiatzen hasten da. Byte-ak c deitzen de aldagai batetan gordetzen du eta outagain.txt
    // deitzen den fitxategi bat sortu eta bertan pegatzen egoten da, horrela xanadu fitxategi osoa kopiatu arte

public class CopyBytes {
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