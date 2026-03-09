package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePage extends Base{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public boolean verifyhome()
	 {
		 String url=driver.getCurrentUrl();
		 return driver.getCurrentUrl().equals(url);
	 }
	public boolean tit()
	{
String title=driver.getTitle();
return driver.getTitle().equals(title); 
	}
	 

}
