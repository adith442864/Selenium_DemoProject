package collectionsFramework;

public class ArraysDemo {

	public static void main(String[] args) {
		
		String emp[] = new String[5];
		emp[0] = "Bharath";
		emp[1] = "Raj";
		emp[2] = "Mike";
		emp[3] = "Robert";
		emp[4] = "Steve";
		
		System.out.println(emp[1]);
		System.out.println(emp.length);
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(i+"="+emp[i]);
		}

		String fruits[] = {"Apple","Orange","Banana"};
		System.out.println(fruits.length);
		
		for(int i=0; i<fruits.length; i++) {
			System.out.println(i+"="+fruits[i]);
		}
		
		
		int ranks[] = {1,2,3,4,5,656};
		int ranks1[] = {};
		ranks1=ranksMethod();
		
		String empData[][] = {{"Bharath","Trainer"},{"Raj","Admin"},{"Rob","HR"}};
//		String empData1[][] = {{"Bharath","Raj","Rob"},{"Trainer","Admin","HR"}};
		
		System.out.println(empData[0][0]);
		System.out.println(empData[0][1]);
		System.out.println(empData[1][0]);
		System.out.println(empData[1][1]);
		
		String empArray[][] =  new String[3][2];
		empArray[0][0]="Bharath";
		empArray[0][1]="Trainer";
		
		empArray[1][0]="Raj";
		empArray[1][1]="Admin";
		
		empArray[2][0]="Rob";
		empArray[2][1]="HR";
		
		
		

	}
	
	public static int[] ranksMethod() {
		int a[] = {10,20};
		return a;
	}

}
