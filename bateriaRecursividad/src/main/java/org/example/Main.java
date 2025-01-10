import org.example.Ejercicio1;
import org.example.Ejercicio2;
import org.example.Ejercicio3;
import org.example.Ejercicio4;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    // Método para limpiar la pantalla
    public static void borrar() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    // Método principal
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            borrar();
            System.out.println("*** Batería de ejercicios sobre recursividad ***");
            System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
            System.out.println("1 - Dígitos");
            System.out.println("2 - Potencias");
            System.out.println("3 - Del Revés");
            System.out.println("4 - Binario");
            System.out.println("5 - A binario");
            System.out.println("6 - Orden alfabético");
            System.out.println("7 - Mostrar suma");
            System.out.println("X - Salir");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine().toUpperCase();

            switch (opcion) {
                case "1":
                    Ejercicio1.main(args);
                    break;
                case "2":
                    Ejercicio2.main(args);
                    break;
                case "3":
                    Ejercicio3.main(args);
                    break;
                case "4":
                    Ejercicio4.main(args);
                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "X":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    pausa();
            }
        } while (!opcion.equals("X"));

        scanner.close();
    }


    // Método para pausar y permitir al usuario decidir qué hacer después
    private static void pausa() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nElige una opción:");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - Salir");
        System.out.print("Elige una opción: ");

        String opcion = scanner.nextLine().toUpperCase();
        if (opcion.equals("X")) {
            System.exit(0);
        }
    }
}
