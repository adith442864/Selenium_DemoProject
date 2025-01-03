package mytestng.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTestNgTest {
	
	ChromeDriver driver;
	
	

	@Test(priority = 0,description = "Verify searching is working in Google page")
	public void googleTest() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://www.google.com");
		
	}
	
	
	@Test(priority = 1,description = "Launching FB page")
	public void faceBookTest() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://www.facebook.com");
	}
	
	
}
