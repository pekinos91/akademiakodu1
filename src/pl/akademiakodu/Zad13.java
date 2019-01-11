package pl.akademiakodu;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("POdaj wyraz");
        String wyraz = scanner.next();

        System.out.println(wyraz.endsWith("tka"));
    }
}
