package org.example;

import java.util.Scanner;

public class Actividad_inicial {

    public void ejecutar() {

        System.out.println("Como te llamas?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("A que curso vas?");
        String curso = entrada.next();
        System.out.println("Hola " + nombre + ", bienvenido a " + curso + ".");

        System.out.println("Introduce un número: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduce otro número:");
        int num2 = entrada.nextInt();

        if (num1==0 || num2==0){
            System.out.println("Error. Una suma no puede ser 0.");
        }
        else {

            int resultado = num1 + num2;
            System.out.println("El resultado de sumar los dos números es: " + resultado);

        }
    }
}