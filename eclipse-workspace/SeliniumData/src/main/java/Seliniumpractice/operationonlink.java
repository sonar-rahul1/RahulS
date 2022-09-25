package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebElement;

public class operationonlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sonar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //driver.get("https://prafpawar11.github.io/checkbox.html");
//        driver.get("https://prafpawar11.github.io/checkbox.html");
//		
//		boolean a =driver.findElement(By.name("API Testing")).isDisplayed();
//		System.out.println(a);//true
//		
//		boolean b =driver.findElement(By.name("API Testing")).isEnabled();
//		System.out.println(b);//true
//		
//		boolean c =driver.findElement(By.name("API Testing")).isSelected();
//		System.out.println(c);//false
//		
//		driver.findElement(By.name("API Testing")).click();
//		
//		boolean d =driver.findElement(By.name("API Testing")).isSelected();
//		System.out.println(d);//true
//		
//        driver.get("https://prafpawar11.github.io/checkbox.html");
		
driver.get("https://prafpawar11.github.io/checkbox.html");
		
		WebElement wb =driver.findElement(By.name("API Testing"));
	
		System.out.println(wb.isDisplayed());
		
		System.out.println(wb.isEnabled());
		
		System.out.println(wb.isSelected());
		
		wb.click();
		
		System.out.println(wb.isSelected());
		
	}

}
