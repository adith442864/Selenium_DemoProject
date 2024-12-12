
public class ClassAndObjectDemo {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Tommy","Bulldog","Black");
		
//		dog1.color = "Black";
//		dog1.breed="Bulldog";
//		dog1.name="Tommy";
		
		dog1.waggingTail();
		dog1.barking();
		
		System.out.println(dog1.name);
		System.out.println(dog1.breed);
		System.out.println(dog1.color);
		
		System.out.println("--------");
		
		Dog dog2 = new Dog("Micky","SomerBreed","White");
		System.out.println(dog1.name);
		System.out.println(dog1.breed);
		System.out.println(dog1.color);
		dog2.waggingTail();
		dog2.barking();
		
		System.out.println("--------");
		
		Dog dog3 = new Dog();
		dog3.color = "Black";
		dog3.breed="Pumarean";
		dog3.name="sunny";
		
		dog3.waggingTail();
		dog3.barking();
		
		System.out.println(dog3.name);
		System.out.println(dog3.breed);
		System.out.println(dog3.color);
		

	}

}

//BluePrint -- Class in Java - To represent characteristics - State and Behaviour
/*
class Dog{
	
	String name;
	String breed;
	String color;
	
	//Behaviour -- Functions or Methods
	public void waggingTail() {
		System.out.println("Wagging tail");
	}
	
	public void barking() {
		System.out.println("Barking");
	}
	*/

	
