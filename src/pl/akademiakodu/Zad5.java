package pl.akademiakodu;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj Wyraz");

        String wyraz = scanner.next();

        StringBuilder hello = new StringBuilder(wyraz);
        hello.reverse();

        System.out.println(hello.charAt(1));





    }
}
