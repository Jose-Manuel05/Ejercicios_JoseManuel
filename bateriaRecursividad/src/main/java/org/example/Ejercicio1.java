package org.example;

import java.util.Scanner;

public class Ejercicio1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] strings) {

        System.out.println("Introduce un número entero: ");
        int numero = scanner.nextInt();
        System.out.println(digitos(numero));
    }

    public static int digitos(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + digitos(n/10);
    }
}