
public class BreakAndContinuteStatementDemo {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=10) {
			if(i==5) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("End of the program");
		
		//continue keyword
		int j=0;
		while(j<10) {
			j++;
			if(j==5) {
				System.out.println("Skipping iteration number: " +j);
				continue;
			}
			System.out.println(j);
			
		}
		
		System.out.println("End of the program");

	}

}
