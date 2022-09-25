package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
//        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
//		
//		
//		driver.switchTo().frame("packageFrame");
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.linkText("Actions")).click();
//		
	//driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//WebElement wb =driver.findElement(By.xpath("//iframe[@title='All Packages']"));
		
		//Thread.sleep(4000);
		
	//	driver.switchTo().frame(wb);
		
		//driver.findElement(By.linkText("org.openqa.selenium")).click();
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		WebElement wb =driver.findElement(By.xpath("//iframe[@title='All Packages']"));
		
		Thread.sleep(4000);
		//we are in frame 1 or index zero
		driver.switchTo().frame(wb);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(4000);
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
		
	
	
	}

}
