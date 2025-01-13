package mytestng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MouseOverExample {
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		
		WebElement payments = driver.findElement(By.xpath("//span[normalize-space()='Payments']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(payments).build().perform();
		
	
		Thread.sleep(3000);
		driver.quit();
		
	}

}
