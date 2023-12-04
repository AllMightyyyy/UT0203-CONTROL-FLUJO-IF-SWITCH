import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 5
        Realiza un programa que contenga un menú, de forma que
        muestre las cuatro operaciones matemáticas básicas:
        sumar, restar, multiplicar y dividir. Se le debe solicitar dos números
        al usuario y la opción a aplicar entre esos dos números
        (puede ser utilizando el símbolo concreto:
        + - * / u opciones numéricas → 1 para sumar, 2 para restar, etc.
        Muestra el resultado en función de la opción seleccionada.

         */

        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter 2 Numbers to perform an operation :D");
        System.out.println("--------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        double x = sc.nextDouble();
        System.out.println("Enter the second Number");
        double y = sc.nextDouble();
        sc.nextLine();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter what type of operation, you would want to perform");
        System.out.println("Enter (1 or +) for sum, (2 or -) for subtraction, (3 or /) for division, (4 or *) for multiplication, and (5 or %) for rest");
        int input = ((int) (sc.nextLine().charAt(0)));
        switch(input) {
            case 49, 43 -> System.out.println("The sum of " + x + " and " + y + " is : " + (x + y) );
            case 50, 45 -> System.out.println("The subtraction of " + x + " and " + y + " is : " + (x - y) );
            case 51, 47 -> System.out.println("The division of " + x + " by " + y + " is : " + (x / y) );
            case 52, 42 -> System.out.println("The multiplication of " + x + " and " + y + " is : " + (x * y) );
            case 53, 37 -> System.out.println("The rest of the division of " + x + " by " + y + " is : " + (x % y) );
        }
    }
}