package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vector {

    public void pruebaVector() {

        int vector[] = new int[7];

        vector[3] = 27;

        vector[6] = vector[3]*2;
        vector[1] = vector[6] - vector[3];

        System.out.println(vector[3]);

        for (int i=0 ; i < vector.length  ; i++){
            System.out.println(" " + vector + " ");
        }

        String palabras[] = new String[5];

        palabras[0] = "10";

        for (int i = 0 ; i < vector.length ; i++){
            System.out.println(" " + palabras + " ");
        }

    }

    public void vectoresEvo() {

        String palabras[] = {"Paco", "Pepe", "Manolo", "Antonio", "Alexandre"};

        for (String i : palabras){

            System.out.println(" " + i + " ");

        }

        System.out.println(Arrays.toString(palabras));

        String salida = Arrays.toString(palabras);
        salida = salida.replace("[", "").replace("]", "");
        System.out.println(salida);

        String palabras2 [] = palabras;
        String palabras3[] = palabras.clone();

        palabras3[0] ="Francisco";

        System.out.println(Arrays.toString(palabras2));
        System.out.println(Arrays.toString(palabras3));

        String palabrasCorto[] = new String[2];
        System.arraycopy(palabras, 0, palabrasCorto, 0, 2);



    }

    public void bateriaEj1(){

        int numeros[] = new int[8], suma = 0;

        Random aleatorios = new Random();


        for (int i = 0 ; i < numeros.length ; i++){

            numeros[i] = aleatorios.nextInt();
            suma += numeros[i];

        }

        System.out.println("El resultado es: " + suma);

    }

    public void bateriaEj2() {

        Scanner telcado = new Scanner(System.in);

        int numeros[] = new int[3], aux;

        System.out.println("Introduce los numeros a invertir: ");

        for (int i = 0 ; i < numeros.length ; i++){

            numeros[i] = telcado.nextInt();

        }

        for (int i = 0 ; 1 < numeros.length/2 ; i++){

            aux = numeros[i];
            numeros[i] = numeros [numeros.length-1-i];
            numeros[numeros.length-i] = aux;

        }

        System.out.println(Arrays.toString(numeros));

    }

    public void bateriaEj3() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeros [] = new int[25], num = 0, contador = 0;


        System.out.println("Introduce un numero [0,100]");

        do {

            if (teclado.hasNextInt()) {
                num = teclado.nextInt();
            }else {
                System.out.println("Introduce un formato valido");
                teclado.nextLine();
            }

        }while (num < 0 || num > 100);

        for (int i = 0 ; i < numeros.length ; i++){

            numeros[i] = aleatorio.nextInt(101);

        }

        for (int i = 0 ; i < numeros.length ; i++){

            if (num == numeros[i]){
                contador ++;
            }

            System.out.println(" " + numeros[i] + " ");

        }

        System.out.println("El número " + num + " aparece " + contador +" veces en el array.");

    }

    public void bateriaEj4() {

        Scanner teclado = new Scanner(System.in);

        int numeros[] = {1,3,5,7,9};

        System.out.println("Array original: ");
        for (int i = 0 ; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("Ingresa la posicion que deseas eliminar: ");
        int posicion = teclado.nextInt();

        for (int i = posicion ; i < numeros.length -1 ; i++){
            numeros[i] = numeros [i + 1];
        }

        numeros[numeros.length -1] = -1;

        System.out.println("Array resultante: ");
        for (int i = 0 ; i < numeros.length ; i++){
            if (numeros[i] != -1){
                System.out.print(numeros[i] + " ");
            }
        }

    }

    public void bateriaEj5() {

        int num[] = {4,8,5,10,98};

        System.out.println( Arrays.toString(num));

        int aux = num[num.length-1];

        for (int i = num.length -1 ; i >= 0 ; i--){
            if (i==0){
                num[i] = aux;
            }else {
                num[i] = num [i-1];
            }
        }

        System.out.println(Arrays.toString(num));

    }

    public void bateriaEj6() {

        int numeros[] = {1,2,3,2,1};

        System.out.print("Array: ");
        for (int i = 0 ; i < numeros.length ; i++){
            System.out.print(numeros[i] + " ");
        }

        boolean esSimetrico = true;
        for (int i = 0 ; i < numeros.length /2 ; i++){
            if (numeros[i] != numeros[numeros.length -1 -i]){
                esSimetrico = false;
                break;
            }
        }

        System.out.println("\nEs simétrico: " + (esSimetrico ? "SI" : "NO"));

    }

    public void bateriaEj7() {

        int num1[] = {1,2,3}, num2[] = {4,5,6};

        int numCombinado[] = new int[num1.length + num2.length];

        System.out.print("Array 1: ");
        for (int i = 0 ; i < num1.length ; i++){
            System.out.print(num1[i]);
        }
        System.out.println();

        System.out.print("Array 2: ");
        for (int i = 0 ; i < num2.length ; i++){
            System.out.print(num2[i]);
        }
        System.out.println();

        for (int  i = 0 ; i < num1.length ; i++){
            numCombinado[i] = num1[i];
        }

        for (int i = 0 ; i < num2.length ; i++){
            numCombinado[num1.length + i] = num2[i];
        }

        System.out.print("Array combinado: ");
        for (int i = 0 ; i < numCombinado.length ; i++){
            System.out.print(numCombinado[i] + " ");
        }

    }

    public void bateriaEj8() {

    }

    public void bateriaEj9() {

    }

    public void bateriaEj10() {

    }
}
