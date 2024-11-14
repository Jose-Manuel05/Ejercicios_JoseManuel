package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcionPrincipal;

        Bucles bucles = new Bucles();
        Exepciones excepciones = new Exepciones();
        claseRandom claseRandom = new claseRandom();
        bateriasProblemas_preExamen bateriasProblemasPreExamen = new bateriasProblemas_preExamen();
        vector vector = new vector();

        do {
            // Menú Principal
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Menu Bucles");
            System.out.println("2. Menu Excepciones");
            System.out.println("3. Menu Random");
            System.out.println("4. Menu Pre-Examen");
            System.out.println("5. Menu Vectores");
            System.out.println("Salir");
            System.out.print("Seleccione una opción: ");

            if (teclado.hasNextInt()) {
                opcionPrincipal = teclado.nextInt();

                switch (opcionPrincipal) {
                    case 1:
                        menuBucles(bucles, teclado);
                        volverMenu();
                        break;
                    case 2:
                        menuExcepciones(excepciones, teclado);
                        volverMenu();
                        break;
                    case 3:
                        menuRandom(claseRandom, teclado);
                        volverMenu();
                        break;
                    case 4:
                        preExamen(bateriasProblemasPreExamen, teclado);
                        volverMenu();
                        break;
                    case 5:
                        vector(vector, teclado);
                        volverMenu();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Elije una opcion del menu");
                }
            } else {
                System.out.println("Por favor, introduzca un número válido.");
                teclado.next();
                opcionPrincipal = 0;
            }
        } while (opcionPrincipal != 10);

        teclado.close();
    }

    private static void menuBucles(Bucles bucles, Scanner teclado) {
        int opcionBucles;
        do {
            System.out.println("\n--- Menú Bucles ---");
            System.out.println("1. Ejecutar Ejercicio 1");
            System.out.println("2. Ejecutar Ejercicio 2");
            System.out.println("3. Ejecutar Ejercicio 3");
            System.out.println("4. Ejecutar Ejercicio 4");
            System.out.println("5. Ejecutar Ejercicio 5");
            System.out.println("6. Ejecutar Ejercicio 6");
            System.out.println("7. Ejecutar Ejercicio 7");
            System.out.println("8. Ejecutar Ejercicio 8");
            System.out.println("9. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            if (teclado.hasNextInt()) {
                opcionBucles = teclado.nextInt();
                switch (opcionBucles) {
                    case 1:
                        bucles.ejercicio1();
                        volverMenu();
                        break;
                    case 2:
                        bucles.ejercicio2();
                        volverMenu();
                        break;
                    case 3:
                        bucles.ejercicio3();
                        volverMenu();
                        break;
                    case 4:
                        bucles.ejercicio4();
                        volverMenu();
                        break;
                    case 5:
                        bucles.ejercicio5();
                        volverMenu();
                        break;
                    case 6:
                        bucles.ejercicio6();
                        volverMenu();
                        break;
                    case 7:
                        bucles.ejercicio7();
                        volverMenu();
                        break;
                    case 8:
                        bucles.ejercicio8();
                        volverMenu();
                        break;
                    case 0:
                        System.out.println("Volviendo al Menú Principal...");
                        break;
                    default:
                        System.out.println("Opción no válida. Elija entre 1 y 9.");
                }
            } else {
                System.out.println("Por favor, introduzca un número válido.");
                teclado.next();
                opcionBucles = 0;
            }
        } while (opcionBucles != 9);
    }

    private static void menuExcepciones(Exepciones excepciones, Scanner teclado) {
        int opcionExcepciones;
        do {
            System.out.println("\n--- Menú Excepciones ---");
            System.out.println("1. Ejecutar Manejo de Excepción 1");
            System.out.println("2. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            if (teclado.hasNextInt()) {
                opcionExcepciones = teclado.nextInt();
                switch (opcionExcepciones) {
                    case 1:
                        excepciones.exepciones();
                        volverMenu();
                        break;
                    case 0:
                        System.out.println("Volviendo al Menú Principal...");
                        volverMenu();
                        break;
                    default:
                        System.out.println("Opción no válida. Elija entre 1 y 3.");
                }
            } else {
                System.out.println("Por favor, introduzca un número válido.");
                teclado.next();
                opcionExcepciones = 0;
            }
        } while (opcionExcepciones != 2);
    }

    private static void menuRandom(claseRandom claseRandom, Scanner teclado) {
        int opcionRandom;
        do {
            System.out.println("\n --- Menu Random ---");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3 ");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            if (teclado.hasNextInt()){
                opcionRandom = teclado.nextInt();
                switch (opcionRandom){
                    case 1:
                        claseRandom.ejercicioRandom1();
                        volverMenu();
                        break;
                    case 2:
                        claseRandom.ejercicioRandom2();
                        volverMenu();
                        break;
                    case 3:
                        claseRandom.ejercicioRandom3();
                        volverMenu();
                        break;
                    case 4:
                        claseRandom.ejercicioRandom4();
                        volverMenu();
                        break;
                    case 0:
                        System.out.println("Volviendo al Menú Principal...");
                        break;
                    default:
                        System.out.println("Opción no válida. Elija entre 1 y 4.");
                }
            }else {
                System.out.println("Por favor, introduzca un número válido.");
                teclado.next();
                opcionRandom = 0;
            }
        }while (opcionRandom != 5);

    }

    private static void preExamen(bateriasProblemas_preExamen bateriasProblemasPreExamen, Scanner teclado) {
        int opcionPrexamen;
        do {
            System.out.println("\n --- Menu Pre-Examen ---");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("5. Ejercicio 6");
            System.out.println("5. Ejercicio 7");
            System.out.println("Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            if (teclado.hasNextInt()){
                opcionPrexamen = teclado.nextInt();
                switch (opcionPrexamen){
                    case 1:
                        bateriasProblemasPreExamen.ejercicio1();
                        volverMenu();
                        break;
                    case 2:
                        bateriasProblemasPreExamen.ejercicio2();
                        volverMenu();
                        break;
                    case 3:
                        bateriasProblemasPreExamen.ejercicio3();
                        volverMenu();
                        break;
                    case 4:
                        bateriasProblemasPreExamen.ejercicio4();
                        volverMenu();
                        break;
                    case 5:
                        bateriasProblemasPreExamen.ejercicio5();
                        volverMenu();
                        break;
                    case 6:
                        bateriasProblemasPreExamen.ejercicio6();
                        volverMenu();
                        break;
                    case 7:
                        bateriasProblemasPreExamen.ejercicio7();
                        volverMenu();
                        break;
                    case 0:
                        System.out.println("Volviendo al Menú Principal...");
                        break;
                    default:
                        System.out.println("Opción no válida. Elija entre 1 y 7.");
                }
            }else {
                System.out.println("Por favor, introduzca un número válido.");
                teclado.next();
                opcionPrexamen = 0;
            }

        }while (opcionPrexamen != 8);
    }

    private static void vector(vector vector, Scanner teclado) {
        int opcionArrays = 0;
        do {
            System.out.println("\n --- Menu Array ---");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("8. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Prueba Vector");
            System.out.println("12. Vector Evo");
            System.out.println("13. Navidad");
            System.out.print("Seleccione una opción: ");

            if (teclado.hasNextInt()) {
                opcionArrays = teclado.nextInt();
                switch (opcionArrays) {
                    case 1:
                        vector.bateriaEj1();
                        volverMenu();
                        break;
                    case 2:
                        vector.bateriaEj2();
                        volverMenu();
                        break;
                    case 3:
                        vector.bateriaEj3();
                        volverMenu();
                        break;
                    case 4:
                        vector.bateriaEj4();
                        volverMenu();
                        break;
                    case 5:
                        vector.bateriaEj5();
                        volverMenu();
                        break;
                    case 6:
                        vector.bateriaEj6();
                        volverMenu();
                        break;
                    case 7:
                        vector.bateriaEj7();
                        volverMenu();
                        break;
                    case 8:
                        vector.bateriaEj8();
                        volverMenu();
                        break;
                    case 9:
                        vector.bateriaEj9();
                        volverMenu();
                        break;
                    case 10:
                        vector.bateriaEj10();
                        volverMenu();
                        break;
                    case 11:
                        vector.pruebaVector();
                        volverMenu();
                        break;
                    case 12:
                        vector.vectoresEvo();
                        volverMenu();
                        break;
                    case 13:
                        vector.navidad();
                        volverMenu();
                        break;
                    default:
                        System.out.println("Presione enter para salir al menu principal");

                }

            }
        } while (opcionArrays != 11);
    }

    private static void volverMenu() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Presiona enter para salir... ");
        teclado.nextLine();
    }
}
