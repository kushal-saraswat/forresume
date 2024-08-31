package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartPage extends BasePage

{
	WebDriver driver;
	public FlipkartPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input [@placeholder='Search for Products, Brands and More']") WebElement searcharea1;
	@FindBy(xpath="//button [@title='Search for Products, Brands and More']") WebElement searchbutton1;
	
	public void textarea1()
	{
		searcharea1.sendKeys("iPhone");
	}
	public void button1()
	{
		searchbutton1.click();
	}
	

}
