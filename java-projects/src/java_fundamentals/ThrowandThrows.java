package java_fundamentals;
import java.io.IOException;
public class ThrowandThrows {
	public static void main(String[] args) {
        try {
            processFile("example.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // Method using throw to manually throw an exception
    static void processFile(String filename) throws IOException {
        if (!filename.endsWith(".txt")) {
            throw new IllegalArgumentException("Invalid file format. Must be a text file.");
        }

        // Simulating an IOException
        throw new IOException("Error processing the file: " + filename);
    }

}
