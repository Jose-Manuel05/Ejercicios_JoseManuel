package org.example;

import java.util.Scanner;

public class Ejercicio3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un valor entero positivo: ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            System.out.print("Número invertido: ");
            imprimirNumeroInvertido(numero);
            System.out.println();
        }
    }

    public static void imprimirNumeroInvertido(int numero) {
        if (numero < 10) {
            System.out.print(numero);
            return;
        }
        System.out.print(numero % 10);
        imprimirNumeroInvertido(numero / 10);
    }
}