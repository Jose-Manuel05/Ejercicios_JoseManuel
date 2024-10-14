package org.example;

import java.util.Scanner;

public class Nº_Suerte {

    public void numero_suerte() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimiento = scanner.nextLine();

        String[] partes = fechaNacimiento.split("/");

        if (partes.length != 3) {
            System.out.println("Error: Formato de fecha inválido. Debe ser dd/mm/yyyy.");
            scanner.close();
        return;
        }

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);

        if (dia <= 0 || mes <= 0 || año <= 0) {
            System.out.println("Error: El día, mes y año deben ser números positivos.");
            scanner.close();
            return;
        }

        int suma = 0;

        while (dia > 0) {
            suma += dia % 10;
            dia /= 10;
        }

        while (mes > 0) {
            suma += mes % 10;
            mes /= 10;
        }

        while (año > 0) {
            suma += año % 10;
            año /= 10;
        }
        while (suma > 9 && suma != 11 && suma != 22) {
            int sumaTemporal = 0;
            while (suma > 0) {
                sumaTemporal += suma % 10;
                suma /= 10;
            }
            suma = sumaTemporal;
        }

        System.out.println("Tu número de la suerte es: " + suma);

        }
    }