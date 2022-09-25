import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascrift {
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	//js.executeScript("document.getElementById('btnLogin').click();");
	
	WebElement wb =driver.findElement(By.id("btnLogin"));
	
	js.executeScript("arguments[0].click();", wb);
	
	
	
}

}
