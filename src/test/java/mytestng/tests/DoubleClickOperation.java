package mytestng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DoubleClickOperation {
	
	@Test
	public void doubleClick() throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement ele = driver.findElement(By.xpath("//p[@ondblclick='myFunction()']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.doubleClick(ele).build().perform();
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	

}
