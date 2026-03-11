package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTestClass;
import pages.Addtocart;
import pages.Searchproduct;

public class AddToCartTest extends BaseTestClass{
	Searchproduct sp;
	Addtocart cart;
	@BeforeMethod
	void intialize()
	{
		sp=new Searchproduct(driver);
		cart=new Addtocart(driver);
	}
	
	@Test
	public void verifyValidAddProduct() {
		sp.searchvalidproduct("Asian men Sneaker");
		sp.clickproduct(7);
		sp.productpage();
		cart.selectSize(); 
		cart.clickAddToCart(); 
		cart.openCart(); 
		Assert.assertTrue(cart.isProductDisplayed(), "Product was NOT added to cart");
	}
	
	
}
