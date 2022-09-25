import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplew1 {
	public static String HRMWindow;
	public static String fbWindow;
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		String parrent=driver.getWindowHandle();
		System.out.println(parrent);
		Thread.sleep(5555);
		driver.findElement(By.partialLinkText("HRM")).click();
		Set<String> allwindow=driver.getWindowHandles();
		System.out.println(allwindow.size());
		Thread.sleep(5555);
		for(String s:allwindow)
		{
			if(!(s.equals(parrent)))
			{
				driver.switchTo().window(s);
//				driver.findElement(By.name("firstname")).sendKeys("abd");
//                driver.findElement(By.name("firstname")).sendKeys("Abc");
//				
//				Thread.sleep(7000);
//				
//				driver.findElement(By.name("reg_email__")).sendKeys("21436477");
//				
//				WebElement wb =driver.findElement(By.xpath("//div[@class='_8fgl _9l2p']"));
//				
//				File f =wb.getScreenshotAs(OutputType.FILE);
//				//FileUtils.copy(f,newFile("C:\\Users\\sonar\\eclipse-workspace\\HybridFrameWork5\\PassScreenShoot\\fre\\png"));
//				
				System.out.println(driver.getTitle());
				
			}
		}
        driver.switchTo().window(parrent);
        driver.findElement(By.partialLinkText("Facebook")).click();
        allwindow=driver.getWindowHandles();
        for(String s:allwindow)
        {
        	if(!(s.equals(parrent))&&(!(s.equals("HRMWindow"))))
        	{
        		driver.switchTo().window(s);
        	fbWindow=driver.getWindowHandle();
        		System.out.println(driver.getTitle());
			}
		}
		
		driver.switchTo().window(HRMWindow);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(parrent);
		
		System.out.println(driver.getTitle());
		
        	}
        }

	