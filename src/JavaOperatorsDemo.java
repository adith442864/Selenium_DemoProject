
public class JavaOperatorsDemo {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		int sum = a+b;
		System.out.println(sum);
		
		System.out.println(a*b);
		System.out.println(b-a);
		System.out.println(b/a);
		
		System.out.println(b%a);
		
		String firstName="test";
		String lastName="automation";
		
		System.out.println(firstName+lastName);
		
		int i=10;
//		i=i+1;
//		i++;
		++i;
//		int j =i++;
		System.out.println("value of i: " +i);
//		System.out.println("value of i: " +j);
		
		//Relational
		boolean result = a<b;
		System.out.println(result);
		
		int x=10, y=20,z=10;
		boolean result2 = (x<=z);
		System.out.println(result2);
		
		System.out.println((x<y) && (x<z));
		System.out.println((x<y) || (x<z));
		
		

	}

}
