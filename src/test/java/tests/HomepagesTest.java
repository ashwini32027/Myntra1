package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTestClass;
import pages.HomePage;

public class HomepagesTest extends BaseTestClass{
	HomePage home;
	@BeforeMethod
	void intialize()
	{
		home=new HomePage(driver);
		
	}
	@Test
	void verifyhomePage()
	{
		Assert.assertTrue(home.verifyhome());
		Assert.assertTrue(home.tit());
	}
	

}
