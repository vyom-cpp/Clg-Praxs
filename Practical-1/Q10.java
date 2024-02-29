// If lengths of three sides of a triangle are input through the keyboard, write a program to
// print the area of the triangle.
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the lengths of the three sides of the triangle
        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        // Calculate the semi-perimeter of the triangle
        double semiPerimeter = (side1 + side2 + side3) / 2;

        // Calculate the area of the triangle using Heron's formula
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        // Display the area of the triangle
        System.out.println("Area of the triangle: " + area);

        // Close the scanner
        scanner.close();
    }
}