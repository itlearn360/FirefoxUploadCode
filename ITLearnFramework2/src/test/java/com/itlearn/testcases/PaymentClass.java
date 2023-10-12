package com.itlearn.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.DashBoardPages;
import com.itlearn.pages.LoginPage;
import com.itlearn.pages.PaymentPage;
import com.itlearn.utility.ReadExcelFile;

public class PaymentClass extends BaseTest {

	String fileName=System.getProperty("user.dir")+"\\TestData\\TestDetail.xlsx";
	
	@Test(dataProvider ="paymentData")
	void paymentProcess(String card,String exp,String cvc) 
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		System.out.println(password);
//		String username="Demo12";
//		String password="Test123456$";
		lp.loginPortal(username, password);
		
		DashBoardPages dp = new DashBoardPages(driver);
		
		dp.coursersSubscribe();
		
		PaymentPage obj= new PaymentPage(driver);
		obj.paymentSection(card,exp,cvc);
		
	}
	
	@DataProvider(name="paymentData")
	public String[][] paymentData()
	{
		
		
		int ttlRows= ReadExcelFile.getRowCount(fileName, "CardDetails");
		int ttlColumns= ReadExcelFile.getColCount(fileName, "CardDetails");
		System.out.println(ttlRows);
		System.out.println(ttlColumns);
		
		String data[][]= new String[ttlRows][ttlColumns];
		
		for(int i=0;i<ttlRows;i++)
		{
			for(int j=0;j<ttlColumns;j++)
			{
				data[i][j]=ReadExcelFile.getCellValue(fileName, "CardDetails", i, j);
				
			}
		}
		return data;
	}
}
