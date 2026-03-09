package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
 public WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
}
@AfterMethod
public void close()
{
	driver.quit();
}
}
