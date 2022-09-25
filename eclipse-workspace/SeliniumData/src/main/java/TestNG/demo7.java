package TestNG;

import org.testng.annotations.Test;

public class demo7 {
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




