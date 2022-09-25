package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 13 (256GB) - Starlight");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String amazon=driver.findElement(By.xpath("//div[@data-asin='B09G9BFKZN']//span[@class='a-price-whole']")).getText();
	       System.out.println(amazon);
	   Thread.sleep(2000);
	       
	       driver.navigate().to("https://www.flipkart.com");
	      
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	       
			driver.findElement(By.name("q")).sendKeys("Apple iPhone 13 (256GB) - Starlight");
			 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			
			 Thread.sleep(2000);
			 
			String flipkart= driver.findElement(By.xpath("//div[@data-id='MOBG6VF5NFYJ8KQX']//div[@class='_30jeq3 _1_WHN1']")).getText();
			System.out.println(flipkart);
			
			int a=Integer.parseInt(flipkart);
			int b=Integer.parseInt(amazon);
			
			//String str = "?@83,999"; 

	       // String[] s = str.split("@", 1);
	        //System.out.println(s);
			
			
			if(a>=b) {
				System.out.println("amazon price is high");
				
			}
			else {
				System.out.println("flipkart price is high");
			}
	}

}

