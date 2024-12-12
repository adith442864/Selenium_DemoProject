
public class MethodsDemo {

	public static void main(String[] args) {
		
		addition(10, 20);
		addition(134, 200);
		
		System.out.println("Substraction output is:=" + substraction(20, 10));
		
		addition("test", "automation");
		
		addition(10,20,30);

	}
	
	//polymorphism is also known as method overloading - One thing in multiple forms
	public static void addition(int a, int b) {
		int result = a+b;
		System.out.println("Addition of a and b is:= " +result);
	}
	
	public static void addition(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("Addition of a and b and c is:= " +result);
	}
	
	public static void addition(String firstName, String lastName) {
		System.out.println(firstName+" "+lastName);
	}
	
	
	public static int substraction(int a, int b) {
		int result = a-b;
		return result;
	}
	
	
	
	
	
	
	
	
	

}
