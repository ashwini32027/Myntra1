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
	@Test
	void validproudct()
	{
		sp.searchvalidproduct("Asian men Sneaker");
		sp.clickproduct(7);
		Assert.assertTrue(sp.productpage());
	}

}
