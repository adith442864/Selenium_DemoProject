package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BrowserUtil {

	public static void customAssertion(String expected,String actual,String whatmessage) {
		if(expected.equalsIgnoreCase(actual)) {
			Reporter.log(whatmessage+"- Passed");
			Assert.assertEquals(expected, actual);	
		}
		else {
			Reporter.log(whatmessage+"- Failed");
			Assert.assertEquals(expected, actual);	
		}
		
	}
	public static RemoteWebDriver getDriver(String browserName) {

		RemoteWebDriver driver;
		if(browserName==null) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		
		return driver;
	}

}
