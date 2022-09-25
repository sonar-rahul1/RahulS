package Seliniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alt= driver.switchTo().alert();
		//String b=alt.getText();
		//System.out.println(b);
		//Thread.sleep(5000);
			//alt.accept();
			//Thread.sleep(5000);
			//alt.dismiss();
        driver.findElement( By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
		while(true)
		{
			String a=driver.findElement(By.xpath("//div[contains(@class, 'content ng')]//span[contains(@class,'month')]")).getText();
		    System.out.println(a);
		    if(a.contains("October 2022")) 
	     	{
		    	break;
	     	}
		    else
		    {
              driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-next')]")).click();
		    }
		}
		driver.findElement(By.xpath("//a[text()='13']")).click();

    }
}