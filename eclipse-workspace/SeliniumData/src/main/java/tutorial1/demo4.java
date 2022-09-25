package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://prafpawar11.github.io/radiobutton.html");
		
		Boolean a=driver.findElement(By.id("pune")).isDisplayed();
		System.out.println(a);
		
		Boolean b=driver.findElement(By.id("pune")).isEnabled();
		System.out.println(b);
		
		Boolean c=driver.findElement(By.id("pune")).isSelected();
		System.out.println(c);
		
		driver.findElement(By.id("pune")).click();
		
		Boolean d=driver.findElement(By.id("pune")).isSelected();
		System.out.println(d);
		Thread.sleep(5000);
		
		System.out.println("......................");
		
		Boolean e=driver.findElement(By.id("mumbai")).isDisplayed();
		System.out.println(e);
		
         Boolean f=driver.findElement(By.id("mumbai")).isEnabled();
         System.out.println(f);
         
         Boolean g=driver.findElement(By.id("mumbai")).isSelected();
         System.out.println(g);
         
         driver.findElement(By.id("mumbai")).click();
         Thread.sleep(5000);
         Boolean h=driver.findElement(By.id("mumbai")).isSelected();
         System.out.println(h);
         
		
	}
}



		
	



