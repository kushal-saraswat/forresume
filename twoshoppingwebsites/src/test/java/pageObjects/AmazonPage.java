package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPage extends BasePage

{
	WebDriver driver;
	public AmazonPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input [@id='twotabsearchtextbox']") WebElement searcharea;
	@FindBy(xpath="//input [@id='nav-search-submit-button']") WebElement searchbutton;
	
	public void textarea()
	{
		searcharea.sendKeys("iPhone");
	}
	public void button()
	{
		searchbutton.click();
	}
	

}
