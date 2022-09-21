package com.dambi;
import java.io.*;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {
        // Programa honek xanadu fitxategiko hitzak banaka "s" deituriko aldagai batetan gordetzen du, eta kontsolan idazten hasten da hitzak banaka eta lerro ezberdinetan
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}