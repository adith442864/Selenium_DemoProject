package mytestng.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class MyFirstTestNgTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
	}

	@Test(priority=1,description="Verify searching is working in Google")
	public void googleTest() {
		//driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=2,description="Launching Facebook page")
	public void faceBookTest() {
		BrowserUtil.getDriver();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=3,enabled=true)
	public void dynamicElementTest() {
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
		
		//Thread.sleep(8000);
		boolean flag = driver.findElement(By.xpath("//h4[normalize-space()='Hello World!']")).isDisplayed();
		System.out.println("Flag: " +flag);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
