package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Demo123");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demo123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		WebElement ab = driver.findElement(By.xpath("//a[@title='Contacts']"));
		act.moveToElement(ab).build().perform();
		driver.findElement(By.xpath("//a[text()='New Contact']")).click();
		
		}
	}



