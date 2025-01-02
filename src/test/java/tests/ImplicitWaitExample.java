package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
		
		//Thread.sleep(8000);
		boolean flag = driver.findElement(By.xpath("//h4[normalize-space()='Hello World!']")).isDisplayed();
		System.out.println("Flag: " +flag);
		

		Thread.sleep(3000);
		driver.quit();
	}


}
