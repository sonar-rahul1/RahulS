package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		String a=driver.getTitle();
		System.out.println(a);
		String b=driver.getCurrentUrl();
		System.out.println(b);
		driver.findElement(By.name("q")).sendKeys("selenium");
		WebElement abc =driver.findElement(By.name("btnK"));
		abc.click();

		Thread.sleep(2000);
		driver.close();
			}



	}

