package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioAmpliacion {

    public void ejercicioAmpliacion1() {

        Scanner teclado = new Scanner(System.in);

        int altura = 0;

        try {

            System.out.println("Ingrese su altura: ");
            altura = teclado.nextInt();

            if (altura < 0){
                System.out.println("Debes introducir un valor positivo.");
            }

        } catch (InputMismatchException e1) {
            System.out.println("Introduce un valor corecto. " + e1);
        }

        if (altura <= 150) {
            System.out.println("Persona de altura baja.");
        } else if (altura >= 151 && altura <= 175) {
            System.out.println("Persona de altura media.");
        } else {
            System.out.println("Persona alta.");
        }
    }

    public void ejercicioAmpliacion2(){

        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        try {
            System.out.println("Bienvenido al progrma de los dias de la semana");
            System.out.println("Elija un numero del 1 al 7: ");
            opcion = teclado.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error, introduce un numero valido");
        }

        if (opcion < 1 || opcion > 7) {
            System.out.println("Error, introduce un valor correcto...");
        }else {
            switch (opcion){

                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;

            }
        }


    }

}
