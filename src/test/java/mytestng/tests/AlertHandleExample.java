package mytestng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandleExample {
	
	@Test
	public void testHandlingAlerts() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		String messageofTheAlert = driver.switchTo().alert().getText();
		System.out.println(messageofTheAlert);
		driver.switchTo().alert().accept(); //Ok Button
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		messageofTheAlert = driver.switchTo().alert().getText();
		System.out.println(messageofTheAlert);
		driver.switchTo().alert().dismiss(); //Cancel button
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("testing");
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
