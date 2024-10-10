package org.example;
import java.util.Scanner;


public class ClaculadoraSimple {

    public void calculadoraSimple () {

            Scanner scanner = new Scanner(System.in);

            // Mostrar opciones de operación al usuario
            System.out.println("Calculadora Simple");
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Elija una opción (1-4): ");
            int opcion = scanner.nextInt();

            // Pedir los dos números
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            // Variable para almacenar el resultado
            int resultado = 0;

            // Realizar la operación basada en la elección del usuario
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            scanner.close();
    }
}

