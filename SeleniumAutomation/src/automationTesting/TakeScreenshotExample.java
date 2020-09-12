package automationTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenshotExample {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		takeScreenshot("Google_Page1");
		
	}
		public static void takeScreenshot(String fileName) throws IOException{
			
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(file, new File("C:\\Users\\Admin\\Desktop\\Selenium Practice\\SeleniumPractice\\src\\automationTesting\\Screenshots\\" +fileName+".png"));			
			
		}

	}
