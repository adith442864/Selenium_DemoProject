package mytestng.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleIframesExample {
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width_css");
		driver.switchTo().frame("iframeResult");
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frame);
		System.out.println(driver.getPageSource());
		
		driver.switchTo().parentFrame();
		System.out.println("################");
		System.out.println(driver.getPageSource());
		
		//modal dialog
		driver.navigate().to("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_modal2");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='myBtn']")).click();
		driver.findElement(By.xpath("//span[@class='close']")).click();
		
		
		Thread.sleep(3000);
		driver.quit();
	
	}

}
