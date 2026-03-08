package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
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
