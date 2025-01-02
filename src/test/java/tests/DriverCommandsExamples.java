package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCommandsExamples {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("Page title is: " +title);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("New URL is: " +currentUrl);
		
		System.out.println(driver.getPageSource());
		
		driver.navigate().to("https://www.selenium.dev");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
