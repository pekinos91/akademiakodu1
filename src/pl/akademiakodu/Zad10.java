package pl.akademiakodu;

import java.sql.SQLOutput;
import java.util.Scanner;
/* nie rozumiem co to wartosc wyrazu */
public class Zad10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");

        String wyraz = scanner.next();

        for (int i=0;i<3;i++) {
            System.out.println(wyraz);
        }

    }
}
