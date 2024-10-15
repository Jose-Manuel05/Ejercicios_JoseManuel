package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Actividad {

    public void actividad (){

        Scanner teclado = new Scanner(System.in);

        LocalDateTime hoy = LocalDateTime.now();
        int anyoActual = hoy.getYear();

        String modo = teclado.next();

        System.out.println("Programa para calcular el año de nacimiento y la edad");
        System.out.println("1º Año de nacimiento");
        System.out.println("2º Edad");
        System.out.println("Seleciona una opcion: ");

        String opcion = teclado.next();
        int anyoNac = 1800;

        boolean error = false;

        switch (modo){
            case "1":
                System.out.println("Introduce un año: ");
                String anyoNacimiento = teclado.next();

                try {
                    anyoNac = Integer.parseInt(anyoNacimiento);
                }catch (NumberFormatException e){
                    System.out.println("Has introducido un formato erroneo. no es un numero. ");
                }


                if (anyoNac < 1900 || anyoNac > anyoActual){
                    System.out.println("El año introducido no es correcto");
                    error = true;
                }
                break;

            case "2":

                int edad = 0;

                System.out.println("Introduce una edad: ");

                if (teclado.hasNextInt()){

                }else {
                    System.out.println("La edad introducida no tiene un formato valido");
                }

                if (edad < 0){
                    System.out.println("La edad introducida no es valida. ");
                    error = true;
                }else {

                    int anyo_nac = anyoActual - edad;

                }
                break;

            default:
                System.out.println("El modo introdicdo no es correcto.");
                break;

        }

        if (error == false) {

            if (anyoNac >= 1900 && anyoNac <= 1927) {
                System.out.println("Eres de la generacion sin bautizar.");
            } else if (anyoNac >= 1928 && anyoNac <= 1944) {
                System.out.println("Eres de la generacion silet.");
            } else if (anyoNac >= 1945 && anyoNac <= 1964) {
                System.out.println("Eres de la generacion baby boomers.");
            } else if (anyoNac >= 1965 && anyoNac <= 1981) {
                System.out.println("Eres de la generacion x.");
            } else if (anyoNac >= 1982 && anyoNac <= 1994) {
                System.out.println("Eres de la generacion mellenial.");
            } else if (anyoNac >= 1995 && anyoNac <= anyoActual) {
                System.out.println("Eres de la generacion centenial.");
            } else {
                System.out.println("No eres de ninguna generacion.");
            }
        }

    }
}
