package org.example;

import java.util.Random;

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

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        int tan = caracteres.length();

        Random random = new Random();

        int logintund_contrasenya = 12;
        int indice;
        String contrasenya = "";

        for (int i = 0; i < tan; i++) {

            indice = random.nextInt(tan);
            contrasenya += caracteres.charAt(indice);

        }

        System.out.println("contrasenya" + contrasenya);

    }

    public void ejercicioRandom3() {



    }

    public void ejercicioRandom4() {

    }
}


