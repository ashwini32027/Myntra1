package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Base;

public class Searchproduct extends Base {
	public Searchproduct(WebDriver driver) {
		super(driver);
	} 
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchbtn;
	//total product
	@FindBy(xpath="//ul[@class='results-base' ]//li")
	List<WebElement>totalproduct;
	//window handels✅
	Set<String> window=driver.getWindowHandles();
	ArrayList<String> windows=new ArrayList<>(window);
	
	//bag
	@FindBy(xpath="//div[normalize-space()='ADD TO BAG']")
	 WebElement bag;
	
	//invalid
	@FindBy(xpath="//img[@class='index-notFoundImage']")
	WebElement inavalidproduct;
	
	public void searchvalidproduct(String name)
	{
		searchbtn.click();
	 searchbtn.sendKeys(name,Keys.ENTER); 
	}
	public int addallproduct()
	{
		return totalproduct.size();
	}
	public void clickproduct(int start) 
	{
		totalproduct.get(start).click();
	}
	public boolean productpage() {
	    Set<String> windowHandles = driver.getWindowHandles();
	    ArrayList<String> windows = new ArrayList<>(windowHandles);
	    System.out.println("Total windows: " + windows.size());
	        driver.switchTo().window(windows.get(1)); // second window/tab
	        return bag.isDisplayed();
	}

	public boolean invalidpr()
	{
		return inavalidproduct.isDisplayed();
	}
	
}
