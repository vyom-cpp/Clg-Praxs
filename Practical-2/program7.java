import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Find the length of the common prefix
        int commonPrefixLength = 0;
        int minLength = Math.min(str1.length(), str2.length());
        while (commonPrefixLength < minLength && str1.charAt(commonPrefixLength) == str2.charAt(commonPrefixLength)) {
            commonPrefixLength++;
        }

        // Display the common prefix
        String commonPrefix = str1.substring(0, commonPrefixLength);
        if (!commonPrefix.isEmpty()) {
            System.out.println("Largest common prefix: " + commonPrefix);
        } else {
            System.out.println("There is no common prefix between the two strings.");
        }

        scanner.close();
    }
}
