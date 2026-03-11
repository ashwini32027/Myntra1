package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Base;

public class Singleprice  extends Base{

	public Singleprice(WebDriver driver) {
		super(driver);
	}
	//Price check
	@FindBy(xpath="//span[@class='pdp-price']//strong")
	WebElement price;
	@FindBy(xpath="//div[contains(@class,'priceDetail-base-total')]//span[contains(@class,'priceDetail-base-value')]//span[2]")
	WebElement totalprice;
	
	//price for single product 
	public int getprice() {
	    String txt = price.getText();
	    txt = txt.replaceAll("[^0-9]","").trim();
	    int singleprice=Integer.parseInt(txt);
	    return singleprice;
	}
	public int getTotalPrice()
	{	
	 String txt=totalprice.getText();
	 //System.out.println(txt);
	 //int singleprice=getprice() +23;
	 txt = txt.replaceAll("[^0-9]","").trim();
	 int totalprice=Integer.parseInt(txt);
     return totalprice;		
	}
	
    
}
