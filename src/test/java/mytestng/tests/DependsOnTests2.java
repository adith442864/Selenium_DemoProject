package mytestng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.BrowserUtil;


public class DependsOnTests2 {
	
	@Parameters({"browser"})
	@Test
	public void test1(@Optional("Firefox")String browserName) {
		Reporter.log("Browser name paramter is:="+browserName);
		RemoteWebDriver driver=BrowserUtil.getDriver(browserName);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Bharath@edureka.com");
		driver.findElement(By.xpath("//button")).click();
		driver.quit();
	}
	
	
	@Parameters({"browser","url"})
	@Test
	public void test2(@Optional("Firefox")String browserName,@Optional("https://selenium.dev")String url) {
		Reporter.log("Browser name paramter is:="+browserName);
		RemoteWebDriver driver=BrowserUtil.getDriver(browserName);
		driver.get(url);
		driver.quit();
	}
	
	
	@Parameters({"browser"})
	@Test
	public void test3(@Optional("Firefox")String browserName) throws InterruptedException {
		Reporter.log("Browser name paramter is:="+browserName);
		RemoteWebDriver driver=BrowserUtil.getDriver(browserName);
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Parameters({"browser"})
	@Test
	public void test4(@Optional("Firefox")String browserName) throws InterruptedException {
		Reporter.log("Browser name paramter is:="+browserName);
		RemoteWebDriver driver=BrowserUtil.getDriver(browserName);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.quit();
	}


}
