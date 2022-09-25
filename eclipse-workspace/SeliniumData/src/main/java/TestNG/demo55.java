package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo55 {
WebDriver driver;
	@Parameters("browsertype")
	@BeforeTest(groups= {"LoginPage"})
	public void setUP(String browsertype)
	{
		
		if(browsertype.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();	
		}
		else if(browsertype.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}
		else if(browsertype.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver=new OperaDriver();
		}
		else {
			System.out.println("Please mention proper browser name");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	
	@Parameters({"username","password"})
	@Test(priority=1,groups= {"LoginPage"})
	public void loginFunctionality(String uname, String pass)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	@Test(priority = 2,dependsOnGroups = {"LoginPage"},groups={"HomePage"})
	public void validateHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(priority = 3,dependsOnGroups = {"LoginPage"},groups={"HomePage"})
	public void validateHomePageUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl().contains("hrm"), true);
	}
	
	@Test(priority = 4,dependsOnGroups = {"LoginPage"},groups={"HomePage"})
	public void validateHomePageLogo()
	{
		boolean logo =driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		Assert.assertEquals(logo, true);
	}
	
	@Test(priority = 5,dependsOnGroups = {"HomePage"},groups={"PIMPage"})
	public void validateUserIsonPIMPage()
	{
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		Assert.assertEquals(driver.getCurrentUrl().contains("pim"), true);
		
	}
	
	@Parameters({"fname","mname","lname"})
	@Test(priority = 6,dependsOnGroups = {"HomePage"},groups={"PIMPage"})
	public void createANewEmployee(String fname, String mname,String lname)
	{
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("middleName")).sendKeys(mname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		//empid=driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();		
	}
	
	
	@Test(priority = 7,dependsOnGroups = {"HomePage"},groups={"PIMPage"})
	public void searchEmployeeInPIMPage()
	{
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		//driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
	}
	
	@Test(priority = 8,dependsOnGroups = {"HomePage"},groups={"PIMPage"})
	public void deleteUserInPIM()
	{
		driver.findElement(By.xpath("//tbody//input[starts-with(@id,'ohrmList')]")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
	}
	
	

	
}
