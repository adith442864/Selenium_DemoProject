package a;

public class ClassA {

	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		obj.a();
		obj.b();
		obj.c();
		obj.d();

	}
	
	
	public void a() {
		System.out.println("This is public from ClassA");
	}
	
	
	protected void b() {
		System.out.println("This is protected from ClassA");
	}
	
	//Default access modifier
	void c() {
		System.out.println("This is default from ClassA");
	}
	
	private void d() {
		System.out.println("This is private from ClassA");
	}

}
