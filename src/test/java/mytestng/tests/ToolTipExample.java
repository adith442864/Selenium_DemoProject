package mytestng.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTipExample {
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement frameEle = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frameEle);
		
		Thread.sleep(3000);
		String toolTip = driver.findElement(By.id("age")).getAttribute("title");
		System.out.println("Tooltip is: " +toolTip);
		//You must come out of the iframe
		driver.switchTo().defaultContent(); //This will set the control of the driver back to the original page
		driver.findElement(By.xpath("//a[normalize-space()='Draggable']")).click();
		
				
		
		Thread.sleep(3000);
		driver.quit();
	
	}

}
