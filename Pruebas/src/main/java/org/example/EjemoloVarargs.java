package org.example;

public class EjemoloVarargs {

    public static void principal(){

        String[][] notas = datos("Xavi","Manuel","Adrian","Danielle","Jose","Alexander");
        Reutilizar.imprimirMatriz(notas);


    }

    public static String[][] datos(String...nombres) {

        String[][] notas = new String[nombres.length][2];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Dame la nota para " + nombres[i] + ":");
            notas[i][0] = nombres[i];
            notas[i][1] = Integer.toString(Reutilizar.intrdocucirInt());
        }

        return notas;

    }


}
