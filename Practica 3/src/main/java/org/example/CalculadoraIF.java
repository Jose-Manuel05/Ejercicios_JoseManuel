import java.util.Scanner;

public class CalculadoraIF {

public void calculadoraif (){

    Scanner scanner = new Scanner(System.in);

        // Solicitar los números
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicitar la operación
        System.out.print("Elige la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;

        // Calcular en función de la operación seleccionada
        if (operacion == '+') {
            resultado = num1 + num2;
        } else if (operacion == '-') {
            resultado = num1 - num2;
        } else if (operacion == '*') {
            resultado = num1 * num2;
        } else if (operacion == '/') {
            // Verificar que el segundo número no sea 0 antes de dividir
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
                return;
            }
        } else {
            System.out.println("Operación no válida.");
            return;
        }

        // Mostrar el resultado
        System.out.println("El resultado es: " + resultado);
    }
}
