package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.DashBoardPages;
import com.itlearn.pages.LoginPage;
import com.itlearn.utility.ReadExcelFile;

public class DashboardTestCase extends BaseTest {
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestDetail.xlsx";
		
	@Test(priority =1)
	void testcourses()
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(username, password);
		
		DashBoardPages dp = new DashBoardPages(driver);
		
		dp.coursersSubscribe();
		
	}
	

}
