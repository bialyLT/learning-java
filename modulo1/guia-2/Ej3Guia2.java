// Escribir un programa que ordene un arreglo de números enteros de
// manera ascendente.

import java.util.Scanner;
import java.util.Arrays;
public class Ej3Guia2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int[] nums = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese un numero: ");
                nums[i] = scanner.nextInt();
            }
            ordenarAsc(nums);
            System.out.println(Arrays.toString(nums));
        } catch (Exception e) {
            System.out.println("hubo un error " + e);
        }
    }

    public static void ordenarAsc(int[] arr) {
            Arrays.sort(arr);
    }

}
