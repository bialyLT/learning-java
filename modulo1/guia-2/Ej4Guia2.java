// Escribir un algoritmo que calcule el factorial de un número ingresado
// por teclado.

import java.util.Scanner;

public class Ej4Guia2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("ingrese un numero entero positivo para calcular el factorial: ");
            int numero = scanner.nextInt();
            int result = factorial(numero);
            System.out.println("el factorial de " + numero + " es: " + result);
        } catch (Exception e) {
            System.out.println("hubo un error: " + e);
        }
    }
    public static int factorial(int num){
        if (num >= 1) {
            int aux = factorial(num-1);
            num = num * aux;
        }else{
            return 1;
        }
        return num;
    }
}
