package pages;

import org.openqa.selenium.By;
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
	
	
	//Quantiy update locator
	@FindBy(xpath="//span[normalize-space()='Qty: 1']")
	WebElement quantity;
	@FindBy(xpath="//div[@class='modal-base-modal dialogs-base-quantityContainer']")
	WebElement quantitypagehover;
	@FindBy(xpath="//div[@class='dialogs-base-display'][normalize-space()='3']")
	WebElement selectsize;
	@FindBy(xpath="//div[normalize-space()='DONE']")
	WebElement clickdone;
	
	
	
	
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
	
	/*
	 *Quantity update
	 *Ashwini kumar */
	public void clickonquantity()
	{
		quantity.click();
	}
	public boolean verifyhoverpage()
	{
		return quantitypagehover.isDisplayed();
	}
	public void sizeselect()
	{
		selectsize.click();
	}
	public void doneclick()
	{
		clickdone.click();
	}
	public boolean verifyquantity(String check)
	{
		WebElement quan=driver.findElement(By.xpath("//span[normalize-space()='Qty: "+check+"']"));
        return quan.isDisplayed();		
	}
	
	
	

}
