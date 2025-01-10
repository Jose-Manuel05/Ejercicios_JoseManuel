package org.example;


public class drHouse {

    static java.util.Scanner in;

    public static String pregunta(String p) {

        System.out.println(p);

        String respuesta = in.nextLine();

        return respuesta;

    }

    public static void triaje(String nombre) {

        String respuesta = "";
        System.out.println(nombre);

        respuesta = pregunta("¿Ha tenido usted "+nombre+" alguna caida?");
        System.out.println(respuesta);

    }

    public static void main(String[] args) {

        triaje("Jose");

    }

}
