package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendergoibio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		while(true)
	{
		String a=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[@class='DayPicker-Caption']")).getText();
          System.out.println(a);
          if(a.equals("December 2022"))
          {
        	  break;
          }
          else
          {
        	  driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton--next')]")).click();
          }
	}
        driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]//p[text()='13']")).click();

		
		driver.findElement(By.xpath("//span[text()='Done']")).click();

  }
}	
