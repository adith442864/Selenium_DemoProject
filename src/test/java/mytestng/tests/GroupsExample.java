package mytestng.tests;

import org.testng.annotations.Test;

public class GroupsExample {
	
	@Test(groups = {"sanity","module1"})
	public void test1() {
		System.out.println("Test case1");	
	}
	
	@Test(groups = {"regression","module1"})
	public void test2() {
		System.out.println("Test case2");	
	}
	
	@Test(groups = {"module1"})
	public void test3() {
		System.out.println("Test case3");	
	}
	
	
	@Test(groups = {"regression","module2"})
	public void test4() {
		System.out.println("Test case4");	
	}
	@Test(groups = {"sanity","module2"})
	public void test5() {
		System.out.println("Test case5");	
	}
	@Test(groups = {"sanity","module3"})
	public void test6() {
		System.out.println("Test case6");	
	}
	@Test(groups = {"regression","module4"})
	public void test7() {
		System.out.println("Test case7");	
	}
	
	@Test(groups = {"module4"})
	public void test8() {
		System.out.println("Test case8");	
	}

}
