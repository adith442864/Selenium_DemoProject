package mytestng.tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void googleTest() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		
	}
	

}
