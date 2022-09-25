package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo3 {
		WebDriver driver;
	@Test(priority=1)
public void setup() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	@Test(priority=2)
	public void loginFunctionality() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	@Test(priority=3)
    public void validateHomePageLogo() {
		boolean actualLogo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		Assert.assertEquals(actualLogo,true);		}
	@Test(priority=4)
	public void validateHomePageTitle(){
      String actualTitle=driver.getTitle();
      Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	@Test(priority=5)
	public void validatePimPage() {
		
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		String actualpimUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualpimUrl.contains("PIM"),true);
	}
}