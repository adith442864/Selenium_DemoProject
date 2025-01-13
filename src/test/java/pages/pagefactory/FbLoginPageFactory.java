package pages.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPageFactory {
	
	//Driver reference
	WebDriver driver;
	
	//Locators of the elements
	@FindBy(id="email")
	WebElement inputEmailId;
	
	@FindBy(id="pass")
	WebElement inputPassword;
	
	
	@FindBy(xpath="//button[@data-testid='royal_login_button']")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	WebElement linkForgotPassword;

	//constructor
	public FbLoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Method to perform actions on the elements
	public void setEmailId(String emailId) {
		inputEmailId.sendKeys(emailId);
		
	}
	
	public void setPassword(String password) {
	inputPassword.sendKeys(password);
		
	}
	
	public void clickLoginButton() {
		loginBtn.click();
		
	}
	

	public void clickForgotPassword() {
		linkForgotPassword.click();
		
	}
	
	
	public void doLogin(String emailId, String password) {
		this.setEmailId(emailId);
		this.setPassword(password);
		this.clickLoginButton();
	
	}

}
