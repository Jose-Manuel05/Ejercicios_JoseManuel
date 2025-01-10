package org.example;

import java.util.Scanner;

public class programaCorrer {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Listado de nombres
        String[] nombres = {"Jose", "Maria", "Pedro", "Ana", "Juan"};
        //Listado de notas a pedir al usuario
        float[] notas = new float[10];
        //Listado de apellidos
        String[] apellidos = new String[20];

        notas[0] = 3.45f;


        System.out.println("Cual es el nuevo nombre?");
        String nuevoNombre = in.nextLine();
        nombres[nombres.length-1] = nuevoNombre;

        System.out.println("Los nombres son:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

    }

}
