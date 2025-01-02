package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("My First Selenium Test");
		//We need to create the driver to interact with Browser
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		
		//Define the Locator and identify the element
		WebElement t=driver.findElement(By.name("q"));
		t.sendKeys("Selenium Dev");
		//Add a wait or a Delay before we click on search button
		Thread.sleep(5000);
		WebElement b=driver.findElement(By.className("gNO89b"));
		b.click();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Bharath@edureka.com");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}

}
