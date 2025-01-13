package mytestng.tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionClassExample {
	
	@Test
	public void rightClick() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");	
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(button).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(5000);
		actions.keyDown(Keys.META).keyUp(Keys.META).build().perform();
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	
	
	
	
	}

}
