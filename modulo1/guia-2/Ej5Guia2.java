// Escribir un algoritmo que lea un valor n por teclado y muestre los
// primeros n términos de la sucesión de Fibonacci.

import java.util.Scanner;

public class Ej5Guia2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("ingrese hasta que termino de fibonacci quiere: ");
            int num = scanner.nextInt();
            System.out.println("estos son los " + num + " primeros terminos de fibonacci: ");
            for (int i = 0; i < num; i++) {
                System.out.println(fibonacci(i));
            }
        } catch (Exception e) {
            System.out.println("hubo un error: " + e);
        }
    }

    public static int fibonacci(int num){
        if (num > 1) {
            return fibonacci(num-1) + fibonacci(num-2);
        }else{
            return num;
        }
    }

}
