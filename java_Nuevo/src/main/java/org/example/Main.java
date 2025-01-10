package org.example;

public class Main {

    public static void precioTotal(float precioUd, int uds) {

        float precioT;

        System.out.println("Calculo función de precio total de un producto.");
        precioT = precioUd*uds;
        System.out.println("Precio total = " + precioT);

    }

    public static void main(String[] args) {


        precioTotal(52.87f,4);


    }
}