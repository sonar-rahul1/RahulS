package Seliniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String a=driver.getTitle();
		System.out.println("Title for amazon");
		driver.navigate().to("http://www.flipkart.com");
		String b=driver.getTitle();
		System.out.println(b);

		for(int i=b.length()-1;i>=0;i--)
		{
		System.out.println(a.charAt(i));
		}


	}

}
