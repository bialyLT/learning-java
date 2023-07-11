// A partir de una cantidad de pesos que el usuario ingresa a través del
// teclado se debe obtener su equivalente en dólares, en euros, en
// guaraníes y en reales. Para este ejercicio se consideran las siguientes
// tasas:
// 1 dólar = 231,68 pesos
// 1 euro = 250,69 pesos
// 1 peso = 31,00 guaraníes
// 1 real = 46,81 pesos
import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("ingrese un precio: ");
            double precio = scanner.nextDouble();
            System.out.println("el precio en dolares es: " + (precio/231.68));
            System.out.println("el precio en euro es: " + (precio/250.69));
            System.out.println("el precio en guaranies es: " + (precio*31));
            System.out.println("el precio en real es: " + (precio/46.81));
        } catch (Exception e) {
            System.out.println("error al convertir");
        }
    }
}
