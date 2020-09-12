package automationTesting;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");

		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.co.in");

		// driver.manage().window().maximize();

	
		  Dimension dimension = new Dimension(750, 500);
		  
		  driver.manage().window().setSize(dimension);
		 

	}

}
