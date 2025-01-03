package mytestng.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTestNgTest2 {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void before() {
		driver=new ChromeDriver();
	}
	
	@AfterMethod
	public void after() {
		driver.quit();
	}

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
	
	@Test
	public void dynamicElementTest() {
		ChromeDriver driver=new ChromeDriver();
		//Implicit wait
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		//Thread.sleep(10000);
		boolean flag=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		System.out.println("Flag:="+flag);
	}

}
