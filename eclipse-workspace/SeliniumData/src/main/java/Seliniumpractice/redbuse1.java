package Seliniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbuse1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		//print all link name in console
		driver.get("https://www.amazon.com/");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung A 32");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> ls =driver.findElements(By.xpath("//span[contains(text(),'Samsung')or @class='a-price-whole']"));
		
		System.out.println(ls.size());
		for(WebElement abc: ls)
		{
			System.out.println(abc.getText());
		}
		
		
		
	}



	}

