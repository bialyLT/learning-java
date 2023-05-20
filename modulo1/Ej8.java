// Pedir al usuario que ingrese una temperatura en grados Celsius y
// mostrar por pantalla su equivalente en kelvin y grados Fahrenheit. Las
// fórmulas para conversiones son:
// Kelvin = 273,15 + Celsius
// Fahrenheit = 1,8 × Celsius

import java.util.Scanner;


public class Ej8 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            
            System.out.println("ingresa una temperatura en grados celsius: ");
            double tempCelsius = scanner.nextDouble();
            System.out.println("la temperatura ingresada convertida a Kelvin es: " + (273.15+tempCelsius));
            System.out.println("la temperatura ingresada convertida a Fahrenheit es: " + (1.8*tempCelsius));


        } catch (Exception e) {
            System.out.println("error al convertir");
        }
    }
}
