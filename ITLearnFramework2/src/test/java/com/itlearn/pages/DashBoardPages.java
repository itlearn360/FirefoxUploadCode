package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPages {

	WebDriver driver;
	//constructor
	public DashBoardPages(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"login-list\"]/li[1]/a") WebElement dashboardclick;
	
	@FindBy(xpath="//*[@id=\"learn-press-user-profile\"]/ul/li[3]") WebElement offerAcademeis;
	
	@FindBy(xpath="//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button") WebElement subscribeButton;
	
	public void coursersSubscribe()
	{
		dashboardclick.click();
		offerAcademeis.click();
		subscribeButton.click();
	}
}
