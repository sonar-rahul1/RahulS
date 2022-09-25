package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
    	WebElement wb=driver.findElement(By.id("month"));
    	//Create Object of the Select class by passing WebElement instance
    	Select sel=new Select(wb);
    	sel.selectByVisibleText("Nov");
    	Thread.sleep(5000);
    	sel.selectByValue("5");
    	Thread.sleep(5000);
    	sel.selectByIndex(8);
	

	}

}
