package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDrag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act= new Actions(driver);
		
		for (int i = 1; i <= 7; i++) {

			WebElement src = driver.findElement(By.id("box"+i));

			WebElement trg = driver.findElement(By.id("box10"+i));

			act.dragAndDrop(src, trg).build().perform();
	
			Thread.sleep(2000);
		}

		Thread.sleep(5000);
		
		for (int i = 1; i <= 7; i++) {
			
	
			WebElement src = driver.findElement(By.id("box"+i));
			
			WebElement cap =driver.findElement(By.id("capitals"));
			
			act.dragAndDrop(src, cap).build().perform();
		}


		
		
		
	}

}
