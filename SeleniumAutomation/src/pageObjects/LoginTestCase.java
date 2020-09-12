package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageWithFindBy;


public class LoginTestCase {
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
	
		/*LoginPageObjects.userName(driver).sendKeys("Admin");
		LoginPageObjects.password(driver).sendKeys("admin123");
		LoginPageObjects.loginButton(driver).click();*/
		
		PageFactory.initElements(driver, LoginPageWithFindBy.class);
		
		
         LoginPageWithFindBy.userName.sendKeys("Admin");
         LoginPageWithFindBy.password.sendKeys("admin123");
         LoginPageWithFindBy.loginButton.click();


		
		
		
		/*WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();*/
		
	}

}
