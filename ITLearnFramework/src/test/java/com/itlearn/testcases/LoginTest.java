package com.itlearn.testcases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.LoginPage;
import com.itlearn.utility.ReadExcelFile;



public class LoginTest extends BaseTest {

		@Test
	void verifyLogin(String userEmail,String userPwd)
	{
		LoginPage lp=new LoginPage(driver);
		String username="Demo12";
		String password="Test123456$";
		lp.loginPortal(username, password);
	}
	
}