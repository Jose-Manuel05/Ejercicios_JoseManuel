package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class simulacionSorteo {

    public void practica1() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce tu boleto en formato N-N-N-N-N-N/R:");
        String boleto = scanner.nextLine();

        if (!boleto.matches("(\\d{1,2}-){5}\\d{1,2}/\\d")) {
            System.out.println("Formato de boleto inválido.");
            return;
        }

        String[] partes = boleto.split("[-/]");
        int[] numerosUsuario = new int[6];
        int reintegroUsuario;

        for (int i = 0; i < 6; i++) {
            numerosUsuario[i] = Integer.parseInt(partes[i]);
            if (numerosUsuario[i] < 1 || numerosUsuario[i] > 49) {
                System.out.println("Los números deben estar entre 1 y 49.");
                return;
            }
        }
        reintegroUsuario = Integer.parseInt(partes[6]);
        if (reintegroUsuario < 0 || reintegroUsuario > 9) {
            System.out.println("El reintegro debe estar entre 0 y 9.");
            return;
        }

        Random aleatorio = new Random();
        int[] numerosSorteo = new int[6];
        int indice = 0;

        while (indice < 6) {
            int num = aleatorio.nextInt(49) + 1;
            boolean repetido = false;

            for (int i = 0; i < indice; i++) {
                if (numerosSorteo[i] == num) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                numerosSorteo[indice++] = num;
            }
        }

        Arrays.sort(numerosSorteo);

        Integer numeroComplementario;

        do {
            numeroComplementario = aleatorio.nextInt(49) + 1;
        }while (Arrays.asList(numerosSorteo).contains(numeroComplementario));

        int reintegroSorteo = aleatorio.nextInt(10);

        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteo));
        System.out.println("Número complementario: " + numeroComplementario);
        System.out.println("Reintegro sorteado: " + reintegroSorteo);

        int aciertos = 0;
        for (int i = 0; i < numerosUsuario.length; i++) {
            for (int j = 0; j < numerosSorteo.length; j++) {
                if (numerosUsuario[i] == numerosSorteo[j]) {
                    aciertos++;
                    break;
                }
            }
        }

        for (int i = 0; i < numerosUsuario.length; i++) {
            for (int j = 0; j < numerosSorteo.length; j++) {
                if (numerosUsuario[i] == numerosSorteo[j]) {
                    aciertos++;
                    break;
                }
            }
        }

        boolean complementarioAcertado = false;
        boolean reintegroAcertado = reintegroUsuario == reintegroSorteo;

        String categoria;
        if (aciertos == 6 && reintegroAcertado) {
            categoria = "Categoría Especial (6 aciertos + reintegro)";
        } else if (aciertos == 6) {
            categoria = "1ª Categoría (6 aciertos)";
        } else if (aciertos == 5 && complementarioAcertado) {
            categoria = "2ª Categoría (5 aciertos + complementario)";
        } else if (aciertos == 5) {
            categoria = "3ª Categoría (5 aciertos)";
        } else if (aciertos == 4) {
            categoria = "4ª Categoría (4 aciertos)";
        } else if (aciertos == 3) {
            categoria = "5ª Categoría (3 aciertos)";
        } else if (reintegroAcertado) {
            categoria = "Reintegro";
        } else {
            categoria = "No premiado";
        }

        System.out.println("Categoría de premio: " + categoria);
    }
}

