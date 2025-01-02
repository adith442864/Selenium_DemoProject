package collectionsFramework;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Bharath");
		list.add("Robert");
		list.add("Raj");
		System.out.println(list);
		
		list.add("Steve");
		System.out.println(list);
		System.out.println(list.get(2));
		
		list.addFirst("Mike");
		System.out.println(list);
		
		
		

	}

}
