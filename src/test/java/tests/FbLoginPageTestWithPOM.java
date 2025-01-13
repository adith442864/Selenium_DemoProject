package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.FbForgotPasswordPage;
import pages.FbLoginPage;

public class FbLoginPageTestWithPOM {
	
	@Test
	public void testLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		FbLoginPage loginPage = new FbLoginPage(driver);
		loginPage.doLogin("test@edureka.com", "Welcome1");
		driver.quit();
	}
	

	@Test
	public void testForgotPassword() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		FbLoginPage loginPage = new FbLoginPage(driver);
		loginPage.doLogin("test@edureka.com", "Welcome1");
		loginPage.clickForgotPassword();
		FbForgotPasswordPage forgotPage = new FbForgotPasswordPage(driver);
		forgotPage.setEmailId("bharath@edureka.com");
		forgotPage.clickSearchButton();
		driver.close();
		driver.quit();
		
	}

}
