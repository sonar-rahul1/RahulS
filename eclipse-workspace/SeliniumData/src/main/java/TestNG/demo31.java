package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo31 {
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method in Demo1 class");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After method in Demo1 class ");
		System.out.println("--------------------------");
	}

	@Test
	public void abc() {
		System.out.println("Abc Test cases in Class ");
	}

	@Test
	public void pqr() {
		System.out.println("PQR Test cases in Clas ");
	}

	@Test
	public void xyz() {
		System.out.println("xyz Test cases in Clas ");
	}

}
