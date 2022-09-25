package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement wb1=driver.findElement(By.id("month"));
		Select sel1=new Select(wb1);
		sel1.selectByVisibleText("Oct");
		WebElement wb2=driver.findElement(By.id("year"));
		Select sel2=new Select(wb2);
		sel2.selectByVisibleText("2022");
		WebElement wb3=driver.findElement(By.id("day"));
		Select sel3=new Select(wb3);
		sel3.selectByVisibleText("2");
		

	}

}
