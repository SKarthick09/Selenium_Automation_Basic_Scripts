package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/upload/";
        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("C:\\Users\\Admin\\Desktop\\testleaf.xls");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("send")).click();

	}

}
