// Write a program that reads a number in meters, converts it to feet, and displays the result
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number in meters
        System.out.print("Enter the length in meters: ");
        double meters = scanner.nextDouble();

        // Convert meters to feet (1 meter = 3.28084 feet)
        double feet = meters * 3.28084;

        // Display the result
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        // Close the scanner
        scanner.close();
    }
}