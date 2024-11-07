package org.example;

import java.time.Year;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Examen {

    public void ejercicio1() {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Elije una de las 3 opciones: Piedra (p), Papel(a), Tijera(t)");
        String opc = teclado.nextLine();



    }

    public void ejercicio2(){

        Scanner teclado = new Scanner(System.in);
        int anyoActual = Year.now().getValue(), anyo = 0, edad = 0;

        try {

            System.out.println("Dime tu año de nacimiento: ");
            anyo = teclado.nextInt();

        } catch (InputMismatchException e){
            System.out.println("Error, introduce un caracter valido...");
            return;
        }

        if (anyo < 1900) {
            System.out.println("No puedes introducir un año menor a 1900...");
            return;
        }else if (anyo >= anyoActual){
            System.out.println("El año no puede ser superior que el año actual...");
        }else {

            for (int i = anyo; i <= anyoActual; i++) {

                System.out.println(anyo + " - edad: " + edad);
                anyo++;
                edad++;

            }
        }
    }

}