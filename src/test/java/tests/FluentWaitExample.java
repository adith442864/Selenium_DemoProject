package tests;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	
		
		driver.findElement(By.xpath("//button[normalize-space()='Enable']")).click();
		//Explicit Wait
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(ElementNotInteractableException.class, NoSuchElementException.class);
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		driver.findElement((By.xpath("//input[@type='text']"))).sendKeys("Testing");
		
		driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='checkbox']")));
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		
		

		Thread.sleep(3000);
		driver.quit();
	}

}
