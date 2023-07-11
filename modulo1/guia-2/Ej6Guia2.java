// Escribir un algoritmo que imprima el listado de los números primos
// menores que 200. Aclaración: el número 1 no es primo.


public class Ej6Guia2 {
    public static void main(String[] args) {
        for (int i = 2; i < 200; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " ");
            }
        }
    }
    public static boolean esPrimo(int n){
        int i = n-1;
        while (i > 1) {
            if (n%i == 0) {
                return false;
            }
            i -= 1;
        }
        return true;
    }
}
