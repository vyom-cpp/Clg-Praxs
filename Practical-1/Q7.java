// Write a program that prompts the user to enter a letter and check whether a letter is a
// vowel or constant.
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        // Check whether the entered character is a vowel or a consonant
        if (isVowel(letter)) {
            System.out.println(letter + " is a vowel.");
        } else {
            System.out.println(letter + " is a consonant.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check whether a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for easier comparison
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}