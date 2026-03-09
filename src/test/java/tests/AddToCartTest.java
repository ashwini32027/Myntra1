package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseTestClass;
import pages.Addtocart;
import pages.Searchproduct;

public class AddToCartTest extends BaseTestClass{
	Searchproduct sp;
	@Test
	public void verifyValidAddProduct() {
		sp=new Searchproduct(driver);
		sp.searchvalidproduct("Asian men Sneaker");
		sp.clickproduct(7);
		sp.productpage();
		Addtocart cart=new Addtocart(driver);
		cart.selectSize(); 
		cart.clickAddToCart(); 
		cart.openCart(); 
		Assert.assertTrue(cart.isProductDisplayed(), "Product was NOT added to cart");
		
	}
}
