package Seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
		driver.findElement(By.xpath("//select[@id='personal_cmbMarital']")).sendKeys("Married");
		driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).click();
		//String b="2023";
		while(true)
		{
            String a = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-month']")).getText();		
            System.out.println(a);
            String c = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-year']")).getText();		
            System.out.println(c);
            
           
            if((c.equals("2023"))&&(a.equals("Dec")))
            {
            	break;
            }
            else
            	 {
                   driver.findElement(By.xpath("//span[text()='Next']")).click();
            
           	    }
       }
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//a[text()='14']")).click();
	}

}
