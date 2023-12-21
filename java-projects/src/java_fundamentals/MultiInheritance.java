package java_fundamentals;

public class MultiInheritance {
	public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.methodA();
        myObj.methodB();
    }
}
// Interface 1
interface A {
    void methodA();
}

// Interface 2
interface B {
    void methodB();
}

// Class implementing both interfaces
class MyClass implements A, B {
    public void methodA() {
        System.out.println("Property from interface A");
    }

    public void methodB() {
        System.out.println("Property from interface B");
    }
}
