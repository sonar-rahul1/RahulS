package seleniumtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo2 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[]args)
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement wb=driver.findElement(By.id("month"));
		Select sel=new Select(wb);
		sel.selectByVisibleText("Dec");
		WebElement wb1=driver.findElement(By.id("Year"));
		Select sel1=new Select(wb1);
		sel1.selectByVisibleText("2023");
		List<WebElement> ls1=sel1.getOptions();
		int g=ls1.size();
		System.out.println(g);

		List<WebElement> ls=sel.getOptions();
		int a=ls.size();
		System.out.println(a);
		for(WebElement abc:ls)
		{
		String b=abc.getText();
		if(b.equals("Nov"))
		{
		System.out.println(b);
		break;
		}
		}
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonar\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/reg");
//       WebElement wb=driver.findElement(By.id("month"));
//       Select sel=new Select(wb);
//       sel.selectByVisibleText("Dec");
//       List<WebElement> ls=sel.getOptions();
//       int a=ls.size();
//       System.out.println(a);
//       for(WebElement abs:ls)
//       {
//    	   String b=abs.getText();
//    	   System.out.println(b);
//       }
//       System.out.println("...................");
//       
//	}

		}
}