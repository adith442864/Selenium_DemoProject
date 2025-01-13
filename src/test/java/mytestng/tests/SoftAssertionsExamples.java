package mytestng.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.BrowserUtil;

public class SoftAssertionsExamples {

	WebDriver driver;

	@Test
	public void testAssertions() throws InterruptedException {
		RemoteWebDriver driver = null; // Declare driver outside try-finally block
		try {
			driver = (RemoteWebDriver) BrowserUtil.getDriver("chrome");
			driver.get("https://www.facebook.com");

			String actualTitle = driver.getTitle();
			SoftAssert softAssertion = new SoftAssert();

			String expectedTitle = "Facebook – log in or sign up";
			AssertJUnit.assertEquals(actualTitle, expectedTitle);

			driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
			Thread.sleep(5000);

			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.facebook.com/login/identify?ctx=recover&ars=facebook_login&from_login_screen=0";
			AssertJUnit.assertEquals(actualURL, expectedURL, "Message");

			driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();

			softAssertion.assertAll();
			
		} 
		finally {
			if (driver != null) {
				driver.quit(); // Ensure the browser is closed
			}
		}
	}

}
