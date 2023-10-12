package com.itlearn.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	WebDriver driver;
	//constructor
	public PaymentPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"learn-press-payment\"]/ul/li/label") WebElement paystripeclick;
	
	@FindBy(xpath="//*[@id=\"learn-press-checkout-place-order\"]") WebElement placeorderbtn;
	
	@FindBy(xpath="//*[@id=\"card-element\"]/div/iframe") WebElement frameelement;
	
	@FindBy(name="cardnumber") WebElement cardnum;
	
	@FindBy(name="exp-date") WebElement expdate;
	
	@FindBy(name="cvc") WebElement cvc;
	
	@FindBy(id="payment-button") WebElement paybtn;
	
	public void paymentSection(String card,String ex,String cv) 
	{
		paystripeclick.click();
		
//		Thread.sleep(3000);
		
		placeorderbtn.submit();
		System.out.println("Submit option");
		
		
		driver.switchTo().frame(frameelement);
		
		
		
		System.out.println("Submit option 2");
		cardnum.sendKeys(card);
		
		expdate.sendKeys(ex);
		
		cvc.sendKeys(cv);
		
		driver.switchTo().defaultContent();
		
		paybtn.click();
	}
}
