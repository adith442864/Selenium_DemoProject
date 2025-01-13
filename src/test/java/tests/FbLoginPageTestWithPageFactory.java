package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.pagefactory.FbForgotPasswordPageFactory;
import pages.pagefactory.FbLoginPageFactory;

public class FbLoginPageTestWithPageFactory {
	
	@Test
	public void testLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		FbLoginPageFactory loginPage = new FbLoginPageFactory(driver);
		loginPage.doLogin("test@edureka.com", "Welcome1");
		driver.quit();
	}
	

	@Test
	public void testForgotPassword() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		FbLoginPageFactory loginPage = new FbLoginPageFactory(driver);
		loginPage.doLogin("test@edureka.com", "Welcome1");
		loginPage.clickForgotPassword();
		FbForgotPasswordPageFactory forgotPage = new FbForgotPasswordPageFactory(driver);
		forgotPage.setEmailId("bharath@edureka.com");
		forgotPage.clickSearchButton();
		driver.quit();
		
	}

}
