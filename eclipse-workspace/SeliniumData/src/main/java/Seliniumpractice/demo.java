package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		String month = "Oct 2022";
		//String day = "17";
		
		
		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		Thread.sleep(3000);

		while (true) 
		{
			String text = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

			if (text.equals(month))
			
				break;
			
			else 
			
				driver.findElement(By.xpath("//td[@class='next']")).click();
			

		    

		driver.findElement(By.xpath("//td[@class='current day'][contains(text(),'17')]")).click();

	}

}
	
	
	
}
