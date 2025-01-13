package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbForgotPasswordPage {
	
	WebDriver driver;
	
	//Locators
	By inputEmailAddress = By.name("email");
	By buttonSearch = By.id("did_submit");
	
	
	//constructor
	public FbForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void setEmailId(String emailId) {
		driver.findElement(inputEmailAddress).sendKeys(emailId);
	}
	
	public void clickSearchButton() {
		driver.findElement(buttonSearch).click();
	}
	
	
	
	
	
	

}
