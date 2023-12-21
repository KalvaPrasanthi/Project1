package java_fundamentals;

public class AccessModifiers {
	// Public variable
    public int publicVariable = 10;

    // Private variable
    private int privateVariable = 20;

    // Protected variable
    protected int protectedVariable = 30;

    // Default (package-private) variable
    int defaultVariable = 40;

    // Public constructor
    public AccessModifiers() {
        System.out.println("Public constructor");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Public method
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        // Create an instance of the class
        AccessModifiers example = new AccessModifiers();

        // Accessing variables and methods from the main method
        System.out.println("Public variable: " + example.publicVariable);
        // System.out.println("Private variable: " + example.privateVariable); // This will result in a compilation error
        System.out.println("Protected variable: " + example.protectedVariable);
        System.out.println("Default variable: " + example.defaultVariable);

        example.publicMethod();
        // example.privateMethod(); // This will result in a compilation error
        example.protectedMethod();
        example.defaultMethod();
    }
}
