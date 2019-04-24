package com.inetBankingv1.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingv1.pageObjects.LoginPage;

public class TC_LoginTest_01 extends BaseClass
{

	@Test
	public void loginTest()
	
	{
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		logger.info("Clicked submit");
		
		if(driver.getTitle().equals(""))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		
		else
		{
			Assert.assertTrue(false);
			logger.info("loging test failed");
		}
		
	}
	
	
}
