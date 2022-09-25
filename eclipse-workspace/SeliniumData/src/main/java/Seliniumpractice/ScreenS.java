package Seliniumpractice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
       TakesScreenshot ts=(TakesScreenshot)driver;
       File f=ts.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(f,new File("C:\Users\sonar\eclipse-workspace\SeliniumData\src\main\java\Seliniumpractice\Screenshot"));
		
		System.out.println("Screenshot is captured");
	}

}
