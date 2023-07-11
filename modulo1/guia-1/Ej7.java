// Escribir un programa que reciba el valor de dos edades y las guarde
// en dos variables. Luego el programa debe intercambiar los valores de
// ambas variables y mostrarlas por pantalla. Por ejemplo, si el usuario
// ingresó los valores edad1 = 24 y edad2 = 35, el programa deberá
// mostrar edad1 = 35 y edad2 = 24.

import java.util.Scanner;


public class Ej7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("ingrese una edad: ");
            int edad1 = scanner.nextInt();
            System.out.println("ingrese otra edad: ");
            int edad2 = scanner.nextInt();
            int aux = edad1;
            edad1 = edad2;
            edad2 = aux;
            System.out.println("las edades se cambiaron de variable: " + edad1 + " y " + edad2);

        }catch(Exception e){
            System.out.println("error al intercambiar las edades");
        }
        
    }
}
