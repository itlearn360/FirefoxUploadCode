package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonClass {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver browserObject;
	       // 1. setup the property of WebDriver to perform "linktext" through chrome web browser.
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe"); 
		// 2. Initialize WebDriver object through ChromeDriver class.
	        browserObject = new FirefoxDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.xpath("//input[@value ='female']")).click();
	        
	        Thread.sleep(5000);
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	        
	        Thread.sleep(5000);
	        
	        browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
	        
	        browserObject.findElement(By.name("submit")).click();

	}

}
