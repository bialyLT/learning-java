// Escribir un programa que lea una palabra por teclado y determine si
// es un palíndromo.

import java.util.Scanner;

public class Ej2Guia2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            String palabra = new String();
            String aux = new String();
            System.out.println("ingrese una palabra: ");
            palabra = scanner.next();
            for (int i = palabra.length() - 1; i >= 0; i--) {
                aux += palabra.charAt(i); 
            }
            if (palabra.equals(aux)) {
                System.out.println("la palabra ingresada es un palindromo");
            }else{
                System.out.println("la palabra ingresada no es un palindromo");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
