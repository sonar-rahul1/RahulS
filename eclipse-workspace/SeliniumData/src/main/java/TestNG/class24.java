package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class class24 {
	@Test
	public void abc()
	{
		System.out.println("Abc method is Started");
		Assert.assertEquals("java", "java");
		System.out.println("Abc method is running");
		System.out.println("Abc method ended");
	}
	@Test
	public void pqr()
	{
		System.out.println("pqr method is Started");
		SoftAssert soft=new SoftAssert();
         soft.assertEquals("java","sellinium");

}
}
