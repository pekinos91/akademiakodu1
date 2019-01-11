package pl.akademiakodu;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String wyraz = scanner.next();

        System.out.println(wyraz.replace("*"," "));

    }
}
