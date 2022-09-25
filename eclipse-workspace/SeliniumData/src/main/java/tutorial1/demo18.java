package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo18 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

driver.get("http://127.0.0.1:5500/ac.html");
		
		driver.findElement(By.id("btn")).click();
		
		Alert pune =(Alert) driver.switchTo().alert();
		
		String a =pune.getText();
		
		if(a.contains("Selenium"))
		{
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test case is fail");
		}
		
		Thread.sleep(4000);
		
		pune.accept();
		
		
	}

}

	}
}