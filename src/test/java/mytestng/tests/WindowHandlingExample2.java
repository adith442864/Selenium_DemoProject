package mytestng.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlingExample2 {
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		System.out.println(handles);
		for(String handle : handles) {
			System.out.println(handle);
			driver.switchTo().window(handle);
			String title = driver.getCurrentUrl();
			if(title.contains("new")) {
				driver.close();
			}
			
		}
		
		Thread.sleep(3000);
		driver.quit();
	
	}

}
