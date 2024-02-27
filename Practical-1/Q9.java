// If a five-digit number is input through the keyboard, write a program to print a new
// number by adding one to each of its digits. For example, if the number that is input is
// 12391 then the output should be displayed as 23502.
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Check if the entered number is a five-digit number
        if (isFiveDigitNumber(number)) {
            // Increment each digit by one
            int newNumber = incrementDigits(number);

            // Display the new number
            System.out.println("New number after incrementing each digit: " + newNumber);
        } else {
            System.out.println("The entered number is not a five-digit number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is a five-digit number
    public static boolean isFiveDigitNumber(int num) {
        return num >= 10000 && num <= 99999;
    }

    // Method to increment each digit of a five-digit number by one
    public static int incrementDigits(int num) {
        int result = 0;
        int multiplier = 1;

        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            digit = (digit + 1) % 10; // Increment the digit by one and handle wrap-around
            result += digit * multiplier; // Add the modified digit to the result
            multiplier *= 10; // Update the multiplier
            num /= 10; // Move to the next digit
        }

        return result;
    }   
}
