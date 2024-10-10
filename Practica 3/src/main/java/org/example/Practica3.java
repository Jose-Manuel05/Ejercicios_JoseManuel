package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {

    public void practica3() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        int edad = -1;

        while (edad < 0) {
            System.out.println("Hola " + nombre + ". Introduce tu edad: ");
            try {
                edad = scanner.nextInt();

                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa. Por favor, introduce una edad valida");
                }
            } catch (InputMismatchException error) {
                System.out.println("Error. Introduce un valor valido.");
                scanner.next();
            }
        }

        if (edad >= 18) {
            System.out.println("Enhorabuena " + nombre + ". Puedes votar.");
        } else {
            int añosFaltantes = 18 - edad;
            System.out.println("Lo siento " + nombre + ". No puedes votar.");
            System.out.println("Te faltan " + añosFaltantes + " años para ser mayor de edad.");

        }
    }
}
