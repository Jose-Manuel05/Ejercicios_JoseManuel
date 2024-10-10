package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica4 {

    public void practica4 (){

        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        try {

            System.out.println("Introduce el multiplicador (3 cifras):");
            num1 = scanner.nextInt();
            if (num1 == 0) {
                throw new IllegalArgumentException("El número no puede ser 0.");
            }
            if (num1 <= 0){
                throw new IllegalArgumentException("Introduce un valor positivo");
            }

            System.out.println("Introduce el multiplicador (3 cifras):");
            num2 = scanner.nextInt();
            if (num2 == 0) {
                throw new IllegalArgumentException("El número no puede ser 0.");
            }
            if (num2 <= 0){
                throw new IllegalArgumentException("Introduce un valor positivo");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, introduce un número válido.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        String operacion = Integer.toString(num1);
        String op1 = operacion.substring(2,3);
        String op2 = operacion.substring(1,2);
        String op3 = operacion.substring(0,1);

        int num_1 = Integer.parseInt(op1);
        int num_2 = Integer.parseInt(op2);
        int num_3 = Integer.parseInt(op3);

        int resultado1 = num1*num2;
        int resultado2 = num_1*num2;
        int resultado3 = num_2*num2;
        int resultado4 = num_3*num2;

        System.out.println("-----------------------");
        System.out.println("El producto de la multiplicacion es: " + resultado1 );
        System.out.println("El proceso es: ");
        System.out.println("    " + num1);
        System.out.println("x   " + num2);
        System.out.println("-----------");
        System.out.println("   " + resultado2);
        System.out.println("  " + resultado3 + "x");
        System.out.println(resultado4 + "xx");
        System.out.println("-----------");
        System.out.println(resultado1);

    }

}
