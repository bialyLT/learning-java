// Escribir un programa que lea la estatura de tres personas, calcule el
// promedio de la altura de ellos y lo informe.

import java.util.Scanner;


public class Ej4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            double prom = 0;
            double valor;

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la altura " + (i+1));
                valor = scanner.nextDouble();
                prom = prom + valor;
            }
            System.out.println("el promedio de las alturas ingresadas es: " + (prom/3));
        }catch (Exception e) {
            System.out.println("hubo un error al calcular las edades");
        }
        
    }
    
}
