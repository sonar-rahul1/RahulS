package Seliniumpractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimention {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver  driver =new ChromeDriver();
        driver.get("https://www.google.com/");
       	driver.manage().window().fullscreen();

		Dimension d1=driver.manage().window().getSize();
		
		System.out.println(d1.getHeight());
	
		System.out.println(d1.getWidth());
		
		System.out.println("=================================");
		
		driver.manage().window().maximize();

		Dimension d=driver.manage().window().getSize();
		
		System.out.println(d.getHeight());
	
		System.out.println(d.getWidth());

		
		

	}

}
