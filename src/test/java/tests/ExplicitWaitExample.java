package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		driver.findElement(By.xpath("//button[normalize-space()='Enable']")).click();
		WebElement inputEle = driver.findElement(By.xpath("//input[@type='text']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(inputEle)).sendKeys("Testing");
		
		driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='checkbox']")));
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		
		

		Thread.sleep(3000);
		driver.quit();
	}

}
