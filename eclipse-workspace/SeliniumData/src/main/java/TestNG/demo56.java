package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo56 {
	@Test
	public void loginPage()
	{
		Assert.assertEquals(12, 12000);
	
	}
	
	//soft Depends on methods
	@Test(dependsOnMethods= {"loginPage"},alwaysRun=true)
	public void homepage()
	{
		Assert.assertEquals("java","java");
	}
	
	//hard depends on methods
	@Test(dependsOnMethods= {"homepage"})
	public void pimpage()
	{
		Assert.assertEquals(123, 123);
	}
	
}
