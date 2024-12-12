
public class StaticKeywordExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student.setSchoolName();

	}

}

class Student {
	
	String name;
	static String schoolName;
	int rollNo;
	
	public static void setSchoolName() {
		schoolName = "ABC School";
		System.out.println(schoolName);
	}
	
}
