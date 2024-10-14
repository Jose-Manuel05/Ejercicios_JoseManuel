package org.example;

import java.util.Scanner;

public class Exepciones {

    public void exepciones(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el divisor: ");
        String numero = teclado.nextLine();

        int num_entero = 0;
        int division = 0;
        int dividendo = 0;

        System.out.println("Introduce el dividendo: ");
        if (teclado.hasNextInt()){

            dividendo = teclado.nextInt();

        }else {
            System.out.println("El formato no es numerico. ");
        }

        try {
            
            num_entero = Integer.parseInt(numero);
            division = dividendo / num_entero;

        }catch (NumberFormatException e1){

            System.out.println("No has escrito un numero... " + e1.getMessage());

        }catch (ArithmeticException e2){

            System.out.println("El denominador es 0. Division erronea. " + e2.getMessage());

        } finally {
            if (num_entero != 0){
                System.out.println("El resultado es " + division);
            }

        }

    }

}
