package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sopa {

    public void practica() {

        Scanner teclado = new Scanner(System.in);

        int m = 0, n = 0;

        try {
            System.out.println("Introduce el número de filas: ");
            m = teclado.nextInt();
            System.out.println("Introduce el número de columnas: ");
            n = teclado.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Error. introduce un caracter valido (Numeros).");
        }

        if ( m <= 0 || n <= 0) {
            System.out.println("Error, ");
        }

        String[][] matriz = new String[m][n];

        System.out.println("Introduce las letras por fila: ");
        for (int i = 0; i < m; i++) {
            String fila = teclado.nextLine();
            if (fila.length() != n || !fila.matches("[a-zA-Z]+")) {
                System.out.println("Error: Cada fila debe contener exactamente " + n + " letras.");
                return;
            }

        }



    }
}
