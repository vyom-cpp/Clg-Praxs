// Write a program that prompts the user to enter three integers and display the integers in
// decreasing order.
import java.util.Scanner;
import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.println("Enter three integers:");

        // Read the integers from the user
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the integers in decreasing order
        Arrays.sort(numbers);
        int temp = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = temp;

        // Display the integers in decreasing order
        System.out.println("Integers in decreasing order:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Close the scanner
        scanner.close();
    }
}