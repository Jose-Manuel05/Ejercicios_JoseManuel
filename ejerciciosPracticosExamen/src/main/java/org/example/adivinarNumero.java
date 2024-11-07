package org.example;

import java.util.Random;
import java.util.Scanner;

public class adivinarNumero {

    public void adivinarNumero() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroPensado = random.nextInt(101), intentos = 10;
        boolean acertado = false;

        System.out.println("Acabo de pensar un número [0-100]… ¿puedes adivinarlo? ¡Tienes 10 intentos!");

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ". Introduce un número: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroPensado) {
                System.out.println("¡HAS ACERTADO! El número era " + numeroPensado + ".");
                acertado = true;
                break;
            } else if (numeroUsuario > numeroPensado) {
                System.out.println("Tu número es mayor al que he pensado.");
            } else {
                System.out.println("Tu número es menor al que he pensado.");
            }
        }

        if (!acertado) {
            System.out.println("Lo siento, se te han acabado los intentos. El número era " + numeroPensado + ".");
        }

    }
}

