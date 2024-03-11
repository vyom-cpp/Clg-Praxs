// Write a program that solves the following equation and displays the value x and y:
// a) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer‘s rule to solve equation
// b) ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )
public class Q3 {
    public static void main(String[] args) {
        // Coefficients of the equations
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55;
        double e = 44.5, f = 5.9;

        // Calculate determinant
        double determinant = a * d - b * c;

        // Check if the system of equations has a unique solution
        if (determinant != 0) {
            // Calculate x and y using Cramer's rule
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;

            // Display the values of x and y
            System.out.println("The values of x and y are:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            System.out.println("The system of equations does not have a unique solution.");
        }
    }
}
