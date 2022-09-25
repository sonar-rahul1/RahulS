package tutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo17 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

//		//WebDriver driver =new ChromeDriver();
//		//print all link name in console
		driver.get("https://www.zomato.com");
//		
//		List<WebElement> ls =driver.findElements(By.tagName("a"));
//		
//		System.out.println(ls.size());
//		for(WebElement abc: ls)
//		{
//			System.out.println(abc.getText());
//		}
//		
       driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("Biryani");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> ls =driver.findElements(By.xpath("//span[contains(text(),'Biryni')]"));
		
		System.out.println(ls.size());
		for(WebElement abc: ls)
		{
			System.out.println(abc.getText());
		}
		
		
		
	}


		
	}