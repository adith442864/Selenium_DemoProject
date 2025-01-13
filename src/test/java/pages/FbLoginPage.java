package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbLoginPage {
	
	//Driver reference
	WebDriver driver;
	
	//Locators of the elements
	By inputEmailId = By.id("email");
	By inputPassword = By.id("pass");
	By loginBtn = By.xpath("//button[@data-testid='royal_login_button']");
	By linkForgotPassword = By.xpath("//a[text()='Forgotten password?']");

	//constructor
	public FbLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Method to perform actions on the elements
	public void setEmailId(String emailId) {
		driver.findElement(inputEmailId).sendKeys(emailId);
		
	}
	
	public void setPassword(String password) {
		driver.findElement(inputPassword).sendKeys(password);
		
	}
	
	public void clickLoginButton() {
		driver.findElement(loginBtn).click();
		
	}
	

	public void clickForgotPassword() {
		driver.findElement(linkForgotPassword).click();
		
	}
	
	
	public void doLogin(String emailId, String password) {
		this.setEmailId(emailId);
		this.setPassword(password);
		this.clickLoginButton();
	
	}

}
