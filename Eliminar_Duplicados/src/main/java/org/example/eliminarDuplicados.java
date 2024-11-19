package org.example;

import java.util.Arrays;
import java.util.Random;

public class eliminarDuplicados {

    public void practica1() {

        int[] num = {1,1,2,2,3,4,8,9};
        System.out.println(Arrays.toString(num));

        int[] aux = new int[num.length];
        int[] sinDuplicados;

        for (int i = 0 ; i < num.length ; i++){

            if (num[i] != num[i+1]){
                aux[i] = num[i];
            }

        }

        System.out.println(Arrays.toString(aux));

        int tam = 0;
        int[] sinDup = new int[tam];
        int pos = 0;

        for (int i = 0 ; i < aux.length ; i++){

            if (aux[i] != 0){
                sinDup[pos] = aux[i];
                pos++;
            }

        }

        System.out.println(Arrays.toString(sinDup));

    }

    public void practica2() {

        int[] num = {1,1,2,2,3,4,8,9};
        int newArray = 0;

        for (int i = 0 ; i < num.length -1; i++){

            if (num[i] != num[i+1]){
                newArray++;
            }

        }

        int[] array2 = new int[newArray];

        newArray = 0;
        for (int i = 0 ; i < num.length -1; i++) {
            if (num[i] != num[i + 1]){
                array2[newArray] = num[i];
                newArray++;
            }
        }

        System.out.println("Array sin duplicados" + Arrays.toString(array2));

    }

    public void practica3() {

        Random aleatorio = new Random();

        int[] sorteo = new int[6];

        for (int i = 0 ; i < sorteo.length ; i++){

            sorteo[i] = aleatorio.nextInt(49) + 1;

        }

        System.out.println(Arrays.toString(sorteo));

        Arrays.sort(sorteo);
        System.out.println(Arrays.toString(sorteo));


        boolean ordenadosDuplicados = true;

        while (ordenadosDuplicados) {
            ordenadosDuplicados = false;

            for (int i = 0; i < sorteo.length; i++) {

                if (i != sorteo.length - 1 && sorteo[i] == sorteo[i + 1]) {

                    System.out.println("Duplicado: " + sorteo[i]);
                    sorteo[i] = aleatorio.nextInt(49) + 1;

                }

            }

            Arrays.sort(sorteo);

        }

        System.out.println(Arrays.toString(sorteo));

    }

    public void  pruevaDistinct() {

        int[] original = {1,1,2,2,3,4,8,9};

        System.out.println(Arrays.toString(original));

        int[] limpio = Arrays.stream(original).distinct().toArray();

        System.out.println(Arrays.toString(limpio));

    }

}
