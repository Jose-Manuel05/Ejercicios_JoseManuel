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

        if(numero > 9) {
            if(numero % 10 == 0 || numero % 10 == 1) {
                return esBinario(numero / 10);
            }else {
                return false;
            }
        }

        return numero == 0 || numero == 1;


    }
}