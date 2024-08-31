package testBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
public WebDriver driver;
@BeforeClass
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	((JavascriptExecutor) driver).executeScript ("window.open ()");
	// Switch to the new tab
	List<String> tabs = new ArrayList<>(driver.getWindowHandles());
	driver. switchTo() .window(tabs.get (1));
	// Open the second website in the new tab
	driver. get ("https://www.flipkart.com/");
	driver. switchTo() .window(tabs.get (0));
	
}





@AfterClass
public void close()
{
	driver.quit();
}
	
	
}
