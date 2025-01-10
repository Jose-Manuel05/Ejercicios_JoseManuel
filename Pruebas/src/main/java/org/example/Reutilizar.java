package org.example;

import java.util.Scanner;

public class Reutilizar {

    public static int intrdocucirInt() {

        Scanner teclado = new Scanner(System.in);

        int dato = teclado.nextInt();
        return dato;

    }

    public static void imprimirMatriz(String matriz[][]) {
        for (String[] filas : matriz){
            for (String columnas : filas){
                System.out.println(columnas + " ");
            }
            System.out.println("\n");
        }
    }

}
