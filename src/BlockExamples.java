
public class BlockExamples {

	public static void main(String[] args) {
		
		Stdnt obj1 = new Stdnt("Bharath", 1);
		Stdnt obj2 = new Stdnt("Mark", 2);
		System.out.println(Stdnt.schoolName);
		Stdnt obj3 = new Stdnt();
		System.out.println(obj3.rollNo +" " +obj3.name);
		
		//Clear certain records in the system when you creating the object
	}

}


class Stdnt {
	int rollNo;
	String name;
	static String schoolName;
	
	//instance block - set default values
	{
		System.out.println("Instance Block is invoked");
		this.rollNo=0;
		this.name="No Name";
	}
	
	//static 
	static {
		System.out.println("Static Block is invoked..");
		schoolName="Edureka Institute";
	}
	
	public Stdnt() {
		
	}
	
	public Stdnt(String name) {
		//Insert record into the database
	}
	
	public Stdnt(String name, int rollNo) {
		System.out.println("Constructor Block is invoked");
		this.name = name;
		this.rollNo = rollNo;
	}
	
	
	
}
