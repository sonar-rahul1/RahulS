package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo11 {
	
WebDriver driver;
		@Test
		public void chromeDemo() throws InterruptedException {

WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.quit();
		}

		@Test
		public void edgeDemo() throws InterruptedException {
			System.setProperty("webdriver.edge.driver","C:\\Users\\sonar\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		 driver = new EdgeDriver();
			
			driver.get("https://www.google.com");
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.quit();
		}

	}

