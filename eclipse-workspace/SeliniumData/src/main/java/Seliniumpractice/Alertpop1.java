package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpop1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");

        WebElement wb = driver.findElement(By.xpath("//div[@class='col-lg-3 col-md-6 mb-4 mb-lg-0 align-self-center px-5 py-3'][1]/a"));

        System.out.println(wb.isDisplayed());

        System.out.println(wb.isEnabled());

        System.out.println(wb.getAttribute("href"));

        wb.click();

        String b =driver.getCurrentUrl();

        if(b.contains("browserstack"))
        {
	      System.out.println("Tc is Pass");
        }
        else 
        {
	     System.out.println("TC is Fail");
         }
    }

}
