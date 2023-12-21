package java_fundamentals;

public class ImplicitAndExplicitTypeCasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Implicit type casting (Widening)
        int intValue = 10;
        byte bValue = 5;
        short sValue = 20;

        float floatValue = intValue;  // Implicit cast from int to float
        double doubleValue = intValue; // Implicit cast from int to double
        long longValue = intValue; // Implicit cast from int to long

        System.out.println("Implicit Type Casting (Widening):");
        System.out.println("int value: " + intValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("long value: " + longValue);

        // Explicit type casting (Narrowing)
        long anotherLongValue = 1234567890123L;
        float anotherFloatValue = (float) anotherLongValue; // Explicit cast from long to float
        int anotherIntValue = (int) anotherLongValue; // Explicit cast from long to int

        byte anotherByteValue = (byte) anotherIntValue; // Explicit cast from int to byte
        short anotherShortValue = (short) anotherIntValue; // Explicit cast from int to short
        double anotherDoubleValue = (double) anotherLongValue; // Explicit cast from long to double

        System.out.println("\nExplicit Type Casting (Narrowing):");
        System.out.println("long value: " + anotherLongValue);
        System.out.println("float value: " + anotherFloatValue);
        System.out.println("int value: " + anotherIntValue);
        System.out.println("byte value: " + anotherByteValue);
        System.out.println("short value: " + anotherShortValue);
        System.out.println("double value: " + anotherDoubleValue);
    }
}
