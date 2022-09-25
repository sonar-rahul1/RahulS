import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplewindows {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		String parent = driver.getWindowHandle();

		driver.findElement(By.name("fname")).sendKeys("Madhavi");
		driver.findElement(By.xpath("//a[contains(text(),'HRM')]")).click();

		Set<String> AllWin = driver.getWindowHandles();
		for (String HR : AllWin) {
			if (!(HR.equals(parent))) {
				driver.switchTo().window(HR);
				String HRM = driver.getWindowHandle();
				System.out.println(HRM);
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				TakesScreenshot ts = (TakesScreenshot) driver;
				File f = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f,
						new File("C:\\Users\\sonar\\eclipse-workspace\\HybridFrameWork5\\PassScreenShoot"
								+ "Orange" + ".png"));

			}
		}

		driver.switchTo().window(parent);

		driver.findElement(By.name("lname")).sendKeys("Akkina");

	}

}

