package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExamples {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String value = driver.findElement(By.name("login")).getAttribute("class");
		System.out.println(value);
		
		String text = driver.findElement(By.name("login")).getText();
		System.out.println("Text content of the element is: " +text);
		
		String loginText = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).getText();
		System.out.println("Text content of the element is: " +loginText);

		String fontSize = driver.findElement(By.id("pass")).getCssValue("font-size");
		System.out.println("Font Size: " +fontSize);
		
		String border = driver.findElement(By.id("pass")).getCssValue("border");
		System.out.println("border : " +border);
		
		Dimension d = driver.findElement(By.id("pass")).getSize();
		System.out.println(d.height );
		System.out.println(d.width);
		
		Point p = driver.findElement(By.id("pass")).getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		
		String tagName = driver.findElement(By.id("pass")).getTagName();
		System.out.println("Tag Name: " +tagName);

		Thread.sleep(3000);
		driver.quit();
	}

}
