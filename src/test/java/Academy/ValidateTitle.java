package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitle extends base {
	public WebDriver driver;
	
	public static Logger Log=LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest


	public void initialise() throws IOException
	{
	
	driver=initializeDriver();
	Log.info("Driver is initialised");
	driver.get(prop.getProperty("url"));
	Log.info("Navigated to Homepage");
	
		
	}
	
	@Test
	
	public void basePageNavigation() throws IOException
	{
		
LandingPage L=new LandingPage(driver);
String features=L.getTitle().getText();
Assert.assertEquals(features,"FEATURED COURS1ES");
Log.info("Successfully Validated TextPage");
System.out.println("Test Completed");
	
	}
	
	@AfterTest

	public void tearDown()
	{
		driver.close();
	}

}
