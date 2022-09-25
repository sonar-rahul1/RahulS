package Seliniumpractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		

driver.get("https://www.amazon.com/");
		
		WebElement wb=driver.findElement(By.id("nav-link-accountList"));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(wb).build().perform();
		
		driver.findElement(By.linkText("Orders")).click();
		
		driver.findElement(By.id("createAccountSubmit")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("Selenium Testing");
		
		
		driver.findElement(By.id("ap_email")).sendKeys("22435366");
		
		driver.findElement(By.id("ap_password")).sendKeys("213555");
		
		
			
	}

}
