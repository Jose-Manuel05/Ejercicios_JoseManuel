package org.example;

public class Ninots_indultados {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int ninots = in.nextInt();
        if (ninots == 0)
        return false;
        else {



            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}
