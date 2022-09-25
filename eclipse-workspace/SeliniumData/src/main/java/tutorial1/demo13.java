package tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys("Rahul");
        driver.findElement(By.id("lastName")).sendKeys("Sonar");
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("personal_optGender_1")).click();
       driver.findElement(By.id("personal_cmbMarital")).sendKeys("Married");
       driver.findElement(By.id("personal_cmbNation")).sendKeys("Indian");
       

  
       
		


	}

}
