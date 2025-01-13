package mytestng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DragAndDropExample {
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		//act.clickAndHold(draggable).release(droppable).build().perform();
		act.dragAndDrop(draggable, droppable).build().perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
