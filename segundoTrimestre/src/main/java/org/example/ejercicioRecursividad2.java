package org.example;

public class ejercicioRecursividad2 {

    static int max = 10;


    public static void main(String[] args) {

        int sec = 1;
        Imprimir(sec);

    }

    public static void Imprimir(int sec) {

        System.out.println(sec);
        if (max > sec){
            Imprimir(sec +1);
        }

    }

}
