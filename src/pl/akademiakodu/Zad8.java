package pl.akademiakodu;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String wyraz = scanner.next();
        StringBuilder wyraz1 = new StringBuilder(wyraz);
        wyraz1.reverse();

        /*wynik: 208*/
        System.out.println(wyraz1.charAt(1) + wyraz1.charAt(0));
        char obl = wyraz1.charAt(1);
        char l = wyraz1.charAt(0);

        /*Dwie ostatnie litery wyrazu to: e i k*/
        System.out.println("Dwie ostatnie litery wyrazu to: " + obl + " i " + l);

        /*wynik: Dwie ostatnie litery wyrazu to: e i k*/
        System.out.println("Dwie ostatnie litery wyrazu to: " + wyraz1.charAt(1) + " i " + wyraz1.charAt(0));

        /*wynik: e k*/
        System.out.println(obl + " "+l);

        /*wynik: 208*/
        System.out.println(obl + l);



    }
}
