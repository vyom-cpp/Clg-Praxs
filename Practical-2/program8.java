import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a password
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Check if the password meets the rules
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        scanner.close();
    }

    // Method to check if the password is valid
    public static boolean isValidPassword(String password) {
        // Check if the password has at least eight characters
        if (password.length() < 8) {
            return false;
        }

        // Check if the password consists of only letters and digits
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }

        // Check if the password contains at least two digits
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }
}
