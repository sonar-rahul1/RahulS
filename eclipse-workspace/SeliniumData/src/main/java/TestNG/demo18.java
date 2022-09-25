package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo18 {
	WebDriver driver;

	@Parameters({ "browsers", "uname", "pass" })
	@Test
	public void login(String browsers, String username, String password) throws InterruptedException {

		if (browsers.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browsers.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browsers.equals("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver =new OperaDriver();
			
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		Thread.sleep(4000);

		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

}


