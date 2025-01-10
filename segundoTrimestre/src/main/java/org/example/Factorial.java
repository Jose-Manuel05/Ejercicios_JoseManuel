package org.example;

import java.util.Scanner;

public class Factorial {

    static Scanner teclado = new Scanner(System.in);

    public static int factorial(int num) {

        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }

        return fact;
    }

    public static int factorialRecursivo(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        return num*factorialRecursivo(num-1);

    }

    public static void main(String[] args) {

        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();
        int factorial = factorialRecursivo(numero);

        System.out.println(factorial);

    }

}
