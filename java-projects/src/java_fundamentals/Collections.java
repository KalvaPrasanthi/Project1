package java_fundamentals;
import java.util.ArrayList;
import java.util.Iterator;
public class Collections {
	public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();

        // Adding elements to the ArrayList
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");

        // Displaying elements using for-each loop
        System.out.println("Elements in the ArrayList:");
        for (String language : stringList) {
            System.out.println(language);
        }

        // Adding more elements
        stringList.add("Ruby");
        stringList.add("Swift");

        // Displaying elements using Iterator
        System.out.println("\nElements after adding more:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing an element
        stringList.remove("C++");

        // Displaying elements after removal
        System.out.println("\nElements after removing 'C++':");
        for (String language : stringList) {
            System.out.println(language);
        }
    }


}
