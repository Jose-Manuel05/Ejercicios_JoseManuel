package org.example;

import java.util.Scanner;

public class Chicles {

    static Scanner teclado;

    public static boolean casoDePrueba() {
        String datos = teclado.nextLine();
        String[] datos_entrada = datos.split(" ");

        if (Integer.parseInt(datos_entrada[0]) == 0) {

            return false;
        }else {

            return true;
        }
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static int[] pedirDatos(int numero) {

        int[] datos = new int[3];
        datos[0] = numero;



        return datos;

    }

}
