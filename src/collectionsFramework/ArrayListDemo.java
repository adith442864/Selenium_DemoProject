package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Create an ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Add elements to the ArrayList
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		System.out.println("After adding elements: " + list);

		// Add element at a specific index
		list.add(1, "Orange");
		System.out.println("After adding element at index 1: " + list);

		// Get element by index
		String element = list.get(2);
		System.out.println("Element at index 2: " + element);

		// Update element at a specific index
		list.set(2, "Blueberry");
		System.out.println("After updating element at index 2: " + list);

		// Remove element by index
		list.remove(1);
		System.out.println("After removing element at index 1: " + list);

		// Remove element by value
		list.remove("Banana");
		System.out.println("After removing element 'Banana': " + list);

		// Check if the list contains a specific element
		boolean contains = list.contains("Apple");
		System.out.println("Does the list contain 'Apple'? " + contains);

		// Get the size of the list
		int size = list.size();
		System.out.println("Size of the list: " + size);

		// Iterate over the list
		System.out.println("Iterating over the list:");
		for (String item : list) {
			System.out.println(item);
		}

		// Sort the list
		list.add("Kiwi");
		list.add("Grapes");
		Collections.sort(list);
		System.out.println("After sorting: " + list);

		// Reverse the list
		Collections.reverse(list);
		System.out.println("After reversing: " + list);

		// Clear the list
		list.clear();
		System.out.println("After clearing the list: " + list);

		// Check if the list is empty
		boolean isEmpty = list.isEmpty();
		System.out.println("Is the list empty? " + isEmpty);

		// Add all elements from another list
		ArrayList<String> anotherList = new ArrayList<>();
		anotherList.add("Mango");
		anotherList.add("Pineapple");
		list.addAll(anotherList);
		System.out.println("After adding all elements from another list: " + list);

		// Remove all elements present in another list
		list.removeAll(anotherList);
		System.out.println("After removing all elements of another list: " + list);

		// Retain only elements that are also in another list
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		anotherList.clear();
		anotherList.add("Apple");
		anotherList.add("Cherry");
		list.retainAll(anotherList);
		System.out.println("After retaining elements present in another list: " + list);

		// Convert ArrayList to Array
		String[] array = list.toArray(new String[0]);
		System.out.println("Converted Array: ");
		for (String item : array) {
			System.out.println(item);
		}

		// Create a sublist
		list.add("Mango");
		list.add("Pineapple");
		ArrayList<String> sublist = new ArrayList<>(list.subList(0, 2));
		System.out.println("Sublist (0 to 2): " + sublist);
	}

}
