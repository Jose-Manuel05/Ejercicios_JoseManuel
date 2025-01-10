package org.example;

public class metodos {

    public static int gradosKelvin(int celcius) {

        final int CTE_KELVIN = 273;
        int kelvin = celcius + CTE_KELVIN;

        return kelvin;
    }

    public static void pruebaMismaClase() {

        gradosKelvin(17);

    }



}