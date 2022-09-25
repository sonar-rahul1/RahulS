package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caleder2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.findElement(By.xpath("//div[@data-mode='checkin']")).click();
		
		while(true)
		{
			String a=driver.findElement(By.xpath("//div[@class='bui-calendar__content']/div[1]//div[@class='bui-calendar__month']")).getText();
			System.out.println(a);
			if(a.equals("November 2022"))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//div[@data-bui-ref='calendar-next']")).click();
			}
		}
		driver.findElement(By.xpath("//div[@class='bui-calendar__content']/div[1]//td[@data-date='2022-11-13']")).click();
		
	}

}
