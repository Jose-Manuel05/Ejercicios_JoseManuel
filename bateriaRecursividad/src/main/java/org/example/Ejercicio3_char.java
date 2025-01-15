package org.example;

import java.util.Arrays;

public class Ejercicio3_char {

    static char[] palabra_vector;

    public static void main(String[] args) {

        String palabra = "prueba";
        palabra_vector = palabra.toCharArray();
        System.out.println(Arrays.toString(palabra_vector));
        invertir_palabra(palabra_vector.length - 1);

    }

    public static void invertir_palabra(int contador) {

        if(contador == 0){
            System.out.print(palabra_vector[contador]);
        } else {
            System.out.print(palabra_vector[contador]);
            invertir_palabra(contador - 1);
        }

    }

}
