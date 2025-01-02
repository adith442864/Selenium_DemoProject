package collectionsFramework;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
//		LinkedHashSet<String> set = new LinkedHashSet<>();
//		LinkedList<String> set = new LinkedList<>();
		set.add("Bharath");
		set.add("Raj");
		set.add("Robert");
		set.add("Ariv");
		set.add("Subash");
		
		System.out.println(set);//[Bharath, Ariv, Robert, Subash, Raj]
		set.add("Bharath");
		set.add("Subash");
		System.out.println(set); //[Bharath, Ariv, Robert, Subash, Raj]
		
		LinkedList<Emp> myEmp = new LinkedList<Emp>();
		Emp e1 = new Emp();
		Emp e2 = new Emp("Bargav","QA");
		
		e1.name="Bharath";
		e1.title = "trainer";
		
		myEmp.add(e1);
		myEmp.add(e2);
		
		
		
		System.out.println(myEmp.get(0).name);
		System.out.println(myEmp.get(0).title);
		
		System.out.println(myEmp.get(1).name);
		System.out.println(myEmp.get(1).title);


	}

}

class Emp {
	
	String name;
	String title;
	
	public Emp() {
		
	}
	
	public Emp(String name,String title) {
		this.name = name;
		this.title = title;
	}
	
}
