package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          
driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		String a="Oct 2022";
		while(true)
		{
			String b=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println(b);
			if(b.equals(a)) 
			{
				break;
				
			}else
			{
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
}
		driver.findElement(By.xpath("//td[text()='11']")).click();

}
}
//          driver.findElement(By.id("onward_cal")).click();
//  		String abc = "Dec 2022";
//
//  		while (true) 
//  		{
//
//  			String a = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
//  			System.out.println(a);
//  			
//  			if(a.equals(abc))
//  			{
//  				break;
//  			}
//  			else {
//  				driver.findElement(By.xpath("//td[@class='next']")).click();
//  			}
//  		
//  		}
//  		
//  		driver.findElement(By.xpath("//td[text()='10']")).click();
//  		
//  		
//  	}
//
//  }
