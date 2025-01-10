package org.example;

import java.util.Scanner;

public class soyRunner {

    public static int mostrarMenu(boolean error) {
        Scanner sc= new Scanner(System.in);
        if(error) System.out.println("INTRODUCE ÚNICAMENTE UNA VALOR [0,1,2,3]");
        System.out.println("---------MENU---------");
        System.out.println("[0] FINALIZAR");
        System.out.println("[1] NUEVO DATO");
        System.out.println("[2] MOSTRAR DATOS");
        System.out.println("[3] BORRAR ULTIMO DATO");
        System.out.println("----------------------");
        System.out.print("TU OPCION [0,1,2,3]-> ");
        int respuesta=sc.nextInt();
        while(respuesta<0||respuesta>3) respuesta=mostrarMenu(true);
        return respuesta;
    }

    public static void main(String[] args) {

        float tiempos[] = new float[10];

        int respuesta = -1;

        respuesta = mostrarMenu(false);
    }

}
