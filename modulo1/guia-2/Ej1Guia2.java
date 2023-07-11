// Escribir un programa que reciba un número entero por teclado. A
// continuación, mostrar la tabla de multiplicar de ese número.

import java.util.Scanner;

public class Ej1Guia2 {
    public static void main(String[] args) {   
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("ingrese un numero: ");
            int x = scanner.nextInt();
            System.out.println("tabla del " + x);
            for (int i = 0; i < 10; i++) {
                System.out.println(x + "x" + (i+1) + ": " + (x*(i+1)));
            }   
        } catch (Exception e) {
            System.out.println("hubo un error");
        }
    }
}
