package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {
	static WebDriver driver;
	public static void datePicker(String monthyear,String date)
	{
		
		while(true) 
		{
		    String a = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		      System.out.println(a);
		     if(a.equals(monthyear)) 
		     {
			break;
		     }
		       else 
		         {
		           	driver.findElement(By.xpath("//td[@class='next']")).click();
		          }
		
		driver.findElement(By.xpath("//td[text()='"+date+"']")).click();
	    }
	}
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");
    	driver.findElement(By.id("onward_cal")).click();
    	Calender1.datePicker("Jan 2023","10");
    	
	}
}

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        

	

