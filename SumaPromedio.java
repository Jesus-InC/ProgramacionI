import java.util.Scanner;
public class SumaPromedio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese el primer número:");
        double a = leer.nextDouble();
        System.out.println("Por favor, ingrese el segundo número:");
        double b = leer.nextDouble();
        System.out.println("Por favor, ingrese el tercer número:");
        double c = leer.nextDouble();

        double suma = a+b+c;
        double promedio = suma/3;
        System.out.println("La suma de los tres números ingresados es: " + suma);
        System.out.println("El promedio de los tres números ingresados es: " + promedio); 
    }
}
