  package Academy;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	public WebDriver driver;

	@BeforeTest


	public void initialise() throws IOException
	{
	
	driver=initializeDriver();
	driver.get(prop.getProperty("url"));
		}
	@Test
	
	public void basePageNavigation() throws IOException
	{
		
	
	LandingPage L=new LandingPage(driver);
	L.getLogin().click();
	
	
	LoginPage lo=new LoginPage(driver);
	lo.getEmail().sendKeys("nirmaladevi@qw.com");
	lo.getPassword().sendKeys("nirmala");
	
	lo.getlogin().click();
	/*L.getNavar().isDisplayed();
	Assert.assertTrue(L.getNavar().isDisplayed());
	*/
	
	}
	@AfterTest

	public void tearDown()
	{
		driver.close();
	}
	
	
	

}
