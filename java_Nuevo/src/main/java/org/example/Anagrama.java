package org.example;

public class Anagrama {

    public static boolean sonAnagramas(String palabra1, String palabra2) {

        if (palabra1.equals(palabra2)) {
            return true;
        }

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();

        java.util.Arrays.sort(letras1);
        java.util.Arrays.sort(letras2);

        return java.util.Arrays.equals(letras1, letras2);

    }

    public static void main(String[] args) {

        System.out.println(sonAnagramas("amor", "roma"));
        System.out.println(sonAnagramas("amor", "amor"));
        System.out.println(sonAnagramas("Amor", "Roma"));
        System.out.println(sonAnagramas("adios", "hola"));
    }
}

