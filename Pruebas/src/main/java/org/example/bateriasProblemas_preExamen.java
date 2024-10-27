package org.example;

import java.util.Scanner;

public class bateriasProblemas_preExamen {

    public void ejercicio1() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la cantidad de numeros que quieres introducir: ");
        int numeros = teclado.nextInt();

        int mayorCero = 0, menorCero = 0, igualCero = 0;

        for (int i = 0; i < numeros; i++) {
            System.out.print("Introduce un número: ");
            int numero = teclado.nextInt();

            if (numero > 0) {
                mayorCero++;
            } else if (numero < 0) {
                menorCero++;
            } else {
                igualCero++;
            }
        }

        System.out.println("La cantidad de numeros mayores que 0 es: " + mayorCero);
        System.out.println("La cantidad de numeros menores que 0 es: " + menorCero);
        System.out.println("La cantidad de numeros iguales que 0 es: " + igualCero);
    }


    public void ejercicio2() {

        Scanner telcado = new Scanner(System.in);

        System.out.println("Introduce la base del numero: ");
        double base = telcado.nextDouble();
        System.out.println("Introduce el exponente: ");
        int exponenete = telcado.nextInt();

        if (exponenete < 0) {
            System.out.println("El exponente tiene que ser mayor a 0...");
        }else {
            double resultado = 1;
            for (int i = 0 ; i < exponenete ; i++){
                resultado *= base;
            }

            System.out.println("El resultado de " + base + " elevado a " + exponenete + " es: " + resultado);
        }
    }


    public void ejercicio3() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la catidad de meses que deseas fianciar: ");
        int meses = teclado.nextInt();

        int pagoMensual = 10, totalApagar = 0;

        for (int i = 1 ; i <= meses ; i++){
            System.out.println("Mes " + i + ": " + pagoMensual + "€");
            totalApagar += pagoMensual;
            pagoMensual *= 2;
        }

        System.out.println("Total a pagar: " + totalApagar + "€");

    }
    public void ejercicio4() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una nota: ");
        int nota = teclado.nextInt();

        String resultado = switch (nota) {
            case 0, 1, 2, 3, 4 -> "INSUFICIENTE";
            case 5 -> "SUFICIENTE";
            case 6 -> "BIEN";
            case 7, 8 -> "NOTABLE";
            case 9, 10 -> "SOBRESALIENTE";
            default -> "No válido";
        };

        System.out.println("La calificación es: " + resultado);


    }
    public void ejercicio5() {

        Scanner teclado = new Scanner(System.in);

        int sueldomax = 0, sueldomayorMil = 0;

        for (int i = 1 ; i <= 5 ; i++){
            System.out.println("Introduce el sueldo " + i + ": ");
            int sueldo = teclado.nextInt();

            if (sueldo > sueldomax) {
                sueldomax = sueldo;
            }
            if (sueldo > 1000) {
                sueldomayorMil++;
            }
        }

        System.out.println("El sueldo máximo es: " + sueldomax + "€");
        System.out.println("Número de sueldos mayores de 1000€: " + sueldomayorMil);


    }
    public void ejercicio6() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el numero de alumnos: ");
        int num = teclado.nextInt();

        int sumaEdades = 0, sumaAlturas = 0, mayoresDeEdad = 0, mayoresDe175 = 0;

        for (int i = 1 ; i <= num ; i++){
            System.out.println("Ingresa la edad del alumno");
            int edad = teclado.nextInt();
            System.out.println("Ingresa la alutura del alumno");
            int altura = teclado.nextInt();

            sumaEdades += edad;
            sumaAlturas += altura;

            if (edad >= 18 ){
                mayoresDeEdad++;
            }
            if (altura > 175 ){
                mayoresDe175++;
            }
        }

        double edadMedia = (double) sumaEdades /num;
        double alturaMedia = (double) sumaAlturas /num;

        System.out.println("Edad media: " + edadMedia);
        System.out.println("Altura media: " + alturaMedia + " cm");
        System.out.println("Cantidad de alumnos mayores de 18 años: " + mayoresDeEdad);
        System.out.println("Cantidad de alumnos que miden más de 175 cm: " + mayoresDe175);


    }
    public void ejercicio7() {

        Scanner teclado = new Scanner(System.in);

        int n;

        do {
            System.out.print("Ingrese el número de términos de la secuencia (entero positivo): ");
            n = teclado.nextInt();
            if (n <= 0) {
                System.out.println("Número inválido. Por favor ingrese un entero positivo.");
            }
        } while (n <= 0);

        System.out.print("Secuencia de Números: ");

        int num1 = 0, num2 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;

        }

    }
}
