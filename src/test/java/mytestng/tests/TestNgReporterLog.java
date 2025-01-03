package mytestng.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgReporterLog {
	
	@Test
	public void test() {
		Reporter.log("Step1: Launching the browser",true);
		ChromeDriver driver=new ChromeDriver();
		Reporter.log("Step1: Launching the browser with Google URL",true);
		driver.get("https://www.google.com");
		driver.quit();
	}

}
