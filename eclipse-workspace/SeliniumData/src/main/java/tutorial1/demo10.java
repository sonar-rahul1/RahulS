package tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo10 {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver =new ChromeDriver();
	   driver.get("https://www.google.com/search?q=https+facebook&oq=https+facebook&aqs=chrome..69i57j0i131i433i512j0i512l3j69i60l3.8766j1j7&sourceid=chrome&ie=UTF-8");     String a=driver.getTitle();
	if(a.contains("facebook"))
	{
	System.out.println();

	}
	else{
	System.out.println();
	}
	driver.navigate().to("https://www.google.com/search?q=goog%3Ble&oq=goog%3Ble&aqs=chrome.0.69i59j46i10i199i465i512j0i10i512l7.3101j0j7&sourceid=chrome&ie=UTF-8");
	String b=driver.getCurrentUrl();
	if(b.contains("index"))
	{
	System.out.println();
	}
	else{
	System.out.println();
	}
	}
}
