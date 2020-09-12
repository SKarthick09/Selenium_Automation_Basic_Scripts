package automationTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
	
	public static void main(String args[]) throws AWTException
	{
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://leafground.com/pages/upload.html");
	
	driver.manage().window().maximize();
	
	WebElement chooseFile = driver.findElement(By.name("filename"));
	chooseFile.click();
	
	
	
	String filePath = "C:\\Users\\Admin\\Documents\\testleaf.xls";
	
	StringSelection select = new StringSelection(filePath);
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_CONTROL);

	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
