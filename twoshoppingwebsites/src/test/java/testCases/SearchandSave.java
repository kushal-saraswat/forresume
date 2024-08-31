package testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import pageObjects.AmazonPage;
import pageObjects.FlipkartPage;
import testBase.BaseClass;

public class SearchandSave extends BaseClass
{
	@Test(priority=1)
	public void search1()
	{
		AmazonPage ap=new AmazonPage(driver);
		
		ap.textarea();
		ap.button();
		
		
	}
	
	
	@Test(priority=2)
	public void search2()
	{
		
		
		List<WebElement> lst=driver.findElements(By.xpath("//span[@data-component-type='s-search-results']"));
		for(WebElement lt : lst)
		{
			String itemName=lt.getText();
			System.out.println(itemName);
		}
	}

}
