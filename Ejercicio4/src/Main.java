import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 4
        Lee un número por teclado que pida el precio de un producto
        (puede tener decimales) y calcule el precio final con IVA.
        El IVA será una constante que será del 21%.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the product, and i will show you the price with IVA Included");
        double x = sc.nextDouble();
        System.out.println("The price with IVA included is : " + (x + ((x * 21) / 100)));

    }
}