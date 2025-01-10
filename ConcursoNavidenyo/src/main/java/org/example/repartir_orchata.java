package org.example;

public class repartir_orchata {
    static java.util.Scanner in;

    static class Persona {
        int trabajo;
        int horchataPedida;

        Persona(int trabajo, int horchataPedida) {
            this.trabajo = trabajo;
            this.horchataPedida = horchataPedida;
        }
    }

    public static boolean casoDePrueba() {
        int h = in.nextInt();
        int n = in.nextInt();

        if (h == 0 && n == 0)
            return false;

        int[] trabajos = new int[n];
        int[] horchataPedida = new int[n];

        for (int i = 0; i < n; i++) {
            trabajos[i] = in.nextInt();
            horchataPedida[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (trabajos[j] < trabajos[j + 1] || (trabajos[j] == trabajos[j + 1] && horchataPedida[j] > horchataPedida[j + 1])) {
                    int tempTrabajo = trabajos[j];
                    trabajos[j] = trabajos[j + 1];
                    trabajos[j + 1] = tempTrabajo;

                    int tempHorchata = horchataPedida[j];
                    horchataPedida[j] = horchataPedida[j + 1];
                    horchataPedida[j + 1] = tempHorchata;
                }
            }
        }

        int horchataRestante = h;
        int personasAtendidas = 0;

        for (int i = 0; i < n; i++) {
            if (horchataRestante >= horchataPedida[i]) {
                horchataRestante -= horchataPedida[i];
                personasAtendidas++;
            } else {
                break;
            }
        }

        System.out.println(personasAtendidas + " " + horchataRestante);

        return true;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
