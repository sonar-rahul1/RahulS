package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://praf002.github.io/");
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Selenium Testing");
		
		//switch to mobile frame using frame index. 
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@name='mob']")).sendKeys("987654321");
		
		Thread.sleep(4000);
		//Switch to Top frame
		driver.switchTo().defaultContent();
		
		//switch to address frame.
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='add']")).sendKeys("Pune MH");
		
		Thread.sleep(4000);
		//Switch to Top frame
		driver.switchTo().defaultContent();
		
		//switch to Mobile Frame using Web Element
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='Frame1.html']"));
		driver.switchTo().frame(frame1);
		
		String a =driver.findElement(By.id("mob")).getAttribute("value");
		System.out.println(a);
		
		Thread.sleep(4000);
		//Switch to Top frame
		driver.switchTo().defaultContent();
		
		//switch to address frame using WebElement
		WebElement addressframe =driver.findElement(By.xpath("//iframe[@src='frame2.html']"));
		driver.switchTo().frame(addressframe);
		
		String b =driver.findElement(By.id("add")).getAttribute("value");
		System.out.println(b);
		

	}

}
