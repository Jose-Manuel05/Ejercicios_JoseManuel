package org.example;

import java.awt.*;
import java.util.Scanner;

public class cadena_caracteres {

    public cadena_caracteres() {
    }

    public void Ejercicio1() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres: ");
        String cadena = teclado.nextLine();

        System.out.println("Texto original: " + cadena);
        int tamanyo = cadena.length();

        System.out.println("La longitd del texo es: " + tamanyo);
        String frase_sinespacios = cadena.replace(" ", "");

        System.out.println("El texto sin espacios: " + frase_sinespacios);
        int concat = tamanyo / 2;

        String part1 = cadena.substring(0, concat);
        String part2 = cadena.substring(concat);

        System.out.println("Primera mitad del texto: " + part1 + ". Segunda mitad del texto: " + part2);
        String cadena_mayusculas = cadena.toUpperCase();
        System.out.println("Texto en mayusculas: " + cadena_mayusculas);
    }

    public void Ejercicio2() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe la primera cadena de texto: ");
        String cadena1 = teclado.nextLine();
        System.out.println("Escribe la segunda cadena de texto: ");
        String cadena2 = teclado.nextLine();

        int tamanyo_cadena1 = cadena1.length();
        int tamanyo_cadena2 = cadena2.length();

        if (tamanyo_cadena1 == tamanyo_cadena2) {
            System.out.println("Los textos tienen el mismo tamaño.");
        }

        if (tamanyo_cadena1 < tamanyo_cadena2) {
            System.out.println("La segunda cadena es mayor.");
        }

        if (tamanyo_cadena1 > tamanyo_cadena2) {
            System.out.println("La primera cadena es mayor.");
        }

    }

    public void Ejercicio3() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una variable numerica: ");
        int n1 = teclado.nextInt();
        System.out.println("Introduce las ultimas cifras que quieras borrar: ");
        int p1 = teclado.nextInt();

        int divisor = (int)Math.pow(10.0, (double)p1);
        int resultado = n1 / divisor;

        System.out.println("El numero despues de eliminar las ultimas: " + p1 + " cifras es :" + resultado);
    }

    public void Ejercicio4() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String texto = teclado.nextLine();
        System.out.println("Introduce la palabra que quieras contar");
        String contar = teclado.nextLine();

        String contar2 = " " + contar + " ";

        texto = " " + texto + " ";
        texto = texto.replace(".", " ");

        String texto2 = texto.replace(contar, "");
        int veces = texto.length() - texto2.length();
        int aparece = veces / contar.length();

        System.out.println("La subcadena " +contar+ " aparece "+aparece+ " veces.");

    }

    public void Ejercicio5(){

        Scanner entrada = new Scanner(System.in);

        int intentos = 9;

        System.out.println("Jugador 1 introduce una frase: ");
        String frase = entrada.nextLine();
        System.out.println("Jugador 2 introduce una palabra: ");
        String palabra = entrada.nextLine();

        while (intentos > 0 ){
            if(frase.contains(palabra)){
                System.out.println("Enhorabuena has hacertado la palabra");
                intentos = 0;
            }else {
                System.out.println("Intento fallido te quedan " +intentos+ " intentos.");
                intentos -= 1;
                palabra = entrada.next();
            }
        }

        if (intentos == 0) {
            System.out.println("Game Over");
        }

    }

}