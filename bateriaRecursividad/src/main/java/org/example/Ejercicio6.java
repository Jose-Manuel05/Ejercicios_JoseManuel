package org.example;

import java.util.Scanner;

public class Ejercicio6 {

    public static boolean palabraAlfabeticamente(char[] palabra, int in) {

        if (in == palabra.length - 1) {
            return true;
        }

        if (palabra[in] > palabra[in + 1]) {
            return false;
        }

        return palabraAlfabeticamente(palabra, in + 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra para comprobar si está ordenada alfabéticamente: ");
        String palabra = scanner.nextLine();

        char[] palabraArray = palabra.toCharArray();

        if (palabraAlfabeticamente(palabraArray, 0)) {
            System.out.println("La palabra '" + palabra + "' está ordenada alfabéticamente.");
        } else {
            System.out.println("La palabra '" + palabra + "' NO está ordenada alfabéticamente.");
        }

    }
}