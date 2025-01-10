package org.example;

import java.util.Scanner;

public class bateriaMetodos2 {

    public static void mostrarMenu(String[] opciones) {

        System.out.println("Menu:");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". "+ opciones[i]);
        }
        System.out.println((opciones.length + 1) + ". Salir");
    }

    public static int principal() {

        Scanner teclado = new Scanner(System.in);

        int opcionSeleccionada = -1;

        String[] opciones = {
                "Ver información",
                "Editar datos",
                "Eliminar registro"
        };

        do {
            opcionSeleccionada = teclado.nextInt();
            mostrarMenu(opciones);

            System.out.print("Selecciona una opción: ");
            switch (opcionSeleccionada) {
                case 1:
                    System.out.println("Has seleccionado: " + opciones[0]);
                    break;
                case 2:
                    System.out.println("Has seleccionado: " + opciones[1]);
                    break;
                case 3:
                    System.out.println("Has seleccionado: " + opciones[2]);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Por favor, selecciona una opción válida.");
                    break;
            }

        }while (opcionSeleccionada != opciones.length + 1);


        return 0;

    }

}

