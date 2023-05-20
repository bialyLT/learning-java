// Pedir al usuario que ingrese el precio de un producto y el porcentaje
// de descuento. A continuación mostrar por pantalla el importe
// descontado y el importe a pagar.

import java.util.Scanner;


public class Ej6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("ingresa el precio de un producto: ");
            double precio = scanner.nextDouble();
            System.out.println("ingresa el descuento que se le va a aplicar: ");
            double desc = scanner.nextDouble();
            System.out.println("el precio actualizado es: " + (precio-(precio*desc)));


        }catch (Exception e) {
            System.out.println("error");
        }
        
    }
    
}
