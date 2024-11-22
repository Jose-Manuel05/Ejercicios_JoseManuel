package org.example;

import java.util.Scanner;

public class buclesAnidados {

    public void prueba1() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura: ");
        int altura = teclado.nextInt();

        for (int i = 1 ; i <=altura ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }

    }

    public void tablaMutiplicar() {

        for (int i = 1 ; i<= 10 ; i++) {
            System.out.println("Tabla del: " + i);
            for (int j = 1 ; j <= 10 ; j++) {
                System.out.println(i + " x " + j + "=" +i * j);
            }
        }

    }

    public void ejerc4() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el valor m: ");
        int m = teclado.nextInt();

        System.out.print("Números primos: ");

        bucle1:
        for (int i = 2; i <= m; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue bucle1;
                }
            }

            System.out.println( i +" ");

        }

    }

}
