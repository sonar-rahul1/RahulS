package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dell 11 generation laptop i5");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			String a=driver.findElement(By.xpath("//div[@data-asin='B09RF4YLCJ']//span[@class='a-price-whole']")).getText();
			System.out.println(a);
			Thread.sleep(5002);
			driver.navigate().to("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@class='q']")).sendKeys("dell 11 generation laptop i5");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			String b=driver.findElement(By.xpath("//div[@data-id='COMG36KGGJHYA4D8']//div[@class='_30jeq3 _1_WHN1']")).getText();
			System.out.println(b);
			//driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//			 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		       
//				driver.findElement(By.name("q")).sendKeys("Apple iPhone 13 (256GB) - Starlight");
//				 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//				
//				 Thread.sleep(2000);
//				 
//				String flipkart= driver.findElement(By.xpath("//div[@data-id='MOBG6VF5NFYJ8KQX']//div[@class='_30jeq3 _1_WHN1']")).getText();
//				System.out.println(flipkart);
	}

}
