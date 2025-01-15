package org.example;

import java.util.Scanner;

public class Ejercicio3_numero {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Introduce la cadena que quieras invertir: ");
        int cadena = scanner.nextInt();
        System.out.print("La cadena invertida es: " );
        numerosInvertidos(cadena);

    }

    public static void numerosInvertidos(int num) {

        if (num >= 0 && num < 10) {
            System.out.print(num);
        } else {
            System.out.print(num % 10);
            numerosInvertidos(num / 10);
        }

    }


}