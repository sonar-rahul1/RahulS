package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement wb=driver.findElement(By.id("year"));
		Select sel=new Select(wb);
		sel.selectByVisibleText("2000");
	WebElement xyz=sel.getFirstSelectedOption();
	String abc=xyz.getText();
	System.out.println(abc);
		
		
		
		

	}

}
