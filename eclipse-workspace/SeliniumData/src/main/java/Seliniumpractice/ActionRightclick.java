package Seliniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionRightclick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		
//        driver.get("https://prafpawar11.github.io/rightclick1.html");
//		
//		WebElement wb =driver.findElement(By.id("btn2"));
//		
//		Actions act =new Actions(driver);
//		
//		act.contextClick(wb).build().perform();
//		
//		String a =driver.findElement(By.id("demo2")).getText();
//		
//		if(a.contains("Right click"))
//		{
//			System.out.println("Test case is pass");
//		}
//		else {
//			System.out.println("Test case is fail");
//		}
//		
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement wb =driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act =new Actions(driver);
	
		act.contextClick(wb).build().perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='Paste']")).click();
		
		Alert alt =driver.switchTo().alert();
		
		String a =alt.getText();
		
		if(a.contains("paste"))
		{
			System.out.println("TC is Pass");
		}
		else {
			System.out.println("TC is fail");
		}
		Thread.sleep(4000);
		alt.accept();
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
