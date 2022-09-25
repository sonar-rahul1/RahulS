import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class java1{
WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();	
	}
	
	@Test
	public void google()
	{
		driver.get("https://www.google.com");
	}
	
	@Test
	public void facebook()
	{
		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void orangehrm()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		TakesScreenshot ts =(TakesScreenshot)driver;
		File f =ts.getScreenshotAs(OutputType.FILE);
		
		File dist =new File("C:\\Users\\praf0\\Desktop\\June Batch Script\\SeleniumTutorial\\Screen\\"+System.currentTimeMillis()+".png");         
		
		FileUtils.copyFile(f, dist);
		
		driver.close();
	}
	
	
}
		