package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		FirefoxDriver browserObject;
	       // 1. setup the property of WebDriver to perform "linktext" through chrome web browser.
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe"); 
			browserObject = new FirefoxDriver();
		// 3. Open the web page http://swisnl.github.io/jQuery-contextMenu/demo.html
		browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        
        // 4. In case of RightClick we use Actions class.Create object and pass the driver to the reference
        Actions action = new Actions(browserObject);    
	// 5. Locate the button using xpath and store the value in the reference that is rightClickElement
        WebElement rightClickElement = browserObject.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        
       // 6. Using the action reference call the contextclick method and pass  element to perform right click
        action.contextClick(rightClickElement).build().perform();

	}

}
