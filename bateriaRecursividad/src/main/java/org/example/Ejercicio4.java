package org.example;

import java.util.Scanner;

public class Ejercicio4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        if (esBinario(numero)) {
            System.out.println("El número " + numero + " es binario.");
        } else {
            System.out.println("El número " + numero + " no es binario.");
        }
    }

    public static boolean esBinario(int numero) {
        if (numero == 0) {
            return true;
        }
        int digito = numero % 10;
        if (digito != 0 && digito != 1) {
            return false;
        }
        return esBinario(numero / 10);
    }
}