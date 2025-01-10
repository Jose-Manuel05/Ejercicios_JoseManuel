package org.example;

public class a {

    public class solution { // Asume fichero llamado solution.java

        // Escáner para leer la entrada de los casos de prueba
        static java.util.Scanner in;

        /**
         * Metodo que resuelve un caso de prueba.
         */
        public static void casoDePrueba() {

            // Leer las dimensiones de la imagen (ancho y alto)
            int ancho = in.nextInt();
            int alto = in.nextInt();
            in.nextLine(); // Consumir el salto de línea restante después de los enteros

            // Crear una matriz para almacenar los píxeles de la imagen
            char[][] imagen = new char[alto][ancho];

            // Leer cada fila de la imagen y guardarla en la matriz
            for (int i = 0; i < alto; i++) {
                String line = in.nextLine(); // Leer la fila como una cadena
                imagen[i] = line.toCharArray(); // Convertir la cadena en un arreglo de caracteres
            }

            // Variable que indica si la imagen es válida según las reglas
            boolean valido = true;

            // Recorrer los bloques de 8x8 píxeles en la imagen
            for (int fila = 0; fila < alto && valido; fila += 8) {
                for (int columna = 0; columna < ancho; columna += 8) {
                    // Validar cada bloque de 8x8
                    if (!isBlockValid(imagen, fila, columna)) {
                        // Si algún bloque no es válido, marcamos como inválido
                        valido = false;
                        break;
                    }
                }
            }

            // Imprimir el resultado: "SI" si es válida, "NO" si no lo es
            System.out.println(valido ? "SI" : "NO");
        } // fin de casoDePrueba

        /**
         * Metodo que verifica si un bloque de 8x8 cumple las condiciones.
         * @param imagen La matriz que representa la imagen completa
         * @param inicioFila La fila inicial del bloque
         * @param inicioColumna La columna inicial del bloque
         * @return true si el bloque es válido, false si no lo es
         */
        private static boolean isBlockValid(char[][] imagen, int inicioFila, int inicioColumna) {
            // Arreglo para contar la frecuencia de cada color (A-O, 15 colores)
            int[] cuentaColor = new int[15];
            // Contador para los colores únicos en el bloque
            int colorUnico = 0;

            // Recorrer las filas del bloque de 8x8
            for (int i = inicioFila; i < inicioFila + 8; i++) {
                // Recorrer las columnas del bloque de 8x8
                for (int j = inicioColumna; j < inicioColumna + 8; j++) {
                    // Calcular el índice del color (A=0, B=1, ..., O=14)
                    int indiceColor = imagen[i][j] - 'A';

                    // Si el color aún no ha sido contado, incrementamos el contador de colores únicos
                    if (cuentaColor[indiceColor] == 0) {
                        colorUnico++;
                    }

                    // Incrementar la cuenta del color actual
                    cuentaColor[indiceColor]++;

                    // Si hay más de 2 colores únicos, el bloque no es válido
                    if (colorUnico > 2) return false;
                }
            }

            // Si el bloque tiene 2 o menos colores únicos, es válido
            return true;
        }

        /**
         * Metodo principal que inicia el programa.
         * Lee el número de casos de prueba y procesa cada uno.
         */
        public static void main(String[] args) {
            // Inicializar el escáner para leer la entrada
            in = new java.util.Scanner(System.in);

            // Leer el número de casos de prueba
            int numCasos = in.nextInt();

            // Procesar cada caso de prueba
            for (int i = 0; i < numCasos; i++) {
                casoDePrueba(); // Llamar al metodo que resuelve un caso
            }
        } // fin de main
    } // fin de la clase solution

}
