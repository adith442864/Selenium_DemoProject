package mytestng.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RobotClassExampleForMouseOperations {

	@Test
    public void test() throws InterruptedException, AWTException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        // Locate the button element
        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        // Perform right-click using Actions class
        Actions actions = new Actions(driver);
        actions.contextClick(button).perform();
        Thread.sleep(2000); // Wait for context menu to appear

        // Click on the "Paste" menu item
        WebElement pasteOption = driver.findElement(By.xpath("//span[text()='Paste']]"));
        pasteOption.click();

        Thread.sleep(3000);

        // Dismiss the alert by pressing "Enter"
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        // Command + R for refreshing the page (macOS uses COMMAND instead of CONTROL)
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_META);

        Thread.sleep(3000);

        // Scroll up using the mouse wheel
        robot.mouseWheel(-3);

        Thread.sleep(3000);
        driver.quit();
    }
}
