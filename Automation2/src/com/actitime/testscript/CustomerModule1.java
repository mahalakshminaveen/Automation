package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;


import com.actitime.generic.Baseclass1;




public class CustomerModule1 extends Baseclass1 {
	@Test(groups= {"smokeTest","regressionTest"})
	public void createCustomer()
	{
		Reporter.log("createCustomer1",true);
	}
	@Test(groups= "regressionTest")
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer1",true);
	}
	@Test(groups= "regressionTest")
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer1",true);
	}

}
