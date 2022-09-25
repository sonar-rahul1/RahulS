package TestNG;

import org.testng.annotations.Test;
public class demo51{

@Test (priority=1)
   public static void abc()
	{
		System.out.println("abc method is started");
	}

	@Test(priority=2)
	public static void pqr()
	{
		System.out.println("pqr method is started");
	}
	@Test(priority=2)
	public static void xtz()
	{
		System.out.println("xtz method is started");
	}
	@Test(priority=4)
	public static void xbc()
	{
		System.out.println("xbc method is started");
	}
}
