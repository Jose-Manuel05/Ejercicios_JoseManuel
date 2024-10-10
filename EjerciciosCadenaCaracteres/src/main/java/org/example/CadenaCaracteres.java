package org.example;

import java.util.Scanner;

public class CadenaCaracteres {

    public void Ejercicio1 () {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres: ");
        String cadena = teclado.nextLine();

        //Muestra el texto original
        System.out.println("Texto original: " + cadena);

        //Muestra la longitud del texto introducido
        int tamanyo = cadena.length();
        System.out.println("La longitd del texo es: " + tamanyo);

        //Elimina los espacios del texto
        String frase_sinespacios =cadena.replace(" ", "");
        System.out.println("El texto sin espacios: " + frase_sinespacios);

        //Divide la cadena de texto en dps partes iguales
        int concat = tamanyo /2;
        String part1 = cadena.substring(0, concat);
        String part2 = cadena.substring(concat);

        System.out.println("Primera mitad del texto: " +part1+ ". Segunda mitad del texto: " +part2);

        //Transforma la cadena de texto a mayusculas
        String cadena_mayusculas = cadena.toUpperCase();
        System.out.println("Texto en mayusculas: "+cadena_mayusculas);

    }

    public void Ejercicio2(){

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

    public void Ejercicio3(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una variable numerica: ");
        int n1 = teclado.nextInt();

        System.out.println("Introduce las ultimas cifras que quieras borrar: ");
        int p1 = teclado.nextInt();

        int divisor = (int) Math.pow(10, p1);

        int resultado = n1 /divisor;

        System.out.println("El numero despues de eliminar las ultimas: " +p1+ " cifras es: " +resultado);

    }

}
