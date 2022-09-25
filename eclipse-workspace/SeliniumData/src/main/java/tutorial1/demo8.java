package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/sonar/OneDrive/Desktop/Automation%20Notes/selinium/Link.html");
WebElement googlelink =driver.findElement(By.id("facebook"));
		
		System.out.println(googlelink.isDisplayed());
		
		System.out.println(googlelink.isEnabled());
		
		String a =googlelink.getText();
		
		System.out.println(a);
		
		googlelink.click();
		
		String actualTitle =driver.getTitle();
		
		if(actualTitle.contains("facebook"))
		{
			System.out.println("Test case is pass for google");
		}
		else {
			System.out.println("Test Cases is Fail for google");
		}
		
		
	}
}

