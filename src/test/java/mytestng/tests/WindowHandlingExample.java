package mytestng.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlingExample {
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/");
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window Address: " +parentWindowHandle);
		
		//want to open a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com");
		String fbHandle = driver.getWindowHandle();
		System.out.println("FB Window Address:" +fbHandle);
		
		driver.switchTo().window(parentWindowHandle);
		driver.close();	
		driver.switchTo().window(fbHandle);
		driver.navigate().to("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		driver.findElement(By.xpath("//a[normalize-space()='Forgotten account?']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		Thread.sleep(3000);
		driver.quit();
	
	}

}
