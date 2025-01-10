package org.example;

/**
 * Pantallas de carga
 * author Jose
 * version 1.0 (13/12/24)
 * Esta clase contiene métodos para validar bloques de 8x8 en una imagen y determinar si una imagen es válida
 * según ciertas reglas.
 */

public class pantallasDeCarga {

    static java.util.Scanner in;

    /**
     * Método principal que lee el número de casos de prueba y ejecuta cada caso de prueba.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    }

    /**
     * Método que valida un bloque de 8x8 de una imagen.
     * @param imagen Imagen a validar.
     * @param inicioFila Fila de inicio del bloque.
     * @param inicioColumna Columna de inicio del bloque.
     * @return true si el bloque es válido, false en caso contrario.
     */
    public static boolean validarBloque(char[][] imagen, int inicioFila, int inicioColumna) {
        int[] cuentaColor = new int[15];
        int colorUnico = 0;

        // Recorremos el bloque 8x8 comenzando desde las coordenadas dadas
        for (int i = inicioFila; i < inicioFila + 8; i++) {
            for (int j = inicioColumna; j < inicioColumna + 8; j++) {
                // Calculamos el índice del color basado en el carácter de la celda ('A' -> 0, 'B' -> 1, ...)
                int indiceColor = imagen[i][j] - 'A';
                // Si es la primera vez que encontramos este color, incrementamos el contador de colores únicos
                if (cuentaColor[indiceColor] == 0) {
                    colorUnico++;
                }
                // Incrementamos el contador para este color específico
                cuentaColor[indiceColor]++;
                // Si ya hay más de 2 colores únicos, el bloque no es válido, retornamos false
                if (colorUnico > 2) return false;
            }
        }

        return true;
    }

    /**
     * Método que valida una imagen completa dividiéndola en bloques de 8x8.
     * @param imagen Imagen a validar.
     * @param altura Altura de la imagen.
     * @param anchura Anchura de la imagen.
     * @return true si la imagen es válida, false en caso contrario.
     */
    public static boolean validarImagen(char[][] imagen, int altura, int anchura) {
        // Validamos cada bloque de 8x8 de la imagen
        for (int fila = 0; fila < anchura; fila += 8) {
            for (int columna = 0; columna < altura; columna += 8) {
                if (!validarBloque(imagen, fila, columna)) {
                    return false; // Si un bloque no es válido, la imagen completa no lo es
                }
            }
        }
        return true; // Todos los bloques son válidos
    }

    /**
     * Método que lee una imagen desde la entrada.
     * @param altura Altura de la imagen.
     * @param anchura Anchura de la imagen.
     * @return Matriz de caracteres que representa la imagen.
     */
    public static char[][] leerImagen(int altura, int anchura) {
        char[][] imagen = new char[anchura][altura];
        for (int i = 0; i < anchura; i++) {
            imagen[i] = in.nextLine().toCharArray();
        }
        return imagen;
    }

    /**
     * Método que ejecuta un caso de prueba, validando una imagen y mostrando el resultado.
     */
    public static void casoDePrueba() {
        // Leer altura y anchura
        int altura = in.nextInt();
        int anchura = in.nextInt();
        in.nextLine();

        // Validación inicial
        if (altura == 0 && anchura == 0) {
            throw new IllegalArgumentException("Dimensiones no válidas.");
        }

        // Leer la imagen
        char[][] imagen = leerImagen(altura, anchura);

        // Validar la imagen
        boolean valido = validarImagen(imagen, altura, anchura);

        // Imprimir resultado
        if (valido) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}

