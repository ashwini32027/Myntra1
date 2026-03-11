package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath="//button[contains(@class,'size-buttons-size-button')]")
	List<WebElement>totalsizes;	
	
	//Quantiy update locator
	@FindBy(xpath="//span[normalize-space()='Qty: 1']")
	WebElement quantity;
	@FindBy(xpath="//div[@class='modal-base-modal dialogs-base-quantityContainer']")
	WebElement quantitypagehover;
	@FindBy(xpath="//div[@class='dialogs-base-display'][normalize-space()='3']")
	WebElement qtyselect;
	@FindBy(xpath="//div[@class='dialogs-base-display'][normalize-space()='0']")
	WebElement qtyzero;
	@FindBy(xpath="//div[@class='dialogs-base-display'][normalize-space()='10']")
	WebElement maxqty;
	@FindBy(xpath="//div[normalize-space()='DONE']")
	WebElement clickdone;
	
	@FindBy(xpath="//span[@class='size-buttons-size-error-message']")
	WebElement errmsg;
	
	
	public void selectSize(int size) {
		totalsizes.get(size).click();
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
	
	//iska name galat ha sahi karna hoga
	public void quantitySelect() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement qtyElement = wait.until(ExpectedConditions.elementToBeClickable(qtyselect));
	    qtyElement.click();
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
	

	public boolean setqtyzero() {
		try {
			qtyzero.click();
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		return true;
	}
	
	public void setQtyMax() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement qtyElement = wait.until(ExpectedConditions.elementToBeClickable(maxqty));
	    qtyElement.click();
	}
	
	public boolean verifyErrMsg() {
		if(errmsg.getText().contains("Please select a size")) {
			return true;
		}
		return false;
	}
	
	public boolean verifyPriceMismatch(int productprice, int totalprice) {
		if(productprice!=totalprice) {
			return true;
		}
		return false;
	}
	public boolean compareunitprice(int productprice, int totalprice) {
		productprice*=10;
		productprice+=23;
		if(productprice==totalprice)
		return true;
		return false;
	}

}
