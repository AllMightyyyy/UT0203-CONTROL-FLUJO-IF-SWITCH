import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 3
        Modifica el ejercicio anterior, para que, en lugar de pedir un número,
        pida un carácter (char) y muestre su código en la tabla ASCII.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character ,and i will show you its number in ASCII Table");
        char x = sc.nextLine().charAt(0);
        System.out.println("The number that represents the ASCII character " + x + " is " + ((int) x));
    }
}