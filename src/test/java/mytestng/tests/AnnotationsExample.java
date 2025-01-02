package mytestng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExample {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after Class");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test
	public void test1() {
		System.out.println("Test Case1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test Case2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

}
