package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
       driver.get("https://prafpawar11.github.io/checkbox.html");
       WebElement wb =driver.findElement(By.id("Sellenium"));
       System.out.println(wb.isDisplayed());//True
		System.out.println(wb.isEnabled());//true
		
		System.out.println(wb.isSelected());//false
		Thread.sleep(4000);
		wb.click();
		Thread.sleep(4000);
		System.out.println(wb.isSelected());//true
		Thread.sleep(4000);
		wb.click();
		System.out.println(wb.isSelected());//false
		System.out.println("-----------------------------------------------");
		WebElement wb1 =driver.findElement(By.name("TestNG"));
		System.out.println(wb1.isDisplayed());//t
		System.out.println(wb1.isEnabled());//t
		System.out.println(wb1.isSelected());//f
		wb1.click();
		System.out.println(wb1.isSelected());//t
		
	}


	}


