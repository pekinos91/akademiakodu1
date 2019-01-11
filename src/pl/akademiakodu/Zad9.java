package pl.akademiakodu;

import java.util.Scanner;

/* nie działa */
public class Zad9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        /*String wyraz = scanner.next();

        wyraz.replaceAll(" ","s");
        System.out.println(wyraz);
        System.out.println(wyraz.contentEquals("kot"));
        System.out.println(wyraz.contentEquals("kot"));
        System.out.println(wyraz.equals("kot"));
        System.out.println(wyraz.contains("kot"));
        System.out.println(wyraz.indexOf("kot"));
        System.out.println(wyraz);
        System.out.println(wyraz.split(wyraz));
        String wyraz1 = "bartek heheheh ehhehe ehehe";
        System.out.println(wyraz1);
        System.out.println(wyraz1.length());*/

        /* przy uzyciu scanner.next() - jeżeli jest zdanie ze spacjami to nie działą!!! */
        String wyraz = scanner.nextLine();

        wyraz.replaceAll(" ","s");
        System.out.println(wyraz);

        System.out.println(wyraz.contains("kot"));


    }
}
