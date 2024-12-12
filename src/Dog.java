
public class Dog {
	
	String name;
	String breed;
	String color;
	
	//constructor - should initialize values when object creation - No return type for const
	//same name as the class name
	
	public Dog(String name, String breed, String color) {
		this.name = name;
		this.breed = breed;
		this.color = color;
	}
	
	public Dog() {
		System.out.println("default const..");
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	//Behaviour -- Functions or Methods
	public void waggingTail() {
		System.out.println("Wagging tail" +this.name);
	}
	
	public void barking() {
		System.out.println("Barking" +this.name);
	}
	
	

	public static void main(String[] args) {
		

	}

}
