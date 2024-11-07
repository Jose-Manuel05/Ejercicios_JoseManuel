package org.example;

import java.time.Year;
import java.util.Scanner;

public class contadorAñoBisiesto {

    public void contadorAñoBisiesto() {

        Scanner scanner = new Scanner(System.in);

        int añoActual = Year.now().getValue();
        int añoInicio;

        do {
            System.out.print("Elige un año (entre 1900 y " + añoActual + "): ");
            añoInicio = scanner.nextInt();
            if (añoInicio < 1900 || añoInicio > añoActual) {
                System.out.println("Año no válido. Debe estar entre 1900 y " + añoActual + ".");
            }
        } while (añoInicio < 1900 || añoInicio > añoActual);

        int contadorBisiestos = 0;

        for (int año = añoInicio; año <= añoActual; año++) {
            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                contadorBisiestos++;
            }
        }

        System.out.println("Ha habido " + contadorBisiestos + " años bisiestos desde " + añoInicio + " hasta " + añoActual + ".");

    }
}

