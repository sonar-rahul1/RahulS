package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sonar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
//		boolean a=driver.findElement(By.id("txtUsername")).isDisplayed();
//		System.out.println(a);
//		//boolean b=driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		boolean c=driver.findElement(By.id("txtUsername")).isEnabled();
//		System.out.println(c);
//         driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//         Thread.sleep(5010);
//         driver.findElement(By.id("txtUsername")).getAttribute("abc");
//         driver.findElement(By.id("txtUsername")).clear();
//         driver.navigate().to("https://www.google.com/search?q=goog%3Ble&oq=goog%3Ble&aqs=chrome.0.69i59j46i10i199i465i512j0i10i512l7.3101j0j7&sourceid=chrome&ie=UTF-8");
//	}
driver.get("https://prafpawar11.github.io/checkbox.html");
		
		boolean a =driver.findElement(By.name("API Testing")).isDisplayed();
		System.out.println(a);//true
		
		boolean b =driver.findElement(By.name("API Testing")).isEnabled();
		System.out.println(b);//true
		
		boolean c =driver.findElement(By.name("API Testing")).isSelected();
		System.out.println(c);//false
		
		driver.findElement(By.name("API Testing")).click();
		
		boolean d =driver.findElement(By.name("API Testing")).isSelected();
		System.out.println(d);//true
		
		
	
	}

}
