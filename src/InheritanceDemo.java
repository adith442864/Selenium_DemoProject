
public class InheritanceDemo {

	public static void main(String[] args) {
		
		Car c = new Car(1500,"X3","BMW");
		c.moveForward();
		c.applyBreak();
		c.steering();
		c.display();
		
		System.out.println("-----------");
		
		LuxuryCar obj = new LuxuryCar(2000, "X6", "Mercedez Benz");
		
		obj.moveForward();
		obj.applyBreak();
		obj.steering();
		obj.sunRoof();
		obj.display();
		
		System.out.println("-----------");
		
		Car myobj = new LuxuryCar(2500, "X10", "Ferrari");
		myobj.applyBreak();
		
		
		

	}

}

class Car {
	
	public Car() {
		System.out.println("Default const..");
	}
	
	public Car(int engineCC, String model,String company) {
		System.out.println("Initializing Param Car Const...");
		this.engineCC = engineCC;
		this.model = model;
		this.company = company;
		
	}
	
	int engineCC;
	String model;
	String company;
	
	public void moveForward() {
		System.out.println("Car-moving forward");
	}
	
	public void applyBreak() {
		System.out.println("Car-apply break");
	}
	
	public void steering() {
		System.out.println("Car--steering");
	}
	
	public void display() {
		System.out.println("engineCC:=" +this.engineCC);
		System.out.println("Model:=" +this.model);
		System.out.println("Company:=" +this.company);
	}
	
}


//Inheritance
//Car -- Parent Class
//Luxury Class - child class
class LuxuryCar extends Car {
	
	public LuxuryCar() {
		System.out.println("Default const..");
	}
	
	public LuxuryCar(int engineCC, String model,String company) {
		super(engineCC, model, company);
	}
	
	
	//method overriding:
	@Override
	public void applyBreak() {
		System.out.println("ABS-apply break");
	}
	
	public void sunRoof() {
		System.out.println("Open Sunroof");
	}
	
	
	
	
	
}

