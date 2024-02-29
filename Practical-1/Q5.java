// Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking
// your weight in kilograms and dividing it by the square of your height in meters. Write a
// program that prompts the user to enter weight in pounds and height in inches and displays
// the BMI.
// Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double heightInches = scanner.nextDouble();

        // Convert weight from pounds to kilograms
        double weightKg = weightPounds * 0.45359237;

        // Convert height from inches to meters
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display the BMI
        System.out.println("BMI is: " + bmi);

        // Close the scanner
        scanner.close();
    }
}