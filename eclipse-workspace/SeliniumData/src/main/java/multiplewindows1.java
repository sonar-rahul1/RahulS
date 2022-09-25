import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplewindows1 {

	public static void main(String[] args) throws InterruptedException {
	//	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://prafpawar11.github.io/multiplewindows.html");
			
			String parent =driver.getWindowHandle();
			
			System.out.println(parent);
			Thread.sleep(3000);
			
			driver.findElement(By.partialLinkText("HRM")).click();
			Thread.sleep(7000);
			
			Set<String> allwindow=driver.getWindowHandles();
			
			System.out.println(allwindow.size());
			
			for(String s:allwindow)
			{
				if(!(s.equals(parent)))
				{
					driver.switchTo().window(s);
					System.out.println(driver.getTitle());
				}
			}
			
			
			driver.quit();
			
		}

	

}
