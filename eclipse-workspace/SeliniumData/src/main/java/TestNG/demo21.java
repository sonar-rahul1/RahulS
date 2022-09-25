package TestNG;


import org.testng.annotations.Test;

public class demo21 {

	


	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login Functionality");
	}
	
	
	@Test(priority = 2)
	public void homepageTitle()
	{
		System.out.println("homepageTitle Functionality");
	}
	
	
	@Test(priority = 3,enabled = false)
	public void homepageUrl()
	{
		System.out.println("homepageTitle Functionality");
	}
	
	
	@Test(priority = 4)
	public void pimLink()
	{
		System.out.println("pimLink Functionality");
	}
	
	
	
	
}