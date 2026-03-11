package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Base;

public class Singleprice  extends Base{

	public Singleprice(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[contains(@class,'itemComponents-base-price itemComponents-base-bold')]//div")
	WebElement price;
	public void getprice() {
	    String txt = price.getText();
	   for(int i=0;i<10;i++)
	   {
		   System.out.print(i +" ");
	   }
	    System.out.println("Product Price: " + txt);
	}

}
