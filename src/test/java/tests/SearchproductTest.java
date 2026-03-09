package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTestClass;
import pages.Searchproduct;

public class SearchproductTest extends BaseTestClass
{
	
	Searchproduct sp;
	@BeforeMethod
	void intialize()
	{
		sp=new Searchproduct(driver);
	}
	@Test(priority=1)
	void validproudct()
	{
		sp.searchvalidproduct("Asian men Sneaker");
		sp.clickproduct(7);
		Assert.assertTrue(sp.productpage());
	}
	@Test(priority=2)
	void InvalidProduct() {
		sp.searchvalidproduct("123");
		Assert.assertTrue(sp.invalidpr());
		
	}

}
