package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        
		String url = ("https://www.google.com/");
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Image")).click();
		
		String pageTitle = driver.getTitle();
		
		int titleLength = driver.getTitle().length();
		
		System.out.println("Title of the Page is: " +pageTitle);
		System.out.println("Length of the title is: "+titleLength);
		
		if(pageTitle.equals("Google Images"))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is wrong");
		}
		driver.close();

	}

}
