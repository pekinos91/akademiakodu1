package pl.akademiakodu;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        String firstName = scanner.nextLine();
        firstName.replaceAll(" ",""); /* nie działa spacje zostają*/
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        lastName.replaceAll(" ","");/* nie działa spacje zostają */

        System.out.println("Twoje imię i nazwisko to: "+ firstName + " " + lastName);



    }
}
