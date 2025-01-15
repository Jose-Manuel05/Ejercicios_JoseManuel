package org.example;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número mayor que cero: ");
        int num = scanner.nextInt();
        sumarNumerosNaturales(num);
    }

    public static void sumarNumerosNaturales(int num) {
        if (num <= 0) {
            System.out.println("El número debe ser mayor que cero.");
            return;
        }

        int suma = 0;
        StringBuilder cadena = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            suma += i;
            cadena.append(i);
            if (i < num) {
                cadena.append(" + ");
            }
        }

        cadena.append(" = ").append(suma);
        System.out.println(cadena);
    }
}