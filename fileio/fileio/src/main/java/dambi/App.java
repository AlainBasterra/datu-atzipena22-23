package dambi;

import java.util.Scanner;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App {
    public static Scanner in;
    public static void main(String[] args) throws Exception {
        in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUAREN IZENBURUA");
            System.out.println("====================================");
            System.out.println("1.- Konprobatu fitxategi/direktorio bat existitzen den path absoluto batekin.");
            System.out.println("2.- Bigarren aukera");
            System.out.println("3.- ...");
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
        in.close();
    }

    public static void met1() {
        System.out.println("Sartu path absoluto bat:");
    
        File tempFile = new File(in.next());
        
        boolean exists = tempFile.exists();
        if (exists) {
            System.out.println("Sartutako helbidea zuzena da!");
        } else {
            System.out.println("Sartutako helbidea ez da zuzena!");
        }
    }

    public static void met2() {

    }

}
