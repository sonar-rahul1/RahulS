package Seliniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String a=driver.getTitle();
		if(a.contains("HRM"))
		{
			System.out.println("Test case is pass for Title");
		}
		else 
		{
			System.out.println("test case is faild for Title");
		}
          String b=	driver.getCurrentUrl();
          if(b.contains("Index"))
          {
        	  System.out.println("test case is pass for url");
          }
          else 
          {
        	  System.out.println("test case is failed for url");
        	  
          }
         String c= driver.getPageSource();
         System.out.println(c);
         Thread.sleep(5000);
         driver.navigate().to("https://www.google.com/");
         Thread.sleep(5011);
         driver.navigate().back();
         Thread.sleep(5222);
         driver.navigate().forward();
     }

}
