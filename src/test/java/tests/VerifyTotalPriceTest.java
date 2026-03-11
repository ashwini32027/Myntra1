package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import BaseTest.BaseTestClass;
import pages.Addtocart;
import pages.Searchproduct;
import pages.Singleprice;

import org.testng.annotations.Test;


public class VerifyTotalPriceTest extends BaseTestClass{
	Searchproduct sp;
	Addtocart cart;
	Singleprice inr;
	@BeforeMethod
	void intialize()
	{
		sp=new Searchproduct(driver);
		cart=new Addtocart(driver);
		inr=new Singleprice(driver);
	}
	
	@Test
	public void verifysingleprice()
	{
		sp.searchvalidproduct("Asian men Sneaker");
		sp.clickproduct(4);
		sp.productpage();
		cart.selectSize(); 
		cart.clickAddToCart(); 
		cart.openCart(); 
		Assert.assertTrue(cart.isProductDisplayed(), "Product was NOT added to cart");
		inr.getprice();
	}

}
