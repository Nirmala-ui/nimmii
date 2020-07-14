	package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	
	By title=By.xpath("//*[@id=\"content\"]/div/div/h2");

	By navBar=By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	
	
public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	/*public WebElement getNavar()
	{
		return driver.findElement(navBar);
	}*/
	
	public WebElement getTitle()	
	{
		return driver.findElement(title);
	}
	
	public WebElement getNavBar()
	{
		return driver.findElement(navBar);
	}

}
