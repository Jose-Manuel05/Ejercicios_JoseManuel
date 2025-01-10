package org.example;

import java.util.Scanner;

public class Ejercicio2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] strings) {

        System.out.println("Introduce la base: ");
        int base = scanner.nextInt();;
        if (base < 0) {
            System.out.println("La base no puede ser negativa.");
            return;
        }

        System.out.println("Introduce el exponente: ");
        int exponente = scanner.nextInt();;
        if (exponente < 0) {
            System.out.println("El exponente no puede ser negativo.");
            return;
        }

        int resultado = potencias(base, exponente);
        System.out.println("El resultado de elevar " + base + " a la " + exponente + " es: " + resultado);

    }

    public static int potencias(int base, int exponente) {

        if (exponente == 0) {
            return 1;
        }
        return base * potencias(base, exponente - 1);

    }

}

