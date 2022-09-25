import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplew {

	public static void main(String[] args) throws InterruptedException {

          WebDriverManager.chromedriver().setup();

          WebDriver driver =new ChromeDriver();
          driver.get("https://prafpawar11.github.io/multiplewindows.html");
          String parrent=driver.getWindowHandle();
          Thread.sleep(5222);
          System.out.println(parrent);
          driver.findElement(By.partialLinkText("HRM")).click();
          Thread.sleep(5222);
          Set<String> allwindow=driver.getWindowHandles();
          System.out.println(allwindow.size());
          for(String s:allwindow)
          {
        	  if(!(s.equals(parrent)));
        	  {
        		  driver.switchTo().window(s);
        		  System.out.println(driver.getTitle());
        	  }
          }
          driver.quit();
    }
	
}
