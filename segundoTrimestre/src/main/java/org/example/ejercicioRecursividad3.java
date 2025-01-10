package org.example;

import java.util.Scanner;

public class ejercicioRecursividad3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el número inicial: ");
        int numPrin = scanner.nextInt();
        System.out.println("Ingrese el número final: ");
        int numFinal = scanner.nextInt();

//        int numFinal= 10;
//        int numPrin = 1;

        System.out.println("El resultado es: " + sumar(numPrin, numFinal));

    }

    public static int sumar(int numPrin, int numFinal) {
        if (numPrin < numFinal) {
            return numPrin + sumar(numPrin + 1, numFinal);
        }

        return numPrin;
    }

}
