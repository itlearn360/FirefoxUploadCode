package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver browserObject;
	       // 1. setup the property of WebDriver to perform "linktext" through chrome web browser.
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe"); 
		// 2. Initialize WebDriver object through ChromeDriver class.
	        browserObject = new FirefoxDriver();
		// 3. Open login page of https://admin-demo.nopcommerce.com/login
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	       
		// 4. Get reference of Email input box by locate the id method.
	        WebElement email=browserObject.findElement(By.id("Email"));
		// 5. Clear the Email input box.
	        email.clear();
		// 6. Get reference of Password input box by locate the id method.
	        WebElement password=browserObject.findElement(By.id("Password"));
		// 7. Clear the Password input box.
	        password.clear();
		// 8. Provide/Enter the correct email to email input box through reference.
	        email.sendKeys("admin@yourstore.com");
		// 9. Provide/Enter the correct password to password input box through reference.
	        password.sendKeys("admin");
		// 10. Get reference of login button by locate the classname method.
	        WebElement button=browserObject.findElement(By.className("button-1"));
		// 11. Submit the button.
	        button.submit();
		// 12. Close the web browser.
		browserObject.close();
	}

}
