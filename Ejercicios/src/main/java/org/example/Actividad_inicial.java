package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad_inicial {

    public void ejecutar() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String nombre = entrada.next();

        System.out.println("A que curso vas?");
        String curso = entrada.next();
        System.out.println("Hola " + nombre + ", bienvenido a " + curso + ".");

        int num1 = 0;
        int num2 = 0;

        while (num1==0 || num2==0) {

            try {
                System.out.println("Introduce un número: ");
                num1 = entrada.nextInt();
                System.out.println("Introduce otro número:");
                num2 = entrada.nextInt();
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Introduce un número válido.");
            }

            if (num1 == 0 || num2 == 0) {
                System.out.println("Error. Una suma no puede ser 0.");
            }


            int resultado = num1 + num2;
            System.out.println("El resultado de sumar los dos números es: " + resultado);

        }
    }
}