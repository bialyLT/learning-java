// Escribir un programa que lea dos números y realice el cálculo de la
// suma, la resta, la multiplicación y la división entre ambos valores. Los
// resultados deben mostrarse por pantalla.

import java.util.Scanner;
import java.lang.Math;


public class Ej3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ingrese un valor: ");
            double num1 = scanner.nextDouble();
            
            System.out.println("ingrese un valor: ");
            double num2 = scanner.nextDouble();

            System.out.println("La suma de " + Math.round(num1) + " y " + Math.round(num2) + " es: " + (Math.round(num1)+Math.round(num1)));
            System.out.println("La resta de " + Math.round(num1) + " y " + Math.round(num1) + " es: " + (Math.round(num1)-Math.round(num1)));
            System.out.println("La multiplicacion de " + Math.round(num1) + " y " + Math.round(num1) + " es: " + (Math.round(num1)*Math.round(num1)));
            System.out.println("La division de " + Math.round(num1) + " y " + Math.round(num1) + " es: " + (num1/num2));
        }catch (Exception e) {
            System.out.println("Error al realizar las operaciones");
        }

    }
}
