package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo9 {
	@Test(groups= {"Regression"})
	public void cucumber() {
		Assert.assertEquals(true, false);
	}
	@Test(dependsOnGroups= {"Regression"},groups= {"system"})
	public void pom()
	{
		System.out.println("System Testing");
	}
	
	@Test(groups= {"Sanity"})
	public void selenium()
	{
		System.out.println("regression and sanity group");
	}
	
	
	@Test(dependsOnGroups = {"Regression"},groups= {"Sanity","System"})
	public void jenkins() {
		System.out.println("Sanity Testig and system group");
	}
}
