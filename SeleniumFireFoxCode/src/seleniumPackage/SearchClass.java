package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe"); 
		
	    // 2. Initialize Webdriver object through ChromeDriver class.
	FirefoxDriver  browserObject = new FirefoxDriver();
	    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
	    browserObject.get("https://www.google.com/");
	    
	    browserObject.findElement(By.name("q")).sendKeys("Selenium Python");
	    
	    browserObject.findElement(By.name("btnK")).submit();

	}

}
