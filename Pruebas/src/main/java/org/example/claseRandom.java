package org.example;

import java.util.Random;
import java.util.Scanner;

public class claseRandom {

    public void ejercicioRandom1() {

        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt();
        System.out.println("El valor del dado 1 es: " + dado1);
        int dado2 = aleatorio.nextInt();
        System.out.println("El valor del dado 2 es: " + dado2);

        System.out.println("El resultado es: " + dado1 + dado2);

    }

    public void ejercicioRandom2() {

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

        int tan = caracteres.length();

        Random random = new Random();

        int longintund_contrasenya = 12;
        int indice;
        String contrasenya = "";

        for (int i = 0; i < longintund_contrasenya; i++) {

            indice = random.nextInt(tan);
            contrasenya += caracteres.charAt(indice);

        }

        System.out.println("contrasenya" + contrasenya);

    }

    public void ejercicioRandom3() {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int min = 0, max = 0;

        while (true) {
            System.out.println("Introduce el valor minimo: ");
            min = teclado.nextInt();
            System.out.println("Introduce el valor maximo");
            max = teclado.nextInt();

            if (min >= max) {
                System.out.println("El valor minimo debe ser mayor que el valor maximo.");
            }else {
                break;
            }

        }

        System.out.println("¿Cunatos numeros aleatorios deseas generar?: ");
        int cantidad = teclado.nextInt();

        System.out.println("Numeros aleatorios generados: ");
        for (int i = 0 ; i < cantidad ; i++){
            int numAleatorio = random.nextInt((max - min + 1) + min);
            System.out.println(numAleatorio);
        }
    }

    public void ejercicioRandom4() {

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

        int tan = caracteres.length();

        Random random = new Random();

        int longintund_contrasenya = random.nextInt(3) + 6;
        String contrasenya = "";
        for (int i = 0; i < longintund_contrasenya; i++) {

            int indice = random.nextInt(tan);
            contrasenya +=caracteres.charAt(indice);
        }

        System.out.println("Contraseña: " + contrasenya);

    }
}


