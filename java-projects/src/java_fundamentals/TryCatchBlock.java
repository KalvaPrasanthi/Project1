package java_fundamentals;
import java.util.Scanner;
public class TryCatchBlock {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a number: ");

	        try {
	            // Attempt to read an integer from the user
	            int number = scanner.nextInt();

	            // Display the entered number
	            System.out.println("You entered: " + number);
	        } catch (Exception e) {
	            // Handle the exception if the user input is not a valid integer
	            System.out.println("Error: Please enter a valid integer.");
	        } finally {
	            // Close the scanner in the finally block to ensure proper cleanup
	            scanner.close();
	        }
	    }
}
