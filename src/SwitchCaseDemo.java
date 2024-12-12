
public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		String day ="Wed";
		
		switch (day) {
		case "Mon":
			System.out.println("Monday");
			break;
		case "Tue":
			System.out.println("Tuesday");
			break;
		case "Wed":
			System.out.println("Wednesday");
			break;
		case "Thu":
			System.out.println("Thursday");
			break;
		case "Fri":
			System.out.println("Friday");
			break;
		case "Sat":
			System.out.println("Saturday");
			break;
		case "Sun":
			System.out.println("Sunday");
			break;

		default:
			System.out.println("For the given value there is no case defined..");
			break;
		}
		
		//using if-else condition
		
		if(day=="Mon") {
			System.out.println("Monday");
		}
		else if(day=="Tue") {
			System.out.println("Tuesday");
		}
		else if(day=="Wed") {
			System.out.println("Wednesday");
		}
		else if(day=="Thu") {
			System.out.println("Thursday");
		}
		else if(day=="Fri") {
			System.out.println("Friday");
		}
		else if(day=="Sat") {
			System.out.println("Saturday");
		}
		else if(day=="Sun") {
			System.out.println("Sunday");
		}

	}

}
