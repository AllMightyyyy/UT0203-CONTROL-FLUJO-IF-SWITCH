import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 1
        Haz una aplicación que calcule el área de un círculo(pi*R2).
         El radio se pedirá por teclado. Usa la constante PI y
         el método pow de Math.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius in cm of the circle, to calculate its area :D ");
        double x = sc.nextDouble();

        System.out.printf("The area of the circle of radius %.2f is : %.2f", x, (Math.PI * (Math.pow(x, 2))));
    }
}