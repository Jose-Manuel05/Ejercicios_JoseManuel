package org.example;

import java.util.Scanner;

public class Comprobador_ISBN {

    public void comprobador_ISBN() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el ISBN: ");
        String isbn = scanner.next();

        if (isbn.length() != 10 || !isbn.matches("[0-9?X]{10}")) {
            System.out.println("El ISBN debe tener 10 caracteres.");
        }

        int suma = 0;
        boolean caracterFaltante = false;
        int posicionPregunta = -1;

        for (int i = 0; i <= 9; i++) {
            char caracter = isbn.charAt(i);

            if (caracter == '?') {
                caracterFaltante = true;
                posicionPregunta = i;
            } else {
                int digito = (caracter == 'X' && i == 9) ? 10 : caracter - '0';
                suma += digito * (10 - i);
            }
        }

        if (caracterFaltante) {
            for (int digitoFaltante = 0; digitoFaltante <= 9; digitoFaltante++) {

                int sumaNumFaltante = suma + digitoFaltante * (10 - posicionPregunta);

                if (sumaNumFaltante % 11 == 0) {
                    System.out.println("El digito que falta es: " + digitoFaltante);
                    scanner.close();
                    return;
                }
            }
            System.out.println("No se pudo determinar el digito que falta.");
        } else {
            if (suma % 11 == 0) {
                System.out.println("El ISBN es valido.");

            } else {
                System.out.println("El ISBN no es valido.");
            }
        }

    }
}