package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Form_Fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe"); 
			
		    // 2. Initialize Webdriver object through ChromeDriver class.
		FirefoxDriver  browserObject = new FirefoxDriver();
		    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
		    browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		    
		    browserObject.findElement(By.name("name")).sendKeys("Sagar");
		    
		    browserObject.findElement(By.name("email")).sendKeys("sagar@gmail.com");
		    browserObject.findElement(By.name("website")).sendKeys("ITLearn360");
		    
		    browserObject.findElement(By.name("comment")).sendKeys("This is a good website");
		    browserObject.findElement(By.name("submit")).click();;
	}

}
