package org.example;

import java.util.Random;
import java.util.Scanner;

public class bateriasMatrices {

    public void practica1() {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Llena una matriz de tamaño 3x3: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el número para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Ingresa el numero que quieas buscar: ");
        int buscar = teclado.nextInt();

        boolean encontrado = false;
        int fila = -1, columna = -1;

        buscar:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == buscar) {
                    encontrado = true;
                    fila = i;
                    columna = j;
                    break buscar;
                }
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado en la posición: [" + fila + "][" + columna + "]");
        } else {
            System.out.println("Número no encontrado en la matriz.");
        }

    }

    public void practica2() {

        Random aleatorio = new Random();

        int filas = aleatorio.nextInt(5) + 1;
        int columnas = aleatorio.nextInt(5) + 1;

        int [][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = aleatorio.nextInt(10) + 1;
            }
        }

        int[] sumaFilas = new int[filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }

        int[] sumaColumnas = new int[columnas];
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSuma de filas:");
        for (int i = 0; i < filas; i++) {
            System.out.println("Fila " + (i + 1) + ": " + sumaFilas[i]);
        }

        System.out.println("\nSuma de columnas:");
        for (int j = 0; j < columnas; j++) {
            System.out.println("Columna " + (j + 1) + ": " + sumaColumnas[j]);
        }
    }

    public void practica3() {

        Scanner sc = new Scanner(System.in);

        //Preguntar la cantidad de estudiantes
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes = sc.nextInt();

        //Preguntar cantidad asignaturas
        System.out.print("Ingrese la cantidad de asignaturas: ");
        int numAsignaturas = sc.nextInt();

        //Crear Matriz
        String[][] matriz = new String[numEstudiantes + 1][numAsignaturas + 1];

        matriz[0][0] = "Nombre/Asignaturas";
        //Rellenar Estuantes
        for (int i = 1; i <= numEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + i + ": ");
            matriz[i][0] = sc.next();
        }

        //Rellenar Aisgnaturas
        for (int j = 1; j <= numAsignaturas; j++) {
            System.out.print("Ingrese el nombre de la asignatura " + j + ": ");
            matriz[0][j] = sc.next();
        }

        //Pedir notas por alumno y asignatura
        double[][] notas = new double[numEstudiantes][numAsignaturas];
        for (int i = 1; i <= numEstudiantes; i++) {
            System.out.println("Ingrese las notas para " + matriz[i][0] + ":");
            for (int j = 1; j <= numAsignaturas; j++) {
                System.out.print("Nota de " + matriz[0][j] + ": ");
                notas[i - 1][j - 1] = sc.nextDouble();
            }
        }

        //Calcular promedio estudiantes y por asignatura
        System.out.println("Resultados:");
        double[] promedioPorAlumno = new double[numEstudiantes];
        double[] promedioPorAsignatura = new double[numAsignaturas];

        //Promedio Estudiantes
        for (int i = 0; i < numEstudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < numAsignaturas; j++) {
                suma += notas[i][j];
            }
            promedioPorAlumno[i] = suma / numAsignaturas;
            System.out.println("Promedio de " + matriz[i + 1][0] + ": " + promedioPorAlumno[i]);
        }

        //Promedio Asignatura
        for (int j = 0; j < numAsignaturas; j++) {
            double suma = 0;
            for (int i = 0; i < numEstudiantes; i++) {
                suma += notas[i][j];
            }
            promedioPorAsignatura[j] = suma / numEstudiantes;
            System.out.println("Promedio de " + matriz[0][j + 1] + ": " + promedioPorAsignatura[j]);
        }
    }

}
