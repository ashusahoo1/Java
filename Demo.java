/*5. a)Define an interface Calculate with a method as Interest which takes two arguments such as principal and number of years and returns the interest amount. Define two classes - HDFC and ICICI which uses this interface ot calculate interest. Write the complete program ot print the interest amount of both hte classes for the user entered principal amount and no. of years. */


import java.util.Scanner;

// Define the Calculate interface
interface Calculate {
    double Interest(double principal, int years);
}

// HDFC class implementing the Calculate interface
class HDFC implements Calculate {
    private static final double HDFC_RATE = 0.07; // 7% interest rate

    @Override
    public double Interest(double principal, int years) {
        return principal * HDFC_RATE * years;
    }
}

// ICICI class implementing the Calculate interface
class ICICI implements Calculate {
    private static final double ICICI_RATE = 0.08; // 8% interest rate

    @Override
    public double Interest(double principal, int years) {
        return principal * ICICI_RATE * years;
    }
}

// Demo class to test the functionality
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input principal and number of years
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        
        // Create instances of HDFC and ICICI
        Calculate hdfc = new HDFC();
        Calculate icici = new ICICI();
        
        // Calculate interest for both banks
        double hdfcInterest = hdfc.Interest(principal, years);
        double iciciInterest = icici.Interest(principal, years);
        
        // Display the interest amounts
        System.out.printf("Interest amount from HDFC: %.2f\n", hdfcInterest);
        System.out.printf("Interest amount from ICICI: %.2f\n", iciciInterest);
        
        scanner.close();
    }
}


