package org.example;

import java.util.Scanner;

/**
 * @author Jose
 * @version 1.0 (10/12/24)
 */
public class Ventas {

    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        float dato = teclado.nextFloat();
        if (dato == -1) {
            return false;
        }else {
            float[] semana = rellenarDatos(dato);
            System.out.println("----");
            System.out.println("----");
            System.out.println("Día de más ventas: Día " + (diasMasVentas(semana) + 1));
            System.out.println("Día de menos ventas: Día " + (diasMenosVentas(semana) + 1));
            System.out.println("Media semanal: " + calcularMediaSemanal(semana));
            System.out.println("Recaudación del domingo: " + semana[6]);
            return true;
        }
    } //casosDePrueba

    /**
     * Metodo para rellanar un vector que contenga los datos introducudos 
     * @param dato se recibe un numero para poder completar la entrada de datos
     * @return datos[] devolvemos un array con los datos
     */
    public static float[] rellenarDatos(float dato) {

        float[] datos = new float[6];

        datos[0] = dato;

        for (int i = 0; i < datos.length; i++) {
            System.out.println("Introduce la recaudación del día " + (i + 1) + ": ");
            datos[i] = teclado.nextFloat();
        }

        return datos;

    }

    public static int diasMasVentas(float[] datos){
        int diaMax = 0;
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] < datos[diaMax]){
                diaMax = i;
            }
        }
        return diaMax;
    }

    public static int diasMenosVentas(float[] datos) {
        int diaMin = 0;
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] < datos[diaMin]){
                diaMin = i;
            }
        }
        return diaMin;
    }


    public static float calcularMediaSemanal(float[] datos) {
        float suma = 0;
        for (float venta : datos) {
            suma += venta;
        }
        return suma/ datos.length;
    }

}
