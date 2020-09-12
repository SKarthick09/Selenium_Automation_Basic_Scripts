package automationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("Before Login, the title: "+driver.getTitle());
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.name("Submit")).click();
		
		System.out.println("After Login, the title: "+driver.getTitle());	
	}

}
