  package Academy;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class dataProvider extends base {
	
	public WebDriver driver;

	@BeforeTest


	public void initialise() throws IOException
	{
	
	driver=initializeDriver();
	driver.get(prop.getProperty("url"));
		}
	@Test(dataProvider="getdata")
	
	public void basePageNavigation(String Username,String password,String text) throws IOException, InterruptedException
	{
		
		
	LandingPage L=new LandingPage(driver);
	L.getLogin().click();
	
	
	LoginPage lo=new LoginPage(driver);
	lo.getEmail().sendKeys(Username);
	lo.getPassword().sendKeys(password);
	System.out.println(text);
	lo.getlogin().click();
	/*L.getNavar().isDisplayed();
	Assert.assertTrue(L.getNavar().isDisplayed());
	*/
	Thread.sleep(2000);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		
		//rows stands for how many times the test should run
		//column stands for how many values for each test
		Object[][] data=new Object[2][3];
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="Restricted user";
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="1223455";
		data[1][2]="nonRestricted user";
		
		return data;


		
		
	}
	@AfterTest
	

	public void tearDown()
	{
		driver.close();
	}
	
	
	

}
