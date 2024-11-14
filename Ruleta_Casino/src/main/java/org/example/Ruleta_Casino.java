package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ruleta_Casino {

    public void practica1() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        String[] colores = {"rojo", "negro"};

        Integer[] numeros = new Integer[37];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        String[] pares = {"par", "impar"};

        System.out.println("*****BIENVENIDO A LA RULETA******");

        System.out.println("Introduce un número (0-36): ");
        int numero = teclado.nextInt();

        boolean numero_encontrado = Arrays.asList(numeros).contains(numero);

        String color = "";
        String par = "";

        if (!numero_encontrado) {
            System.out.println("ERROR. El número no es válido");
            return;
        } else {
            if (numero != 0) {
                System.out.println("Inserta un color...");
                color = teclado.next();
                boolean color_encontrado = Arrays.asList(colores).contains(color);

                if (!color_encontrado) {
                    System.out.println("ERROR. El color no es válido");
                    return;
                } else {
                    System.out.println("Inserta par/impar: ");
                    par = teclado.next();
                    boolean par_encontrado = Arrays.asList(pares).contains(par);

                    if (!par_encontrado) {
                        System.out.println("ERROR. La opción par/impar no es válida.");
                        return;
                    }
                }

            }

        }

        String sorteo_color = colores[aleatorio.nextInt(colores.length)];
        int sorteo_numero = numeros[aleatorio.nextInt(numeros.length)];
        String sorteo_par;

        if (sorteo_numero % 2 == 0) {
            sorteo_par = "par";
        } else {
            sorteo_par = "impar";
        }

        System.out.println("Ha tocado " + sorteo_numero + " " + sorteo_color + " " + sorteo_par);

        if (sorteo_numero == numero && sorteo_color.equals(color) && sorteo_par.equals(par)) {
            System.out.println("HAS GANADO!!!");
        } else if (numero != 0 && sorteo_color.equals(color)) {
            System.out.println("Has acertado el color.");
        } else if (numero != 0 && sorteo_par.equals(par)) {
            System.out.println("Has acertado la opción " + par);
        } else if (numero != 0 && numero == sorteo_numero) {
            System.out.println("Has acertado el número");
        } else if (numero == 0 && sorteo_numero == 0) {
            System.out.println("HAS GANADO y los demás usuarios pierden.");
        } else {
            System.out.println("Has perdido.");
        }
    }
}
