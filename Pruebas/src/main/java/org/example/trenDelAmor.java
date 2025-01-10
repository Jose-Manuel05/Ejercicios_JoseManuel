package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class trenDelAmor {

    static Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext()) {
            return false;
        }else {
            String datos = in.nextLine();
            String[] datos_entrada = datos.split(" ");
            System.out.println(Arrays.toString(datos_entrada));
            return true;
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}
