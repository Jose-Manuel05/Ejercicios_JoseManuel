package org.example;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Bucles {

    public void ejercicio1() {

        Scanner teclado = new Scanner(System.in);

        String password = "patata";
        String passUsuario;

        do {

            System.out.println("Introduce tu contraseña");
            passUsuario = teclado.next();

        }while (!passUsuario.equals(password));

        System.out.println("Contraseña correcta. Binevenido");

    }

    public void ejercicio2() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();

        for (int i=num;i>=1;i--){

            System.out.println(i);

        }

    }

    public void ejercicio3() {

        for (int i = 1;i<=50;i++){

            if (i%3 == 0){
                System.out.println(i);
            }

        }

    }

    public void ejercicio4() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres: ");
        String cadena = teclado.next();

        for (int i = 0;i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
        }

    }

    public void ejercicio5() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = teclado.nextInt();

        System.out.println("La tabla de multiplicar de " + num +" es: ");

        for (int i = 1 ; i<=10 ; i++){

            int resultado = num*i;
            System.out.println(num +  " x " + i + " = " + resultado );

        }

    }

    public void ejercicio6() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres sumar: ");
        int num = teclado.nextInt();

        int resultado = 0;

        for (int i = 1 ; i<=num ; i++){
            System.out.println("Inserta nº"+ i +":");
            int num2 = teclado.nextInt();
            resultado += num2;
        }
        System.out.println("El resultado es: " + resultado);


    }

    public void ejercicio7() {

        Scanner telcado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = telcado.nextInt();
        long factorial = 1;


        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println( "El numero factorial de " + num + " es: "+ factorial);

    }

    public void ejercicio8() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i); // Agregar el carácter al resultado
        }

        System.out.println("Cadena invertida: " + cadenaInvertida);

    }

}

