package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner telcado = new Scanner(System.in);
        telcado.hasNextInt();
        int ej = 0;

        if (telcado.hasNextInt()){
            ej = telcado.nextInt();
            telcado.nextLine();
        }


        //Exepciones exepciones = new Exepciones();
        //exepciones.exepciones();


        Bucles bucles = new Bucles();

        //bucles.ejercicio1();
        //bucles.ejercicio2();
        //bucles.ejercicio3();
        //bucles.ejercicio4();
        //bucles.ejercicio5();
        //bucles.ejercicio6();
        //bucles.ejercicio7();
        //bucles.ejercicio8();

    }
}