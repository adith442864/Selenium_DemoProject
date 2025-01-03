package mytestng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class AssertionsExamples {
	
	@Test
	public void testAssertions() throws InterruptedException {
		RemoteWebDriver driver=(RemoteWebDriver) BrowserUtil.getDriver("chrome");
		driver.get("https://www.facebook.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		Assert.assertEquals(actualTitle, expectedTitle,"Verify expected title of the facebook login page");
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(5000);
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.facebook.com/login/identify?ctx=recover&ars=facebook_login&from_login_screen=0";
		//Assert.assertEquals(actualURL, expectedURL,"It seems URL of the forgot password is different and assertion failed");
		BrowserUtil.customAssertion(actualURL, expectedURL, "Verify the URL of the forgotpassword link");
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	}

}
