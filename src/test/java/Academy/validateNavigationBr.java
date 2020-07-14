package Academy;

import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.LandingPage;
import resources.base;


public class validateNavigationBr extends base {
	
	public WebDriver driver;

	public static Logger Log=LogManager.getLogger(base.class.getName());
	
	
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

	Assert.assertTrue(L.getNavBar().isDisplayed());	
	Log.info("Navigation Bar is Displyed");
	}

@AfterTest

public void tearDown()
{
	driver.close();
}





}