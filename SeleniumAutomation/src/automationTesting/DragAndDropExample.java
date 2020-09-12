package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://leafground.com/pages/drop.html");
			
			driver.manage().window().maximize();
			
			WebElement From = driver.findElement(By.id("draggable"));
			WebElement To = driver.findElement(By.id("droppable"));
			
			Actions action = new Actions(driver);
			
			action.dragAndDrop(From, To).build().perform();
			
			//action.clickAndHold(From).moveToElement(To).release(To).build().perform();
	}

}
