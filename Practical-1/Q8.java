// A cashier has currency notes of denominations 1, 2, 5, 10, 50 and 100. If the amount to be
// withdrawn is input through the keyboard, find the total number of currency notes of each
// denomination the cashier will have to give to the withdrawer.
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount to be withdrawn
        System.out.print("Enter the amount to be withdrawn: ");
        int amount = scanner.nextInt();

        // Array to store the denominations of currency notes
        int[] denominations = { 100, 50, 10, 5, 2, 1 };
        // Array to store the count of each denomination
        int[] notesCount = new int[denominations.length];

        // Iterate through each denomination
        for (int i = 0; i < denominations.length; i++) {
            // Calculate the number of notes of current denomination
            notesCount[i] = amount / denominations[i];
            // Update the amount for the next iteration
            amount %= denominations[i];
        }

        // Display the total number of currency notes of each denomination
        System.out.println("Currency notes to be given:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + ": " + notesCount[i]);
        }

        // Close the scanner
        scanner.close();
    }
}