/**
Crear una clase llamada Libro que contenga los siguientes atributos:
a) ISBN
b) Título
c) Autor
d) Número de páginas

La clase debe tener:
e) Un constructor con todos los atributos pasados por parámetro
f) Un constructor vacío

Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el
autor del libro y el número de páginas.
 */

import java.util.Scanner;
 
public class Libro {
    String isbn;
    String titulo;
    String autor;
    int num_pag;
    
    public Libro() {
        
    }
    
    public Libro(String isbn, String titulo, String autor, int num_pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.num_pag = num_pag;
    }

    public void cargarLibro(){
        
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("ingresa un isbn: ");
            isbn = scanner.nextLine();
            System.out.println("ingresa el titulo del libro: ");
            titulo = scanner.nextLine();
            System.out.println("ingresa el autor del libro: ");
            autor = scanner.nextLine();
            System.out.println("ingresa la cantidad de paginas que tiene: ");
            num_pag = scanner.nextInt();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void informarLibro() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Nombre del autor: " + autor);
        System.out.println("Numero de paginas: " + num_pag);
    }
    
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.cargarLibro();
        libro1.informarLibro();
    }
}
