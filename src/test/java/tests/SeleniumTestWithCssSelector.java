package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestWithCssSelector {
	
	//Css Selectors
	//button[id^='u_0_5'] --Starts with
	//button[id*='u_0_5'] -- Contains

	public static void main(String[] args) throws InterruptedException {
		System.out.println("My First Selenium Test");
		//We need to create the driver to interact with Browser
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		
		//Define the Locator and identify the element
		//WebElement t=driver.findElement(By.xpath("//textarea[@name='q']"));
		WebElement t=driver.findElement(By.cssSelector("textarea[name='q']"));
		t.sendKeys("Selenium Dev");
		//Add a wait or a Delay before we click on search button
		Thread.sleep(5000);
		//WebElement b=driver.findElement(By.xpath("//input[@class='gNO89b']"));
		WebElement b=driver.findElement(By.cssSelector("input.gNO89b"));
		b.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='rso']/div[2]/div[6]//a")).click();
		Thread.sleep(25000);
		driver.navigate().to("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Bharath@edureka.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Bharath@edureka.com");
		//o1(driver,By.xpath("//input[@id='email']")).sendKeys("test");
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).getTagName();
	}
	
	public static WebElement o1(ChromeDriver driver,By by) {
		return driver.findElement(by);
	}

}
