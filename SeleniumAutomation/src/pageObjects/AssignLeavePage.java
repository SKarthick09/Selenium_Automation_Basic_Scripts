package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AssignLeavePage {
	@Test
	public void login() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		Thread.sleep(3000);
		
		WebElement assignLeaveButton = driver.findElement(By.xpath("//*[@id=\'dashboard-quick-launch-panel-menu_holder\']/table/tbody/tr/td[1]/div/a/img"));
		assignLeaveButton.click();
		
		WebElement empName = driver.findElement(By.id("assignleave_txtEmployee_empName"));
		empName.sendKeys("kajal Rajput");
		
		//Select leaveTypeOptions = new Select (driver.findElements(By.id("assignleave_txtLeaveType")));
		//leaveTypeOptions.selectByIndex(1);
		
		WebElement options = driver.findElement(By.id("assignleave_txtLeaveType"));
		Select select = new Select(options);
		select.selectByIndex(1);
		
		WebElement fromDate = driver.findElement(By.id("assignleave_txtFromDate"));
		fromDate.clear();
		fromDate.sendKeys("2020-06-26"+Keys.ENTER);
		
		WebElement toDate = driver.findElement(By.id("assignleave_txtToDate"));
		toDate.clear();
		toDate.sendKeys("2020-06-28"+Keys.ENTER);
		
		WebElement comment = driver.findElement(By.id("assignleave_txtComment"));
		comment.sendKeys("Stomach Pain"+Keys.ENTER);
		
		WebElement assignButton = driver.findElement(By.id("assignBtn"));
		assignButton.click();
}
	
}
