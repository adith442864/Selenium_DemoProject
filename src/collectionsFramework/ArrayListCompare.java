package collectionsFramework;
import java.util.ArrayList;

public class ArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create two ArrayLists
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // Add elements to the first ArrayList
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        // Add elements to the second ArrayList
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Grapes");

        // Compare the two ArrayLists before any operation
        System.out.println("Are the lists equal? " + list1.equals(list2));

        // Add an element to list2 and compare again
        list2.add("Mango");
        System.out.println("After adding 'Mango' to list2: " + list2);
        System.out.println("Are the lists equal? " + list1.equals(list2));

        // Remove an element from list1 and compare again
        list1.remove("Cherry");
        System.out.println("After removing 'Cherry' from list1: " + list1);
        System.out.println("Are the lists equal? " + list1.equals(list2));

        // Retain only common elements between list1 and list2
        list1.retainAll(list2);
        System.out.println("After retaining common elements in list1: " + list1);
        System.out.println("Are the lists equal? " + list1.equals(list2));

        // Remove all elements of list1 from list2
        list2.removeAll(list1);
        System.out.println("After removing elements of list1 from list2: " + list2);
        System.out.println("Are the lists equal? " + list1.equals(list2));

        // Additional: Check intersection and differences
        ArrayList<String> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        System.out.println("Intersection of list1 and list2: " + intersection);

        ArrayList<String> difference = new ArrayList<>(list1);
        difference.removeAll(list2);
        System.out.println("Difference of list1 and list2: " + difference);

        // Add all elements back to list1 and compare again
        list1.addAll(list2);
        System.out.println("After adding all elements of list2 to list1: " + list1);
        System.out.println("Are the lists equal? " + list1.equals(list2));
    }

	

}
