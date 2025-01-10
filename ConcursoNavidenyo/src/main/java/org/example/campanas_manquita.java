package org.example;

public class campanas_manquita {

    static java.util.Scanner in;

    public static void casoDePrueba() {

         String sonido = in.next();

        int[] frecuencia = new int[200];
        for (char c : sonido.toCharArray()) {
            frecuencia[c - 'A']++;
        }

        int maxFrecuencia = 0;
        for (int f : frecuencia) {
            maxFrecuencia = Math.max(maxFrecuencia, f);
        }

        if (maxFrecuencia <= (sonido.length() + 1) / 2) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }

}
