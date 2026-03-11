package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTestClass;
import pages.Addtocart;
import pages.Searchproduct;
import pages.Singleprice;

public class VerifyUnitPriceTest extends BaseTestClass{
	
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
	public void verifyPriceAccordingToQty() {
		sp.searchvalidproduct("Asian men Sneaker");
		sp.clickproduct(4);
		sp.productpage();
		int productpageprice = inr.getprice();
		cart.selectSize(2); 
		cart.clickAddToCart(); 
		cart.openCart(); 
		Assert.assertTrue(cart.isProductDisplayed(), "Product was NOT added to cart");
		cart.clickonquantity();
		cart.verifyhoverpage();
		cart.setQtyMax();
		cart.doneclick();
		Assert.assertTrue(cart.verifyquantity("10"));
		//int totalPrice=inr.getTotalPrice();
		Assert.assertTrue(cart.compareunitprice(productpageprice,inr.getTotalPrice()), "qty wise price not update");
		
	}
}
