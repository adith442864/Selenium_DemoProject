package mytestng.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ScrollingPage {
	
	@Test
	public void test() throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		
		for(int i=1; i<=5; i++) {
			Thread.sleep(2000);
			driver.executeScript("window.scrollBy(0,200);");
		}
		
		Thread.sleep(3000);
		driver.executeScript("window.scrollTo(0,600);");
		
		//
		Thread.sleep(3000);
		driver.get("https://jqueryui.com/tooltip/");
		WebElement link = driver.findElement(By.xpath("//a[text()='Cookie']"));
		driver.executeScript("arguments[0].scrollIntoView();", link);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
