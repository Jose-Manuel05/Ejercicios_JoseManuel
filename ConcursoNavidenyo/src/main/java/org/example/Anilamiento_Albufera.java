package org.example;

// Asume fichero llamado solution.java
    public class Anilamiento_Albufera {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int caso = in.nextInt();
        in.nextLine();

        int aveLiberada = 0;

        if (caso == 0)
            return false;
        else {
            for (int i = 0; i < caso; i++) {
                String auxS = in.nextLine();
                String[] aux = auxS.split(" ");

                int[] ave = new int[] { Integer.parseInt(aux[0]), Integer.parseInt(aux[1])};

                if (ave[0] < 0 || ave[0] > 10000 || ave[1] < 0 || ave[1] > 10000) {
                    return false;
                } else if (ave[0] < ave[1]) {
                    return false;
                } else {
                    aveLiberada += ave[0] - ave[1];
                }

            }
        }
        System.out.println(aveLiberada);
        return true;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}