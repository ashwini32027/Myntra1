package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;

public class Hometest extends Base {
	HomePage ok;
	@BeforeMethod
	public void intialize()
	{
		ok=new HomePage(driver);
	}
	
	@Test
	void verifyy()
	{
		Assert.assertTrue(ok.verifyhome());
		
	}

}
