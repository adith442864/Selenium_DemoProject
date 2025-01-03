package mytestng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class AlertHandlingExample {
	
	@Test
	public void testHandlingAlerts() throws InterruptedException {
		RemoteWebDriver driver=(RemoteWebDriver) BrowserUtil.getDriver("chrome");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(10000);
		String messageOftheAlert=driver.switchTo().alert().getText();
		
		System.out.println(messageOftheAlert);
		driver.switchTo().alert().accept();//Ok button
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(10000);
		driver.switchTo().alert().dismiss();//Cancel button operation
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(10000);
		driver.switchTo().alert().sendKeys("Bharath Testing");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();//OK button
	}

}
