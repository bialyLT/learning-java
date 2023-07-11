// Escribir un programa en el cual se le pregunte al usuario su nombre. A
// continuación, mostrar un mensaje que diga “Hola, ” completando el
// mensaje con el nombre que ingresó el usuario.


import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");

            String nombreString = scanner.next();

            System.out.println("Hola " + nombreString);
        }catch (Exception e) {
            System.out.println("Error al ingresar un nombre");
        }
        
    }
}
