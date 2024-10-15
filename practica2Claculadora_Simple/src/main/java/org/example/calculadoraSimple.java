package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadoraSimple {

    public void calculadora () {

        Scanner teclado = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("Bienvenido al programa de calculadora.");

        int num1 = 0;
        int num2 = 0;
        String op = "";

        boolean opValido = false;

        try {

            System.out.println("Introduce el primer numero: ");
            num1 = teclado.nextInt();

            System.out.println("Introduce el operando (+, -, *, /, r (para la raiz cuadrada)): ");
            op = teclado.next();

            System.out.println("Introduce el segundo numero: ");
            num2 = teclado.nextInt();


        }catch (InputMismatchException e){
            System.out.println("Error, introduce un valor numerico correcto. " + e.getMessage());
        }

        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("r")) {
            opValido = true;
        } else {
            System.out.println("Erro, operador no válido.");
        }

        if (op.equals("r")) {
            if (num1 < 0) {
                System.out.println("Error, no puedes introducir un numero negativo");
            }else {
                double resultado = Math.sqrt(num1);
                System.out.println("La raiz cuadrade de " +num1+ " es: " +resultado);
            }

        }else {

            switch (op) {

                case "+":
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Resultado: " + (num1 * num2));
                case "/":
                    if (num1 == 0|| num2 == 0) {
                        System.out.println("Error: No se puede dividir por cero.");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    break;
            }
        }



    }

}
