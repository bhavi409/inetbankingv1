package com.inetBankingv1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtuserName;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnlogin;
	
	public void setUserName(String uname)
	{
		txtuserName.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtuserName.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnlogin.click();
	}
	
}
