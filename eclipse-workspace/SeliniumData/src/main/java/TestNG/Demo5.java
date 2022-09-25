package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo5 {

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Beforeclass");
	}

	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeTest
	public void beforeabc()
	{
		System.out.println("Before Test abc Test");
	}
	
	@AfterTest
	public void afterabc() {
		System.out.println("After test in abc Test ");
	}

	
	@Test
	public void abc()
	{
		System.out.println("Abc Test cases Demo5 class");
	}
	
	@Test
	public void xyz()
	{
		System.out.println("Xyz Test cases Demo5 class");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test");
	}
	
}

