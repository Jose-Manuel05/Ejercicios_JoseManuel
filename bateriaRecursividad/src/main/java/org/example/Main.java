import org.example.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    //Limpiar la pantalla
    public static void borrar() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    // Menu
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            borrar();
            System.out.println("*** Batería de ejercicios sobre recursividad ***");
            System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
            System.out.println("1 - Dígitos");
            System.out.println("2 - Potencias");
            System.out.println("3 - Del Revés numero");
            System.out.println("4 - Del Revés char");
            System.out.println("5 - Binario");
            System.out.println("6 - A binario");
            System.out.println("7 - Orden alfabético");
            System.out.println("8 - Mostrar suma");
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
                    Ejercicio3_numero.main(args);
                    break;
                case "4":
                    Ejercicio3_char.main(args);
                    break;
                case "5":
                    Ejercicio4.main(args);
                    break;
                case "6":
                    Ejercicio5.main(args);
                    break;
                case "7":
                    Ejercicio6.main(args);
                    break;
                case "8":
                    Ejercicio7.main(args);
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
