package mytestng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.BrowserUtil;


public class DependsOnTests {
	
	@Parameters({"browser"})
	@Test
	public void test1(@Optional("Firefox")String browserName) {
		System.out.println("Browser name paramter is:="+browserName);
		RemoteWebDriver driver=BrowserUtil.getDriver(browserName);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Bharath@edureka.com");
		driver.findElement(By.xpath("//button")).click();
		driver.quit();
	}
	
	
	@Parameters({"browser","url"})
	@Test(dependsOnMethods = {"test1"})
	public void test2(@Optional("Firefox")String browserName,String url) {
		System.out.println("Browser name paramter is:="+browserName);
		RemoteWebDriver driver=BrowserUtil.getDriver(browserName);
		driver.get(url);
		driver.quit();
	}
	
	
	@Parameters({"browser"})
	@Test
	public void test3(@Optional("Firefox")String browserName) throws InterruptedException {
		System.out.println("Browser name paramter is:="+browserName);
		RemoteWebDriver driver=BrowserUtil.getDriver(browserName);
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Parameters({"browser"})
	@Test
	public void test4(@Optional("Firefox")String browserName) throws InterruptedException {
		System.out.println("Browser name paramter is:="+browserName);
		RemoteWebDriver driver=BrowserUtil.getDriver(browserName);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.quit();
	}


}
