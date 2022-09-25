package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zomato {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		WebElement wb=driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		
        Actions act =new Actions(driver);
		
		act.sendKeys(wb,"Biryani").build().perform();
		act.moveToElement(wb).build().perform();
		
		
		
         
          
	}

}
