package pages.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FbForgotPasswordPageFactory {
	
	WebDriver driver;
	
	//Locators
	@FindBy(how=How.NAME, using="email")
	WebElement inputEmailAddress;
	
	@FindBy(id="did_submit")
	WebElement buttonSearch;
	
	//constructor
	public FbForgotPasswordPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setEmailId(String emailId) {
		inputEmailAddress.sendKeys(emailId);
	}
	
	public void clickSearchButton() {
		buttonSearch.click();
	}
	
	
	
	
	
	

}
