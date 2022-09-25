package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String a=driver.getCurrentUrl();
		System.out.println(a);
		String b=driver.getCurrentUrl();
		System.out.println(b);
		String c=driver.getPageSource();
		System.out.println(c);
		for(int i=a.length()-1;i<=0;i--)
		{
			System.out.println(a.charAt(i));
					
		}
		
	}

	
}
