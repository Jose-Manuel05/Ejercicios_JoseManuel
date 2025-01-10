package org.example;

import java.util.Scanner;

public class tabalaMultiplicar {

    static Scanner in = new Scanner(System.in);

    public static void main (String[] args) {

        int tabla = pedirTabla();
        boolean valida = validarTabla(tabla);

        if (valida) {
            calcularTablas(tabla);
        }else {
            System.out.println("La Tabla introducida no es válida");
        }

        int cuadrado = calcularCuadrado(tabla);
        System.out.println("El cuadrado de la tabla es: " + cuadrado);

    }

    public static int calcularCuadrado(int tabla) {

        return tabla * tabla;

    }

    public static int pedirTabla() {

        System.out.println("Introduce la tabla que quieras [1-10]: ");
        int tabla = in.nextInt();

        return tabla;
    }

    public static boolean validarTabla(int tabla) {

        if (tabla < 1 || tabla > 10) {
            System.out.println("Tabla no válida");
            return false;
        } else {
            return true;
        }
    }

    public static void calcularTablas(int tabla) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + tabla * i);
        }
    }

}
