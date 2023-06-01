package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass1 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void closeBrowser()
	{
		Reporter.log("closeBrowser",true);
	}
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void logout()
	{
		Reporter.log("logout",true);
	}
	

	}


