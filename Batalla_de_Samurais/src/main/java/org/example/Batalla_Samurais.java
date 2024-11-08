package org.example;

import java.util.Random;
import java.util.Scanner;

public class Batalla_Samurais {

    public void practica1() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];

        System.out.println("Equipo 1: ");
        while (true){
            System.out.println("Introduce la potencia del equipo: ");
            String equipo1Potencia = teclado.nextLine();
            String[] potencias = equipo1Potencia.split(" ");

            int sumaPotencias = 0;
            boolean valido = true;

            if (potencias.length != 7){
                System.out.println("Error, debes introducir 7 valores.");
                continue;
            }

            for (int i = 0; i < 7; i++) {
                try {
                    equipo1[i] = Integer.parseInt(potencias[i]);
                    sumaPotencias += equipo1[i];
                } catch (NumberFormatException e) {
                    System.out.println("ERROR, se ha detectado una letra o carácter no numérico en las potencias. Asegúrate de introducir solo números enteros.");
                    valido = false;
                    break;
                }
            }

            if (!valido){
                continue;
            }

            if (sumaPotencias != 30) {
                System.out.println("ERROR. La potencia total debe sumar 30.");
            } else {
                System.out.println("Equipo completado.");
                break;
            }

        }

        System.out.println("Equipo 2: ");
        while (true){
            System.out.println("Introduce la potencia del equipo: ");
            String equipo2Potencia = teclado.nextLine();
            String[] potencias = equipo2Potencia.split(" ");

            if (potencias.length != 7){
                System.out.println("Error, debes introducir 7 valores.");
                continue;
            }

            int sumaPotencias = 0;
            boolean valido = true;

            for (int i = 0; i < 7; i++) {
                try {
                    equipo2[i] = Integer.parseInt(potencias[i]);
                    sumaPotencias += equipo2[i];
                } catch (NumberFormatException e) {
                    System.out.println("ERROR, se ha detectado una letra o carácter no numérico en las potencias. Asegúrate de introducir solo números enteros.");
                    valido = false;
                    break;
                }
            }

            if (!valido){
                continue;
            }

            if (sumaPotencias != 30) {
                System.out.println("ERROR. La potencia total debe sumar 30.");
            } else {
                System.out.println("Equipo completado.");
                break;
            }

        }

        System.out.println("¡Empieza la batalla!");
        int samuraiInical = aleatorio.nextInt(7);
        System.out.println("La battala la inicia con el Samurai " + (samuraiInical + 1) + ".");

        int bajasEquipo1 = 0, bajasEquipo2 = 0;

        for (int i = 0; i < 7; i++) {
            int indiceActual = (samuraiInical + i) % 7;

            if (equipo1[indiceActual] > 0 && equipo2[indiceActual] > 0) {
                System.out.print("Samurai " + (indiceActual + 1) + ". ");

                if (equipo1[indiceActual] > equipo2[indiceActual]) {
                    System.out.println("Gana Equipo 1. " + equipo1[indiceActual] + " vs " + equipo2[indiceActual]);
                    equipo2[indiceActual] = 0;
                    bajasEquipo2++;
                } else if (equipo1[indiceActual] < equipo2[indiceActual]) {
                    System.out.println("Gana Equipo 2. " + equipo1[indiceActual] + " vs " + equipo2[indiceActual]);
                    equipo1[indiceActual] = 0;
                    bajasEquipo1++;
                } else {
                    System.out.println("Empate. Ambos samuráis mueren. " + equipo1[indiceActual] + " vs " + equipo2[indiceActual]);
                    equipo1[indiceActual] = 0;
                    equipo2[indiceActual] = 0;
                    bajasEquipo1++;
                    bajasEquipo2++;
                }

                if (bajasEquipo1 > 3) {
                    System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajasEquipo1 + " bajas.");
                    break;
                } else if (bajasEquipo2 > 3) {
                    System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajasEquipo2 + " bajas.");
                    break;
                }
            }
        }

    }

}
