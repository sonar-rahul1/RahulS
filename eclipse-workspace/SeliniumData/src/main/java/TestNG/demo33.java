package TestNG;

import org.testng.annotations.Test;

public class demo33 {

	@Test(priority=1,groups= {"PIM"})
	public void validatePIMLink()
	{
		System.out.println("Validate PIM Link");
	}

	@Test(priority=2,groups= {"PIM"})
	public void addNewUserPIM()
	{
		System.out.println("New User is added in PIM");
	}
	
	@Test(priority=3,groups= {"PIM"})
	public void searchUserPIM()
	{
		System.out.println("Search new User in PIM");
	}
	

	
	
	
	

}
