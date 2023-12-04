import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 2
        Lee un número por teclado y muestra por consola, el carácter al que
        pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97,
         me muestre una a.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to show it's ASCII equivalent");
        int input = sc.nextInt();
        System.out.println("The ASCII equivalent of " + input + " is : " + ((char) input));
    }
}