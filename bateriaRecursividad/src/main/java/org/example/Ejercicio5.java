package org.example;

import java.util.Scanner;

public class Ejercicio5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        if (esBinario(numero)) {
            System.out.println("El número " + numero + " es binario.");
        } else {
            System.out.println("El número " + numero + " no es binario.");
            System.out.println("El número " + numero + " en binario es: " + Convertir(numero)+".");
        }

    }

    public static boolean esBinario(int num) {

        if(num > 9) {
            if(num % 10 == 0 || num % 10 == 1) {
                return esBinario(num / 10);
            }else {
                return false;
            }
        }

        return num == 0 || num == 1;

    }

    public static String Convertir (int num) {

        if (num == 0 || num == 1) {
            return Integer.toString(num);
        }else {
            return Convertir(num /  2) + num % 2;
        }

    }

}
