package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class demo22 {
	

	
	@Test(priority=1,groups= {"HomePage"})
	public void homepageTitle()
	{
		System.out.println("Home Page title");
	}
	
	@Test(priority=2,groups= {"HomePage"})
	public void validatehomePageUrl()
	{
		System.out.println("Home Page Url");
	}
	
	@Test(priority=3,groups= {"HomePage"})
	public void homePageLogo()
	{
		System.out.println("Home Page Logo");
	}
	
	
	
	

}
