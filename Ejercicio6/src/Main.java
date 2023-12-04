import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 6
        Crea un menú con estas opciones:
            1. Cálculo del área de un rectángulo.
            2. Cálculo del área de un círculo.
            3. Cálculo del área de un triángulo.
        Debes crear todas las variables necesarias para almacenar
        cada uno de los cálculos disponibles, así como realizar las
        operaciones, dependiendo de la opción elegida. Puedes usar los
        valores que prefieras para realizar los cálculos

        rectangle A = wl
        circle = pi * r²
        triangle = (bh) / 2
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("What shape's area; do you want to calculate ?");
        System.out.println("(R)ectangle, (C)ircle, (T)riangle ?");
        System.out.println("----------------------------------------------------------");
        char input = sc.nextLine().toUpperCase().charAt(0);
        switch(input)  {
            case 'R' -> {
                System.out.println("You want to calculate the Area of a Rectangle, so you have to enter 2 values");
                System.out.println("Enter the length of the rectangle :");
                double l = sc.nextDouble();
                System.out.println("Enter the width of the rectangle :");
                double w = sc.nextDouble();
                System.out.println("The area of the rectangle is : " + (l * w));
            }
            case 'C' -> {
                System.out.println("You want to calculate the area of a Circle, so you have to enter the radius");
                System.out.println("Enter the radius of the circle : ");
                double r = sc.nextDouble();
                System.out.println("The area of the circle is : " + (Math.PI * (Math.pow(r, 2))));
            }
            case 'T' -> {
                System.out.println("You want to calculate the area of the triangle, so you have to enter 2 values");
                System.out.println("Enter the length of the base of the triangle : ");
                double b = sc.nextDouble();
                System.out.println("Enter the height of the triangle :");
                double h = sc.nextDouble();
                System.out.println("The area of the triangle is : " + ((b * h) / 2));
            }
            default -> System.out.println("Invalid choice, you brain dead or some shit ?");
        }
    }
}