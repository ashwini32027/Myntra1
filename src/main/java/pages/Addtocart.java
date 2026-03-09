package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Base;

public class Addtocart extends Base{
	public Addtocart(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[contains(@class,'itemContainer')]") 
	WebElement cartProduct; 

	@FindBy(xpath = "//div[contains(text(),'ADD TO BAG')]") 
	WebElement addToBag; 
	
	@FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']") 
	WebElement bagIcon; 
	
	@FindBy(xpath="(//div[contains(@class,'size-buttons-size-buttons')]//button)[1]")
	WebElement firstSize;
	
	public void selectSize() {
	    firstSize.click();
	}
	
	public boolean isProductDisplayed() { 
		return cartProduct.isDisplayed(); 
	}
	
	public void openCart() { 
		bagIcon.click(); 
	}
	
	public void clickAddToCart() { 
		addToBag.click(); 
	}
	

}
