package automationTesting;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadedExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/download.html");
		
		driver.manage().window().maximize();
		
		WebElement downloadLink = driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();
		
		Thread.sleep(3000);
		
		File fileLocation = new File("C:\\Users\\Admin\\Downloads");
		
		File[] totalFiles = 	fileLocation.listFiles();
		
		for (File file : totalFiles) {
			
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("File is downloaded");
			}
		}
		


	}

}
