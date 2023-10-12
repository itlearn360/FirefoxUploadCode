package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

	

public class SocialMediaNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe"); 
		// 2. Initialize WebDriver object through ChromeDriver class.
		FirefoxDriver browserObject=new FirefoxDriver();
		// 3. Open the web page https://www.itlearn360.com/
	        browserObject.get("https://www.itlearn360.com/");
		// 4. Locate facebook icons using className locator and perform click
	        browserObject.findElement(By.className("fa-facebook")).click();
		// 5. Navigate back on main page using navigate and back method 
	        browserObject.navigate().back();
		// 6. Locate twitter icons using className locator and perform click
	        browserObject.findElement(By.className("fa-twitter")).click();
		// 7. Navigate back on main page using navigate and back method
	        browserObject.navigate().back();
		// 8. Locate instagram icons using className locator and perform click
	        browserObject.findElement(By.className("fa-instagram")).click();
		// 9. Navigate back on main page using navigate and back method
	        browserObject.navigate().back();
		// 10. Locate youtube icons using className locator and perform click
	        browserObject.findElement(By.className("fa-youtube")).click();
		// 11. Navigate back on main page using navigate and back method
	        browserObject.navigate().back();
		// 12. Locate linkedIn icons using className locator and perform click
	        browserObject.findElement(By.className("fa-linkedin")).click();
		// 13. Navigate back on main page using navigate and back method
	        browserObject.navigate().back();
	        // 14. Close the browser
	        browserObject.close();

	}

}
