package java_fundamentals;
import java.util.Scanner;
public class GeometryCalculator {
	    public static double calculateRectangleArea(double length, double width) {
	        return length * width;
	    }

	    public static double calculateCircleArea(double radius) {
	        return Math.PI * Math.pow(radius, 2);
	    }

	    public static double calculateTriangleArea(double base, double height) {
	        return 0.5 * base * height;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Choose a geometric shape:");
	        System.out.println("1. Rectangle");
	        System.out.println("2. Circle");
	        System.out.println("3. Triangle");

	        System.out.print("Enter the number of the shape: ");
	        int choice = scanner.nextInt();

	        double area = 0;

	        if (choice == 1) {
	            System.out.print("Enter the length of the rectangle: ");
	            double length = scanner.nextDouble();
	            System.out.print("Enter the width of the rectangle: ");
	            double width = scanner.nextDouble();
	            area = calculateRectangleArea(length, width);
	        } else if (choice == 2) {
	            System.out.print("Enter the radius of the circle: ");
	            double radius = scanner.nextDouble();
	            area = calculateCircleArea(radius);
	        } else if (choice == 3) {
	            System.out.print("Enter the base of the triangle: ");
	            double base = scanner.nextDouble();
	            System.out.print("Enter the height of the triangle: ");
	            double height = scanner.nextDouble();
	            area = calculateTriangleArea(base, height);
	        } else {
	            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
	            System.exit(0);
	        }

	        System.out.println("The area is: " + area);
	    }
}
