package mytestng.tests;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridExample {
	
	@Test
	public void test1() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN11);
		
		RemoteWebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),cap);
		driver.get("https://jqueryui.com/tooltip/");
		WebElement link = driver.findElement(By.xpath("//a[text()='Cookie']"));
		driver.executeScript("arguments[0].scollIntoView();", link);
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	
	@Test
	public void test2() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN11);
		
		RemoteWebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),cap);
		driver.get("https://jqueryui.com/tooltip/");
		WebElement link = driver.findElement(By.xpath("//a[text()='Cookie']"));
		driver.executeScript("arguments[0].scollIntoView();", link);
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	
	@Test
	public void test3() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN11);
		
		RemoteWebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),cap);
		driver.get("https://jqueryui.com/tooltip/");
		WebElement link = driver.findElement(By.xpath("//a[text()='Cookie']"));
		driver.executeScript("arguments[0].scollIntoView();", link);
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	

}
