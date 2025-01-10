package org.example;

public class Triangulo {

    public static void main(String[] args) {

        String ast = "";

        for (int i = 0; i < 4; i++) {
            ast += "* ";
            System.out.println(ast);
        }

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int altura = 3;
        tri(0, 0, altura);


    }

    public static void tri(int contB, int contA, int n){

        if (contB < contA) {
            System.out.print("* ");
            tri(contB + 1, contA, n);
        } else {
            System.out.println();
            if (contA < n)
                tri(0, contA + 1, n);
        }
    }

}
