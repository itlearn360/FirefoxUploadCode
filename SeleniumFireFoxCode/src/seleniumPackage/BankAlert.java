package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BankAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver browserObject;
	       // 1. setup the property of WebDriver to perform "linktext" through chrome web browser.
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe"); 
			browserObject = new FirefoxDriver();
	       // 3. Open the form page https://mail.rediff.com/cgi-bin/login.cgi
	        browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// 4. Locate the signIn button without passing the value to username and password in input box and perform click.
	        browserObject.findElement(By.name("proceed")).click();
	       // 5. Intialize Alert object using switchTo and alert method.
	        Alert alert = browserObject.switchTo().alert();
		
		// 6. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
	        Thread.sleep(3000);
		
		// 7 . The getText method will give the text in alert box.
	        System.out.println(alert.getText());
		// 8 . To move to next step accept the alert
	        alert.accept();
		// 9. Close the web browser
	        browserObject.close();
	}

}
