// Escribir un programa que lea dos números y realice el cálculo de la
// suma, la resta, la multiplicación y la división entre ambos valores. Los
// resultados deben mostrarse por pantalla.

import java.util.Scanner;


public class Ej3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ingrese un valor: ");
            int num1 = scanner.nextInt();
            
            System.out.println("ingrese un valor: ");
            int num2 = scanner.nextInt();

            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1+num2));
            System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1-num2));
            System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + (num1*num2));
            System.out.println("La division de " + num1 + " y " + num2 + " es: " + (num1/num2));
        }catch (Exception e) {
            System.out.println("Error al realizar las operaciones");
        }

    }
}
