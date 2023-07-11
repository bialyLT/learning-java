/*
Declarar una clase llamada Circunferencia que tenga como
atributo privado el radio (de tipo real). La clase debe tener los
siguientes métodos:
a) Un constructor que inicialice el radio recibido como parámetro.
b) Un getter y un setter para el atributo radio.
c) Un método area() que calcule y devuelva el área
d) Un método perimetro() que calcule y devuelva el perímetro
Recordá que el área y el perímetro se calculan con las siguientes
fórmulas:
area = PI * radio2
perimetro = 2 * PI * radio
 */
import java.lang.Math;

public class Circunsferencia {
    private double radio;

    public Circunsferencia(double radio){
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area(){
        return ((Math.PI)*(Math.pow((getRadio()),2)));
    }

    public double perimetro(){
        return (2*Math.PI*getRadio());
    }

    public static void main(String[] args) {
        Circunsferencia circle = new Circunsferencia(5);
        System.out.println("El area es: " + circle.area());
        System.out.println("El perimetro es: " + circle.perimetro());
    }
    
}
