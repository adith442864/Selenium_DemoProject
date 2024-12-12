import java.io.FileNotFoundException;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int a = 100;
		int b= 20;
		
		try {
			int result = a/b;
			System.out.println("Result of a/b is: " +result);
		}
		
		catch (Exception e) {
			System.out.println("Some exception is coming when trying to divide a/b..");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		finally {
			System.out.println("Division operation is completed...");
		}
		
		division(100, 0);
		
		System.out.println("End of the program");

	}
	
	public static void division(int a, int b) {
		try {
			int result = a/b;
			System.out.println("Result of a/b is: " +result);
		}
		catch (Exception e) {
			throw new myException("Hey!!you are trying to divide by zero!");
			
			
		}
	}

}

class myException extends RuntimeException {
	
	public myException(String message) {
		super(message);
	}
}