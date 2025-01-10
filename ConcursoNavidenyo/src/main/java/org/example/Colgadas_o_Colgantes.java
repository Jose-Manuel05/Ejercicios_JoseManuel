package org.example;

import java.util.Scanner;

public class Colgadas_o_Colgantes {

    static Scanner teclado;

    public static void casoDePrueba() {
        String [] palabras =  new String[]{
                teclado.next().toLowerCase()
        };

        for( String palabra : palabras){
            if (palabra.equals("colgadas")){
                System.out.println("Bien");
            }
            else if (palabra.equals("colgantes")){
                System.out.println("Mal");
            }
        }
    }

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        for (int i = 0; i < numCasos; i++){
            casoDePrueba();
        }

    }

}