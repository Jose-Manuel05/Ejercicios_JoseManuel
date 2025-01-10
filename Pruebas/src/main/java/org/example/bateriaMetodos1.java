package org.example;

import java.util.Scanner;

public class bateriaMetodos1 {

    public static int calcularCubo(int n){

        return n * n * n;

    }

    public static void mostrarUsario() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int num = teclado.nextInt();

        int resultado = calcularCubo(num);

        System.out.println("El cubo de " + num + " es " + resultado);

    }

}

