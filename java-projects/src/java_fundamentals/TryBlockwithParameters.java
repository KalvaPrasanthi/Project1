package java_fundamentals;
import java.io.FileOutputStream;
public class TryBlockwithParameters {
	public static void main(String[] args) {
		try(FileOutputStream fileOutputStream =new FileOutputStream("abc.txt")){      
			String msg = "Welcome to java fundamentals!";      
			byte byteArray[] = msg.getBytes(); //converting string into byte array      
			fileOutputStream.write(byteArray);  
System.out.println("file compiled successfuly!");      
			}catch(Exception exception){  
			       System.out.println(exception);  
			}      	
	}
}
