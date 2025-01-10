package org.example;

import java.util.Random;
import java.util.Scanner;

public class CaraCruz {


    public static void caraCruz() {

        mostrarOpciones(); //como no tenemos que guardar nada no ponemos nada delante
        String opcionUsurario = recogerOpcion(); //al tener que guardar el valor que devueve utilizamos el string
        String opcionSorteo = sorteo();
        comprobarResultado(opcionUsurario, opcionSorteo);

    }

   public static void mostrarOpciones() {

       System.out.println("BIENVENIDO");
       System.out.println("Elije tu opcion: ");
       System.out.println("C - Cara");
       System.out.println("X - Cruz");

   }

   public static String recogerOpcion() {

       Scanner teclado = new Scanner(System.in);
       String opcion = teclado.next();

        return opcion;
   }

   public static String sorteo() {

       Random alatorio = new Random();
       String[] opciones = {"cara","cruz"};

       String sorteo = opciones[alatorio.nextInt(2)];

       return sorteo;

   }

   public static void comprobarResultado(String opcion, String sorteo) {

        if (opcion.equals(sorteo)) {
            System.out.println("Has ganado! Ha salido: " + sorteo);
        } else {
            System.out.println("Has perdido! Ha salido: " + sorteo);
        }

   }


}
