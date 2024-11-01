package assignment;

public class DivisionByZeroExample {
	public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result;

        try {
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
          
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues after the try-catch block.");
    }
}


