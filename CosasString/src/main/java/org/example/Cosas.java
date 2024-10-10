package org.example;

public class Cosas {

    public void cosaspractica(){

        String frase = "Victor y chao. Roberto bye.";

        int tamanyo = frase.length();
        System.out.println("El tamaño de la letra es: " + tamanyo);

        char letra = frase.charAt(14);
        System.out.println("La letra en la posiscion 14 es: " + letra);

        String trozo = frase.substring(6,11);
        System.out.println("Un trozo de la frase es: " + trozo);

        String concatenar = frase.concat(trozo);
        System.out.println("Concateno una frase con el trozo de palabra anterior: " + concatenar);

        int posicion = frase.indexOf("y");
        System.out.println("La posicion de la letra y es: " + posicion);

        posicion = frase.indexOf("y", 8);
        System.out.println("La posicion de la letra y saltando 8 caracteres es: " + posicion);

        posicion = frase.lastIndexOf("y");
        System.out.println("La ultima posicion de la letra y es: " + posicion);

        String mayusculas = frase.toUpperCase();
        System.out.println("La frase en mayusculas es: " + mayusculas);
        String minusculas = frase.toLowerCase();
        System.out.println("La frase en minusculas es: " + minusculas);

        String nombre = "Jose                          ";
        System.out.println("Mi nombre leido desde base de datos es: " + nombre + ".");
        nombre = nombre.trim();
        System.out.println("Y mi nombre quitando espacios de tamaño es: " + nombre + ".");

        String sinespacios = frase.replace (" ", "");
        System.out.println("Mi frase sin espacios es: " + sinespacios);
        String reemplazar = frase.replace ("chao", "hola");
        System.out.println("Mi frase reemplazando chao por hola es: " + reemplazar);

        String palabra1 = "hola";
        String palabra2 ="adios";

        if(palabra1.equals(palabra2)){
            System.out.println("Son iguales " +palabra1+ " y " + palabra2);
        }else {
            System.out.println("No son iguales " +palabra1+ " y " + palabra2);
        }

        String palabra3 = "hola";
        String palabra4 ="Hola";

        if(palabra3.equalsIgnoreCase(palabra4)){
            System.out.println("Son iguales " +palabra3+ " y " + palabra4);
        }else {
            System.out.println("No son iguales " +palabra3+ " y " + palabra4);
        }

        int valor_unicode = frase.compareTo(palabra1);
        if(valor_unicode<0){
            System.out.println("Valor unicode"+ valor_unicode + ". La cadena "+frase+ +palabra1);
        }else {
            if (valor_unicode==0) {
                System.out.println("La cadena" + frase + "tiene el mismo tamaño " + palabra1);
            }else {
                System.out.println("La cadena" + frase + "es mas pequeña que " + palabra1);
            }
        }


        System.out.println(""+ palabra4);


    }

}
