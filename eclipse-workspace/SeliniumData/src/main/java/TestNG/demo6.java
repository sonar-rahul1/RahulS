package TestNG;

import org.testng.annotations.Test;

public class demo6 {
 @Test(groups= {"login"})
 public void login() {
	 System.out.println("Login functionality");
 }
 @Test(priority=2)
 public void HomePageTitle()
 {
	 System.out.println("HomepageTitle");
 }
 @Test (priority=3, enabled=false)
 public void HomePageUrl()
 {
 System.out.println("HomePageUrl");
 }
}
