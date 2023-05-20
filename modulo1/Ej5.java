// Pedir al usuario que ingrese el valor del radio de una circunferencia.
// Calcular y mostrar por pantalla el área y el perímetro. Recordá que el
// área y el perímetro se calculan con las siguientes fórmulas:
// area = PI × radio2
// perimetro = 2 × PI × radio

import java.util.Scanner;
import java.lang.Math;


public class Ej5 {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("ingrese el radio de una circunferencia: ");
            double radio = scanner.nextDouble();

            System.out.println("el area de la circunferencia es: " + (Math.PI*Math.pow(radio, 2)));
            System.out.println("el perimetro de la circunferencia es: " + (2*Math.PI*radio));

        } catch (Exception e) {
            System.out.println("error al realizar los calculos");
        }
    }
    
}
