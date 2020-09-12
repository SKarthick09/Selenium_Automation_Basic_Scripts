package automationTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Alert.html");

		driver.manage().window().maximize();

		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBox.click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();

		WebElement confirmBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmBox.click();

		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss();

		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptBox.click();

		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Testing");
		promptAlert.accept();
	}

}
